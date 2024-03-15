# BalanceApi

All URIs are relative to *https://staging-biz.coinprofile.co/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAccountBalance**](BalanceApi.md#getAccountBalance) | **GET** /v1/balance | Retrieve merchant account balance |
| [**getAccountBalance_0**](BalanceApi.md#getAccountBalance_0) | **GET** /balance | Retrieve user&#39;s account balance |
| [**transferFunds**](BalanceApi.md#transferFunds) | **POST** /balance/transfer | Transfer funds |
| [**withdrawFunds**](BalanceApi.md#withdrawFunds) | **POST** /balance/withdraw | Withdraw balance |


<a name="getAccountBalance"></a>
# **getAccountBalance**
> BalanceGetAccountBalanceResponse getAccountBalance(currency).execute();

Retrieve merchant account balance

Retrieves account balance for the selected currency

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BalanceApi;
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
      BalanceGetAccountBalanceResponse result = client
              .balance
              .getAccountBalance(currency)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceApi#getAccountBalance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BalanceGetAccountBalanceResponse> response = client
              .balance
              .getAccountBalance(currency)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceApi#getAccountBalance");
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

[**BalanceGetAccountBalanceResponse**](BalanceGetAccountBalanceResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [ApiUser](../README.md#ApiUser)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getAccountBalance_0"></a>
# **getAccountBalance_0**
> BalanceGetAccountBalance200Response getAccountBalance_0().currency(currency).execute();

Retrieve user&#39;s account balance

Retrieves account balance for each currency

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BalanceApi;
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
    String currency = "NGN"; // Currency for which balance is to be retrieved. When this is not supplied, balance will be retrieved for all available currencies.
    try {
      BalanceGetAccountBalance200Response result = client
              .balance
              .getAccountBalance_0()
              .currency(currency)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceApi#getAccountBalance_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BalanceGetAccountBalance200Response> response = client
              .balance
              .getAccountBalance_0()
              .currency(currency)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceApi#getAccountBalance_0");
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
| **currency** | **String**| Currency for which balance is to be retrieved. When this is not supplied, balance will be retrieved for all available currencies. | [optional] [enum: NGN, USD, USDT] |

### Return type

[**BalanceGetAccountBalance200Response**](BalanceGetAccountBalance200Response.md)

### Authorization

[ApiKey](../README.md#ApiKey), [ApiUser](../README.md#ApiUser), [UserVersion](../README.md#UserVersion)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="transferFunds"></a>
# **transferFunds**
> BalanceTransferFundsResponse transferFunds(balanceTransferFundsRequest).execute();

Transfer funds

Transfer funds from user&#39;s balance to another user (fiat-to-fiat)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BalanceApi;
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
    String currency = "NGN"; // Currency being sent.
    String receiverUsername = "receiverUsername_example"; // Receiver's coinprofile username.
    String amount = "amount_example"; // Amount to transfer.
    String memo = "memo_example"; // Transaction memo.
    String otpType = "otp"; // The type of OTP to be used.
    String token = "token_example"; // The token to be used for OTP.
    try {
      BalanceTransferFundsResponse result = client
              .balance
              .transferFunds(currency, receiverUsername)
              .amount(amount)
              .memo(memo)
              .otpType(otpType)
              .token(token)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceApi#transferFunds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BalanceTransferFundsResponse> response = client
              .balance
              .transferFunds(currency, receiverUsername)
              .amount(amount)
              .memo(memo)
              .otpType(otpType)
              .token(token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceApi#transferFunds");
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
| **balanceTransferFundsRequest** | [**BalanceTransferFundsRequest**](BalanceTransferFundsRequest.md)|  | |

### Return type

[**BalanceTransferFundsResponse**](BalanceTransferFundsResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [ApiUser](../README.md#ApiUser), [UserVersion](../README.md#UserVersion)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="withdrawFunds"></a>
# **withdrawFunds**
> BalanceWithdrawFundsResponse withdrawFunds(balanceWithdrawFundsRequest).execute();

Withdraw balance

Withdraw funds from the user&#39;s balance

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BalanceApi;
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
    String accountName = "accountName_example"; // The account name. This is the name of the account holder.
    String accountNumber = "accountNumber_example"; // The account number of the user's bank account.
    String amount = "amount_example"; // The amount to be withdrawn.
    String bank = "bank_example"; // The bank name. e.g. \\\"Access Bank\\\".
    String bankCode = "bankCode_example"; // The bank code. e.g. \\\"044\\\".
    String currency = "currency_example"; // The currency of the withdrawal.
    String otpType = "otp"; // The type of OTP to be used.
    String token = "token_example"; // The token to be used for OTP.
    try {
      BalanceWithdrawFundsResponse result = client
              .balance
              .withdrawFunds(accountName, accountNumber, amount, bank, bankCode, currency, otpType)
              .token(token)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceApi#withdrawFunds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BalanceWithdrawFundsResponse> response = client
              .balance
              .withdrawFunds(accountName, accountNumber, amount, bank, bankCode, currency, otpType)
              .token(token)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BalanceApi#withdrawFunds");
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
| **balanceWithdrawFundsRequest** | [**BalanceWithdrawFundsRequest**](BalanceWithdrawFundsRequest.md)|  | |

### Return type

[**BalanceWithdrawFundsResponse**](BalanceWithdrawFundsResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [ApiUser](../README.md#ApiUser), [UserVersion](../README.md#UserVersion)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

