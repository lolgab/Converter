package typings.vue.typesVnodeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js.annotation.ScalaJSDefined
import typings.vue.Anon_Render
import scala.scalajs.js
import scala.scalajs.js.`|`

trait VNodeData extends js.Object {
  var attrs: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var `class`: js.UndefOr[js.Any] = js.undefined
  var directives: js.UndefOr[js.Array[VNodeDirective]] = js.undefined
  var domProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var hook: js.UndefOr[StringDictionary[js.Function]] = js.undefined
  var inlineTemplate: js.UndefOr[Anon_Render] = js.undefined
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String | Double] = js.undefined
  var nativeOn: js.UndefOr[StringDictionary[js.Function | js.Array[js.Function]]] = js.undefined
  var on: js.UndefOr[StringDictionary[js.Function | js.Array[js.Function]]] = js.undefined
  var props: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var ref: js.UndefOr[String] = js.undefined
  var scopedSlots: js.UndefOr[StringDictionary[ScopedSlot]] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var staticClass: js.UndefOr[String] = js.undefined
  var staticStyle: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var style: js.UndefOr[js.Array[js.Object] | js.Object] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
  var transition: js.UndefOr[js.Object] = js.undefined
}

object VNodeData {
  @inline
  def apply(
    attrs: StringDictionary[js.Any] = null,
    `class`: js.Any = null,
    directives: js.Array[VNodeDirective] = null,
    domProps: StringDictionary[js.Any] = null,
    hook: StringDictionary[js.Function] = null,
    inlineTemplate: Anon_Render = null,
    keepAlive: js.UndefOr[Boolean] = js.undefined,
    key: String | Double = null,
    nativeOn: StringDictionary[js.Function | js.Array[js.Function]] = null,
    on: StringDictionary[js.Function | js.Array[js.Function]] = null,
    props: StringDictionary[js.Any] = null,
    ref: String = null,
    scopedSlots: StringDictionary[ScopedSlot] = null,
    show: js.UndefOr[Boolean] = js.undefined,
    slot: String = null,
    staticClass: String = null,
    staticStyle: StringDictionary[js.Any] = null,
    style: js.Array[js.Object] | js.Object = null,
    tag: String = null,
    transition: js.Object = null
  ): VNodeData = {
    val __obj = js.Dynamic.literal()
    if (attrs != null) __obj.updateDynamic("attrs")(attrs)
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (domProps != null) __obj.updateDynamic("domProps")(domProps)
    if (hook != null) __obj.updateDynamic("hook")(hook)
    if (inlineTemplate != null) __obj.updateDynamic("inlineTemplate")(inlineTemplate)
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nativeOn != null) __obj.updateDynamic("nativeOn")(nativeOn)
    if (on != null) __obj.updateDynamic("on")(on)
    if (props != null) __obj.updateDynamic("props")(props)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    if (scopedSlots != null) __obj.updateDynamic("scopedSlots")(scopedSlots)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (slot != null) __obj.updateDynamic("slot")(slot)
    if (staticClass != null) __obj.updateDynamic("staticClass")(staticClass)
    if (staticStyle != null) __obj.updateDynamic("staticStyle")(staticStyle)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[VNodeData]
  }
}

