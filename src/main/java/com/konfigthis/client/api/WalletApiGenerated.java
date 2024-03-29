/*
 * Coinprofile business API
 * Coinprofile business API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.WalletExecuteTransferRequest;
import com.konfigthis.client.model.WalletExecuteTransferResponse;
import com.konfigthis.client.model.WalletGetAddressesResponse;
import com.konfigthis.client.model.WalletGetSupportedConfigResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class WalletApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WalletApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public WalletApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call executeTransferCall(WalletExecuteTransferRequest walletExecuteTransferRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = walletExecuteTransferRequest;

        // create path and map variables
        String localVarPath = "/wallet/transfer";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKey", "ApiUser", "UserVersion" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call executeTransferValidateBeforeCall(WalletExecuteTransferRequest walletExecuteTransferRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'walletExecuteTransferRequest' is set
        if (walletExecuteTransferRequest == null) {
            throw new ApiException("Missing the required parameter 'walletExecuteTransferRequest' when calling executeTransfer(Async)");
        }

        return executeTransferCall(walletExecuteTransferRequest, _callback);

    }


    private ApiResponse<WalletExecuteTransferResponse> executeTransferWithHttpInfo(WalletExecuteTransferRequest walletExecuteTransferRequest) throws ApiException {
        okhttp3.Call localVarCall = executeTransferValidateBeforeCall(walletExecuteTransferRequest, null);
        Type localVarReturnType = new TypeToken<WalletExecuteTransferResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call executeTransferAsync(WalletExecuteTransferRequest walletExecuteTransferRequest, final ApiCallback<WalletExecuteTransferResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = executeTransferValidateBeforeCall(walletExecuteTransferRequest, _callback);
        Type localVarReturnType = new TypeToken<WalletExecuteTransferResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ExecuteTransferRequestBuilder {
        private final String address;
        private final Double amount;
        private final String currency;
        private final String network;
        private String memo;
        private String walletType;

        private ExecuteTransferRequestBuilder(String address, double amount, String currency, String network) {
            this.address = address;
            this.amount = amount;
            this.currency = currency;
            this.network = network;
        }

        /**
         * Set memo
         * @param memo Optional transaction memo (optional)
         * @return ExecuteTransferRequestBuilder
         */
        public ExecuteTransferRequestBuilder memo(String memo) {
            this.memo = memo;
            return this;
        }
        
        /**
         * Set walletType
         * @param walletType Wallet type (optional)
         * @return ExecuteTransferRequestBuilder
         */
        public ExecuteTransferRequestBuilder walletType(String walletType) {
            this.walletType = walletType;
            return this;
        }
        
        /**
         * Build call for executeTransfer
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            WalletExecuteTransferRequest walletExecuteTransferRequest = buildBodyParams();
            return executeTransferCall(walletExecuteTransferRequest, _callback);
        }

        private WalletExecuteTransferRequest buildBodyParams() {
            WalletExecuteTransferRequest walletExecuteTransferRequest = new WalletExecuteTransferRequest();
            walletExecuteTransferRequest.address(this.address);
            walletExecuteTransferRequest.amount(this.amount);
            walletExecuteTransferRequest.currency(this.currency);
            walletExecuteTransferRequest.memo(this.memo);
            walletExecuteTransferRequest.network(this.network);
            walletExecuteTransferRequest.walletType(this.walletType);
            return walletExecuteTransferRequest;
        }

        /**
         * Execute executeTransfer request
         * @return WalletExecuteTransferResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
         </table>
         */
        public WalletExecuteTransferResponse execute() throws ApiException {
            WalletExecuteTransferRequest walletExecuteTransferRequest = buildBodyParams();
            ApiResponse<WalletExecuteTransferResponse> localVarResp = executeTransferWithHttpInfo(walletExecuteTransferRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute executeTransfer request with HTTP info returned
         * @return ApiResponse&lt;WalletExecuteTransferResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<WalletExecuteTransferResponse> executeWithHttpInfo() throws ApiException {
            WalletExecuteTransferRequest walletExecuteTransferRequest = buildBodyParams();
            return executeTransferWithHttpInfo(walletExecuteTransferRequest);
        }

        /**
         * Execute executeTransfer request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<WalletExecuteTransferResponse> _callback) throws ApiException {
            WalletExecuteTransferRequest walletExecuteTransferRequest = buildBodyParams();
            return executeTransferAsync(walletExecuteTransferRequest, _callback);
        }
    }

    /**
     * Wallet transfer
     * Transfer crypto from one wallet address to another
     * @param walletExecuteTransferRequest  (required)
     * @return ExecuteTransferRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ExecuteTransferRequestBuilder executeTransfer(String address, double amount, String currency, String network) throws IllegalArgumentException {
        if (address == null) throw new IllegalArgumentException("\"address\" is required but got null");
            

        
        if (currency == null) throw new IllegalArgumentException("\"currency\" is required but got null");
            

        if (network == null) throw new IllegalArgumentException("\"network\" is required but got null");
            

        return new ExecuteTransferRequestBuilder(address, amount, currency, network);
    }
    private okhttp3.Call getAddressesCall(String currency, String network, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/wallet";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (currency != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("currency", currency));
        }

        if (network != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("network", network));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKey", "ApiUser", "UserVersion" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAddressesValidateBeforeCall(String currency, String network, final ApiCallback _callback) throws ApiException {
        return getAddressesCall(currency, network, _callback);

    }


    private ApiResponse<WalletGetAddressesResponse> getAddressesWithHttpInfo(String currency, String network) throws ApiException {
        okhttp3.Call localVarCall = getAddressesValidateBeforeCall(currency, network, null);
        Type localVarReturnType = new TypeToken<WalletGetAddressesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAddressesAsync(String currency, String network, final ApiCallback<WalletGetAddressesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAddressesValidateBeforeCall(currency, network, _callback);
        Type localVarReturnType = new TypeToken<WalletGetAddressesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetAddressesRequestBuilder {
        private String currency;
        private String network;

        private GetAddressesRequestBuilder() {
        }

        /**
         * Set currency
         * @param currency The cryptocurrency for which address will be retrieved (optional)
         * @return GetAddressesRequestBuilder
         */
        public GetAddressesRequestBuilder currency(String currency) {
            this.currency = currency;
            return this;
        }
        
        /**
         * Set network
         * @param network The crypto network of the retrieved wallet address (optional)
         * @return GetAddressesRequestBuilder
         */
        public GetAddressesRequestBuilder network(String network) {
            this.network = network;
            return this;
        }
        
        /**
         * Build call for getAddresses
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successfully retrieved wallet </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getAddressesCall(currency, network, _callback);
        }


        /**
         * Execute getAddresses request
         * @return WalletGetAddressesResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successfully retrieved wallet </td><td>  -  </td></tr>
         </table>
         */
        public WalletGetAddressesResponse execute() throws ApiException {
            ApiResponse<WalletGetAddressesResponse> localVarResp = getAddressesWithHttpInfo(currency, network);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getAddresses request with HTTP info returned
         * @return ApiResponse&lt;WalletGetAddressesResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successfully retrieved wallet </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<WalletGetAddressesResponse> executeWithHttpInfo() throws ApiException {
            return getAddressesWithHttpInfo(currency, network);
        }

        /**
         * Execute getAddresses request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successfully retrieved wallet </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<WalletGetAddressesResponse> _callback) throws ApiException {
            return getAddressesAsync(currency, network, _callback);
        }
    }

    /**
     * Retrieves a user&#39;s crypto wallet addresses
     * get wallet
     * @return GetAddressesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successfully retrieved wallet </td><td>  -  </td></tr>
     </table>
     */
    public GetAddressesRequestBuilder getAddresses() throws IllegalArgumentException {
        return new GetAddressesRequestBuilder();
    }
    private okhttp3.Call getSupportedConfigCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/wallet/supported/config";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSupportedConfigValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getSupportedConfigCall(_callback);

    }


    private ApiResponse<WalletGetSupportedConfigResponse> getSupportedConfigWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getSupportedConfigValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<WalletGetSupportedConfigResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getSupportedConfigAsync(final ApiCallback<WalletGetSupportedConfigResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSupportedConfigValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<WalletGetSupportedConfigResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetSupportedConfigRequestBuilder {

        private GetSupportedConfigRequestBuilder() {
        }

        /**
         * Build call for getSupportedConfig
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getSupportedConfigCall(_callback);
        }


        /**
         * Execute getSupportedConfig request
         * @return WalletGetSupportedConfigResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public WalletGetSupportedConfigResponse execute() throws ApiException {
            ApiResponse<WalletGetSupportedConfigResponse> localVarResp = getSupportedConfigWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getSupportedConfig request with HTTP info returned
         * @return ApiResponse&lt;WalletGetSupportedConfigResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<WalletGetSupportedConfigResponse> executeWithHttpInfo() throws ApiException {
            return getSupportedConfigWithHttpInfo();
        }

        /**
         * Execute getSupportedConfig request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<WalletGetSupportedConfigResponse> _callback) throws ApiException {
            return getSupportedConfigAsync(_callback);
        }
    }

    /**
     * Get supported cryptocurrencies and network
     * Get supported cryptocurrencies and networks
     * @return GetSupportedConfigRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public GetSupportedConfigRequestBuilder getSupportedConfig() throws IllegalArgumentException {
        return new GetSupportedConfigRequestBuilder();
    }
}
