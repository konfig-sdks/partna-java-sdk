# WebhookApi

All URIs are relative to *https://staging-biz.coinprofile.co/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCallbackUrl**](WebhookApi.md#getCallbackUrl) | **GET** /callbackurl | Retrieve subscribed webhook url |
| [**subscribeWebhookCallback**](WebhookApi.md#subscribeWebhookCallback) | **PUT** /callbackurl | Subscribe to webhook |


<a name="getCallbackUrl"></a>
# **getCallbackUrl**
> WebhookGetCallbackUrlResponse getCallbackUrl().execute();

Retrieve subscribed webhook url

Retrieve the callback url used as webhook

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhookApi;
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
    try {
      WebhookGetCallbackUrlResponse result = client
              .webhook
              .getCallbackUrl()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#getCallbackUrl");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebhookGetCallbackUrlResponse> response = client
              .webhook
              .getCallbackUrl()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#getCallbackUrl");
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

[**WebhookGetCallbackUrlResponse**](WebhookGetCallbackUrlResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [ApiUser](../README.md#ApiUser), [UserVersion](../README.md#UserVersion)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="subscribeWebhookCallback"></a>
# **subscribeWebhookCallback**
> WebhookSubscribeWebhookCallbackResponse subscribeWebhookCallback(webhookSubscribeWebhookCallbackRequest).execute();

Subscribe to webhook

Set the callback url that will be used as webhook

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhookApi;
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
    String callbackUrl = "callbackUrl_example"; // The callback url. e.g. https://www.example.com/callback
    try {
      WebhookSubscribeWebhookCallbackResponse result = client
              .webhook
              .subscribeWebhookCallback(callbackUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#subscribeWebhookCallback");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebhookSubscribeWebhookCallbackResponse> response = client
              .webhook
              .subscribeWebhookCallback(callbackUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#subscribeWebhookCallback");
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
| **webhookSubscribeWebhookCallbackRequest** | [**WebhookSubscribeWebhookCallbackRequest**](WebhookSubscribeWebhookCallbackRequest.md)|  | |

### Return type

[**WebhookSubscribeWebhookCallbackResponse**](WebhookSubscribeWebhookCallbackResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [ApiUser](../README.md#ApiUser), [UserVersion](../README.md#UserVersion)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

