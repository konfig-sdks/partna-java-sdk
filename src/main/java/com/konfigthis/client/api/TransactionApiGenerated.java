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


import com.konfigthis.client.model.TransactionGetDetailsResponse;
import com.konfigthis.client.model.TransactionGetUserTransactionSummaryResponse;
import com.konfigthis.client.model.TransactionGetUserTransactionsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class TransactionApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TransactionApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public TransactionApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getDetailsCall(String transactionId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/transaction/{transactionId}"
            .replace("{" + "transactionId" + "}", localVarApiClient.escapeString(transactionId.toString()));

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

        String[] localVarAuthNames = new String[] { "ApiKey", "ApiUser", "UserVersion" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDetailsValidateBeforeCall(String transactionId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException("Missing the required parameter 'transactionId' when calling getDetails(Async)");
        }

        return getDetailsCall(transactionId, _callback);

    }


    private ApiResponse<TransactionGetDetailsResponse> getDetailsWithHttpInfo(String transactionId) throws ApiException {
        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(transactionId, null);
        Type localVarReturnType = new TypeToken<TransactionGetDetailsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDetailsAsync(String transactionId, final ApiCallback<TransactionGetDetailsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(transactionId, _callback);
        Type localVarReturnType = new TypeToken<TransactionGetDetailsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetDetailsRequestBuilder {
        private final String transactionId;

        private GetDetailsRequestBuilder(String transactionId) {
            this.transactionId = transactionId;
        }

        /**
         * Build call for getDetails
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
            return getDetailsCall(transactionId, _callback);
        }


        /**
         * Execute getDetails request
         * @return TransactionGetDetailsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public TransactionGetDetailsResponse execute() throws ApiException {
            ApiResponse<TransactionGetDetailsResponse> localVarResp = getDetailsWithHttpInfo(transactionId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getDetails request with HTTP info returned
         * @return ApiResponse&lt;TransactionGetDetailsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<TransactionGetDetailsResponse> executeWithHttpInfo() throws ApiException {
            return getDetailsWithHttpInfo(transactionId);
        }

        /**
         * Execute getDetails request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<TransactionGetDetailsResponse> _callback) throws ApiException {
            return getDetailsAsync(transactionId, _callback);
        }
    }

    /**
     * Get a transaction
     * Get a transaction
     * @param transactionId  (required)
     * @return GetDetailsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public GetDetailsRequestBuilder getDetails(String transactionId) throws IllegalArgumentException {
        if (transactionId == null) throw new IllegalArgumentException("\"transactionId\" is required but got null");
            

        return new GetDetailsRequestBuilder(transactionId);
    }
    private okhttp3.Call getUserTransactionSummaryCall(String currency, String type, Double page, Double limit, Double duration, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/transaction/summary";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (currency != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("currency", currency));
        }

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (duration != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("duration", duration));
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
    private okhttp3.Call getUserTransactionSummaryValidateBeforeCall(String currency, String type, Double page, Double limit, Double duration, final ApiCallback _callback) throws ApiException {
        return getUserTransactionSummaryCall(currency, type, page, limit, duration, _callback);

    }


    private ApiResponse<TransactionGetUserTransactionSummaryResponse> getUserTransactionSummaryWithHttpInfo(String currency, String type, Double page, Double limit, Double duration) throws ApiException {
        okhttp3.Call localVarCall = getUserTransactionSummaryValidateBeforeCall(currency, type, page, limit, duration, null);
        Type localVarReturnType = new TypeToken<TransactionGetUserTransactionSummaryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getUserTransactionSummaryAsync(String currency, String type, Double page, Double limit, Double duration, final ApiCallback<TransactionGetUserTransactionSummaryResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserTransactionSummaryValidateBeforeCall(currency, type, page, limit, duration, _callback);
        Type localVarReturnType = new TypeToken<TransactionGetUserTransactionSummaryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetUserTransactionSummaryRequestBuilder {
        private String currency;
        private String type;
        private Double page;
        private Double limit;
        private Double duration;

        private GetUserTransactionSummaryRequestBuilder() {
        }

        /**
         * Set currency
         * @param currency Currency for which transactions are to be retrieved. When this is not supplied, transactions will be retrieved for all available currencies. (optional)
         * @return GetUserTransactionSummaryRequestBuilder
         */
        public GetUserTransactionSummaryRequestBuilder currency(String currency) {
            this.currency = currency;
            return this;
        }
        
        /**
         * Set type
         * @param type Type of transactions to be retrieved. When this is not supplied, transactions will be retrieved for all available types. (optional)
         * @return GetUserTransactionSummaryRequestBuilder
         */
        public GetUserTransactionSummaryRequestBuilder type(String type) {
            this.type = type;
            return this;
        }
        
        /**
         * Set page
         * @param page Number of pages to be retrieved. (optional)
         * @return GetUserTransactionSummaryRequestBuilder
         */
        public GetUserTransactionSummaryRequestBuilder page(Double page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set limit
         * @param limit Number of transaction records to be retrieved per page page. (optional)
         * @return GetUserTransactionSummaryRequestBuilder
         */
        public GetUserTransactionSummaryRequestBuilder limit(Double limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set duration
         * @param duration Duration of the transaction to be retrieved per page page. (optional)
         * @return GetUserTransactionSummaryRequestBuilder
         */
        public GetUserTransactionSummaryRequestBuilder duration(Double duration) {
            this.duration = duration;
            return this;
        }
        
        /**
         * Build call for getUserTransactionSummary
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
            return getUserTransactionSummaryCall(currency, type, page, limit, duration, _callback);
        }


        /**
         * Execute getUserTransactionSummary request
         * @return TransactionGetUserTransactionSummaryResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
         </table>
         */
        public TransactionGetUserTransactionSummaryResponse execute() throws ApiException {
            ApiResponse<TransactionGetUserTransactionSummaryResponse> localVarResp = getUserTransactionSummaryWithHttpInfo(currency, type, page, limit, duration);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getUserTransactionSummary request with HTTP info returned
         * @return ApiResponse&lt;TransactionGetUserTransactionSummaryResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<TransactionGetUserTransactionSummaryResponse> executeWithHttpInfo() throws ApiException {
            return getUserTransactionSummaryWithHttpInfo(currency, type, page, limit, duration);
        }

        /**
         * Execute getUserTransactionSummary request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<TransactionGetUserTransactionSummaryResponse> _callback) throws ApiException {
            return getUserTransactionSummaryAsync(currency, type, page, limit, duration, _callback);
        }
    }

    /**
     * Retrieve user&#39;s transaction summary
     * Retrieves all user transactions summary
     * @return GetUserTransactionSummaryRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public GetUserTransactionSummaryRequestBuilder getUserTransactionSummary() throws IllegalArgumentException {
        return new GetUserTransactionSummaryRequestBuilder();
    }
    private okhttp3.Call getUserTransactionsCall(String currency, String type, Double page, Double limit, Double duration, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/transaction";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (currency != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("currency", currency));
        }

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (duration != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("duration", duration));
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
    private okhttp3.Call getUserTransactionsValidateBeforeCall(String currency, String type, Double page, Double limit, Double duration, final ApiCallback _callback) throws ApiException {
        return getUserTransactionsCall(currency, type, page, limit, duration, _callback);

    }


    private ApiResponse<TransactionGetUserTransactionsResponse> getUserTransactionsWithHttpInfo(String currency, String type, Double page, Double limit, Double duration) throws ApiException {
        okhttp3.Call localVarCall = getUserTransactionsValidateBeforeCall(currency, type, page, limit, duration, null);
        Type localVarReturnType = new TypeToken<TransactionGetUserTransactionsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getUserTransactionsAsync(String currency, String type, Double page, Double limit, Double duration, final ApiCallback<TransactionGetUserTransactionsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserTransactionsValidateBeforeCall(currency, type, page, limit, duration, _callback);
        Type localVarReturnType = new TypeToken<TransactionGetUserTransactionsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetUserTransactionsRequestBuilder {
        private String currency;
        private String type;
        private Double page;
        private Double limit;
        private Double duration;

        private GetUserTransactionsRequestBuilder() {
        }

        /**
         * Set currency
         * @param currency Currency for which transactions are to be retrieved. When this is not supplied, transactions will be retrieved for all available currencies. (optional)
         * @return GetUserTransactionsRequestBuilder
         */
        public GetUserTransactionsRequestBuilder currency(String currency) {
            this.currency = currency;
            return this;
        }
        
        /**
         * Set type
         * @param type Type of transactions to be retrieved. When this is not supplied, transactions will be retrieved for all available types. (optional)
         * @return GetUserTransactionsRequestBuilder
         */
        public GetUserTransactionsRequestBuilder type(String type) {
            this.type = type;
            return this;
        }
        
        /**
         * Set page
         * @param page Number of pages to be retrieved. (optional)
         * @return GetUserTransactionsRequestBuilder
         */
        public GetUserTransactionsRequestBuilder page(Double page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set limit
         * @param limit Number of transaction records to be retrieved per page page. (optional)
         * @return GetUserTransactionsRequestBuilder
         */
        public GetUserTransactionsRequestBuilder limit(Double limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set duration
         * @param duration Duration of the transaction to be retrieved per page page. (optional)
         * @return GetUserTransactionsRequestBuilder
         */
        public GetUserTransactionsRequestBuilder duration(Double duration) {
            this.duration = duration;
            return this;
        }
        
        /**
         * Build call for getUserTransactions
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
            return getUserTransactionsCall(currency, type, page, limit, duration, _callback);
        }


        /**
         * Execute getUserTransactions request
         * @return TransactionGetUserTransactionsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
         </table>
         */
        public TransactionGetUserTransactionsResponse execute() throws ApiException {
            ApiResponse<TransactionGetUserTransactionsResponse> localVarResp = getUserTransactionsWithHttpInfo(currency, type, page, limit, duration);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getUserTransactions request with HTTP info returned
         * @return ApiResponse&lt;TransactionGetUserTransactionsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<TransactionGetUserTransactionsResponse> executeWithHttpInfo() throws ApiException {
            return getUserTransactionsWithHttpInfo(currency, type, page, limit, duration);
        }

        /**
         * Execute getUserTransactions request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<TransactionGetUserTransactionsResponse> _callback) throws ApiException {
            return getUserTransactionsAsync(currency, type, page, limit, duration, _callback);
        }
    }

    /**
     * Retrieve user&#39;s transaction records
     * Retrieves all user transactions
     * @return GetUserTransactionsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public GetUserTransactionsRequestBuilder getUserTransactions() throws IllegalArgumentException {
        return new GetUserTransactionsRequestBuilder();
    }
}