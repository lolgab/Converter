package typings
package atGoogleDashCloudFirestoreLib.FirebaseFirestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var projectId: js.UndefOr[java.lang.String] = js.undefined
}

object Settings {
  @scala.inline
  def apply(projectId: java.lang.String = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[Settings]
  }
}
