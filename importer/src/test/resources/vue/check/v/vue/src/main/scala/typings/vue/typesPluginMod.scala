package typings.vue

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSImport.Namespace
import scala.scalajs.js.annotation.JSName
import typings.vue.typesPluginMod.PluginFunction
import typings.vue.typesVueMod.Vue
import typings.vue.typesVueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`

@JSImport("vue/types/plugin", Namespace)
@js.native
object typesPluginMod extends js.Object {
  @js.native
  trait PluginObject[T] extends /* key */ StringDictionary[js.Any] {
    @JSName("install")
    var install_Original: PluginFunction[T] = js.native
    def install(Vue: VueConstructor[Vue]): Unit = js.native
    def install(Vue: VueConstructor[Vue], options: T): Unit = js.native
  }
  
  type PluginFunction[T] = js.Function2[/* Vue */ VueConstructor[Vue], /* options */ js.UndefOr[T], Unit]
}

