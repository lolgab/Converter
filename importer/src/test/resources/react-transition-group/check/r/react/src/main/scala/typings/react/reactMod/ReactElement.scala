package typings.react.reactMod

import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js
import scala.scalajs.js.`|`

trait ReactElement extends js.Object {
  var key: Key | Null
  var props: js.Any
  var `type`: String | ComponentClass[_] | SFC[_]
}

object ReactElement {
  @inline
  def apply(props: js.Any, `type`: String | ComponentClass[_] | SFC[_], key: Key = null): ReactElement = {
    val __obj = js.Dynamic.literal(props = props)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactElement]
  }
}

