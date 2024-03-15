

# BalanceTransferFundsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **String** | Amount to transfer. |  [optional] |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) | Currency being sent. |  |
|**memo** | **String** | Transaction memo. |  [optional] |
|**otpType** | [**OtpTypeEnum**](#OtpTypeEnum) | The type of OTP to be used. |  [optional] |
|**receiverUsername** | **String** | Receiver&#39;s coinprofile username. |  |
|**token** | **String** | The token to be used for OTP. |  [optional] |



## Enum: CurrencyEnum

| Name | Value |
|---- | -----|
| NGN | &quot;NGN&quot; |
| USD | &quot;USD&quot; |



## Enum: OtpTypeEnum

| Name | Value |
|---- | -----|
| OTP | &quot;otp&quot; |
| TOTP | &quot;totp&quot; |



