package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://staging-biz.coinprofile.co/v2";
        
        configuration.adminSecret  = "YOUR API KEY";
        
        configuration.apiKey  = "YOUR API KEY";
        
        configuration.apiUser  = "YOUR API KEY";
        
        configuration.userVersion  = "YOUR API KEY";
        Partna client = new Partna(configuration);
        assertNotNull(client);
    }
}
