

# BalanceWithdrawFundsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountName** | **String** | The account name. This is the name of the account holder. |  |
|**accountNumber** | **String** | The account number of the user&#39;s bank account. |  |
|**amount** | **String** | The amount to be withdrawn. |  |
|**bank** | **String** | The bank name. e.g. \&quot;Access Bank\&quot;. |  |
|**bankCode** | **String** | The bank code. e.g. \&quot;044\&quot;. |  |
|**currency** | **String** | The currency of the withdrawal. |  |
|**otpType** | [**OtpTypeEnum**](#OtpTypeEnum) | The type of OTP to be used. |  |
|**token** | **String** | The token to be used for OTP. |  [optional] |



## Enum: OtpTypeEnum

| Name | Value |
|---- | -----|
| OTP | &quot;otp&quot; |
| TOTP | &quot;totp&quot; |



