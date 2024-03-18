# WatchersApi

All URIs are relative to *https://127.0.0.1/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authenticateSession**](WatchersApi.md#authenticateSession) | **POST** /watchers/login | AuthenticateWatcher |
| [**createAlerts**](WatchersApi.md#createAlerts) | **POST** /alerts | pushAlerts |
| [**deleteAlertById**](WatchersApi.md#deleteAlertById) | **DELETE** /alerts/{alert_id} | DeleteAlert |
| [**getAlertById**](WatchersApi.md#getAlertById) | **GET** /alerts/{alert_id} | GetAlertByID |
| [**getAlertById_0**](WatchersApi.md#getAlertById_0) | **HEAD** /alerts/{alert_id} | GetAlertByID |
| [**listAlerts**](WatchersApi.md#listAlerts) | **GET** /alerts | searchAlerts |
| [**registerWatcher**](WatchersApi.md#registerWatcher) | **POST** /watchers | RegisterWatcher |
| [**removeAlerts**](WatchersApi.md#removeAlerts) | **DELETE** /alerts | deleteAlerts |
| [**removeDecisionById**](WatchersApi.md#removeDecisionById) | **DELETE** /decisions/{decision_id} | DeleteDecision |
| [**removeDecisions**](WatchersApi.md#removeDecisions) | **DELETE** /decisions | deleteDecisions |
| [**searchAlerts**](WatchersApi.md#searchAlerts) | **HEAD** /alerts | searchAlerts |


<a name="authenticateSession"></a>
# **authenticateSession**
> WatcherAuthResponse authenticateSession(watcherAuthRequest).execute();

AuthenticateWatcher

Authenticate current to get session ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CrowdSec;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WatchersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://127.0.0.1/v1";
    CrowdSec client = new CrowdSec(configuration);
    String machineId = "machineId_example";
    String password = "password_example";
    List<String> scenarios = Arrays.asList(); // the list of scenarios enabled on the watcher
    try {
      WatcherAuthResponse result = client
              .watchers
              .authenticateSession(machineId, password)
              .scenarios(scenarios)
              .execute();
      System.out.println(result);
      System.out.println(result.getCode());
      System.out.println(result.getExpire());
      System.out.println(result.getToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchersApi#authenticateSession");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WatcherAuthResponse> response = client
              .watchers
              .authenticateSession(machineId, password)
              .scenarios(scenarios)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchersApi#authenticateSession");
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
| **watcherAuthRequest** | [**WatcherAuthRequest**](WatcherAuthRequest.md)| Information about the watcher to be reset | |

### Return type

[**WatcherAuthResponse**](WatcherAuthResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Login successful |  -  |

<a name="createAlerts"></a>
# **createAlerts**
> List&lt;String&gt; createAlerts(alert).execute();

pushAlerts

Push alerts to API

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CrowdSec;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WatchersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://127.0.0.1/v1";
    
    configuration.jWTAuthorizer  = "YOUR API KEY";
    CrowdSec client = new CrowdSec(configuration);
    try {
      List<String> result = client
              .watchers
              .createAlerts()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchersApi#createAlerts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<String>> response = client
              .watchers
              .createAlerts()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchersApi#createAlerts");
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
| **alert** | [**List&lt;Alert&gt;**](Alert.md)| Push alerts to the API | |

### Return type

**List&lt;String&gt;**

### Authorization

[JWTAuthorizer](../README.md#JWTAuthorizer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Alert(s) created |  -  |

<a name="deleteAlertById"></a>
# **deleteAlertById**
> DeleteAlertsResponse deleteAlertById(alertId).execute();

DeleteAlert

Delete alert for given alert ID (only from cscli)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CrowdSec;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WatchersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://127.0.0.1/v1";
    
    configuration.jWTAuthorizer  = "YOUR API KEY";
    CrowdSec client = new CrowdSec(configuration);
    String alertId = "alertId_example"; // 
    try {
      DeleteAlertsResponse result = client
              .watchers
              .deleteAlertById(alertId)
              .execute();
      System.out.println(result);
      System.out.println(result.getNbDeleted());
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchersApi#deleteAlertById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeleteAlertsResponse> response = client
              .watchers
              .deleteAlertById(alertId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchersApi#deleteAlertById");
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
| **alertId** | **String**|  | |

### Return type

[**DeleteAlertsResponse**](DeleteAlertsResponse.md)

### Authorization

[JWTAuthorizer](../README.md#JWTAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getAlertById"></a>
# **getAlertById**
> Alert getAlertById(alertId).execute();

GetAlertByID

Get alert by ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CrowdSec;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WatchersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://127.0.0.1/v1";
    
    configuration.jWTAuthorizer  = "YOUR API KEY";
    CrowdSec client = new CrowdSec(configuration);
    String alertId = "alertId_example"; // 
    try {
      Alert result = client
              .watchers
              .getAlertById(alertId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUuid());
      System.out.println(result.getMachineId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getScenario());
      System.out.println(result.getScenarioHash());
      System.out.println(result.getScenarioVersion());
      System.out.println(result.getMessage());
      System.out.println(result.getEventsCount());
      System.out.println(result.getStartAt());
      System.out.println(result.getStopAt());
      System.out.println(result.getCapacity());
      System.out.println(result.getLeakspeed());
      System.out.println(result.getSimulated());
      System.out.println(result.getEvents());
      System.out.println(result.getRemediation());
      System.out.println(result.getDecisions());
      System.out.println(result.getSource());
      System.out.println(result.getMeta());
      System.out.println(result.getLabels());
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchersApi#getAlertById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Alert> response = client
              .watchers
              .getAlertById(alertId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchersApi#getAlertById");
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
| **alertId** | **String**|  | |

### Return type

[**Alert**](Alert.md)

### Authorization

[JWTAuthorizer](../README.md#JWTAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="getAlertById_0"></a>
# **getAlertById_0**
> getAlertById_0(alertId).execute();

GetAlertByID

Get alert by ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CrowdSec;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WatchersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://127.0.0.1/v1";
    
    configuration.jWTAuthorizer  = "YOUR API KEY";
    CrowdSec client = new CrowdSec(configuration);
    String alertId = "alertId_example"; // 
    try {
      client
              .watchers
              .getAlertById_0(alertId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchersApi#getAlertById_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .watchers
              .getAlertById_0(alertId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchersApi#getAlertById_0");
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
| **alertId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[JWTAuthorizer](../README.md#JWTAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | 400 response |  -  |

<a name="listAlerts"></a>
# **listAlerts**
> List&lt;Alert&gt; listAlerts().scope(scope).value(value).scenario(scenario).ip(ip).range(range).since(since).until(until).simulated(simulated).hasActiveDecision(hasActiveDecision).decisionType(decisionType).limit(limit).origin(origin).execute();

searchAlerts

Allows to search for alerts

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CrowdSec;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WatchersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://127.0.0.1/v1";
    
    configuration.jWTAuthorizer  = "YOUR API KEY";
    CrowdSec client = new CrowdSec(configuration);
    String scope = "scope_example"; // show alerts for this scope
    String value = "value_example"; // show alerts for this value (used with scope)
    String scenario = "scenario_example"; // show alerts for this scenario
    String ip = "ip_example"; // IP to search for (shorthand for scope=ip&value=)
    String range = "range_example"; // range to search for (shorthand for scope=range&value=)
    OffsetDateTime since = OffsetDateTime.now(); // search alerts newer than delay (format must be compatible with time.ParseDuration)
    OffsetDateTime until = OffsetDateTime.now(); // search alerts older than delay (format must be compatible with time.ParseDuration)
    Boolean simulated = true; // if set to true, decisions in simulation mode will be returned as well
    Boolean hasActiveDecision = true; // only return alerts with decisions not expired yet
    String decisionType = "decisionType_example"; // restrict results to alerts with decisions matching given type
    Double limit = 3.4D; // number of alerts to return
    String origin = "origin_example"; // restrict results to this origin (ie. lists,CAPI,cscli)
    try {
      List<Alert> result = client
              .watchers
              .listAlerts()
              .scope(scope)
              .value(value)
              .scenario(scenario)
              .ip(ip)
              .range(range)
              .since(since)
              .until(until)
              .simulated(simulated)
              .hasActiveDecision(hasActiveDecision)
              .decisionType(decisionType)
              .limit(limit)
              .origin(origin)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchersApi#listAlerts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Alert>> response = client
              .watchers
              .listAlerts()
              .scope(scope)
              .value(value)
              .scenario(scenario)
              .ip(ip)
              .range(range)
              .since(since)
              .until(until)
              .simulated(simulated)
              .hasActiveDecision(hasActiveDecision)
              .decisionType(decisionType)
              .limit(limit)
              .origin(origin)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchersApi#listAlerts");
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
| **scope** | **String**| show alerts for this scope | [optional] |
| **value** | **String**| show alerts for this value (used with scope) | [optional] |
| **scenario** | **String**| show alerts for this scenario | [optional] |
| **ip** | **String**| IP to search for (shorthand for scope&#x3D;ip&amp;value&#x3D;) | [optional] |
| **range** | **String**| range to search for (shorthand for scope&#x3D;range&amp;value&#x3D;) | [optional] |
| **since** | **OffsetDateTime**| search alerts newer than delay (format must be compatible with time.ParseDuration) | [optional] |
| **until** | **OffsetDateTime**| search alerts older than delay (format must be compatible with time.ParseDuration) | [optional] |
| **simulated** | **Boolean**| if set to true, decisions in simulation mode will be returned as well | [optional] |
| **hasActiveDecision** | **Boolean**| only return alerts with decisions not expired yet | [optional] |
| **decisionType** | **String**| restrict results to alerts with decisions matching given type | [optional] |
| **limit** | **Double**| number of alerts to return | [optional] |
| **origin** | **String**| restrict results to this origin (ie. lists,CAPI,cscli) | [optional] |

### Return type

[**List&lt;Alert&gt;**](Alert.md)

### Authorization

[JWTAuthorizer](../README.md#JWTAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="registerWatcher"></a>
# **registerWatcher**
> registerWatcher(watcherRegistrationRequest).execute();

RegisterWatcher

This method is used when installing crowdsec (cscli-&gt;APIL)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CrowdSec;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WatchersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://127.0.0.1/v1";
    CrowdSec client = new CrowdSec(configuration);
    String machineId = "machineId_example";
    String password = "password_example";
    try {
      client
              .watchers
              .registerWatcher(machineId, password)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchersApi#registerWatcher");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .watchers
              .registerWatcher(machineId, password)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchersApi#registerWatcher");
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
| **watcherRegistrationRequest** | [**WatcherRegistrationRequest**](WatcherRegistrationRequest.md)| Information about the watcher to be registered | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Watcher Created |  -  |

<a name="removeAlerts"></a>
# **removeAlerts**
> DeleteAlertsResponse removeAlerts().scope(scope).value(value).scenario(scenario).ip(ip).range(range).since(since).until(until).hasActiveDecision(hasActiveDecision).alertSource(alertSource).execute();

deleteAlerts

Allows to delete alerts

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CrowdSec;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WatchersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://127.0.0.1/v1";
    
    configuration.jWTAuthorizer  = "YOUR API KEY";
    CrowdSec client = new CrowdSec(configuration);
    String scope = "scope_example"; // delete alerts for this scope
    String value = "value_example"; // delete alerts for this value (used with scope)
    String scenario = "scenario_example"; // delete alerts for this scenario
    String ip = "ip_example"; // delete Alerts with IP (shorthand for scope=ip&value=)
    String range = "range_example"; // delete alerts concerned by range (shorthand for scope=range&value=)
    OffsetDateTime since = OffsetDateTime.now(); // delete alerts added after YYYY-mm-DD-HH:MM:SS
    OffsetDateTime until = OffsetDateTime.now(); // delete alerts added before YYYY-mm-DD-HH:MM:SS
    Boolean hasActiveDecision = true; // delete only alerts with decisions not expired yet
    String alertSource = "alertSource_example"; // delete only alerts with matching source (ie. cscli/crowdsec)
    try {
      DeleteAlertsResponse result = client
              .watchers
              .removeAlerts()
              .scope(scope)
              .value(value)
              .scenario(scenario)
              .ip(ip)
              .range(range)
              .since(since)
              .until(until)
              .hasActiveDecision(hasActiveDecision)
              .alertSource(alertSource)
              .execute();
      System.out.println(result);
      System.out.println(result.getNbDeleted());
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchersApi#removeAlerts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeleteAlertsResponse> response = client
              .watchers
              .removeAlerts()
              .scope(scope)
              .value(value)
              .scenario(scenario)
              .ip(ip)
              .range(range)
              .since(since)
              .until(until)
              .hasActiveDecision(hasActiveDecision)
              .alertSource(alertSource)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchersApi#removeAlerts");
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
| **scope** | **String**| delete alerts for this scope | [optional] |
| **value** | **String**| delete alerts for this value (used with scope) | [optional] |
| **scenario** | **String**| delete alerts for this scenario | [optional] |
| **ip** | **String**| delete Alerts with IP (shorthand for scope&#x3D;ip&amp;value&#x3D;) | [optional] |
| **range** | **String**| delete alerts concerned by range (shorthand for scope&#x3D;range&amp;value&#x3D;) | [optional] |
| **since** | **OffsetDateTime**| delete alerts added after YYYY-mm-DD-HH:MM:SS | [optional] |
| **until** | **OffsetDateTime**| delete alerts added before YYYY-mm-DD-HH:MM:SS | [optional] |
| **hasActiveDecision** | **Boolean**| delete only alerts with decisions not expired yet | [optional] |
| **alertSource** | **String**| delete only alerts with matching source (ie. cscli/crowdsec) | [optional] |

### Return type

[**DeleteAlertsResponse**](DeleteAlertsResponse.md)

### Authorization

[JWTAuthorizer](../README.md#JWTAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="removeDecisionById"></a>
# **removeDecisionById**
> DeleteDecisionResponse removeDecisionById(decisionId).execute();

DeleteDecision

Delete decision for given decision ID (only from cscli)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CrowdSec;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WatchersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://127.0.0.1/v1";
    
    configuration.jWTAuthorizer  = "YOUR API KEY";
    CrowdSec client = new CrowdSec(configuration);
    String decisionId = "decisionId_example"; // 
    try {
      DeleteDecisionResponse result = client
              .watchers
              .removeDecisionById(decisionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getNbDeleted());
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchersApi#removeDecisionById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeleteDecisionResponse> response = client
              .watchers
              .removeDecisionById(decisionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchersApi#removeDecisionById");
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
| **decisionId** | **String**|  | |

### Return type

[**DeleteDecisionResponse**](DeleteDecisionResponse.md)

### Authorization

[JWTAuthorizer](../README.md#JWTAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="removeDecisions"></a>
# **removeDecisions**
> DeleteDecisionResponse removeDecisions().scope(scope).value(value).type(type).ip(ip).range(range).scenario(scenario).execute();

deleteDecisions

Delete decisions(s) for given filters (only from cscli)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CrowdSec;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WatchersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://127.0.0.1/v1";
    
    configuration.jWTAuthorizer  = "YOUR API KEY";
    CrowdSec client = new CrowdSec(configuration);
    String scope = "scope_example"; // scope to which the decision applies (ie. IP/Range/Username/Session/...)
    String value = "value_example"; // the value to match for in the specified scope
    String type = "type_example"; // type of decision
    String ip = "ip_example"; // IP to search for (shorthand for scope=ip&value=)
    String range = "range_example"; // range to search for (shorthand for scope=range&value=)
    String scenario = "scenario_example"; // scenario to search
    try {
      DeleteDecisionResponse result = client
              .watchers
              .removeDecisions()
              .scope(scope)
              .value(value)
              .type(type)
              .ip(ip)
              .range(range)
              .scenario(scenario)
              .execute();
      System.out.println(result);
      System.out.println(result.getNbDeleted());
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchersApi#removeDecisions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeleteDecisionResponse> response = client
              .watchers
              .removeDecisions()
              .scope(scope)
              .value(value)
              .type(type)
              .ip(ip)
              .range(range)
              .scenario(scenario)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchersApi#removeDecisions");
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
| **scenario** | **String**| scenario to search | [optional] |

### Return type

[**DeleteDecisionResponse**](DeleteDecisionResponse.md)

### Authorization

[JWTAuthorizer](../README.md#JWTAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="searchAlerts"></a>
# **searchAlerts**
> searchAlerts().scope(scope).value(value).scenario(scenario).ip(ip).range(range).since(since).until(until).simulated(simulated).hasActiveDecision(hasActiveDecision).decisionType(decisionType).limit(limit).origin(origin).execute();

searchAlerts

Allows to search for alerts

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.CrowdSec;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WatchersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://127.0.0.1/v1";
    
    configuration.jWTAuthorizer  = "YOUR API KEY";
    CrowdSec client = new CrowdSec(configuration);
    String scope = "scope_example"; // show alerts for this scope
    String value = "value_example"; // show alerts for this value (used with scope)
    String scenario = "scenario_example"; // show alerts for this scenario
    String ip = "ip_example"; // IP to search for (shorthand for scope=ip&value=)
    String range = "range_example"; // range to search for (shorthand for scope=range&value=)
    OffsetDateTime since = OffsetDateTime.now(); // search alerts newer than delay (format must be compatible with time.ParseDuration)
    OffsetDateTime until = OffsetDateTime.now(); // search alerts older than delay (format must be compatible with time.ParseDuration)
    Boolean simulated = true; // if set to true, decisions in simulation mode will be returned as well
    Boolean hasActiveDecision = true; // only return alerts with decisions not expired yet
    String decisionType = "decisionType_example"; // restrict results to alerts with decisions matching given type
    Double limit = 3.4D; // number of alerts to return
    String origin = "origin_example"; // restrict results to this origin (ie. lists,CAPI,cscli)
    try {
      client
              .watchers
              .searchAlerts()
              .scope(scope)
              .value(value)
              .scenario(scenario)
              .ip(ip)
              .range(range)
              .since(since)
              .until(until)
              .simulated(simulated)
              .hasActiveDecision(hasActiveDecision)
              .decisionType(decisionType)
              .limit(limit)
              .origin(origin)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchersApi#searchAlerts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .watchers
              .searchAlerts()
              .scope(scope)
              .value(value)
              .scenario(scenario)
              .ip(ip)
              .range(range)
              .since(since)
              .until(until)
              .simulated(simulated)
              .hasActiveDecision(hasActiveDecision)
              .decisionType(decisionType)
              .limit(limit)
              .origin(origin)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling WatchersApi#searchAlerts");
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
| **scope** | **String**| show alerts for this scope | [optional] |
| **value** | **String**| show alerts for this value (used with scope) | [optional] |
| **scenario** | **String**| show alerts for this scenario | [optional] |
| **ip** | **String**| IP to search for (shorthand for scope&#x3D;ip&amp;value&#x3D;) | [optional] |
| **range** | **String**| range to search for (shorthand for scope&#x3D;range&amp;value&#x3D;) | [optional] |
| **since** | **OffsetDateTime**| search alerts newer than delay (format must be compatible with time.ParseDuration) | [optional] |
| **until** | **OffsetDateTime**| search alerts older than delay (format must be compatible with time.ParseDuration) | [optional] |
| **simulated** | **Boolean**| if set to true, decisions in simulation mode will be returned as well | [optional] |
| **hasActiveDecision** | **Boolean**| only return alerts with decisions not expired yet | [optional] |
| **decisionType** | **String**| restrict results to alerts with decisions matching given type | [optional] |
| **limit** | **Double**| number of alerts to return | [optional] |
| **origin** | **String**| restrict results to this origin (ie. lists,CAPI,cscli) | [optional] |

### Return type

null (empty response body)

### Authorization

[JWTAuthorizer](../README.md#JWTAuthorizer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | 400 response |  -  |

