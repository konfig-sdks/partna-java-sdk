

# PaymentCreateNewPaymentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountName** | **String** | The account name. Required when paymentType is bank |  [optional] |
|**accountNumber** | **String** | The account number. Required when paymentType is bank |  [optional] |
|**bank** | **String** | The bank name. Required when paymentType is bank |  [optional] |
|**bankCode** | **String** | The bank code. Required when paymentType is bank |  [optional] |
|**businessId** | **String** | The business id |  |
|**coinprofileUsername** | **String** | The coinprofile username. Required when paymentType is profile |  [optional] |
|**country** | **String** | The country. Required when paymentType is bank |  [optional] |
|**customerEmail** | **String** | The rate key |  |
|**incomingAmount** | **Double** | The incoming amount |  [optional] |
|**incomingCurrency** | **String** | The incoming currency |  |
|**outgoingAmount** | **Double** | The outgoing amount |  [optional] |
|**outgoingCurrency** | **String** | The outgoing currency |  |
|**paymentType** | **String** | The payment type |  |
|**rateKey** | **String** | The rate key |  [optional] |
|**reference** | **String** | The reference |  [optional] |



