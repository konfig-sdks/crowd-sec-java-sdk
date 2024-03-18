package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://127.0.0.1/v1";
        
        configuration.aPIKeyAuthorizer  = "YOUR API KEY";
        
        configuration.jWTAuthorizer  = "YOUR API KEY";
        CrowdSec client = new CrowdSec(configuration);
        assertNotNull(client);
    }
}
