package typings.insight.insightMod.insight

import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js
import scala.scalajs.js.`|`

trait IConfigstore extends js.Object {
  var all: js.Any
  var path: String
  def del(key: String): Unit
  def get(key: String): js.Any
  def set(key: String, `val`: js.Any): Unit
}

object IConfigstore {
  @inline
  def apply(
    all: js.Any,
    del: String => Unit,
    get: String => js.Any,
    path: String,
    set: (String, js.Any) => Unit
  ): IConfigstore = {
    val __obj = js.Dynamic.literal(all = all, del = js.Any.fromFunction1(del), get = js.Any.fromFunction1(get), path = path, set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[IConfigstore]
  }
}

