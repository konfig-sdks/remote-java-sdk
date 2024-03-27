# SandboxApi

All URIs are relative to *https://gateway.remote.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEmploymentWithoutValidations**](SandboxApi.md#createEmploymentWithoutValidations) | **POST** /v1/sandbox/employments | Create employment |
| [**employmentUpdate**](SandboxApi.md#employmentUpdate) | **PUT** /v1/sandbox/employments/{employment_id} | Update employment |
| [**triggerWebhookCallback**](SandboxApi.md#triggerWebhookCallback) | **POST** /v1/sandbox/webhook-callbacks/trigger | Trigger a Webhook |
| [**updateEmploymentState**](SandboxApi.md#updateEmploymentState) | **PATCH** /v1/sandbox/employments/{employment_id} | Update employment |


<a name="createEmploymentWithoutValidations"></a>
# **createEmploymentWithoutValidations**
> EmploymentCreationResponse createEmploymentWithoutValidations().body(body).execute();

Create employment

Creates an employment without provisional_start_date validation.  This endpoint is only available in Sandbox and allows creating employments which &#x60;provisional_start_date&#x60; is in the past. This is especially helpful for:   * Testing the Timeoff Balance endpoints   * Testing the Offboarding endpoints   * Testing features around probation periods  This endpoint will respond with a 404 outside of the Sandbox environment.  For creating an employment&#39;s parameters outside of testing purposes, use [this Employment create endpoint](https://gateway.remote.com/v1/docs/openapi.html) 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SandboxApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://gateway.remote.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Remote client = new Remote(configuration);
    try {
      EmploymentCreationResponse result = client
              .sandbox
              .createEmploymentWithoutValidations()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling SandboxApi#createEmploymentWithoutValidations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmploymentCreationResponse> response = client
              .sandbox
              .createEmploymentWithoutValidations()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SandboxApi#createEmploymentWithoutValidations");
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
| **body** | **Object**| Employment params | [optional] |

### Return type

[**EmploymentCreationResponse**](EmploymentCreationResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |

<a name="employmentUpdate"></a>
# **employmentUpdate**
> EmploymentResponse employmentUpdate(employmentId).employmentUpdateParams(employmentUpdateParams).execute();

Update employment

Updates an employment. Use this endpoint to modify employment states for testing in the Sandbox environment. This endpoint will respond with a 404 outside of the Sandbox environment.  For updating an employment&#39;s parameters outside of testing purposes, use [this Employment update endpoint](https://gateway.remote.com/v1/docs/openapi.html). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SandboxApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://gateway.remote.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Remote client = new Remote(configuration);
    String employmentId = "e3ee69d7-1293-4664-92fc-02625dae5247"; // Employment ID
    EmploymentStatus status = EmploymentStatus.fromValue("active");
    try {
      EmploymentResponse result = client
              .sandbox
              .employmentUpdate(employmentId)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling SandboxApi#employmentUpdate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmploymentResponse> response = client
              .sandbox
              .employmentUpdate(employmentId)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SandboxApi#employmentUpdate");
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
| **employmentId** | **String**| Employment ID | |
| **employmentUpdateParams** | [**EmploymentUpdateParams**](EmploymentUpdateParams.md)| Employment params | [optional] |

### Return type

[**EmploymentResponse**](EmploymentResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="triggerWebhookCallback"></a>
# **triggerWebhookCallback**
> SuccessResponse triggerWebhookCallback().webhookTriggerParams(webhookTriggerParams).execute();

Trigger a Webhook

Triggers a callback previously registered for webhooks. Use this endpoint to emit a webhook for testing in the Sandbox environment. This endpoint will respond with a 404 outside of the Sandbox environment. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SandboxApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://gateway.remote.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Remote client = new Remote(configuration);
    String employmentId = "employmentId_example";
    String eventType = "billing_document.issued";
    try {
      SuccessResponse result = client
              .sandbox
              .triggerWebhookCallback()
              .employmentId(employmentId)
              .eventType(eventType)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling SandboxApi#triggerWebhookCallback");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SuccessResponse> response = client
              .sandbox
              .triggerWebhookCallback()
              .employmentId(employmentId)
              .eventType(eventType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SandboxApi#triggerWebhookCallback");
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
| **webhookTriggerParams** | [**WebhookTriggerParams**](WebhookTriggerParams.md)| Webhook Trigger Params | [optional] |

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateEmploymentState"></a>
# **updateEmploymentState**
> EmploymentResponse updateEmploymentState(employmentId).employmentUpdateParams(employmentUpdateParams).execute();

Update employment

Updates an employment. Use this endpoint to modify employment states for testing in the Sandbox environment. This endpoint will respond with a 404 outside of the Sandbox environment.  For updating an employment&#39;s parameters outside of testing purposes, use [this Employment update endpoint](https://gateway.remote.com/v1/docs/openapi.html). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SandboxApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://gateway.remote.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    Remote client = new Remote(configuration);
    String employmentId = "e3ee69d7-1293-4664-92fc-02625dae5247"; // Employment ID
    EmploymentStatus status = EmploymentStatus.fromValue("active");
    try {
      EmploymentResponse result = client
              .sandbox
              .updateEmploymentState(employmentId)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling SandboxApi#updateEmploymentState");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmploymentResponse> response = client
              .sandbox
              .updateEmploymentState(employmentId)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SandboxApi#updateEmploymentState");
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
| **employmentId** | **String**| Employment ID | |
| **employmentUpdateParams** | [**EmploymentUpdateParams**](EmploymentUpdateParams.md)| Employment params | [optional] |

### Return type

[**EmploymentResponse**](EmploymentResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

