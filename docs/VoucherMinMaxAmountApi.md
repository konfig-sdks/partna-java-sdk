# VoucherMinMaxAmountApi

All URIs are relative to *https://staging-biz.coinprofile.co/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMinMaxAmount**](VoucherMinMaxAmountApi.md#getMinMaxAmount) | **GET** /v1/voucher-min-max | Retrieves minimum and maximum voucher amounts |


<a name="getMinMaxAmount"></a>
# **getMinMaxAmount**
> VoucherMinmaxAmountGetMinMaxAmountResponse getMinMaxAmount().currency(currency).execute();

Retrieves minimum and maximum voucher amounts

Retrieves minimum and maximum voucher amounts for each currency.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VoucherMinMaxAmountApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://staging-biz.coinprofile.co/v2";
    Partna client = new Partna(configuration);
    String currency = "NGN"; // Voucher currency
    try {
      VoucherMinmaxAmountGetMinMaxAmountResponse result = client
              .voucherMinMaxAmount
              .getMinMaxAmount()
              .currency(currency)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherMinMaxAmountApi#getMinMaxAmount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VoucherMinmaxAmountGetMinMaxAmountResponse> response = client
              .voucherMinMaxAmount
              .getMinMaxAmount()
              .currency(currency)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherMinMaxAmountApi#getMinMaxAmount");
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
| **currency** | **String**| Voucher currency | [optional] [enum: NGN, USD] |

### Return type

[**VoucherMinmaxAmountGetMinMaxAmountResponse**](VoucherMinmaxAmountGetMinMaxAmountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

