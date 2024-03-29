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


import com.konfigthis.client.model.ApiKeyGenerateNewApiKeyRequest;
import com.konfigthis.client.model.ApiKeyGenerateNewApiKeyResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ApiKeyApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ApiKeyApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ApiKeyApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call generateNewApiKeyCall(ApiKeyGenerateNewApiKeyRequest apiKeyGenerateNewApiKeyRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = apiKeyGenerateNewApiKeyRequest;

        // create path and map variables
        String localVarPath = "/auth/api-key";

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
    private okhttp3.Call generateNewApiKeyValidateBeforeCall(ApiKeyGenerateNewApiKeyRequest apiKeyGenerateNewApiKeyRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'apiKeyGenerateNewApiKeyRequest' is set
        if (apiKeyGenerateNewApiKeyRequest == null) {
            throw new ApiException("Missing the required parameter 'apiKeyGenerateNewApiKeyRequest' when calling generateNewApiKey(Async)");
        }

        return generateNewApiKeyCall(apiKeyGenerateNewApiKeyRequest, _callback);

    }


    private ApiResponse<ApiKeyGenerateNewApiKeyResponse> generateNewApiKeyWithHttpInfo(ApiKeyGenerateNewApiKeyRequest apiKeyGenerateNewApiKeyRequest) throws ApiException {
        okhttp3.Call localVarCall = generateNewApiKeyValidateBeforeCall(apiKeyGenerateNewApiKeyRequest, null);
        Type localVarReturnType = new TypeToken<ApiKeyGenerateNewApiKeyResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call generateNewApiKeyAsync(ApiKeyGenerateNewApiKeyRequest apiKeyGenerateNewApiKeyRequest, final ApiCallback<ApiKeyGenerateNewApiKeyResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = generateNewApiKeyValidateBeforeCall(apiKeyGenerateNewApiKeyRequest, _callback);
        Type localVarReturnType = new TypeToken<ApiKeyGenerateNewApiKeyResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GenerateNewApiKeyRequestBuilder {
        private String otpType;
        private String token;

        private GenerateNewApiKeyRequestBuilder() {
        }

        /**
         * Set otpType
         * @param otpType  (optional)
         * @return GenerateNewApiKeyRequestBuilder
         */
        public GenerateNewApiKeyRequestBuilder otpType(String otpType) {
            this.otpType = otpType;
            return this;
        }
        
        /**
         * Set token
         * @param token  (optional)
         * @return GenerateNewApiKeyRequestBuilder
         */
        public GenerateNewApiKeyRequestBuilder token(String token) {
            this.token = token;
            return this;
        }
        
        /**
         * Build call for generateNewApiKey
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
            ApiKeyGenerateNewApiKeyRequest apiKeyGenerateNewApiKeyRequest = buildBodyParams();
            return generateNewApiKeyCall(apiKeyGenerateNewApiKeyRequest, _callback);
        }

        private ApiKeyGenerateNewApiKeyRequest buildBodyParams() {
            ApiKeyGenerateNewApiKeyRequest apiKeyGenerateNewApiKeyRequest = new ApiKeyGenerateNewApiKeyRequest();
            apiKeyGenerateNewApiKeyRequest.otpType(this.otpType);
            apiKeyGenerateNewApiKeyRequest.token(this.token);
            return apiKeyGenerateNewApiKeyRequest;
        }

        /**
         * Execute generateNewApiKey request
         * @return ApiKeyGenerateNewApiKeyResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
         </table>
         */
        public ApiKeyGenerateNewApiKeyResponse execute() throws ApiException {
            ApiKeyGenerateNewApiKeyRequest apiKeyGenerateNewApiKeyRequest = buildBodyParams();
            ApiResponse<ApiKeyGenerateNewApiKeyResponse> localVarResp = generateNewApiKeyWithHttpInfo(apiKeyGenerateNewApiKeyRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute generateNewApiKey request with HTTP info returned
         * @return ApiResponse&lt;ApiKeyGenerateNewApiKeyResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ApiKeyGenerateNewApiKeyResponse> executeWithHttpInfo() throws ApiException {
            ApiKeyGenerateNewApiKeyRequest apiKeyGenerateNewApiKeyRequest = buildBodyParams();
            return generateNewApiKeyWithHttpInfo(apiKeyGenerateNewApiKeyRequest);
        }

        /**
         * Execute generateNewApiKey request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ApiKeyGenerateNewApiKeyResponse> _callback) throws ApiException {
            ApiKeyGenerateNewApiKeyRequest apiKeyGenerateNewApiKeyRequest = buildBodyParams();
            return generateNewApiKeyAsync(apiKeyGenerateNewApiKeyRequest, _callback);
        }
    }

    /**
     * Create api key
     * Create a new api key
     * @param apiKeyGenerateNewApiKeyRequest  (required)
     * @return GenerateNewApiKeyRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public GenerateNewApiKeyRequestBuilder generateNewApiKey() throws IllegalArgumentException {
        return new GenerateNewApiKeyRequestBuilder();
    }
}
