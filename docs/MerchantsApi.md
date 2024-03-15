# MerchantsApi

All URIs are relative to *https://staging-biz.coinprofile.co/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRecord**](MerchantsApi.md#getRecord) | **GET** /v1/merchants | Retrieve merchant record |
| [**updateRecord**](MerchantsApi.md#updateRecord) | **PATCH** /v1/merchants | Update merchant record |


<a name="getRecord"></a>
# **getRecord**
> MerchantsGetRecordResponse getRecord().execute();

Retrieve merchant record

Retrieves merchant record - username, email, callback URL, merchant logo, creditCurrency, API key expiry date-time

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MerchantsApi;
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
    try {
      MerchantsGetRecordResponse result = client
              .merchants
              .getRecord()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantsApi#getRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MerchantsGetRecordResponse> response = client
              .merchants
              .getRecord()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantsApi#getRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MerchantsGetRecordResponse**](MerchantsGetRecordResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [ApiUser](../README.md#ApiUser)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="updateRecord"></a>
# **updateRecord**
> MerchantsUpdateRecordResponse updateRecord(merchantsUpdateRecordRequest).execute();

Update merchant record

Updates merchant record

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MerchantsApi;
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
    String callbackUrl = "callbackUrl_example"; // Merchant callback URL. Webhook will be sent to this URL.
    String creditCurrency = "NGN"; // Merchants can set this property to their desired currency. Their balance on Ventogram will be credited with this currency when their users redeem voucher created on Ventogram. Conversion between different currencies will be performed at the rate which is obtainable at the time of redeeming the voucher. If this is not set by the merchant,  their balance will be credited with the currency used in creating the voucher.
    String feeBearer = "client"; // Bearer of the voucher fee
    String logo = "logo_example"; // Merchant logo URL
    try {
      MerchantsUpdateRecordResponse result = client
              .merchants
              .updateRecord()
              .callbackUrl(callbackUrl)
              .creditCurrency(creditCurrency)
              .feeBearer(feeBearer)
              .logo(logo)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantsApi#updateRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MerchantsUpdateRecordResponse> response = client
              .merchants
              .updateRecord()
              .callbackUrl(callbackUrl)
              .creditCurrency(creditCurrency)
              .feeBearer(feeBearer)
              .logo(logo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantsApi#updateRecord");
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
| **merchantsUpdateRecordRequest** | [**MerchantsUpdateRecordRequest**](MerchantsUpdateRecordRequest.md)|  | |

### Return type

[**MerchantsUpdateRecordResponse**](MerchantsUpdateRecordResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [ApiUser](../README.md#ApiUser)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

