package typings.fullcalendar.emitterMixinMod

import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js
import scala.scalajs.js.`|`

trait EmitterInterface extends js.Object {
  def on(types: js.Any, handler: js.Any): js.Any
}

object EmitterInterface {
  @inline
  def apply(on: (js.Any, js.Any) => js.Any): EmitterInterface = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
  
    __obj.asInstanceOf[EmitterInterface]
  }
}

