

# VoucherGetMultipleRecordsResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Double** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**currency** | **String** |  |  [optional] |
|**dateRedeemed** | **OffsetDateTime** | This is defined only if the voucher payment has been received |  [optional] |
|**email** | **String** |  |  [optional] |
|**expectedAmount** | **Double** |  |  [optional] |
|**fee** | **Double** |  |  [optional] |
|**feeBearer** | [**FeeBearerEnum**](#FeeBearerEnum) |  |  [optional] |
|**fullname** | **String** |  |  [optional] |
|**id** | **String** |  |  [optional] |
|**memo** | **String** |  |  [optional] |
|**merchant** | **String** |  |  [optional] |
|**paidAt** | **OffsetDateTime** | This is defined only if the voucher payment has been received |  [optional] |
|**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) |  |  [optional] |
|**rate** | **Double** | This is defined only if the voucher has been paid and redeemed |  [optional] |
|**rateKey** | **String** | This is defined only if the voucher was created using a valid rate key |  [optional] |
|**receivedAmount** | **Double** | This is defined only if the voucher payment has been received |  [optional] |
|**voucherCode** | **String** | This is defined only if the voucher payment has been received |  [optional] |



## Enum: FeeBearerEnum

| Name | Value |
|---- | -----|
| CLIENT | &quot;client&quot; |
| MERCHANT | &quot;merchant&quot; |



## Enum: PaymentStatusEnum

| Name | Value |
|---- | -----|
| PAID | &quot;paid&quot; |
| UNPAID | &quot;unpaid&quot; |



