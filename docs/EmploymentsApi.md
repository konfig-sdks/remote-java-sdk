# EmploymentsApi

All URIs are relative to *https://gateway.remote.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**completeOnboarding**](EmploymentsApi.md#completeOnboarding) | **POST** /v1/ready | Complete onboarding |
| [**createEmployment**](EmploymentsApi.md#createEmployment) | **POST** /v1/employments | Create employment |
| [**getEmploymentInfo**](EmploymentsApi.md#getEmploymentInfo) | **GET** /v1/employments/{employment_id} | Show employment |
| [**inviteStartEnrollment**](EmploymentsApi.md#inviteStartEnrollment) | **POST** /v1/employments/{employment_id}/invite | Invite employment |
| [**listAll**](EmploymentsApi.md#listAll) | **GET** /v1/employments | List employments |
| [**updateData**](EmploymentsApi.md#updateData) | **PATCH** /v1/employments/{employment_id} | Update employment |
| [**updateDetails**](EmploymentsApi.md#updateDetails) | **PUT** /v1/employments/{employment_id} | Update employment |


<a name="completeOnboarding"></a>
# **completeOnboarding**
> EmploymentResponse completeOnboarding(completeOnboarding).execute();

Complete onboarding

Completes the employee onboarding. When all tasks are completed, the employee is marked as in &#x60;review&#x60; status

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmploymentsApi;
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
    try {
      EmploymentResponse result = client
              .employments
              .completeOnboarding()
              .employmentId(employmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmploymentsApi#completeOnboarding");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmploymentResponse> response = client
              .employments
              .completeOnboarding()
              .employmentId(employmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmploymentsApi#completeOnboarding");
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
| **completeOnboarding** | [**CompleteOnboarding**](CompleteOnboarding.md)| Employment slug | |

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

<a name="createEmployment"></a>
# **createEmployment**
> EmploymentCreationResponse createEmployment().body(body).execute();

Create employment

Creates an employment. We support creating employees and contractors.  This endpoint requires and returns country-specific data. The exact required and returned fields will vary depending on which country the employment is in. To see the list of parameters for each country, see the **Show form schema** endpoint under the [Countries](https://gateway.remote.com/v1/docs/openapi.html) category.  Please note that the compliance requirements for each country are subject to change according to local laws. Given its continual updates, using Remote&#39;s [json-schema-form](https://remote.com/resources/api/how-json-schemas-work) should be considered in order to avoid compliance issues and to have the latest version of a country requirements.  If you are using this endpoint to build an integration, make sure you are dynamically collecting or displaying the latest parameters for each country by querying the _\&quot;Show form schema\&quot;_ endpoint.  For more information on JSON Schemas, see the **How JSON Schemas work** documentation.  To learn how you can dynamically generate forms to display in your UI, see the documentation for the [json-schema-form](https://remote.com/resources/api/how-json-schemas-work) tool.  

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmploymentsApi;
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
              .employments
              .createEmployment()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmploymentsApi#createEmployment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmploymentCreationResponse> response = client
              .employments
              .createEmployment()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmploymentsApi#createEmployment");
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

<a name="getEmploymentInfo"></a>
# **getEmploymentInfo**
> EmploymentResponse getEmploymentInfo(employmentId).execute();

Show employment

Shows all the information of an employment.  This endpoint requires and returns country-specific data. The exact required and returned fields will vary depending on which country the employment is in. To see the list of parameters for each country, see the **Show form schema** endpoint under the [Countries](https://gateway.remote.com/v1/docs/openapi.html) category.  Please note that the compliance requirements for each country are subject to change according to local laws. Given its continual updates, using Remote&#39;s [json-schema-form](https://remote.com/resources/api/how-json-schemas-work) should be considered in order to avoid compliance issues and to have the latest version of a country requirements.  If you are using this endpoint to build an integration, make sure you are dynamically collecting or displaying the latest parameters for each country by querying the _\&quot;Show form schema\&quot;_ endpoint.  For more information on JSON Schemas, see the **How JSON Schemas work** documentation.  To learn how you can dynamically generate forms to display in your UI, see the documentation for the [json-schema-form](https://remote.com/resources/api/how-json-schemas-work) tool.  

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmploymentsApi;
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
    String employmentId = "93t3j-employment-id-9suej43"; // Employment ID
    try {
      EmploymentResponse result = client
              .employments
              .getEmploymentInfo(employmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmploymentsApi#getEmploymentInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmploymentResponse> response = client
              .employments
              .getEmploymentInfo(employmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmploymentsApi#getEmploymentInfo");
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

### Return type

[**EmploymentResponse**](EmploymentResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="inviteStartEnrollment"></a>
# **inviteStartEnrollment**
> SuccessResponse inviteStartEnrollment(employmentId).execute();

Invite employment

Invite an employment to start the self-enrollment.  Requirements for the invitation to succeed:  * Employment needs to have the following JSON Schema forms filled: &#x60;contract_details&#x60; and &#x60;pricing_plan_details&#x60; * &#x60;provisional_start_date&#x60; must consider the minimum onbaording time of the employment&#39;s country  If there are validations errors, they are returned with a Conflict HTTP Status (409) and a descriptive message. HTTP Status OK (200) is returned in case of success. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmploymentsApi;
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
    String employmentId = "31b8e49b-aa1c-47af-849c-3d0a53e20e0d"; // Employment ID
    try {
      SuccessResponse result = client
              .employments
              .inviteStartEnrollment(employmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmploymentsApi#inviteStartEnrollment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SuccessResponse> response = client
              .employments
              .inviteStartEnrollment(employmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmploymentsApi#inviteStartEnrollment");
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

### Return type

[**SuccessResponse**](SuccessResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |

<a name="listAll"></a>
# **listAll**
> ListEmploymentsResponse listAll().companyId(companyId).email(email).status(status).page(page).pageSize(pageSize).execute();

List employments

Lists all employments, except for the deleted ones.  This endpoint requires and returns country-specific data. The exact required and returned fields will vary depending on which country the employment is in. To see the list of parameters for each country, see the **Show form schema** endpoint under the [Countries](https://gateway.remote.com/v1/docs/openapi.html) category.  Please note that the compliance requirements for each country are subject to change according to local laws. Given its continual updates, using Remote&#39;s [json-schema-form](https://remote.com/resources/api/how-json-schemas-work) should be considered in order to avoid compliance issues and to have the latest version of a country requirements.  If you are using this endpoint to build an integration, make sure you are dynamically collecting or displaying the latest parameters for each country by querying the _\&quot;Show form schema\&quot;_ endpoint.  For more information on JSON Schemas, see the **How JSON Schemas work** documentation.  To learn how you can dynamically generate forms to display in your UI, see the documentation for the [json-schema-form](https://remote.com/resources/api/how-json-schemas-work) tool.  

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmploymentsApi;
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
    String companyId = "93t3j-company-id-9suej43"; // Company ID
    String email = "anna@example.com"; // Filters the results by employments whose login email matches the value
    String status = "active"; // Filters the results by employments whose status matches the value
    Integer page = 1; // Starts fetching records after the given page
    Integer pageSize = 30; // Change the amount of records returned per page, defaults to 20, limited to 100
    try {
      ListEmploymentsResponse result = client
              .employments
              .listAll()
              .companyId(companyId)
              .email(email)
              .status(status)
              .page(page)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmploymentsApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListEmploymentsResponse> response = client
              .employments
              .listAll()
              .companyId(companyId)
              .email(email)
              .status(status)
              .page(page)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmploymentsApi#listAll");
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
| **companyId** | **String**| Company ID | [optional] |
| **email** | **String**| Filters the results by employments whose login email matches the value | [optional] |
| **status** | **String**| Filters the results by employments whose status matches the value | [optional] |
| **page** | **Integer**| Starts fetching records after the given page | [optional] |
| **pageSize** | **Integer**| Change the amount of records returned per page, defaults to 20, limited to 100 | [optional] |

### Return type

[**ListEmploymentsResponse**](ListEmploymentsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateData"></a>
# **updateData**
> EmploymentResponse updateData(employmentId).body(body).execute();

Update employment

Updates an employment.  **For &#x60;created&#x60; employments:** You can change all basic params and onboarding tasks or perform a per onboarding task update. You can also update basic_information.  **For &#x60;active&#x60; employments:** You can update the manager (&#x60;manager_id&#x60; field), emergency_contact_details and address_details.  This endpoint requires and returns country-specific data. The exact required and returned fields will vary depending on which country the employment is in. To see the list of parameters for each country, see the **Show form schema** endpoint under the [Countries](https://gateway.remote.com/v1/docs/openapi.html) category.  Please note that the compliance requirements for each country are subject to change according to local laws. Given its continual updates, using Remote&#39;s [json-schema-form](https://remote.com/resources/api/how-json-schemas-work) should be considered in order to avoid compliance issues and to have the latest version of a country requirements.  If you are using this endpoint to build an integration, make sure you are dynamically collecting or displaying the latest parameters for each country by querying the _\&quot;Show form schema\&quot;_ endpoint.  For more information on JSON Schemas, see the **How JSON Schemas work** documentation.  To learn how you can dynamically generate forms to display in your UI, see the documentation for the [json-schema-form](https://remote.com/resources/api/how-json-schemas-work) tool.   #### Automatically inviting an employee  When you submit the &#x60;contract_details&#x60; and &#x60;pricing_plan_details&#x60;, Remote should have all the required data to automatically send an invite to the employee. You can tell if an automatic invite has been sent by looking at the &#x60;employment_lifecycle_stage&#x60; field value. If its value is &#x60;employee_self_enrollment&#x60;, it means the employee has received an email to join the Remote platform at their &#x60;personal_email&#x60;.  After an automatic invite is sent to an employee, **you will not be able to update employment data through the Remote API**. After onboarding, only a limited set of employment data will be available for updates, such as &#x60;emergency_contact_details&#x60;. If you want to provide additional information for an employment, please make sure to do so **before** the employee is invited. We block updates to some employment data because employees need to agree to amendments in certain cases, such as when there are changes to their contract_details. Currently, these amendments can only be done through the Remote UI.  Please contact Remote if you need to update contractors via API since it&#39;s currently not supported. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmploymentsApi;
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
    String employmentId = "93t3j-employment-id-9suej43"; // Employment ID
    try {
      EmploymentResponse result = client
              .employments
              .updateData(employmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmploymentsApi#updateData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmploymentResponse> response = client
              .employments
              .updateData(employmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmploymentsApi#updateData");
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
| **body** | **Object**| Employment params | [optional] |

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

<a name="updateDetails"></a>
# **updateDetails**
> EmploymentResponse updateDetails(employmentId).body(body).execute();

Update employment

Updates an employment.  **For &#x60;created&#x60; employments:** You can change all basic params and onboarding tasks or perform a per onboarding task update. You can also update basic_information.  **For &#x60;active&#x60; employments:** You can update the manager (&#x60;manager_id&#x60; field), emergency_contact_details and address_details.  This endpoint requires and returns country-specific data. The exact required and returned fields will vary depending on which country the employment is in. To see the list of parameters for each country, see the **Show form schema** endpoint under the [Countries](https://gateway.remote.com/v1/docs/openapi.html) category.  Please note that the compliance requirements for each country are subject to change according to local laws. Given its continual updates, using Remote&#39;s [json-schema-form](https://remote.com/resources/api/how-json-schemas-work) should be considered in order to avoid compliance issues and to have the latest version of a country requirements.  If you are using this endpoint to build an integration, make sure you are dynamically collecting or displaying the latest parameters for each country by querying the _\&quot;Show form schema\&quot;_ endpoint.  For more information on JSON Schemas, see the **How JSON Schemas work** documentation.  To learn how you can dynamically generate forms to display in your UI, see the documentation for the [json-schema-form](https://remote.com/resources/api/how-json-schemas-work) tool.   #### Automatically inviting an employee  When you submit the &#x60;contract_details&#x60; and &#x60;pricing_plan_details&#x60;, Remote should have all the required data to automatically send an invite to the employee. You can tell if an automatic invite has been sent by looking at the &#x60;employment_lifecycle_stage&#x60; field value. If its value is &#x60;employee_self_enrollment&#x60;, it means the employee has received an email to join the Remote platform at their &#x60;personal_email&#x60;.  After an automatic invite is sent to an employee, **you will not be able to update employment data through the Remote API**. After onboarding, only a limited set of employment data will be available for updates, such as &#x60;emergency_contact_details&#x60;. If you want to provide additional information for an employment, please make sure to do so **before** the employee is invited. We block updates to some employment data because employees need to agree to amendments in certain cases, such as when there are changes to their contract_details. Currently, these amendments can only be done through the Remote UI.  Please contact Remote if you need to update contractors via API since it&#39;s currently not supported. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmploymentsApi;
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
    String employmentId = "93t3j-employment-id-9suej43"; // Employment ID
    try {
      EmploymentResponse result = client
              .employments
              .updateDetails(employmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmploymentsApi#updateDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmploymentResponse> response = client
              .employments
              .updateDetails(employmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmploymentsApi#updateDetails");
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
| **body** | **Object**| Employment params | [optional] |

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

