# VoucherApi

All URIs are relative to *https://staging-biz.coinprofile.co/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPayment**](VoucherApi.md#createPayment) | **POST** /v1/vouchers | Create a new voucher payment |
| [**getMultipleRecords**](VoucherApi.md#getMultipleRecords) | **GET** /v1/voucher/get-many | Get multiple records |
| [**getRecord**](VoucherApi.md#getRecord) | **GET** /v1/vouchers | Retrieve voucher record |
| [**redeemAndWithdraw**](VoucherApi.md#redeemAndWithdraw) | **PATCH** /v1/voucher | Redeem and withdraw |
| [**redeemExistingUnused**](VoucherApi.md#redeemExistingUnused) | **PATCH** /v1/vouchers | Redeem existing unused voucher |


<a name="createPayment"></a>
# **createPayment**
> VoucherCreatePaymentResponse createPayment(voucherCreatePaymentRequest).execute();

Create a new voucher payment

Creates a new voucher payment for a user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VoucherApi;
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
    Integer amount = 56; // Required voucher amount
    String currency = "NGN"; // Required voucher currency
    String email = "email_example"; // User email
    String fullname = "fullname_example"; // Fullname of the user creating voucher
    String rateKey = "rateKey_example"; // This is a Ventogram-signed rate key. If provided when a voucher is created, the conversion will use the rate signed with this key if it is valid at the time of redeeming a voucher. Conversion will use the current rate if key has expired.
    try {
      VoucherCreatePaymentResponse result = client
              .voucher
              .createPayment(amount, currency, email, fullname)
              .rateKey(rateKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherApi#createPayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VoucherCreatePaymentResponse> response = client
              .voucher
              .createPayment(amount, currency, email, fullname)
              .rateKey(rateKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherApi#createPayment");
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
| **voucherCreatePaymentRequest** | [**VoucherCreatePaymentRequest**](VoucherCreatePaymentRequest.md)|  | |

### Return type

[**VoucherCreatePaymentResponse**](VoucherCreatePaymentResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [ApiUser](../README.md#ApiUser)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |

<a name="getMultipleRecords"></a>
# **getMultipleRecords**
> VoucherGetMultipleRecordsResponse getMultipleRecords().page(page).pageSize(pageSize).paymentStatus(paymentStatus).execute();

Get multiple records

Retrieves a collection of voucher records, sorted in descending order by their creation date.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VoucherApi;
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
    Double page = 3.4D; // Defaults to 1. This is the current page being requested relative to size of a page
    Double pageSize = 3.4D; // The number of items to be retured per page
    String paymentStatus = "paid"; // Voucher payment status
    try {
      VoucherGetMultipleRecordsResponse result = client
              .voucher
              .getMultipleRecords()
              .page(page)
              .pageSize(pageSize)
              .paymentStatus(paymentStatus)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getMeta());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherApi#getMultipleRecords");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VoucherGetMultipleRecordsResponse> response = client
              .voucher
              .getMultipleRecords()
              .page(page)
              .pageSize(pageSize)
              .paymentStatus(paymentStatus)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherApi#getMultipleRecords");
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
| **page** | **Double**| Defaults to 1. This is the current page being requested relative to size of a page | [optional] |
| **pageSize** | **Double**| The number of items to be retured per page | [optional] |
| **paymentStatus** | **String**| Voucher payment status | [optional] [enum: paid, unpaid] |

### Return type

[**VoucherGetMultipleRecordsResponse**](VoucherGetMultipleRecordsResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [ApiUser](../README.md#ApiUser)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getRecord"></a>
# **getRecord**
> VoucherGetRecordResponse getRecord().id(id).memo(memo).accountNumber(accountNumber).execute();

Retrieve voucher record

Retrieves an existing voucher record(s). When no query param is provided, all the voucher record for the merchant will be returned. If accountNumber field is provided in the query, all the voucher records associated with the given accountNumber for the merchant will be returned.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VoucherApi;
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
    String id = "id_example"; // Voucher id
    String memo = "memo_example"; // Voucher memo or reference number
    String accountNumber = "accountNumber_example"; // The account number used to pay for voucher
    try {
      VoucherGetRecordResponse result = client
              .voucher
              .getRecord()
              .id(id)
              .memo(memo)
              .accountNumber(accountNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherApi#getRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VoucherGetRecordResponse> response = client
              .voucher
              .getRecord()
              .id(id)
              .memo(memo)
              .accountNumber(accountNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherApi#getRecord");
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
| **id** | **String**| Voucher id | [optional] |
| **memo** | **String**| Voucher memo or reference number | [optional] |
| **accountNumber** | **String**| The account number used to pay for voucher | [optional] |

### Return type

[**VoucherGetRecordResponse**](VoucherGetRecordResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [ApiUser](../README.md#ApiUser)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="redeemAndWithdraw"></a>
# **redeemAndWithdraw**
> VoucherRedeemAndWithdrawResponse redeemAndWithdraw(voucherRedeemAndWithdrawRequest).execute();

Redeem and withdraw

Redeems an existing unused voucher and transfers crypto to the provided wallet address

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VoucherApi;
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
    String cryptoAddress = "cryptoAddress_example"; // Must be provided along with newtwork. The crypto wallet address on the provided network, to which crypto equivalent will be sent
    String currency = "USDC"; // Cryptocurrency to send to the provided wallet details
    String email = "email_example"; // Email that was used to create the voucher
    String network = "network_example"; // Supported crypto network
    String voucherCode = "voucherCode_example"; // Voucher code to be redeemed
    String merchantFee = "merchantFee_example"; // In USD (optional) with a precision of 2 decimal places (max). Can be supplied if the merchant want to withdraw a portion of the voucher amount into their Ventogram balance. This must be a fraction or all of voucher value (ie received amount - voucher fee)
    String rateKey = "rateKey_example"; // This is a Ventogram-signed rate key. This will be returned in response if the signed rate was used for conversion.
    try {
      VoucherRedeemAndWithdrawResponse result = client
              .voucher
              .redeemAndWithdraw(cryptoAddress, currency, email, network, voucherCode)
              .merchantFee(merchantFee)
              .rateKey(rateKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherApi#redeemAndWithdraw");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VoucherRedeemAndWithdrawResponse> response = client
              .voucher
              .redeemAndWithdraw(cryptoAddress, currency, email, network, voucherCode)
              .merchantFee(merchantFee)
              .rateKey(rateKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherApi#redeemAndWithdraw");
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
| **voucherRedeemAndWithdrawRequest** | [**VoucherRedeemAndWithdrawRequest**](VoucherRedeemAndWithdrawRequest.md)|  | |

### Return type

[**VoucherRedeemAndWithdrawResponse**](VoucherRedeemAndWithdrawResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [ApiUser](../README.md#ApiUser)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="redeemExistingUnused"></a>
# **redeemExistingUnused**
> VoucherRedeemExistingUnusedResponse redeemExistingUnused(voucherRedeemExistingUnusedRequest).execute();

Redeem existing unused voucher

Redeems an existing unused voucher

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Partna;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VoucherApi;
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
    String email = "email_example"; // Email that was used to create the voucher
    String voucherCode = "voucherCode_example"; // Voucher code to be redeemed
    try {
      VoucherRedeemExistingUnusedResponse result = client
              .voucher
              .redeemExistingUnused(email, voucherCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMessage());
      System.out.println(result.getSuccess());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherApi#redeemExistingUnused");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VoucherRedeemExistingUnusedResponse> response = client
              .voucher
              .redeemExistingUnused(email, voucherCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoucherApi#redeemExistingUnused");
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
| **voucherRedeemExistingUnusedRequest** | [**VoucherRedeemExistingUnusedRequest**](VoucherRedeemExistingUnusedRequest.md)|  | |

### Return type

[**VoucherRedeemExistingUnusedResponse**](VoucherRedeemExistingUnusedResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey), [ApiUser](../README.md#ApiUser)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

