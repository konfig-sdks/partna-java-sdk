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


import com.konfigthis.client.model.CurrencyGetMinimumAllowedResponse;
import com.konfigthis.client.model.CurrencyListSupportedCurrenciesResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CurrencyApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CurrencyApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public CurrencyApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getMinimumAllowedCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/currency/minimum-allowed";

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
    private okhttp3.Call getMinimumAllowedValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getMinimumAllowedCall(_callback);

    }


    private ApiResponse<CurrencyGetMinimumAllowedResponse> getMinimumAllowedWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getMinimumAllowedValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<CurrencyGetMinimumAllowedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getMinimumAllowedAsync(final ApiCallback<CurrencyGetMinimumAllowedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMinimumAllowedValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<CurrencyGetMinimumAllowedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetMinimumAllowedRequestBuilder {

        private GetMinimumAllowedRequestBuilder() {
        }

        /**
         * Build call for getMinimumAllowed
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
            return getMinimumAllowedCall(_callback);
        }


        /**
         * Execute getMinimumAllowed request
         * @return CurrencyGetMinimumAllowedResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public CurrencyGetMinimumAllowedResponse execute() throws ApiException {
            ApiResponse<CurrencyGetMinimumAllowedResponse> localVarResp = getMinimumAllowedWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getMinimumAllowed request with HTTP info returned
         * @return ApiResponse&lt;CurrencyGetMinimumAllowedResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CurrencyGetMinimumAllowedResponse> executeWithHttpInfo() throws ApiException {
            return getMinimumAllowedWithHttpInfo();
        }

        /**
         * Execute getMinimumAllowed request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<CurrencyGetMinimumAllowedResponse> _callback) throws ApiException {
            return getMinimumAllowedAsync(_callback);
        }
    }

    /**
     * Get minimum amount allowed
     * Get minimum amount allowed
     * @return GetMinimumAllowedRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public GetMinimumAllowedRequestBuilder getMinimumAllowed() throws IllegalArgumentException {
        return new GetMinimumAllowedRequestBuilder();
    }
    private okhttp3.Call listSupportedCurrenciesCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/currency/supported";

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
    private okhttp3.Call listSupportedCurrenciesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return listSupportedCurrenciesCall(_callback);

    }


    private ApiResponse<CurrencyListSupportedCurrenciesResponse> listSupportedCurrenciesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = listSupportedCurrenciesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<CurrencyListSupportedCurrenciesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listSupportedCurrenciesAsync(final ApiCallback<CurrencyListSupportedCurrenciesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listSupportedCurrenciesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<CurrencyListSupportedCurrenciesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListSupportedCurrenciesRequestBuilder {

        private ListSupportedCurrenciesRequestBuilder() {
        }

        /**
         * Build call for listSupportedCurrencies
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
            return listSupportedCurrenciesCall(_callback);
        }


        /**
         * Execute listSupportedCurrencies request
         * @return CurrencyListSupportedCurrenciesResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public CurrencyListSupportedCurrenciesResponse execute() throws ApiException {
            ApiResponse<CurrencyListSupportedCurrenciesResponse> localVarResp = listSupportedCurrenciesWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listSupportedCurrencies request with HTTP info returned
         * @return ApiResponse&lt;CurrencyListSupportedCurrenciesResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CurrencyListSupportedCurrenciesResponse> executeWithHttpInfo() throws ApiException {
            return listSupportedCurrenciesWithHttpInfo();
        }

        /**
         * Execute listSupportedCurrencies request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<CurrencyListSupportedCurrenciesResponse> _callback) throws ApiException {
            return listSupportedCurrenciesAsync(_callback);
        }
    }

    /**
     * Get supported currencies
     * Get supported currencies
     * @return ListSupportedCurrenciesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ListSupportedCurrenciesRequestBuilder listSupportedCurrencies() throws IllegalArgumentException {
        return new ListSupportedCurrenciesRequestBuilder();
    }
}
