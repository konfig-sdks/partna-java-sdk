

# VoucherCreatePaymentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Integer** | Required voucher amount |  |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) | Required voucher currency |  |
|**email** | **String** | User email |  |
|**fullname** | **String** | Fullname of the user creating voucher |  |
|**rateKey** | **String** | This is a Ventogram-signed rate key. If provided when a voucher is created, the conversion will use the rate signed with this key if it is valid at the time of redeeming a voucher. Conversion will use the current rate if key has expired. |  [optional] |



## Enum: CurrencyEnum

| Name | Value |
|---- | -----|
| NGN | &quot;NGN&quot; |
| USD | &quot;USD&quot; |



