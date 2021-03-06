package org.scalablytyped.converter.internal
package importer

import org.scalablytyped.converter.internal.scalajs._

/**
  * Account for an... interesting case of piece of modelling. We'll fix it some day, but for now I doubled down on it.
  * There are reasons for this, most notably in the implementation of the module system.
  *
  * On the typescript side we merge different syntactical entities by using the `namespaced` name.
  * `{function a(): void; namespace a {const b: number}` =>
  * `{namespace a {function ^(): void, const b: number}`.
  *
  * This undoes the damage.
  */
object RewriteNamespaceMembers {
  def apply(original: IArray[Tree]): (IArray[TypeRef], IArray[MemberTree], IArray[Tree]) =
    original.partitionCollect4(
      { case x: FieldTree if x.name === Name.namespaced     => x },
      { case x: MethodTree if x.name === Name.namespaced    => x },
      { case x: ContainerTree if x.name === Name.namespaced => x },
      { case x: MemberTree                                  => x },
    ) match {
      case (namespacedFields, namespacedMethods, namespacedContainers, memberTrees, remaining) =>
        val inheritance: IArray[TypeRef] = {
          val fromFields = namespacedFields.map(x => x.tpe)
          val fromContainers = namespacedContainers.flatMap {
            case _: PackageTree => Empty
            case ModuleTree(_, _, parents, _, _, _, _) =>
              parents map {
                case TypeRef(QualifiedName.TopLevel, IArray.exactlyOne(parent), _) => parent
                case parent                                                        => parent
              }
          }
          (fromFields ++ fromContainers).distinct match {
            case Empty => Empty
            /* This is a shortcut so we don't have to implement the members */
            case more => IArray(TypeRef.TopLevel(TypeRef.Intersection(more)))
          }
        }

        val (membersFromContainers, restFromContainers) =
          namespacedContainers.flatMap(_.members).partitionCollect { case x: MemberTree => x }

        val newMemberTrees = {
          val rewrittenMethods = namespacedMethods.map(_.copy(name = Name.APPLY))

          memberTrees ++ rewrittenMethods ++ membersFromContainers
        }

        (inheritance, newMemberTrees, remaining ++ restFromContainers)
    }

}
