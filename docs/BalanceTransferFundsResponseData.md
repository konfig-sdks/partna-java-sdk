

# BalanceTransferFundsResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **String** |  |  [optional] |
|**date** | **LocalDate** |  |  [optional] |
|**fromCurrency** | [**FromCurrencyEnum**](#FromCurrencyEnum) |  |  [optional] |
|**receiveAmount** | **String** |  |  [optional] |
|**sender** | **String** |  |  [optional] |
|**senderPrevbalance** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**toCurrency** | [**ToCurrencyEnum**](#ToCurrencyEnum) |  |  [optional] |
|**transactionId** | **String** |  |  [optional] |
|**username** | **String** |  |  [optional] |



## Enum: FromCurrencyEnum

| Name | Value |
|---- | -----|
| NGN | &quot;NGN&quot; |
| USD | &quot;USD&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| FULLFILED | &quot;fullfiled&quot; |
| PROCESSING | &quot;processing&quot; |
| FAILED | &quot;failed&quot; |



## Enum: ToCurrencyEnum

| Name | Value |
|---- | -----|
| NGN | &quot;NGN&quot; |
| USD | &quot;USD&quot; |



