package typings
package rxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object internalTypesMod {
  type OperatorFunction[T, R] = UnaryFunction[
    rxjsLib.internalObservableMod.Observable[T], 
    rxjsLib.internalObservableMod.Observable[R]
  ]
  type PartialObserver[T] = NextObserver[T] | ErrorObserver[T] | CompletionObserver[T]
  type UnaryFunction[T, R] = js.Function1[/* source */ T, R]
}