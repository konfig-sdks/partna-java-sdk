# TransactionsApi

All URIs are relative to *https://staging-biz.coinprofile.co/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMerchantTransactionSummary**](TransactionsApi.md#getMerchantTransactionSummary) | **GET** /v1/transactions/summary | Retrieve merchant transaction summary |


<a name="getMerchantTransactionSummary"></a>
# **getMerchantTransactionSummary**
> TransactionsGetMerchantTransactionSummaryResponse getMerchantTransactionSummary(currency).execute();

Retrieve merchant transaction summary

Retrieves transaction summary for the selected currency for a merchant

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://staging-biz.coinprofile.co/v2";
    
    configuration.apiKey  = "YOUR API KEY";
    
    configuration.apiUser  = "YOUR API KEY";
    Partna client = new Partna(configuration);
    String currency = "NGN"; // One of supported currencies
    try {
      TransactionsGetMerchantTransactionSummaryResponse result = client
              .transactions
              .getMerchantTransactionSummary(currency)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getMerchantTransactionSummary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TransactionsGetMerchantTransactionSummaryResponse> response = client
              .transactions
              .getMerchantTransactionSummary(currency)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getMerchantTransactionSummary");
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
| **currency** | **String**| One of supported currencies | [enum: NGN, USD] |

### Return type

[**TransactionsGetMerchantTransactionSummaryResponse**](TransactionsGetMerchantTransactionSummaryResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [ApiUser](../README.md#ApiUser)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

