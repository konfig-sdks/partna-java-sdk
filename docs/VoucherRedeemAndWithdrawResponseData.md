

# VoucherRedeemAndWithdrawResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**convertedVoucherFee** | **Double** | Voucher fee in the outgoing currency |  [optional] |
|**convertedVoucherFeeCurrency** | **String** | The same as toCurrency |  [optional] |
|**creditCurrency** | **String** | Merchant&#39;s balance currency |  [optional] |
|**currentBalance** | **Double** | Merchant&#39;s balance after redeeming voucher |  [optional] |
|**email** | **String** | Email that aws used to create the voucher |  [optional] |
|**feeBearer** | [**FeeBearerEnum**](#FeeBearerEnum) | The bearer of voucher fee |  [optional] |
|**fromAmount** | **Double** | Voucher payment amount. |  [optional] |
|**fromCurrency** | **String** | voucher payment currency |  [optional] |
|**id** | **String** | Voucher ID |  [optional] |
|**merchant** | **String** | username of the merchant that created the voucher |  [optional] |
|**merchantFee** | **Double** | This can be optionally provided by the merchant in the request if they want some of the received amount to be added to their Ventogram balance. |  [optional] |
|**previousBalance** | **Double** | Merchant&#39;s balance before redeeming voucher |  [optional] |
|**rate** | **Double** | The exchange rate that was used for conversion (if applicable) at the time of redeeming the voucher. If there&#39;s no conversion, the value is 1. |  [optional] |
|**reference** | **String** | This is basically a unique id |  [optional] |
|**toAccount** | **String** | The crypto wallet address to which asset was transferred |  [optional] |
|**toAmount** | **Double** | The amount that was sent to user wallet address. |  [optional] |
|**toCurrency** | **String** | The currency that was sent to user wallet. |  [optional] |
|**voucherCode** | **String** | Voucher code to be redeemed |  [optional] |
|**voucherFee** | **Double** | The fee associated with voucher in the payment currency. This will be deducted from merchant&#39;s balance if merchant is the fee bearer. |  [optional] |
|**withdrawalFee** | **Double** | The processing fee for the crypto transfer that will be deducted from the merchant&#39;s account. Merchants must maintain a sufficient balance to utilize the redeem-and-withdraw endpoint. |  [optional] |



## Enum: FeeBearerEnum

| Name | Value |
|---- | -----|
| MERCHANT | &quot;merchant&quot; |
| CLIENT | &quot;client&quot; |



