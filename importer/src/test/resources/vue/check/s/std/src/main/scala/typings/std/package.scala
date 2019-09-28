package typings

import scala.scalajs.js
import scala.scalajs.js.`|`

package object std {
  import org.scalablytyped.runtime.StringDictionary

  type Element = Node
  type HTMLElement = Node
  type Readonly[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: T[P]}
    */ typings.std.stdStrings.Readonly with T
  type Record[K /* <: String */, T] = StringDictionary[K]
}
