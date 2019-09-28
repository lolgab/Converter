package typings.vueDashResource.vuejs

import scala.scalajs.js.annotation.ScalaJSDefined
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`

trait HttpResponse extends js.Object {
  var data: js.Object
  var headers: js.Function
  var ok: Boolean
  var status: Double
  var statusText: String
  def blob(): Blob
  def json(): js.Any
  def text(): String
}

object HttpResponse {
  @inline
  def apply(
    blob: () => Blob,
    data: js.Object,
    headers: js.Function,
    json: () => js.Any,
    ok: Boolean,
    status: Double,
    statusText: String,
    text: () => String
  ): HttpResponse = {
    val __obj = js.Dynamic.literal(blob = js.Any.fromFunction0(blob), data = data, headers = headers, json = js.Any.fromFunction0(json), ok = ok, status = status, statusText = statusText, text = js.Any.fromFunction0(text))
  
    __obj.asInstanceOf[HttpResponse]
  }
}

