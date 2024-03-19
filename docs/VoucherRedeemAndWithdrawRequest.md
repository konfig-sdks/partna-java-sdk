

# VoucherRedeemAndWithdrawRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cryptoAddress** | **String** | Must be provided along with newtwork. The crypto wallet address on the provided network, to which crypto equivalent will be sent |  |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) | Cryptocurrency to send to the provided wallet details |  |
|**email** | **String** | Email that was used to create the voucher |  |
|**merchantFee** | **String** | In USD (optional) with a precision of 2 decimal places (max). Can be supplied if the merchant want to withdraw a portion of the voucher amount into their Ventogram balance. This must be a fraction or all of voucher value (ie received amount - voucher fee) |  [optional] |
|**network** | **String** | Supported crypto network |  |
|**rateKey** | **String** | This is a Ventogram-signed rate key. This will be returned in response if the signed rate was used for conversion. |  [optional] |
|**voucherCode** | **String** | Voucher code to be redeemed |  |



## Enum: CurrencyEnum

| Name | Value |
|---- | -----|
| USDC | &quot;USDC&quot; |
| USDT | &quot;USDT&quot; |



