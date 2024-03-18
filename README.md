<div align="center">

[![Visit Crowdsec](./header.png)](https://www.crowdsec.net&#x2F;)

# [Crowdsec](https://www.crowdsec.net&#x2F;)

CrowdSec local API

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=CrowdSec&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>crowd-sec-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:crowd-sec-java-sdk:1.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/crowd-sec-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://127.0.0.1/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BouncersApi* | [**getDecisionsStream**](docs/BouncersApi.md#getDecisionsStream) | **GET** /decisions/stream | getDecisionsStream
*BouncersApi* | [**getDecisionsStream_0**](docs/BouncersApi.md#getDecisionsStream_0) | **HEAD** /decisions/stream | GetDecisionsStream
*BouncersApi* | [**getInformation**](docs/BouncersApi.md#getInformation) | **GET** /decisions | getDecisions
*BouncersApi* | [**getInformation_0**](docs/BouncersApi.md#getInformation_0) | **HEAD** /decisions | GetDecisions
*WatchersApi* | [**authenticateSession**](docs/WatchersApi.md#authenticateSession) | **POST** /watchers/login | AuthenticateWatcher
*WatchersApi* | [**createAlerts**](docs/WatchersApi.md#createAlerts) | **POST** /alerts | pushAlerts
*WatchersApi* | [**deleteAlertById**](docs/WatchersApi.md#deleteAlertById) | **DELETE** /alerts/{alert_id} | DeleteAlert
*WatchersApi* | [**getAlertById**](docs/WatchersApi.md#getAlertById) | **GET** /alerts/{alert_id} | GetAlertByID
*WatchersApi* | [**getAlertById_0**](docs/WatchersApi.md#getAlertById_0) | **HEAD** /alerts/{alert_id} | GetAlertByID
*WatchersApi* | [**listAlerts**](docs/WatchersApi.md#listAlerts) | **GET** /alerts | searchAlerts
*WatchersApi* | [**registerWatcher**](docs/WatchersApi.md#registerWatcher) | **POST** /watchers | RegisterWatcher
*WatchersApi* | [**removeAlerts**](docs/WatchersApi.md#removeAlerts) | **DELETE** /alerts | deleteAlerts
*WatchersApi* | [**removeDecisionById**](docs/WatchersApi.md#removeDecisionById) | **DELETE** /decisions/{decision_id} | DeleteDecision
*WatchersApi* | [**removeDecisions**](docs/WatchersApi.md#removeDecisions) | **DELETE** /decisions | deleteDecisions
*WatchersApi* | [**searchAlerts**](docs/WatchersApi.md#searchAlerts) | **HEAD** /alerts | searchAlerts


## Documentation for Models

 - [Alert](docs/Alert.md)
 - [Decision](docs/Decision.md)
 - [DecisionsStreamResponse](docs/DecisionsStreamResponse.md)
 - [DeleteAlertsResponse](docs/DeleteAlertsResponse.md)
 - [DeleteDecisionResponse](docs/DeleteDecisionResponse.md)
 - [Event](docs/Event.md)
 - [MetaInner](docs/MetaInner.md)
 - [Metrics](docs/Metrics.md)
 - [MetricsAgentInfo](docs/MetricsAgentInfo.md)
 - [MetricsBouncerInfo](docs/MetricsBouncerInfo.md)
 - [Source](docs/Source.md)
 - [WatcherAuthRequest](docs/WatcherAuthRequest.md)
 - [WatcherAuthResponse](docs/WatcherAuthResponse.md)
 - [WatcherRegistrationRequest](docs/WatcherRegistrationRequest.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
