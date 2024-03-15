# BankApi

All URIs are relative to *https://staging-biz.coinprofile.co/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSupportedBanks**](BankApi.md#getSupportedBanks) | **GET** /bank/supported | Retrieve a list of supported banks |


<a name="getSupportedBanks"></a>
# **getSupportedBanks**
> BankGetSupportedBanksResponse getSupportedBanks().country(country).execute();

Retrieve a list of supported banks

Retrieve a list of supported banks

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BankApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://staging-biz.coinprofile.co/v2";
    Partna client = new Partna(configuration);
    String country = "country_example"; // The country from which to retrieve supported banks
    try {
      BankGetSupportedBanksResponse result = client
              .bank
              .getSupportedBanks()
              .country(country)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankApi#getSupportedBanks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BankGetSupportedBanksResponse> response = client
              .bank
              .getSupportedBanks()
              .country(country)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankApi#getSupportedBanks");
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
| **country** | **String**| The country from which to retrieve supported banks | [optional] |

### Return type

[**BankGetSupportedBanksResponse**](BankGetSupportedBanksResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

