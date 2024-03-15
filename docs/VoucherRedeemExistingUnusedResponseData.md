

# VoucherRedeemExistingUnusedResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Double** | Voucher amount after fee deduction |  [optional] |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) | voucher payment currency |  [optional] |
|**currentBalance** | **Double** | Merchant&#39;s balance after redeeming voucher |  [optional] |
|**email** | **String** | Email that aws used to create the voucher |  [optional] |
|**fee** | **Double** | The fee associated with voucher |  [optional] |
|**feeBearer** | [**FeeBearerEnum**](#FeeBearerEnum) | The bearer of voucher fee |  [optional] |
|**fromAmount** | **Double** | The amount in the currency that was converted from when conversion was done. If there&#39;s no conversion, this is the same as toAmount. |  [optional] |
|**fromCurrency** | **String** | The currency from which conversion was done. If there&#39;s no conversion, this is the same as toCurrency. |  [optional] |
|**id** | **String** | Voucher ID |  [optional] |
|**merchant** | **String** | username of the merchant that created the voucher |  [optional] |
|**previousBalance** | **Double** | Merchant&#39;s balance before redeeming voucher |  [optional] |
|**rate** | **Double** | The exchange rate that was used for conversion when conversion was done. If there&#39;s no conversion, the value is 1. |  [optional] |
|**toAmount** | **Double** | The amount in the currency that was converted to when conversion was done. If there&#39;s no conversion, this is the same as fromAmount. |  [optional] |
|**toCurrency** | **String** | The currency to which conversion was done. If there&#39;s no conversion, this is the same as fromCurrency. |  [optional] |
|**voucherCode** | **String** | Voucher code to be redeemed |  [optional] |
|**wavedFee** | **Double** | Waved fee (if available) |  [optional] |



## Enum: CurrencyEnum

| Name | Value |
|---- | -----|
| NGN | &quot;NGN&quot; |
| USD | &quot;USD&quot; |



## Enum: FeeBearerEnum

| Name | Value |
|---- | -----|
| CLIENT | &quot;client&quot; |
| MERCHANT | &quot;merchant&quot; |



