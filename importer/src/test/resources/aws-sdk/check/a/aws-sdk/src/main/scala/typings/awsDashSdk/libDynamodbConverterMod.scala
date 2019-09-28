package typings.awsDashSdk

import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSImport.Namespace
import typings.awsDashSdk.clientsDynamodbMod.AttributeValue
import typings.awsDashSdk.libDynamodbConverterMod.Converter.ConverterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`

@JSImport("aws-sdk/lib/dynamodb/converter", Namespace)
@js.native
object libDynamodbConverterMod extends js.Object {
  @js.native
  class Converter () extends js.Object
  
  /* static members */
  @js.native
  object Converter extends js.Object {
    def input(data: js.Any): AttributeValue = js.native
    def input(data: js.Any, options: ConverterOptions): AttributeValue = js.native
    type ConverterOptions = typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.ConverterOptions
  }
  
}

