package typings.vueDashScrollto.vueDashScrolltoMod

import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSImport.Namespace
import scala.scalajs.js.annotation.JSName
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`

@JSImport("vue/types/vue", Namespace)
@js.native
object typesVueMod extends js.Object {
  @js.native
  trait Vue extends js.Object {
    @JSName("$scrollTo")
    var $scrollTo_Original: VueStatic = js.native
    @JSName("$scrollTo")
    def $scrollTo(element: String): Unit = js.native
    @JSName("$scrollTo")
    def $scrollTo(element: String, duration: Double): Unit = js.native
    @JSName("$scrollTo")
    def $scrollTo(element: String, duration: Double, options: Options): Unit = js.native
    @JSName("$scrollTo")
    def $scrollTo(element: String, options: Options): Unit = js.native
    @JSName("$scrollTo")
    def $scrollTo(element: Element): Unit = js.native
    @JSName("$scrollTo")
    def $scrollTo(element: Element, duration: Double): Unit = js.native
    @JSName("$scrollTo")
    def $scrollTo(element: Element, duration: Double, options: Options): Unit = js.native
    @JSName("$scrollTo")
    def $scrollTo(element: Element, options: Options): Unit = js.native
    @JSName("$scrollTo")
    def $scrollTo(options: Options): Unit = js.native
  }
  
}

