package typings.materialDashUi.__MaterialUI.BottomNavigation

import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js
import scala.scalajs.js.`|`

trait BottomNavigationItemProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
}

object BottomNavigationItemProps {
  @inline
  def apply(className: String = null): BottomNavigationItemProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[BottomNavigationItemProps]
  }
}

