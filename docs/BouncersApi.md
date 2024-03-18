# BouncersApi

All URIs are relative to *https://127.0.0.1/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDecisionsStream**](BouncersApi.md#getDecisionsStream) | **GET** /decisions/stream | getDecisionsStream |
| [**getDecisionsStream_0**](BouncersApi.md#getDecisionsStream_0) | **HEAD** /decisions/stream | GetDecisionsStream |
| [**getInformation**](BouncersApi.md#getInformation) | **GET** /decisions | getDecisions |
| [**getInformation_0**](BouncersApi.md#getInformation_0) | **HEAD** /decisions | GetDecisions |


<a name="getDecisionsStream"></a>
# **getDecisionsStream**
> DecisionsStreamResponse getDecisionsStream().startup(startup).scopes(scopes).origins(origins).scenariosContaining(scenariosContaining).scenariosNotContaining(scenariosNotContaining).execute();

getDecisionsStream

Returns a list of new/expired decisions. Intended for bouncers that need to \&quot;stream\&quot; decisions

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CrowdSec;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BouncersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://127.0.0.1/v1";
    
    configuration.aPIKeyAuthorizer  = "YOUR API KEY";
    CrowdSec client = new CrowdSec(configuration);
    Boolean startup = true; // If true, means that the bouncers is starting and a full list must be provided
    String scopes = "scopes_example"; // Comma separated scopes of decisions to fetch
    String origins = "origins_example"; // Comma separated name of origins. If provided, then only the decisions originating from provided origins would be returned.
    String scenariosContaining = "scenariosContaining_example"; // Comma separated words. If provided, only the decisions created by scenarios containing any of the provided word would be returned.
    String scenariosNotContaining = "scenariosNotContaining_example"; // Comma separated words. If provided, only the decisions created by scenarios, not containing any of the provided word would be returned.
    try {
      DecisionsStreamResponse result = client
              .bouncers
              .getDecisionsStream()
              .startup(startup)
              .scopes(scopes)
              .origins(origins)
              .scenariosContaining(scenariosContaining)
              .scenariosNotContaining(scenariosNotContaining)
              .execute();
      System.out.println(result);
      System.out.println(result.getNew());
      System.out.println(result.getDeleted());
    } catch (ApiException e) {
      System.err.println("Exception when calling BouncersApi#getDecisionsStream");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DecisionsStreamResponse> response = client
              .bouncers
              .getDecisionsStream()
              .startup(startup)
              .scopes(scopes)
              .origins(origins)
              .scenariosContaining(scenariosContaining)
              .scenariosNotContaining(scenariosNotContaining)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BouncersApi#getDecisionsStream");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startup** | **Boolean**| If true, means that the bouncers is starting and a full list must be provided | [optional] |
| **scopes** | **String**| Comma separated scopes of decisions to fetch | [optional] |
| **origins** | **String**| Comma separated name of origins. If provided, then only the decisions originating from provided origins would be returned. | [optional] |
| **scenariosContaining** | **String**| Comma separated words. If provided, only the decisions created by scenarios containing any of the provided word would be returned. | [optional] |
| **scenariosNotContaining** | **String**| Comma separated words. If provided, only the decisions created by scenarios, not containing any of the provided word would be returned. | [optional] |

### Return type

[**DecisionsStreamResponse**](DecisionsStreamResponse.md)

### Authorization

[APIKeyAuthorizer](../README.md#APIKeyAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getDecisionsStream_0"></a>
# **getDecisionsStream_0**
> getDecisionsStream_0().startup(startup).execute();

GetDecisionsStream

Returns a list of new/expired decisions. Intended for bouncers that need to \&quot;stream\&quot; decisions

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CrowdSec;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BouncersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://127.0.0.1/v1";
    
    configuration.aPIKeyAuthorizer  = "YOUR API KEY";
    CrowdSec client = new CrowdSec(configuration);
    Boolean startup = true; // If true, means that the bouncer is starting and a full list must be provided
    try {
      client
              .bouncers
              .getDecisionsStream_0()
              .startup(startup)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BouncersApi#getDecisionsStream_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .bouncers
              .getDecisionsStream_0()
              .startup(startup)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BouncersApi#getDecisionsStream_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startup** | **Boolean**| If true, means that the bouncer is starting and a full list must be provided | [optional] |

### Return type

null (empty response body)

### Authorization

[APIKeyAuthorizer](../README.md#APIKeyAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | 400 response |  -  |

<a name="getInformation"></a>
# **getInformation**
> List&lt;Decision&gt; getInformation().scope(scope).value(value).type(type).ip(ip).range(range).contains(contains).origins(origins).scenariosContaining(scenariosContaining).scenariosNotContaining(scenariosNotContaining).execute();

getDecisions

Returns information about existing decisions

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CrowdSec;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BouncersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://127.0.0.1/v1";
    CrowdSec client = new CrowdSec(configuration);
    String scope = "scope_example"; // scope to which the decision applies (ie. IP/Range/Username/Session/...)
    String value = "value_example"; // the value to match for in the specified scope
    String type = "type_example"; // type of decision
    String ip = "ip_example"; // IP to search for (shorthand for scope=ip&value=)
    String range = "range_example"; // range to search for (shorthand for scope=range&value=)
    Boolean contains = true; // indicate if you're looking for a decision that contains the value, or that is contained within the value
    String origins = "origins_example"; // Comma separated name of origins. If provided, then only the decisions originating from provided origins would be returned.
    String scenariosContaining = "scenariosContaining_example"; // Comma separated words. If provided, only the decisions created by scenarios containing any of the provided word would be returned.
    String scenariosNotContaining = "scenariosNotContaining_example"; // Comma separated words. If provided, only the decisions created by scenarios, not containing any of the provided word would be returned.
    try {
      List<Decision> result = client
              .bouncers
              .getInformation()
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
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BouncersApi#getInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Decision>> response = client
              .bouncers
              .getInformation()
              .scope(scope)
              .value(value)
              .type(type)
              .ip(ip)
              .range(range)
              .contains(contains)
              .origins(origins)
              .scenariosContaining(scenariosContaining)
              .scenariosNotContaining(scenariosNotContaining)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BouncersApi#getInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| scope to which the decision applies (ie. IP/Range/Username/Session/...) | [optional] |
| **value** | **String**| the value to match for in the specified scope | [optional] |
| **type** | **String**| type of decision | [optional] |
| **ip** | **String**| IP to search for (shorthand for scope&#x3D;ip&amp;value&#x3D;) | [optional] |
| **range** | **String**| range to search for (shorthand for scope&#x3D;range&amp;value&#x3D;) | [optional] |
| **contains** | **Boolean**| indicate if you&#39;re looking for a decision that contains the value, or that is contained within the value | [optional] |
| **origins** | **String**| Comma separated name of origins. If provided, then only the decisions originating from provided origins would be returned. | [optional] |
| **scenariosContaining** | **String**| Comma separated words. If provided, only the decisions created by scenarios containing any of the provided word would be returned. | [optional] |
| **scenariosNotContaining** | **String**| Comma separated words. If provided, only the decisions created by scenarios, not containing any of the provided word would be returned. | [optional] |

### Return type

[**List&lt;Decision&gt;**](Decision.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getInformation_0"></a>
# **getInformation_0**
> getInformation_0().scope(scope).value(value).type(type).ip(ip).range(range).contains(contains).execute();

GetDecisions

Returns information about existing decisions

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CrowdSec;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BouncersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://127.0.0.1/v1";
    
    configuration.aPIKeyAuthorizer  = "YOUR API KEY";
    CrowdSec client = new CrowdSec(configuration);
    String scope = "scope_example"; // scope to which the decision applies (ie. IP/Range/Username/Session/...)
    String value = "value_example"; // the value to match for in the specified scope
    String type = "type_example"; // type of decision
    String ip = "ip_example"; // IP to search for (shorthand for scope=ip&value=)
    String range = "range_example"; // range to search for (shorthand for scope=range&value=)
    Boolean contains = true; // indicate if you're looking for a decision that contains the value, or that is contained within the value
    try {
      client
              .bouncers
              .getInformation_0()
              .scope(scope)
              .value(value)
              .type(type)
              .ip(ip)
              .range(range)
              .contains(contains)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BouncersApi#getInformation_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .bouncers
              .getInformation_0()
              .scope(scope)
              .value(value)
              .type(type)
              .ip(ip)
              .range(range)
              .contains(contains)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling BouncersApi#getInformation_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **scope** | **String**| scope to which the decision applies (ie. IP/Range/Username/Session/...) | [optional] |
| **value** | **String**| the value to match for in the specified scope | [optional] |
| **type** | **String**| type of decision | [optional] |
| **ip** | **String**| IP to search for (shorthand for scope&#x3D;ip&amp;value&#x3D;) | [optional] |
| **range** | **String**| range to search for (shorthand for scope&#x3D;range&amp;value&#x3D;) | [optional] |
| **contains** | **Boolean**| indicate if you&#39;re looking for a decision that contains the value, or that is contained within the value | [optional] |

### Return type

null (empty response body)

### Authorization

[APIKeyAuthorizer](../README.md#APIKeyAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | 400 response |  -  |

