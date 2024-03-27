# ContractAmendmentsApi

All URIs are relative to *https://gateway.remote.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approveAmendment**](ContractAmendmentsApi.md#approveAmendment) | **PUT** /v1/sandbox/contract-amendments/{contract_amendment_request_id}/approve | Approve Contract Amendment in the Sandbox Environment |
| [**checkAutomatability**](ContractAmendmentsApi.md#checkAutomatability) | **POST** /v1/contract-amendments/automatable | Automatable Contract Amendment |
| [**createRequest**](ContractAmendmentsApi.md#createRequest) | **POST** /v1/contract-amendments | Create Contract Amendment |
| [**getFormSchema**](ContractAmendmentsApi.md#getFormSchema) | **POST** /v1/contract-amendments/schema | Show form schema |
| [**listRequests**](ContractAmendmentsApi.md#listRequests) | **GET** /v1/contract-amendments | List Contract Amendment |
| [**showSingleRequest**](ContractAmendmentsApi.md#showSingleRequest) | **GET** /v1/contract-amendments/{id} | Show Contract Amendment |


<a name="approveAmendment"></a>
# **approveAmendment**
> ContractAmendmentResponse approveAmendment(contractAmendmentRequestId).execute();

Approve Contract Amendment in the Sandbox Environment

Approves a contract amendment request without the intervention of a Remote admin. Approvals done via this endpoint are effective immediately, regardless of the effective date entered on the contract amendment creation.  This endpoint is only available in Sandbox, otherwise it will respond with a 404. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractAmendmentsApi;
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
    String contractAmendmentRequestId = "6d947344-b053-4a4f-acf0-79d296cbd082"; // Contract amendment request ID
    try {
      ContractAmendmentResponse result = client
              .contractAmendments
              .approveAmendment(contractAmendmentRequestId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractAmendmentsApi#approveAmendment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractAmendmentResponse> response = client
              .contractAmendments
              .approveAmendment(contractAmendmentRequestId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractAmendmentsApi#approveAmendment");
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
| **contractAmendmentRequestId** | **String**| Contract amendment request ID | |

### Return type

[**ContractAmendmentResponse**](ContractAmendmentResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="checkAutomatability"></a>
# **checkAutomatability**
> ContractAmendmentAutomatableResponse checkAutomatability().createContractAmendmentParams(createContractAmendmentParams).execute();

Automatable Contract Amendment

Check if a contract amendment request is automatable. If the contract amendment request is automatable, then after submission, it will instantly amend the employee&#39;s contract and send them an updated document.  This endpoint requires and returns country-specific data. The exact required and returned fields will vary depending on which country the employment is in. To see the list of parameters for each country, see the **Show form schema** endpoint under the [Contract Amendments](https://gateway.remote.com/v1/docs/openapi.html) category.  Please note that the compliance requirements for each country are subject to change according to local laws. Given its continual updates, using Remote&#39;s [json-schema-form](https://remote.com/resources/api/how-json-schemas-work) should be considered in order to avoid compliance issues and to have the latest version of a country requirements.  If you are using this endpoint to build an integration, make sure you are dynamically collecting or displaying the latest parameters for each country by querying the _\&quot;Show form schema\&quot;_ endpoint.  For more information on JSON Schemas, see the **How JSON Schemas work** documentation.  To learn how you can dynamically generate forms to display in your UI, see the documentation for the [json-schema-form](https://remote.com/resources/api/how-json-schemas-work) tool.  

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractAmendmentsApi;
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
    String amendmentContractId = "amendmentContractId_example"; // The contract ID of the contract that needs to be amended.
    Object contractAmendment = null; // Contract amendment informations. As its properties may vary depending on the country,                 you must query the [Show form schema](https://gateway.remote.com/v1/docs/openapi.html) endpoint             passing the country code, `contract_amendment` and the employment ID as request body.
    String employmentId = "employmentId_example"; // The employment ID that is related to the contract amendment request.
    try {
      ContractAmendmentAutomatableResponse result = client
              .contractAmendments
              .checkAutomatability(amendmentContractId, contractAmendment, employmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractAmendmentsApi#checkAutomatability");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractAmendmentAutomatableResponse> response = client
              .contractAmendments
              .checkAutomatability(amendmentContractId, contractAmendment, employmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractAmendmentsApi#checkAutomatability");
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
| **createContractAmendmentParams** | [**CreateContractAmendmentParams**](CreateContractAmendmentParams.md)| Contract Amendment Params | [optional] |

### Return type

[**ContractAmendmentAutomatableResponse**](ContractAmendmentAutomatableResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="createRequest"></a>
# **createRequest**
> ContractAmendmentResponse createRequest().createContractAmendmentParams(createContractAmendmentParams).execute();

Create Contract Amendment

Creates a Contract Amendment request.  This endpoint requires and returns country-specific data. The exact required and returned fields will vary depending on which country the employment is in. To see the list of parameters for each country, see the **Show form schema** endpoint under the [Contract Amendments](https://gateway.remote.com/v1/docs/openapi.html) category.  Please note that the compliance requirements for each country are subject to change according to local laws. Given its continual updates, using Remote&#39;s [json-schema-form](https://remote.com/resources/api/how-json-schemas-work) should be considered in order to avoid compliance issues and to have the latest version of a country requirements.  If you are using this endpoint to build an integration, make sure you are dynamically collecting or displaying the latest parameters for each country by querying the _\&quot;Show form schema\&quot;_ endpoint.  For more information on JSON Schemas, see the **How JSON Schemas work** documentation.  To learn how you can dynamically generate forms to display in your UI, see the documentation for the [json-schema-form](https://remote.com/resources/api/how-json-schemas-work) tool.  

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractAmendmentsApi;
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
    String amendmentContractId = "amendmentContractId_example"; // The contract ID of the contract that needs to be amended.
    Object contractAmendment = null; // Contract amendment informations. As its properties may vary depending on the country,                 you must query the [Show form schema](https://gateway.remote.com/v1/docs/openapi.html) endpoint             passing the country code, `contract_amendment` and the employment ID as request body.
    String employmentId = "employmentId_example"; // The employment ID that is related to the contract amendment request.
    try {
      ContractAmendmentResponse result = client
              .contractAmendments
              .createRequest(amendmentContractId, contractAmendment, employmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractAmendmentsApi#createRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractAmendmentResponse> response = client
              .contractAmendments
              .createRequest(amendmentContractId, contractAmendment, employmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractAmendmentsApi#createRequest");
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
| **createContractAmendmentParams** | [**CreateContractAmendmentParams**](CreateContractAmendmentParams.md)| Contract Amendment | [optional] |

### Return type

[**ContractAmendmentResponse**](ContractAmendmentResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |

<a name="getFormSchema"></a>
# **getFormSchema**
> ContractAmendmentFormResponse getFormSchema(contractAmendmentSchemaParams).execute();

Show form schema

Returns the json schema of the &#x60;contract_amendment&#x60; form. This endpoint requires a company access token, as forms are dependent on certain properties of companies and their current employments. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractAmendmentsApi;
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
    String countryCode = "countryCode_example"; // Country code according to ISO 3-digit alphabetic codes.
    String employmentId = "employmentId_example"; // The ID of the employment concerned by the contract amendment request.
    String form = "contract_amendment"; // Name of the desired form
    try {
      ContractAmendmentFormResponse result = client
              .contractAmendments
              .getFormSchema(countryCode, employmentId)
              .form(form)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractAmendmentsApi#getFormSchema");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractAmendmentFormResponse> response = client
              .contractAmendments
              .getFormSchema(countryCode, employmentId)
              .form(form)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractAmendmentsApi#getFormSchema");
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
| **contractAmendmentSchemaParams** | [**ContractAmendmentSchemaParams**](ContractAmendmentSchemaParams.md)| Contract Amendment Form | |

### Return type

[**ContractAmendmentFormResponse**](ContractAmendmentFormResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listRequests"></a>
# **listRequests**
> ListContractAmendmentResponse listRequests().execute();

List Contract Amendment

List Contract Amendment requests.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractAmendmentsApi;
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
      ListContractAmendmentResponse result = client
              .contractAmendments
              .listRequests()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractAmendmentsApi#listRequests");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListContractAmendmentResponse> response = client
              .contractAmendments
              .listRequests()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractAmendmentsApi#listRequests");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListContractAmendmentResponse**](ListContractAmendmentResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="showSingleRequest"></a>
# **showSingleRequest**
> ContractAmendmentResponse showSingleRequest(id).execute();

Show Contract Amendment

Show a single Contract Amendment request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractAmendmentsApi;
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
    String id = "93t3j-contract_amendment_id-9suej43"; // Contract amendment request ID
    try {
      ContractAmendmentResponse result = client
              .contractAmendments
              .showSingleRequest(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractAmendmentsApi#showSingleRequest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractAmendmentResponse> response = client
              .contractAmendments
              .showSingleRequest(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractAmendmentsApi#showSingleRequest");
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
| **id** | **String**| Contract amendment request ID | |

### Return type

[**ContractAmendmentResponse**](ContractAmendmentResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

