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


import com.konfigthis.client.model.RatesGetConversionRatesResponse;
import com.konfigthis.client.model.RatesGetCurrentRatesResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class RatesApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RatesApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public RatesApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getConversionRatesCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/currency/rates";

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
    private okhttp3.Call getConversionRatesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getConversionRatesCall(_callback);

    }


    private ApiResponse<RatesGetConversionRatesResponse> getConversionRatesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getConversionRatesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<RatesGetConversionRatesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getConversionRatesAsync(final ApiCallback<RatesGetConversionRatesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getConversionRatesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<RatesGetConversionRatesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetConversionRatesRequestBuilder {

        private GetConversionRatesRequestBuilder() {
        }

        /**
         * Build call for getConversionRates
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
            return getConversionRatesCall(_callback);
        }


        /**
         * Execute getConversionRates request
         * @return RatesGetConversionRatesResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
         </table>
         */
        public RatesGetConversionRatesResponse execute() throws ApiException {
            ApiResponse<RatesGetConversionRatesResponse> localVarResp = getConversionRatesWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getConversionRates request with HTTP info returned
         * @return ApiResponse&lt;RatesGetConversionRatesResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<RatesGetConversionRatesResponse> executeWithHttpInfo() throws ApiException {
            return getConversionRatesWithHttpInfo();
        }

        /**
         * Execute getConversionRates request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<RatesGetConversionRatesResponse> _callback) throws ApiException {
            return getConversionRatesAsync(_callback);
        }
    }

    /**
     * Retrieves conversion rates
     * Retrieves conversion rates for all supported currencies
     * @return GetConversionRatesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public GetConversionRatesRequestBuilder getConversionRates() throws IllegalArgumentException {
        return new GetConversionRatesRequestBuilder();
    }
    private okhttp3.Call getCurrentRatesCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/currency/rate";

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
    private okhttp3.Call getCurrentRatesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getCurrentRatesCall(_callback);

    }


    private ApiResponse<RatesGetCurrentRatesResponse> getCurrentRatesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getCurrentRatesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<RatesGetCurrentRatesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getCurrentRatesAsync(final ApiCallback<RatesGetCurrentRatesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCurrentRatesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<RatesGetCurrentRatesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetCurrentRatesRequestBuilder {

        private GetCurrentRatesRequestBuilder() {
        }

        /**
         * Build call for getCurrentRates
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
            return getCurrentRatesCall(_callback);
        }


        /**
         * Execute getCurrentRates request
         * @return RatesGetCurrentRatesResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public RatesGetCurrentRatesResponse execute() throws ApiException {
            ApiResponse<RatesGetCurrentRatesResponse> localVarResp = getCurrentRatesWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getCurrentRates request with HTTP info returned
         * @return ApiResponse&lt;RatesGetCurrentRatesResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<RatesGetCurrentRatesResponse> executeWithHttpInfo() throws ApiException {
            return getCurrentRatesWithHttpInfo();
        }

        /**
         * Execute getCurrentRates request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<RatesGetCurrentRatesResponse> _callback) throws ApiException {
            return getCurrentRatesAsync(_callback);
        }
    }

    /**
     * Get current rates
     * Get the current rates
     * @return GetCurrentRatesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public GetCurrentRatesRequestBuilder getCurrentRates() throws IllegalArgumentException {
        return new GetCurrentRatesRequestBuilder();
    }
}