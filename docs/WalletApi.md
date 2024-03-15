# WalletApi

All URIs are relative to *https://staging-biz.coinprofile.co/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**executeTransfer**](WalletApi.md#executeTransfer) | **POST** /wallet/transfer | Wallet transfer |
| [**getAddresses**](WalletApi.md#getAddresses) | **GET** /wallet | Retrieves a user&#39;s crypto wallet addresses |
| [**getSupportedConfig**](WalletApi.md#getSupportedConfig) | **GET** /wallet/supported/config | Get supported cryptocurrencies and network |


<a name="executeTransfer"></a>
# **executeTransfer**
> WalletExecuteTransferResponse executeTransfer(walletExecuteTransferRequest).execute();

Wallet transfer

Transfer crypto from one wallet address to another

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WalletApi;
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
    String address = "address_example"; // Wallet address to transfer crypto
    Double amount = 3.4D; // Amount of crypto to be transferred
    String currency = "currency_example"; // Currency of the crypto to be transferred
    String network = "network_example"; // Network on which crypto is to be transferred
    String memo = "memo_example"; // Optional transaction memo
    String walletType = "walletType_example"; // Wallet type
    try {
      WalletExecuteTransferResponse result = client
              .wallet
              .executeTransfer(address, amount, currency, network)
              .memo(memo)
              .walletType(walletType)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletApi#executeTransfer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WalletExecuteTransferResponse> response = client
              .wallet
              .executeTransfer(address, amount, currency, network)
              .memo(memo)
              .walletType(walletType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletApi#executeTransfer");
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
| **walletExecuteTransferRequest** | [**WalletExecuteTransferRequest**](WalletExecuteTransferRequest.md)|  | |

### Return type

[**WalletExecuteTransferResponse**](WalletExecuteTransferResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [ApiUser](../README.md#ApiUser), [UserVersion](../README.md#UserVersion)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getAddresses"></a>
# **getAddresses**
> WalletGetAddressesResponse getAddresses().currency(currency).network(network).execute();

Retrieves a user&#39;s crypto wallet addresses

get wallet

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WalletApi;
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
    String currency = "currency_example"; // The cryptocurrency for which address will be retrieved
    String network = "network_example"; // The crypto network of the retrieved wallet address
    try {
      WalletGetAddressesResponse result = client
              .wallet
              .getAddresses()
              .currency(currency)
              .network(network)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
      System.out.println(result.getSuccess());
      System.out.println(result.getWallet());
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletApi#getAddresses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WalletGetAddressesResponse> response = client
              .wallet
              .getAddresses()
              .currency(currency)
              .network(network)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletApi#getAddresses");
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
| **currency** | **String**| The cryptocurrency for which address will be retrieved | [optional] |
| **network** | **String**| The crypto network of the retrieved wallet address | [optional] |

### Return type

[**WalletGetAddressesResponse**](WalletGetAddressesResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [ApiUser](../README.md#ApiUser), [UserVersion](../README.md#UserVersion)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successfully retrieved wallet |  -  |

<a name="getSupportedConfig"></a>
# **getSupportedConfig**
> WalletGetSupportedConfigResponse getSupportedConfig().execute();

Get supported cryptocurrencies and network

Get supported cryptocurrencies and networks

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WalletApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://staging-biz.coinprofile.co/v2";
    Partna client = new Partna(configuration);
    try {
      WalletGetSupportedConfigResponse result = client
              .wallet
              .getSupportedConfig()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getState());
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletApi#getSupportedConfig");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WalletGetSupportedConfigResponse> response = client
              .wallet
              .getSupportedConfig()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletApi#getSupportedConfig");
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

[**WalletGetSupportedConfigResponse**](WalletGetSupportedConfigResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

