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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.WebhookGetCallbackUrlResponse;
import com.konfigthis.client.model.WebhookSubscribeWebhookCallbackRequest;
import com.konfigthis.client.model.WebhookSubscribeWebhookCallbackResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhookApi
 */
@Disabled
public class WebhookApiTest {

    private static WebhookApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new WebhookApi(apiClient);
    }

    /**
     * Retrieve subscribed webhook url
     *
     * Retrieve the callback url used as webhook
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCallbackUrlTest() throws ApiException {
        WebhookGetCallbackUrlResponse response = api.getCallbackUrl()
                .execute();
        // TODO: test validations
    }

    /**
     * Subscribe to webhook
     *
     * Set the callback url that will be used as webhook
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void subscribeWebhookCallbackTest() throws ApiException {
        String callbackUrl = null;
        WebhookSubscribeWebhookCallbackResponse response = api.subscribeWebhookCallback(callbackUrl)
                .execute();
        // TODO: test validations
    }

}