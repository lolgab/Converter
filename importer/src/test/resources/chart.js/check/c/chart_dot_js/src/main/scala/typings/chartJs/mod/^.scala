package typings.chartJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.AnonGlobal
import typings.chartJs.TypeofClassChart
import typings.std.ArrayLike
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chart.js", JSImport.Namespace)
@js.native
class ^ protected () extends Chart {
  def this(context: String, options: js.Any) = this()
  def this(context: ArrayLike[CanvasRenderingContext2D | HTMLCanvasElement], options: js.Any) = this()
  def this(context: CanvasRenderingContext2D, options: js.Any) = this()
  def this(context: HTMLCanvasElement, options: js.Any) = this()
}

@JSImport("chart.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Chart: TypeofClassChart = js.native
  var controllers: StringDictionary[js.Any] = js.native
  var defaults: AnonGlobal = js.native
}

