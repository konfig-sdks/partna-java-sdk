# PaymentApi

All URIs are relative to *https://staging-biz.coinprofile.co/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewPayment**](PaymentApi.md#createNewPayment) | **POST** /payment | Create payment |
| [**getSingle**](PaymentApi.md#getSingle) | **GET** /payment/{paymentId} | Get a single payment |
| [**resolveOverpaidTransaction**](PaymentApi.md#resolveOverpaidTransaction) | **GET** /payment/resolve | Resolve overpaid Transaction |


<a name="createNewPayment"></a>
# **createNewPayment**
> PaymentCreateNewPaymentResponse createNewPayment(paymentCreateNewPaymentRequest).execute();

Create payment

Create a new payment

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    String businessId = "businessId_example"; // The business id
    String customerEmail = "customerEmail_example"; // The rate key
    String incomingCurrency = "incomingCurrency_example"; // The incoming currency
    String outgoingCurrency = "outgoingCurrency_example"; // The outgoing currency
    String paymentType = "paymentType_example"; // The payment type
    String accountName = "accountName_example"; // The account name. Required when paymentType is bank
    String accountNumber = "accountNumber_example"; // The account number. Required when paymentType is bank
    String bank = "bank_example"; // The bank name. Required when paymentType is bank
    String bankCode = "bankCode_example"; // The bank code. Required when paymentType is bank
    String coinprofileUsername = "coinprofileUsername_example"; // The coinprofile username. Required when paymentType is profile
    String country = "country_example"; // The country. Required when paymentType is bank
    Double incomingAmount = 3.4D; // The incoming amount
    Double outgoingAmount = 3.4D; // The outgoing amount
    String rateKey = "rateKey_example"; // The rate key
    String reference = "reference_example"; // The reference
    try {
      PaymentCreateNewPaymentResponse result = client
              .payment
              .createNewPayment(businessId, customerEmail, incomingCurrency, outgoingCurrency, paymentType)
              .accountName(accountName)
              .accountNumber(accountNumber)
              .bank(bank)
              .bankCode(bankCode)
              .coinprofileUsername(coinprofileUsername)
              .country(country)
              .incomingAmount(incomingAmount)
              .outgoingAmount(outgoingAmount)
              .rateKey(rateKey)
              .reference(reference)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createNewPayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentCreateNewPaymentResponse> response = client
              .payment
              .createNewPayment(businessId, customerEmail, incomingCurrency, outgoingCurrency, paymentType)
              .accountName(accountName)
              .accountNumber(accountNumber)
              .bank(bank)
              .bankCode(bankCode)
              .coinprofileUsername(coinprofileUsername)
              .country(country)
              .incomingAmount(incomingAmount)
              .outgoingAmount(outgoingAmount)
              .rateKey(rateKey)
              .reference(reference)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createNewPayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paymentCreateNewPaymentRequest** | [**PaymentCreateNewPaymentRequest**](PaymentCreateNewPaymentRequest.md)|  | |

### Return type

[**PaymentCreateNewPaymentResponse**](PaymentCreateNewPaymentResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [ApiUser](../README.md#ApiUser), [UserVersion](../README.md#UserVersion)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getSingle"></a>
# **getSingle**
> PaymentGetSingleResponse getSingle(paymentId).execute();

Get a single payment

Get a single payment

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
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
    String paymentId = "paymentId_example"; // The ID of the created payment
    try {
      PaymentGetSingleResponse result = client
              .payment
              .getSingle(paymentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentGetSingleResponse> response = client
              .payment
              .getSingle(paymentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paymentId** | **String**| The ID of the created payment | |

### Return type

[**PaymentGetSingleResponse**](PaymentGetSingleResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [ApiUser](../README.md#ApiUser), [UserVersion](../README.md#UserVersion)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="resolveOverpaidTransaction"></a>
# **resolveOverpaidTransaction**
> PaymentResolveOverpaidTransactionResponse resolveOverpaidTransaction(id, option).execute();

Resolve overpaid Transaction

Resolve overpaid Transaction

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://staging-biz.coinprofile.co/v2";
    Partna client = new Partna(configuration);
    String id = "id_example"; // The ID of the unresolved transaction
    String option = "refundexcess"; // This is the way you want the transaction to be completed. Either refundExcess or PayAll option
    try {
      PaymentResolveOverpaidTransactionResponse result = client
              .payment
              .resolveOverpaidTransaction(id, option)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#resolveOverpaidTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PaymentResolveOverpaidTransactionResponse> response = client
              .payment
              .resolveOverpaidTransaction(id, option)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#resolveOverpaidTransaction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the unresolved transaction | |
| **option** | **String**| This is the way you want the transaction to be completed. Either refundExcess or PayAll option | [enum: refundexcess, payall] |

### Return type

[**PaymentResolveOverpaidTransactionResponse**](PaymentResolveOverpaidTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

