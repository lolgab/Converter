package typings.materialDashUi.__MaterialUI.Styles

import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js
import scala.scalajs.js.`|`

trait MuiTheme extends js.Object {
  var spacing: js.UndefOr[js.Any] = js.undefined
}

object MuiTheme {
  @inline
  def apply(spacing: js.Any = null): MuiTheme = {
    val __obj = js.Dynamic.literal()
    if (spacing != null) __obj.updateDynamic("spacing")(spacing)
    __obj.asInstanceOf[MuiTheme]
  }
}

