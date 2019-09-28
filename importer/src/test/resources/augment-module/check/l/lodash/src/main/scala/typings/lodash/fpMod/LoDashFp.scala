package typings.lodash.fpMod

import scala.scalajs.js.annotation.JSName
import typings.lodash.fpCurryMod.Curry
import typings.lodash.lodashMod.CurriedFunction1
import typings.lodash.lodashMod.CurriedFunction2
import scala.scalajs.js
import scala.scalajs.js.`|`

@js.native
trait LoDashFp extends js.Object {
  @JSName("curry")
  var curry_Original: Curry = js.native
  def curry[T1, R](func: js.Function1[/* t1 */ T1, R]): CurriedFunction1[T1, R] = js.native
  def curry[T1, T2, R](func: js.Function2[/* t1 */ T1, /* t2 */ T2, R]): CurriedFunction2[T1, T2, R] = js.native
}

