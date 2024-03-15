<div align="center">

[![Visit Partna](./header.png)](https://getpartna.com&#x2F;)

# [Partna](https://getpartna.com&#x2F;)

Coinprofile business API

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Partna&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>partna-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:partna-java-sdk:1.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/partna-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApiKeyApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://staging-biz.coinprofile.co/v2";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiUser  = "YOUR API KEY";
    
    configuration.userVersion  = "YOUR API KEY";
    Partna client = new Partna(configuration);
    String otpType = "otpType_example";
    String token = "token_example";
    try {
      ApiKeyGenerateNewApiKeyResponse result = client
              .apiKey
              .generateNewApiKey()
              .otpType(otpType)
              .token(token)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiKeyApi#generateNewApiKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ApiKeyGenerateNewApiKeyResponse> response = client
              .apiKey
              .generateNewApiKey()
              .otpType(otpType)
              .token(token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiKeyApi#generateNewApiKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://staging-biz.coinprofile.co/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApiKeyApi* | [**generateNewApiKey**](docs/ApiKeyApi.md#generateNewApiKey) | **POST** /auth/api-key | Create api key
*BalanceApi* | [**getAccountBalance**](docs/BalanceApi.md#getAccountBalance) | **GET** /v1/balance | Retrieve merchant account balance
*BalanceApi* | [**getAccountBalance_0**](docs/BalanceApi.md#getAccountBalance_0) | **GET** /balance | Retrieve user&#39;s account balance
*BalanceApi* | [**transferFunds**](docs/BalanceApi.md#transferFunds) | **POST** /balance/transfer | Transfer funds
*BalanceApi* | [**withdrawFunds**](docs/BalanceApi.md#withdrawFunds) | **POST** /balance/withdraw | Withdraw balance
*BankApi* | [**getSupportedBanks**](docs/BankApi.md#getSupportedBanks) | **GET** /bank/supported | Retrieve a list of supported banks
*BankAccountApi* | [**verifyAndReturnDetails**](docs/BankAccountApi.md#verifyAndReturnDetails) | **POST** /bank/resolve | Resolve bank account
*CurrencyApi* | [**getMinimumAllowed**](docs/CurrencyApi.md#getMinimumAllowed) | **GET** /currency/minimum-allowed | Get minimum amount allowed
*CurrencyApi* | [**listSupportedCurrencies**](docs/CurrencyApi.md#listSupportedCurrencies) | **GET** /currency/supported | Get supported currencies
*MerchantsApi* | [**getRecord**](docs/MerchantsApi.md#getRecord) | **GET** /v1/merchants | Retrieve merchant record
*MerchantsApi* | [**updateRecord**](docs/MerchantsApi.md#updateRecord) | **PATCH** /v1/merchants | Update merchant record
*MockPaymentApi* | [**requestSubmission**](docs/MockPaymentApi.md#requestSubmission) | **POST** /v1/mock/payment | Make a mock payment
*PaymentApi* | [**createNewPayment**](docs/PaymentApi.md#createNewPayment) | **POST** /payment | Create payment
*PaymentApi* | [**getSingle**](docs/PaymentApi.md#getSingle) | **GET** /payment/{paymentId} | Get a single payment
*PaymentApi* | [**resolveOverpaidTransaction**](docs/PaymentApi.md#resolveOverpaidTransaction) | **GET** /payment/resolve | Resolve overpaid Transaction
*RatesApi* | [**getConversionRates**](docs/RatesApi.md#getConversionRates) | **GET** /v1/currency/rates | Retrieves conversion rates
*RatesApi* | [**getCurrentRates**](docs/RatesApi.md#getCurrentRates) | **GET** /currency/rate | Get current rates
*TransactionApi* | [**getDetails**](docs/TransactionApi.md#getDetails) | **GET** /transaction/{transactionId} | Get a transaction
*TransactionApi* | [**getUserTransactionSummary**](docs/TransactionApi.md#getUserTransactionSummary) | **GET** /transaction/summary | Retrieve user&#39;s transaction summary
*TransactionApi* | [**getUserTransactions**](docs/TransactionApi.md#getUserTransactions) | **GET** /transaction | Retrieve user&#39;s transaction records
*TransactionsApi* | [**getMerchantTransactionSummary**](docs/TransactionsApi.md#getMerchantTransactionSummary) | **GET** /v1/transactions/summary | Retrieve merchant transaction summary
*VoucherApi* | [**createPayment**](docs/VoucherApi.md#createPayment) | **POST** /v1/vouchers | Create a new voucher payment
*VoucherApi* | [**getMultipleRecords**](docs/VoucherApi.md#getMultipleRecords) | **GET** /v1/voucher/get-many | Get multiple records
*VoucherApi* | [**getRecord**](docs/VoucherApi.md#getRecord) | **GET** /v1/vouchers | Retrieve voucher record
*VoucherApi* | [**redeemAndWithdraw**](docs/VoucherApi.md#redeemAndWithdraw) | **PATCH** /v1/voucher | Redeem and withdraw
*VoucherApi* | [**redeemExistingUnused**](docs/VoucherApi.md#redeemExistingUnused) | **PATCH** /v1/vouchers | Redeem existing unused voucher
*VoucherFeeApi* | [**getFee**](docs/VoucherFeeApi.md#getFee) | **GET** /v1/voucher-fee | Retrieves conversion rates
*VoucherMinMaxAmountApi* | [**getMinMaxAmount**](docs/VoucherMinMaxAmountApi.md#getMinMaxAmount) | **GET** /v1/voucher-min-max | Retrieves minimum and maximum voucher amounts
*WalletApi* | [**executeTransfer**](docs/WalletApi.md#executeTransfer) | **POST** /wallet/transfer | Wallet transfer
*WalletApi* | [**getAddresses**](docs/WalletApi.md#getAddresses) | **GET** /wallet | Retrieves a user&#39;s crypto wallet addresses
*WalletApi* | [**getSupportedConfig**](docs/WalletApi.md#getSupportedConfig) | **GET** /wallet/supported/config | Get supported cryptocurrencies and network
*WebhookApi* | [**getCallbackUrl**](docs/WebhookApi.md#getCallbackUrl) | **GET** /callbackurl | Retrieve subscribed webhook url
*WebhookApi* | [**subscribeWebhookCallback**](docs/WebhookApi.md#subscribeWebhookCallback) | **PUT** /callbackurl | Subscribe to webhook


## Documentation for Models

 - [ApiKeyGenerateNewApiKeyRequest](docs/ApiKeyGenerateNewApiKeyRequest.md)
 - [ApiKeyGenerateNewApiKeyResponse](docs/ApiKeyGenerateNewApiKeyResponse.md)
 - [ApiKeyGenerateNewApiKeyResponseData](docs/ApiKeyGenerateNewApiKeyResponseData.md)
 - [BalanceGetAccountBalance200Response](docs/BalanceGetAccountBalance200Response.md)
 - [BalanceGetAccountBalance200ResponseData](docs/BalanceGetAccountBalance200ResponseData.md)
 - [BalanceGetAccountBalance200ResponseDataBalances](docs/BalanceGetAccountBalance200ResponseDataBalances.md)
 - [BalanceGetAccountBalanceResponse](docs/BalanceGetAccountBalanceResponse.md)
 - [BalanceGetAccountBalanceResponseData](docs/BalanceGetAccountBalanceResponseData.md)
 - [BalanceTransferFundsRequest](docs/BalanceTransferFundsRequest.md)
 - [BalanceTransferFundsResponse](docs/BalanceTransferFundsResponse.md)
 - [BalanceTransferFundsResponseData](docs/BalanceTransferFundsResponseData.md)
 - [BalanceWithdrawFundsRequest](docs/BalanceWithdrawFundsRequest.md)
 - [BalanceWithdrawFundsResponse](docs/BalanceWithdrawFundsResponse.md)
 - [BankAccountVerifyAndReturnDetailsRequest](docs/BankAccountVerifyAndReturnDetailsRequest.md)
 - [BankAccountVerifyAndReturnDetailsResponse](docs/BankAccountVerifyAndReturnDetailsResponse.md)
 - [BankAccountVerifyAndReturnDetailsResponseData](docs/BankAccountVerifyAndReturnDetailsResponseData.md)
 - [BankGetSupportedBanksResponse](docs/BankGetSupportedBanksResponse.md)
 - [BankGetSupportedBanksResponseDataInner](docs/BankGetSupportedBanksResponseDataInner.md)
 - [CurrencyGetMinimumAllowedResponse](docs/CurrencyGetMinimumAllowedResponse.md)
 - [CurrencyListSupportedCurrenciesResponse](docs/CurrencyListSupportedCurrenciesResponse.md)
 - [CurrencyListSupportedCurrenciesResponseData](docs/CurrencyListSupportedCurrenciesResponseData.md)
 - [MerchantsGetRecordResponse](docs/MerchantsGetRecordResponse.md)
 - [MerchantsGetRecordResponseData](docs/MerchantsGetRecordResponseData.md)
 - [MerchantsUpdateRecordRequest](docs/MerchantsUpdateRecordRequest.md)
 - [MerchantsUpdateRecordResponse](docs/MerchantsUpdateRecordResponse.md)
 - [MerchantsUpdateRecordResponseData](docs/MerchantsUpdateRecordResponseData.md)
 - [MockPaymentRequestSubmissionRequest](docs/MockPaymentRequestSubmissionRequest.md)
 - [MockPaymentRequestSubmissionResponse](docs/MockPaymentRequestSubmissionResponse.md)
 - [PaymentCreateNewPaymentRequest](docs/PaymentCreateNewPaymentRequest.md)
 - [PaymentCreateNewPaymentResponse](docs/PaymentCreateNewPaymentResponse.md)
 - [PaymentCreateNewPaymentResponseData](docs/PaymentCreateNewPaymentResponseData.md)
 - [PaymentGetSingleResponse](docs/PaymentGetSingleResponse.md)
 - [PaymentResolveOverpaidTransactionResponse](docs/PaymentResolveOverpaidTransactionResponse.md)
 - [RatesGetConversionRatesResponse](docs/RatesGetConversionRatesResponse.md)
 - [RatesGetConversionRatesResponseData](docs/RatesGetConversionRatesResponseData.md)
 - [RatesGetConversionRatesResponseDataUSDNGN](docs/RatesGetConversionRatesResponseDataUSDNGN.md)
 - [RatesGetCurrentRatesResponse](docs/RatesGetCurrentRatesResponse.md)
 - [RatesGetCurrentRatesResponseData](docs/RatesGetCurrentRatesResponseData.md)
 - [RatesGetCurrentRatesResponseDataYOURCURRENCY](docs/RatesGetCurrentRatesResponseDataYOURCURRENCY.md)
 - [TransactionGetDetailsResponse](docs/TransactionGetDetailsResponse.md)
 - [TransactionGetUserTransactionSummaryResponse](docs/TransactionGetUserTransactionSummaryResponse.md)
 - [TransactionGetUserTransactionSummaryResponseData](docs/TransactionGetUserTransactionSummaryResponseData.md)
 - [TransactionGetUserTransactionSummaryResponseDataSummary](docs/TransactionGetUserTransactionSummaryResponseDataSummary.md)
 - [TransactionGetUserTransactionsResponse](docs/TransactionGetUserTransactionsResponse.md)
 - [TransactionGetUserTransactionsResponseData](docs/TransactionGetUserTransactionsResponseData.md)
 - [TransactionGetUserTransactionsResponseDataDataInner](docs/TransactionGetUserTransactionsResponseDataDataInner.md)
 - [TransactionsGetMerchantTransactionSummaryResponse](docs/TransactionsGetMerchantTransactionSummaryResponse.md)
 - [TransactionsGetMerchantTransactionSummaryResponseData](docs/TransactionsGetMerchantTransactionSummaryResponseData.md)
 - [VoucherCreatePaymentRequest](docs/VoucherCreatePaymentRequest.md)
 - [VoucherCreatePaymentResponse](docs/VoucherCreatePaymentResponse.md)
 - [VoucherCreatePaymentResponseData](docs/VoucherCreatePaymentResponseData.md)
 - [VoucherFeeGetFeeResponse](docs/VoucherFeeGetFeeResponse.md)
 - [VoucherFeeGetFeeResponseData](docs/VoucherFeeGetFeeResponseData.md)
 - [VoucherGetMultipleRecordsResponse](docs/VoucherGetMultipleRecordsResponse.md)
 - [VoucherGetMultipleRecordsResponseDataInner](docs/VoucherGetMultipleRecordsResponseDataInner.md)
 - [VoucherGetMultipleRecordsResponseMeta](docs/VoucherGetMultipleRecordsResponseMeta.md)
 - [VoucherGetRecordResponse](docs/VoucherGetRecordResponse.md)
 - [VoucherGetRecordResponseDataInner](docs/VoucherGetRecordResponseDataInner.md)
 - [VoucherMinmaxAmountGetMinMaxAmountResponse](docs/VoucherMinmaxAmountGetMinMaxAmountResponse.md)
 - [VoucherMinmaxAmountGetMinMaxAmountResponseData](docs/VoucherMinmaxAmountGetMinMaxAmountResponseData.md)
 - [VoucherMinmaxAmountGetMinMaxAmountResponseDataNGN](docs/VoucherMinmaxAmountGetMinMaxAmountResponseDataNGN.md)
 - [VoucherMinmaxAmountGetMinMaxAmountResponseDataUSD](docs/VoucherMinmaxAmountGetMinMaxAmountResponseDataUSD.md)
 - [VoucherRedeemAndWithdrawRequest](docs/VoucherRedeemAndWithdrawRequest.md)
 - [VoucherRedeemAndWithdrawResponse](docs/VoucherRedeemAndWithdrawResponse.md)
 - [VoucherRedeemAndWithdrawResponseData](docs/VoucherRedeemAndWithdrawResponseData.md)
 - [VoucherRedeemExistingUnusedRequest](docs/VoucherRedeemExistingUnusedRequest.md)
 - [VoucherRedeemExistingUnusedResponse](docs/VoucherRedeemExistingUnusedResponse.md)
 - [VoucherRedeemExistingUnusedResponseData](docs/VoucherRedeemExistingUnusedResponseData.md)
 - [WalletExecuteTransferRequest](docs/WalletExecuteTransferRequest.md)
 - [WalletExecuteTransferResponse](docs/WalletExecuteTransferResponse.md)
 - [WalletExecuteTransferResponseData](docs/WalletExecuteTransferResponseData.md)
 - [WalletExecuteTransferResponseDataTransferDetail](docs/WalletExecuteTransferResponseDataTransferDetail.md)
 - [WalletGetAddressesResponse](docs/WalletGetAddressesResponse.md)
 - [WalletGetAddressesResponseWallet](docs/WalletGetAddressesResponseWallet.md)
 - [WalletGetSupportedConfigResponse](docs/WalletGetSupportedConfigResponse.md)
 - [WalletGetSupportedConfigResponseData](docs/WalletGetSupportedConfigResponseData.md)
 - [WebhookGetCallbackUrlResponse](docs/WebhookGetCallbackUrlResponse.md)
 - [WebhookGetCallbackUrlResponseData](docs/WebhookGetCallbackUrlResponseData.md)
 - [WebhookSubscribeWebhookCallbackRequest](docs/WebhookSubscribeWebhookCallbackRequest.md)
 - [WebhookSubscribeWebhookCallbackResponse](docs/WebhookSubscribeWebhookCallbackResponse.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
