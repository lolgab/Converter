package typings.commander.commanderMod

import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js
import scala.scalajs.js.`|`

trait ParseOptionsResult extends js.Object {
  var args: js.Array[String]
  var unknown: js.Array[String]
}

object ParseOptionsResult {
  @inline
  def apply(args: js.Array[String], unknown: js.Array[String]): ParseOptionsResult = {
    val __obj = js.Dynamic.literal(args = args, unknown = unknown)
  
    __obj.asInstanceOf[ParseOptionsResult]
  }
}

