

# MerchantsUpdateRecordRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callbackUrl** | **String** | Merchant callback URL. Webhook will be sent to this URL. |  [optional] |
|**creditCurrency** | [**CreditCurrencyEnum**](#CreditCurrencyEnum) | Merchants can set this property to their desired currency. Their balance on Ventogram will be credited with this currency when their users redeem voucher created on Ventogram. Conversion between different currencies will be performed at the rate which is obtainable at the time of redeeming the voucher. If this is not set by the merchant,  their balance will be credited with the currency used in creating the voucher. |  [optional] |
|**feeBearer** | [**FeeBearerEnum**](#FeeBearerEnum) | Bearer of the voucher fee |  [optional] |
|**logo** | **String** | Merchant logo URL |  [optional] |



## Enum: CreditCurrencyEnum

| Name | Value |
|---- | -----|
| NGN | &quot;NGN&quot; |
| USD | &quot;USD&quot; |
| EMPTY | &quot;&quot; |



## Enum: FeeBearerEnum

| Name | Value |
|---- | -----|
| CLIENT | &quot;client&quot; |
| MERCHANT | &quot;merchant&quot; |



