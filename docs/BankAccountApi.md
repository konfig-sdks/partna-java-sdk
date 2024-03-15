# BankAccountApi

All URIs are relative to *https://staging-biz.coinprofile.co/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**verifyAndReturnDetails**](BankAccountApi.md#verifyAndReturnDetails) | **POST** /bank/resolve | Resolve bank account |


<a name="verifyAndReturnDetails"></a>
# **verifyAndReturnDetails**
> BankAccountVerifyAndReturnDetailsResponse verifyAndReturnDetails(bankAccountVerifyAndReturnDetailsRequest).execute();

Resolve bank account

Verifies the bank account and returns the bank account details

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BankAccountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://staging-biz.coinprofile.co/v2";
    Partna client = new Partna(configuration);
    String accountNumber = "accountNumber_example"; // The account number.
    String bankCode = "bankCode_example"; // The bank code.
    try {
      BankAccountVerifyAndReturnDetailsResponse result = client
              .bankAccount
              .verifyAndReturnDetails(accountNumber, bankCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountApi#verifyAndReturnDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BankAccountVerifyAndReturnDetailsResponse> response = client
              .bankAccount
              .verifyAndReturnDetails(accountNumber, bankCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountApi#verifyAndReturnDetails");
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
| **bankAccountVerifyAndReturnDetailsRequest** | [**BankAccountVerifyAndReturnDetailsRequest**](BankAccountVerifyAndReturnDetailsRequest.md)|  | |

### Return type

[**BankAccountVerifyAndReturnDetailsResponse**](BankAccountVerifyAndReturnDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

