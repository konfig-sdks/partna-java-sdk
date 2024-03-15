# MockPaymentApi

All URIs are relative to *https://staging-biz.coinprofile.co/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**requestSubmission**](MockPaymentApi.md#requestSubmission) | **POST** /v1/mock/payment | Make a mock payment |


<a name="requestSubmission"></a>
# **requestSubmission**
> MockPaymentRequestSubmissionResponse requestSubmission(mockPaymentRequestSubmissionRequest).execute();

Make a mock payment

Sends a mock payment request (only in staging environment)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MockPaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://staging-biz.coinprofile.co/v2";
    Partna client = new Partna(configuration);
    String voucherId = "voucherId_example"; // ID of the voucher to be paid
    Integer amount = 56; // Amount to pay. This can be used to simulate overpayment and underpayment in staging environment. If this field is not provided, the expected amount will be paid.
    try {
      MockPaymentRequestSubmissionResponse result = client
              .mockPayment
              .requestSubmission(voucherId)
              .amount(amount)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling MockPaymentApi#requestSubmission");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MockPaymentRequestSubmissionResponse> response = client
              .mockPayment
              .requestSubmission(voucherId)
              .amount(amount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MockPaymentApi#requestSubmission");
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
| **mockPaymentRequestSubmissionRequest** | [**MockPaymentRequestSubmissionRequest**](MockPaymentRequestSubmissionRequest.md)|  | |

### Return type

[**MockPaymentRequestSubmissionResponse**](MockPaymentRequestSubmissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |

