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
import com.konfigthis.client.model.ApiKeyGenerateNewApiKeyRequest;
import com.konfigthis.client.model.ApiKeyGenerateNewApiKeyResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApiKeyApi
 */
@Disabled
public class ApiKeyApiTest {

    private static ApiKeyApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ApiKeyApi(apiClient);
    }

    /**
     * Create api key
     *
     * Create a new api key
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateNewApiKeyTest() throws ApiException {
        String otpType = null;
        String token = null;
        ApiKeyGenerateNewApiKeyResponse response = api.generateNewApiKey()
                .otpType(otpType)
                .token(token)
                .execute();
        // TODO: test validations
    }

}