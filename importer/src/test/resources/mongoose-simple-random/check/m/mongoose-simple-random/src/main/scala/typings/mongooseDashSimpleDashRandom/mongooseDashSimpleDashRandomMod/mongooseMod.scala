package typings.mongooseDashSimpleDashRandom.mongooseDashSimpleDashRandomMod

import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSImport.Namespace
import typings.mongoose.mongooseMod.Document
import typings.mongoose.mongooseMod.ModelProperties
import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`

/* augmented module */
@JSImport("mongoose", Namespace)
@js.native
object mongooseMod extends js.Object {
  @js.native
  trait Model[T /* <: Document */]
    extends EventEmitter
       with ModelProperties {
    def findRandom(conditions: js.Object): Unit = js.native
    def findRandom(conditions: js.Object, projection: js.Object): Unit = js.native
    def findRandom(conditions: js.Object, projection: js.Object, options: js.Object): Unit = js.native
    def findRandom(
      conditions: js.Object,
      projection: js.Object,
      options: js.Object,
      callback: js.Function2[/* err */ js.Any, /* res */ js.UndefOr[js.Array[T]], Unit]
    ): Unit = js.native
    def findRandom(
      conditions: js.Object,
      projection: js.Object,
      options: Null,
      callback: js.Function2[/* err */ js.Any, /* res */ js.UndefOr[js.Array[T]], Unit]
    ): Unit = js.native
    def findRandom(conditions: js.Object, projection: Null, options: js.Object): Unit = js.native
    def findRandom(
      conditions: js.Object,
      projection: Null,
      options: js.Object,
      callback: js.Function2[/* err */ js.Any, /* res */ js.UndefOr[js.Array[T]], Unit]
    ): Unit = js.native
    def findRandom(
      conditions: js.Object,
      projection: Null,
      options: Null,
      callback: js.Function2[/* err */ js.Any, /* res */ js.UndefOr[js.Array[T]], Unit]
    ): Unit = js.native
  }
  
}

