/*
 * Swagger CrowdSec
 * CrowdSec local API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: contact@crowdsec.net
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.Decision;
import com.konfigthis.client.model.DecisionsStreamResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BouncersApi
 */
@Disabled
public class BouncersApiTest {

    private static BouncersApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new BouncersApi(apiClient);
    }

    /**
     * getDecisionsStream
     *
     * Returns a list of new/expired decisions. Intended for bouncers that need to \&quot;stream\&quot; decisions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDecisionsStreamTest() throws ApiException {
        Boolean startup = null;
        String scopes = null;
        String origins = null;
        String scenariosContaining = null;
        String scenariosNotContaining = null;
        DecisionsStreamResponse response = api.getDecisionsStream()
                .startup(startup)
                .scopes(scopes)
                .origins(origins)
                .scenariosContaining(scenariosContaining)
                .scenariosNotContaining(scenariosNotContaining)
                .execute();
        // TODO: test validations
    }

    /**
     * GetDecisionsStream
     *
     * Returns a list of new/expired decisions. Intended for bouncers that need to \&quot;stream\&quot; decisions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDecisionsStream_0Test() throws ApiException {
        Boolean startup = null;
        api.getDecisionsStream_0()
                .startup(startup)
                .execute();
        // TODO: test validations
    }

    /**
     * getDecisions
     *
     * Returns information about existing decisions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInformationTest() throws ApiException {
        String scope = null;
        String value = null;
        String type = null;
        String ip = null;
        String range = null;
        Boolean contains = null;
        String origins = null;
        String scenariosContaining = null;
        String scenariosNotContaining = null;
        List<Decision> response = api.getInformation()
                .scope(scope)
                .value(value)
                .type(type)
                .ip(ip)
                .range(range)
                .contains(contains)
                .origins(origins)
                .scenariosContaining(scenariosContaining)
                .scenariosNotContaining(scenariosNotContaining)
                .execute();
        // TODO: test validations
    }

    /**
     * GetDecisions
     *
     * Returns information about existing decisions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInformation_0Test() throws ApiException {
        String scope = null;
        String value = null;
        String type = null;
        String ip = null;
        String range = null;
        Boolean contains = null;
        api.getInformation_0()
                .scope(scope)
                .value(value)
                .type(type)
                .ip(ip)
                .range(range)
                .contains(contains)
                .execute();
        // TODO: test validations
    }

}
