

# VoucherGetRecordResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | Type of created bank account. Note that this property is only available in v2. |  [optional] |
|**amount** | **Double** |  |  [optional] |
|**cancelledAt** | **OffsetDateTime** | This property is optional. Only available if the voucher has been cancelled. |  [optional] |
|**createdAt** | **String** |  |  [optional] |
|**currency** | **String** |  |  [optional] |
|**dateRedeemed** | **OffsetDateTime** | Timestamp of when the voucher was redeemed. If voucher has not been redeemed, this field is undefined. |  [optional] |
|**email** | **String** |  |  [optional] |
|**fee** | **Double** |  |  [optional] |
|**feeBearer** | **String** |  |  [optional] |
|**fullname** | **String** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**memo** | **String** |  |  [optional] |
|**merchant** | **String** |  |  [optional] |
|**paymentExpiresAt** | **OffsetDateTime** |  |  [optional] |
|**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) |  |  [optional] |
|**voucherCode** | **String** | Voucher code. Present only if voucher has been paid |  [optional] |



## Enum: AccountTypeEnum

| Name | Value |
|---- | -----|
| DYNAMIC | &quot;dynamic&quot; |
| STATIC | &quot;static&quot; |



## Enum: PaymentStatusEnum

| Name | Value |
|---- | -----|
| PAID | &quot;paid&quot; |
| UNPAID | &quot;unpaid&quot; |
| DECLINED | &quot;declined&quot; |



