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
import com.konfigthis.client.model.BankGetSupportedBanksResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BankApi
 */
@Disabled
public class BankApiTest {

    private static BankApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new BankApi(apiClient);
    }

    /**
     * Retrieve a list of supported banks
     *
     * Retrieve a list of supported banks
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSupportedBanksTest() throws ApiException {
        String country = null;
        BankGetSupportedBanksResponse response = api.getSupportedBanks()
                .country(country)
                .execute();
        // TODO: test validations
    }

}