package typings.vue

import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js
import scala.scalajs.js.`|`

trait Anon_Event extends js.Object {
  var event: js.UndefOr[String] = js.undefined
  var prop: js.UndefOr[String] = js.undefined
}

object Anon_Event {
  @inline
  def apply(event: String = null, prop: String = null): Anon_Event = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event)
    if (prop != null) __obj.updateDynamic("prop")(prop)
    __obj.asInstanceOf[Anon_Event]
  }
}

