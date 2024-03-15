# TransactionApi

All URIs are relative to *https://staging-biz.coinprofile.co/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDetails**](TransactionApi.md#getDetails) | **GET** /transaction/{transactionId} | Get a transaction |
| [**getUserTransactionSummary**](TransactionApi.md#getUserTransactionSummary) | **GET** /transaction/summary | Retrieve user&#39;s transaction summary |
| [**getUserTransactions**](TransactionApi.md#getUserTransactions) | **GET** /transaction | Retrieve user&#39;s transaction records |


<a name="getDetails"></a>
# **getDetails**
> TransactionGetDetailsResponse getDetails(transactionId).execute();

Get a transaction

Get a transaction

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
    String transactionId = "transactionId_example";
    try {
      TransactionGetDetailsResponse result = client
              .transaction
              .getDetails(transactionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAmount());
      System.out.println(result.getBusinessId());
      System.out.println(result.getCurrency());
      System.out.println(result.getFromAmount());
      System.out.println(result.getFromCurrency());
      System.out.println(result.getIsFromRegUser());
      System.out.println(result.getMemo());
      System.out.println(result.getMessage());
      System.out.println(result.getPrevBalance());
      System.out.println(result.getSender());
      System.out.println(result.getStatus());
      System.out.println(result.getSuccess());
      System.out.println(result.getTransactionId());
      System.out.println(result.getType());
      System.out.println(result.getUsername());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TransactionGetDetailsResponse> response = client
              .transaction
              .getDetails(transactionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getDetails");
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
| **transactionId** | **String**|  | |

### Return type

[**TransactionGetDetailsResponse**](TransactionGetDetailsResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [ApiUser](../README.md#ApiUser), [UserVersion](../README.md#UserVersion)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getUserTransactionSummary"></a>
# **getUserTransactionSummary**
> TransactionGetUserTransactionSummaryResponse getUserTransactionSummary().currency(currency).type(type).page(page).limit(limit).duration(duration).execute();

Retrieve user&#39;s transaction summary

Retrieves all user transactions summary

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
    String currency = "NGN"; // Currency for which transactions are to be retrieved. When this is not supplied, transactions will be retrieved for all available currencies.
    String type = "deposit"; // Type of transactions to be retrieved. When this is not supplied, transactions will be retrieved for all available types.
    Double page = 3.4D; // Number of pages to be retrieved.
    Double limit = 3.4D; // Number of transaction records to be retrieved per page page.
    Double duration = nullD; // Duration of the transaction to be retrieved per page page.
    try {
      TransactionGetUserTransactionSummaryResponse result = client
              .transaction
              .getUserTransactionSummary()
              .currency(currency)
              .type(type)
              .page(page)
              .limit(limit)
              .duration(duration)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getUserTransactionSummary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TransactionGetUserTransactionSummaryResponse> response = client
              .transaction
              .getUserTransactionSummary()
              .currency(currency)
              .type(type)
              .page(page)
              .limit(limit)
              .duration(duration)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getUserTransactionSummary");
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
| **currency** | **String**| Currency for which transactions are to be retrieved. When this is not supplied, transactions will be retrieved for all available currencies. | [optional] [enum: NGN, USD] |
| **type** | **String**| Type of transactions to be retrieved. When this is not supplied, transactions will be retrieved for all available types. | [optional] [enum: deposit, withdrawal, sent, transfer, internalTransfer, conversion] |
| **page** | **Double**| Number of pages to be retrieved. | [optional] |
| **limit** | **Double**| Number of transaction records to be retrieved per page page. | [optional] |
| **duration** | **Double**| Duration of the transaction to be retrieved per page page. | [optional] [enum: , , , ] |

### Return type

[**TransactionGetUserTransactionSummaryResponse**](TransactionGetUserTransactionSummaryResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [ApiUser](../README.md#ApiUser), [UserVersion](../README.md#UserVersion)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getUserTransactions"></a>
# **getUserTransactions**
> TransactionGetUserTransactionsResponse getUserTransactions().currency(currency).type(type).page(page).limit(limit).duration(duration).execute();

Retrieve user&#39;s transaction records

Retrieves all user transactions

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionApi;
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
    String currency = "NGN"; // Currency for which transactions are to be retrieved. When this is not supplied, transactions will be retrieved for all available currencies.
    String type = "deposit"; // Type of transactions to be retrieved. When this is not supplied, transactions will be retrieved for all available types.
    Double page = 3.4D; // Number of pages to be retrieved.
    Double limit = 3.4D; // Number of transaction records to be retrieved per page page.
    Double duration = nullD; // Duration of the transaction to be retrieved per page page.
    try {
      TransactionGetUserTransactionsResponse result = client
              .transaction
              .getUserTransactions()
              .currency(currency)
              .type(type)
              .page(page)
              .limit(limit)
              .duration(duration)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getUserTransactions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TransactionGetUserTransactionsResponse> response = client
              .transaction
              .getUserTransactions()
              .currency(currency)
              .type(type)
              .page(page)
              .limit(limit)
              .duration(duration)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getUserTransactions");
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
| **currency** | **String**| Currency for which transactions are to be retrieved. When this is not supplied, transactions will be retrieved for all available currencies. | [optional] [enum: NGN, USD] |
| **type** | **String**| Type of transactions to be retrieved. When this is not supplied, transactions will be retrieved for all available types. | [optional] [enum: deposit, withdrawal, sent, transfer, internalTransfer, conversion] |
| **page** | **Double**| Number of pages to be retrieved. | [optional] |
| **limit** | **Double**| Number of transaction records to be retrieved per page page. | [optional] |
| **duration** | **Double**| Duration of the transaction to be retrieved per page page. | [optional] [enum: , , , ] |

### Return type

[**TransactionGetUserTransactionsResponse**](TransactionGetUserTransactionsResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [ApiUser](../README.md#ApiUser), [UserVersion](../README.md#UserVersion)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

