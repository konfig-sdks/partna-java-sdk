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
import com.konfigthis.client.model.RatesGetConversionRatesResponse;
import com.konfigthis.client.model.RatesGetCurrentRatesResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RatesApi
 */
@Disabled
public class RatesApiTest {

    private static RatesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new RatesApi(apiClient);
    }

    /**
     * Retrieves conversion rates
     *
     * Retrieves conversion rates for all supported currencies
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConversionRatesTest() throws ApiException {
        RatesGetConversionRatesResponse response = api.getConversionRates()
                .execute();
        // TODO: test validations
    }

    /**
     * Get current rates
     *
     * Get the current rates
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrentRatesTest() throws ApiException {
        RatesGetCurrentRatesResponse response = api.getCurrentRates()
                .execute();
        // TODO: test validations
    }

}