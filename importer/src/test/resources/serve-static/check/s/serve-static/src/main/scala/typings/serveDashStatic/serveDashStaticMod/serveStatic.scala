package typings.serveDashStatic.serveDashStaticMod

import scala.scalajs.js.annotation.JSImport
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`

@JSImport("serve-static", "serveStatic")
@js.native
object serveStatic extends js.Object {
  def apply(root: String): Handler = js.native
  def apply(root: String, options: ServeStaticOptions): Handler = js.native
}

