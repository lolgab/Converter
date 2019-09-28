package typings.reactDashBootstrap.libButtonGroupMod

import scala.scalajs.js.annotation.ScalaJSDefined
import typings.react.Anon_Html
import typings.react.reactMod.HTMLProps
import typings.react.reactMod.Key
import typings.react.reactMod.ReactNode
import typings.react.reactMod.Ref
import typings.react.reactStrings.foo
import typings.reactDashBootstrap.reactDashBootstrapMod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`

trait ButtonGroupProps extends HTMLProps[ButtonGroup] {
  var block: js.UndefOr[Boolean] = js.undefined
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var bsStyle: js.UndefOr[String] = js.undefined
  var justified: js.UndefOr[Boolean] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object ButtonGroupProps {
  @inline
  def apply(
    defaultValue: foo,
    hasOwnProperty: String => Boolean,
    isPrototypeOf: js.Object => Boolean,
    onChange: foo,
    propertyIsEnumerable: String => Boolean,
    toLocaleString: () => String,
    `type`: foo,
    value: foo,
    valueOf: () => js.Any,
    accept: String = null,
    acceptCharset: String = null,
    block: js.UndefOr[Boolean] = js.undefined,
    bsSize: Sizes = null,
    bsStyle: String = null,
    children: ReactNode = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    justified: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    ref: Ref[ButtonGroup] = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): ButtonGroupProps = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), isPrototypeOf = js.Any.fromFunction1(isPrototypeOf), onChange = onChange, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), toLocaleString = js.Any.fromFunction0(toLocaleString), value = value, valueOf = js.Any.fromFunction0(valueOf))
    __obj.updateDynamic("type")(`type`)
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (acceptCharset != null) __obj.updateDynamic("acceptCharset")(acceptCharset)
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(justified)) __obj.updateDynamic("justified")(justified)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[ButtonGroupProps]
  }
}

