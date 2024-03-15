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


import com.konfigthis.client.model.WebhookGetCallbackUrlResponse;
import com.konfigthis.client.model.WebhookSubscribeWebhookCallbackRequest;
import com.konfigthis.client.model.WebhookSubscribeWebhookCallbackResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class WebhookApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public WebhookApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public WebhookApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getCallbackUrlCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/callbackurl";

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
    private okhttp3.Call getCallbackUrlValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getCallbackUrlCall(_callback);

    }


    private ApiResponse<WebhookGetCallbackUrlResponse> getCallbackUrlWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getCallbackUrlValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<WebhookGetCallbackUrlResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getCallbackUrlAsync(final ApiCallback<WebhookGetCallbackUrlResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCallbackUrlValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<WebhookGetCallbackUrlResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetCallbackUrlRequestBuilder {

        private GetCallbackUrlRequestBuilder() {
        }

        /**
         * Build call for getCallbackUrl
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
            return getCallbackUrlCall(_callback);
        }


        /**
         * Execute getCallbackUrl request
         * @return WebhookGetCallbackUrlResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
         </table>
         */
        public WebhookGetCallbackUrlResponse execute() throws ApiException {
            ApiResponse<WebhookGetCallbackUrlResponse> localVarResp = getCallbackUrlWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getCallbackUrl request with HTTP info returned
         * @return ApiResponse&lt;WebhookGetCallbackUrlResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<WebhookGetCallbackUrlResponse> executeWithHttpInfo() throws ApiException {
            return getCallbackUrlWithHttpInfo();
        }

        /**
         * Execute getCallbackUrl request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<WebhookGetCallbackUrlResponse> _callback) throws ApiException {
            return getCallbackUrlAsync(_callback);
        }
    }

    /**
     * Retrieve subscribed webhook url
     * Retrieve the callback url used as webhook
     * @return GetCallbackUrlRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public GetCallbackUrlRequestBuilder getCallbackUrl() throws IllegalArgumentException {
        return new GetCallbackUrlRequestBuilder();
    }
    private okhttp3.Call subscribeWebhookCallbackCall(WebhookSubscribeWebhookCallbackRequest webhookSubscribeWebhookCallbackRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = webhookSubscribeWebhookCallbackRequest;

        // create path and map variables
        String localVarPath = "/callbackurl";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call subscribeWebhookCallbackValidateBeforeCall(WebhookSubscribeWebhookCallbackRequest webhookSubscribeWebhookCallbackRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'webhookSubscribeWebhookCallbackRequest' is set
        if (webhookSubscribeWebhookCallbackRequest == null) {
            throw new ApiException("Missing the required parameter 'webhookSubscribeWebhookCallbackRequest' when calling subscribeWebhookCallback(Async)");
        }

        return subscribeWebhookCallbackCall(webhookSubscribeWebhookCallbackRequest, _callback);

    }


    private ApiResponse<WebhookSubscribeWebhookCallbackResponse> subscribeWebhookCallbackWithHttpInfo(WebhookSubscribeWebhookCallbackRequest webhookSubscribeWebhookCallbackRequest) throws ApiException {
        okhttp3.Call localVarCall = subscribeWebhookCallbackValidateBeforeCall(webhookSubscribeWebhookCallbackRequest, null);
        Type localVarReturnType = new TypeToken<WebhookSubscribeWebhookCallbackResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call subscribeWebhookCallbackAsync(WebhookSubscribeWebhookCallbackRequest webhookSubscribeWebhookCallbackRequest, final ApiCallback<WebhookSubscribeWebhookCallbackResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = subscribeWebhookCallbackValidateBeforeCall(webhookSubscribeWebhookCallbackRequest, _callback);
        Type localVarReturnType = new TypeToken<WebhookSubscribeWebhookCallbackResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class SubscribeWebhookCallbackRequestBuilder {
        private final String callbackUrl;

        private SubscribeWebhookCallbackRequestBuilder(String callbackUrl) {
            this.callbackUrl = callbackUrl;
        }

        /**
         * Build call for subscribeWebhookCallback
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
            WebhookSubscribeWebhookCallbackRequest webhookSubscribeWebhookCallbackRequest = buildBodyParams();
            return subscribeWebhookCallbackCall(webhookSubscribeWebhookCallbackRequest, _callback);
        }

        private WebhookSubscribeWebhookCallbackRequest buildBodyParams() {
            WebhookSubscribeWebhookCallbackRequest webhookSubscribeWebhookCallbackRequest = new WebhookSubscribeWebhookCallbackRequest();
            webhookSubscribeWebhookCallbackRequest.callbackUrl(this.callbackUrl);
            return webhookSubscribeWebhookCallbackRequest;
        }

        /**
         * Execute subscribeWebhookCallback request
         * @return WebhookSubscribeWebhookCallbackResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
         </table>
         */
        public WebhookSubscribeWebhookCallbackResponse execute() throws ApiException {
            WebhookSubscribeWebhookCallbackRequest webhookSubscribeWebhookCallbackRequest = buildBodyParams();
            ApiResponse<WebhookSubscribeWebhookCallbackResponse> localVarResp = subscribeWebhookCallbackWithHttpInfo(webhookSubscribeWebhookCallbackRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute subscribeWebhookCallback request with HTTP info returned
         * @return ApiResponse&lt;WebhookSubscribeWebhookCallbackResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<WebhookSubscribeWebhookCallbackResponse> executeWithHttpInfo() throws ApiException {
            WebhookSubscribeWebhookCallbackRequest webhookSubscribeWebhookCallbackRequest = buildBodyParams();
            return subscribeWebhookCallbackWithHttpInfo(webhookSubscribeWebhookCallbackRequest);
        }

        /**
         * Execute subscribeWebhookCallback request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<WebhookSubscribeWebhookCallbackResponse> _callback) throws ApiException {
            WebhookSubscribeWebhookCallbackRequest webhookSubscribeWebhookCallbackRequest = buildBodyParams();
            return subscribeWebhookCallbackAsync(webhookSubscribeWebhookCallbackRequest, _callback);
        }
    }

    /**
     * Subscribe to webhook
     * Set the callback url that will be used as webhook
     * @param webhookSubscribeWebhookCallbackRequest  (required)
     * @return SubscribeWebhookCallbackRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public SubscribeWebhookCallbackRequestBuilder subscribeWebhookCallback(String callbackUrl) throws IllegalArgumentException {
        if (callbackUrl == null) throw new IllegalArgumentException("\"callbackUrl\" is required but got null");
            

        return new SubscribeWebhookCallbackRequestBuilder(callbackUrl);
    }
}
