# CompanyDepartmentApi

All URIs are relative to *https://gateway.remote.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewDepartment**](CompanyDepartmentApi.md#createNewDepartment) | **POST** /v1/company-departments | Create New Department |
| [**list**](CompanyDepartmentApi.md#list) | **GET** /v1/company-departments | List Company Departments |


<a name="createNewDepartment"></a>
# **createNewDepartment**
> CompanyDepartmentCreatedResponse createNewDepartment(createCompanyDepartmentParams).execute();

Create New Department

Creates a new department in the specified company. Department names may be non-unique and must be non-empty with no more than 255 characters (Unicode code points).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyDepartmentApi;
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
    String companyId = "companyId_example"; // The Company ID. Required in all cases, whether the API credentials have access to multiple companies or just one.
    String name = "name_example"; // The name of the company department. May be non-unique and limited to 255 characters, maximum.
    try {
      CompanyDepartmentCreatedResponse result = client
              .companyDepartment
              .createNewDepartment(companyId, name)
              .execute();
      System.out.println(result);
      System.out.println(result.getCompanyDepartment());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyDepartmentApi#createNewDepartment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompanyDepartmentCreatedResponse> response = client
              .companyDepartment
              .createNewDepartment(companyId, name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyDepartmentApi#createNewDepartment");
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
| **createCompanyDepartmentParams** | [**CreateCompanyDepartmentParams**](CreateCompanyDepartmentParams.md)| Create Company Department request params | |

### Return type

[**CompanyDepartmentCreatedResponse**](CompanyDepartmentCreatedResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="list"></a>
# **list**
> ListCompanyDepartmentsPaginatedResponse list(companyId).paginate(paginate).page(page).pageSize(pageSize).execute();

List Company Departments

Lists all departments for the authorized company specified in the request. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyDepartmentApi;
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
    String companyId = "d2091b1e-b1a4-437a-91ea-2809ffbb6d59"; // Company ID
    Boolean paginate = false; // Paginate option. Default: true. When true, paginates response; otherwise, does not.
    Integer page = 1; // Starts fetching records after the given page
    Integer pageSize = 20; // Number of items per page
    try {
      ListCompanyDepartmentsPaginatedResponse result = client
              .companyDepartment
              .list(companyId)
              .paginate(paginate)
              .page(page)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getCurrentPage());
      System.out.println(result.getData());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyDepartmentApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListCompanyDepartmentsPaginatedResponse> response = client
              .companyDepartment
              .list(companyId)
              .paginate(paginate)
              .page(page)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyDepartmentApi#list");
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
| **companyId** | **String**| Company ID | |
| **paginate** | **Boolean**| Paginate option. Default: true. When true, paginates response; otherwise, does not. | [optional] |
| **page** | **Integer**| Starts fetching records after the given page | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of items per page | [optional] [default to 20] |

### Return type

[**ListCompanyDepartmentsPaginatedResponse**](ListCompanyDepartmentsPaginatedResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

