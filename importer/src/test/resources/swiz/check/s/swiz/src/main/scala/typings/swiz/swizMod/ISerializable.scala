package typings.swiz.swizMod

import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js
import scala.scalajs.js.`|`

trait ISerializable extends js.Object {
  def getSerializerType(): String
}

object ISerializable {
  @inline
  def apply(getSerializerType: () => String): ISerializable = {
    val __obj = js.Dynamic.literal(getSerializerType = js.Any.fromFunction0(getSerializerType))
  
    __obj.asInstanceOf[ISerializable]
  }
}

