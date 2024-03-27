# IncentivesApi

All URIs are relative to *https://gateway.remote.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createIncentive**](IncentivesApi.md#createIncentive) | **POST** /v1/incentives | Create Incentive |
| [**listAll**](IncentivesApi.md#listAll) | **GET** /v1/incentives | List Incentives |
| [**removeIncentive**](IncentivesApi.md#removeIncentive) | **DELETE** /v1/incentives/{id} | Delete an Incentive |
| [**showDetails**](IncentivesApi.md#showDetails) | **GET** /v1/incentives/{id} | Show Incentive |
| [**updateIncentive**](IncentivesApi.md#updateIncentive) | **PUT** /v1/incentives/{id} | Update Incentive |
| [**updateIncentive_0**](IncentivesApi.md#updateIncentive_0) | **PATCH** /v1/incentives/{id} | Update Incentive |


<a name="createIncentive"></a>
# **createIncentive**
> IncentiveResponse createIncentive().createOneTimeIncentiveParams(createOneTimeIncentiveParams).execute();

Create Incentive

Creates an Incentive.  Incentives use the currency of the employment specified provided in the &#x60;employment_id&#x60; field. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IncentivesApi;
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
    Integer amount = 56; // The amount (in the currency of the employment) to be given to the employee.  This field accepts fractional amounts as well. However to avoid precision issues and errors that can arise from storing fractional amounts, the Remote API only accepts currencies and their fractional amounts as integers. This means you should append fractional amounts to the end of the amount you're passing in with this field.  For example, if the incentive you're offering is EUR 500.25, you would specify `50025` as the amount for this field. 
    AmountTaxType amountTaxType = AmountTaxType.fromValue("gross");
    LocalDate effectiveDate = LocalDate.now(); // The date at which the incentive should take effect.  Note that the incentive is not paid out on the effective date, but during the next payroll cycle. The effective date determines which payroll cycle the incentive will be paid out in.  The effective date needs to be today or a future date.  Note for recurring incentives: since the months don't have the same amount of days, if day of month of `effective_date` is one of [28, 29, 30, 31] it will be transformed to the last day of each month, avoiding the possibility of skipping a month in the recurrence. 
    String employmentId = "employmentId_example";
    String type = "acting_up_allowance";
    String note = "note_example";
    try {
      IncentiveResponse result = client
              .incentives
              .createIncentive(amount, amountTaxType, effectiveDate, employmentId, type)
              .note(note)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling IncentivesApi#createIncentive");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IncentiveResponse> response = client
              .incentives
              .createIncentive(amount, amountTaxType, effectiveDate, employmentId, type)
              .note(note)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IncentivesApi#createIncentive");
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
| **createOneTimeIncentiveParams** | [**CreateOneTimeIncentiveParams**](CreateOneTimeIncentiveParams.md)| Incentive | [optional] |

### Return type

[**IncentiveResponse**](IncentiveResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |

<a name="listAll"></a>
# **listAll**
> ListIncentivesResponse listAll().employmentId(employmentId).status(status).recurringIncentiveId(recurringIncentiveId).page(page).pageSize(pageSize).execute();

List Incentives

Lists all Incentives of a company

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IncentivesApi;
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
    String employmentId = "93t3j-employment-id-9suej43"; // Filter by Employment ID
    String status = "paid"; // Filter by Incentive status
    String recurringIncentiveId = "2f900aaf-4952-4ec4-ac7c-2b917a2b4da9"; // Filter by Recurring Incentive id
    Integer page = 1; // Starts fetching records after the given page
    Integer pageSize = 30; // Change the amount of records returned per page, defaults to 20, limited to 100
    try {
      ListIncentivesResponse result = client
              .incentives
              .listAll()
              .employmentId(employmentId)
              .status(status)
              .recurringIncentiveId(recurringIncentiveId)
              .page(page)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling IncentivesApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListIncentivesResponse> response = client
              .incentives
              .listAll()
              .employmentId(employmentId)
              .status(status)
              .recurringIncentiveId(recurringIncentiveId)
              .page(page)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IncentivesApi#listAll");
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
| **employmentId** | **String**| Filter by Employment ID | [optional] |
| **status** | **String**| Filter by Incentive status | [optional] |
| **recurringIncentiveId** | **String**| Filter by Recurring Incentive id | [optional] |
| **page** | **Integer**| Starts fetching records after the given page | [optional] |
| **pageSize** | **Integer**| Change the amount of records returned per page, defaults to 20, limited to 100 | [optional] |

### Return type

[**ListIncentivesResponse**](ListIncentivesResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="removeIncentive"></a>
# **removeIncentive**
> SuccessResponse removeIncentive(id).execute();

Delete an Incentive

Delete an incentive.  &#x60;one_time&#x60; incentives that have the following status **CANNOT** be deleted: * &#x60;processing&#x60; * &#x60;paid&#x60; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IncentivesApi;
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
    String id = "id_example"; // Incentive ID
    try {
      SuccessResponse result = client
              .incentives
              .removeIncentive(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling IncentivesApi#removeIncentive");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SuccessResponse> response = client
              .incentives
              .removeIncentive(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IncentivesApi#removeIncentive");
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
| **id** | **String**| Incentive ID | |

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
| **200** | Success |  -  |

<a name="showDetails"></a>
# **showDetails**
> IncentiveResponse showDetails(id).execute();

Show Incentive

Show an Incentive&#39;s details

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IncentivesApi;
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
    String id = "id_example"; // Incentive ID
    try {
      IncentiveResponse result = client
              .incentives
              .showDetails(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling IncentivesApi#showDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IncentiveResponse> response = client
              .incentives
              .showDetails(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IncentivesApi#showDetails");
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
| **id** | **String**| Incentive ID | |

### Return type

[**IncentiveResponse**](IncentiveResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateIncentive"></a>
# **updateIncentive**
> IncentiveResponse updateIncentive(id).updateIncentiveParams(updateIncentiveParams).execute();

Update Incentive

Updates an Incentive.  Incentives use the currency of the employment specified provided in the &#x60;employment_id&#x60; field.  The API doesn&#39;t support updating paid incentives. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IncentivesApi;
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
    String id = "id_example"; // Incentive ID
    Integer amount = 56; // The amount (in the currency of the employment) to be given to the employee.  This field accepts fractional amounts as well. However to avoid precision issues and errors that can arise from storing fractional amounts, the Remote API only accepts currencies and their fractional amounts as integers. This means you should append fractional amounts to the end of the amount you're passing in with this field.  For example, if the incentive you're offering is EUR 500.25, you would specify `50025` as the amount for this field. 
    AmountTaxType amountTaxType = AmountTaxType.fromValue("gross");
    LocalDate effectiveDate = LocalDate.now(); // The date at which the incentive should take effect.  Note that the incentive is not paid out on the effective date, but during the next payroll cycle. The effective date determines which payroll cycle the incentive will be paid out in.  The effective date needs to be today or a future date.  Note for recurring incentives: since the months don't have the same amount of days, if day of month of `effective_date` is one of [28, 29, 30, 31] it will be transformed to the last day of each month, avoiding the possibility of skipping a month in the recurrence. 
    String note = "note_example";
    String type = "type_example"; // A valid type according to the payment frequency
    try {
      IncentiveResponse result = client
              .incentives
              .updateIncentive(id)
              .amount(amount)
              .amountTaxType(amountTaxType)
              .effectiveDate(effectiveDate)
              .note(note)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling IncentivesApi#updateIncentive");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IncentiveResponse> response = client
              .incentives
              .updateIncentive(id)
              .amount(amount)
              .amountTaxType(amountTaxType)
              .effectiveDate(effectiveDate)
              .note(note)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IncentivesApi#updateIncentive");
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
| **id** | **String**| Incentive ID | |
| **updateIncentiveParams** | [**UpdateIncentiveParams**](UpdateIncentiveParams.md)| Incentive | [optional] |

### Return type

[**IncentiveResponse**](IncentiveResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateIncentive_0"></a>
# **updateIncentive_0**
> IncentiveResponse updateIncentive_0(id).updateIncentiveParams(updateIncentiveParams).execute();

Update Incentive

Updates an Incentive.  Incentives use the currency of the employment specified provided in the &#x60;employment_id&#x60; field.  The API doesn&#39;t support updating paid incentives. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IncentivesApi;
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
    String id = "id_example"; // Incentive ID
    Integer amount = 56; // The amount (in the currency of the employment) to be given to the employee.  This field accepts fractional amounts as well. However to avoid precision issues and errors that can arise from storing fractional amounts, the Remote API only accepts currencies and their fractional amounts as integers. This means you should append fractional amounts to the end of the amount you're passing in with this field.  For example, if the incentive you're offering is EUR 500.25, you would specify `50025` as the amount for this field. 
    AmountTaxType amountTaxType = AmountTaxType.fromValue("gross");
    LocalDate effectiveDate = LocalDate.now(); // The date at which the incentive should take effect.  Note that the incentive is not paid out on the effective date, but during the next payroll cycle. The effective date determines which payroll cycle the incentive will be paid out in.  The effective date needs to be today or a future date.  Note for recurring incentives: since the months don't have the same amount of days, if day of month of `effective_date` is one of [28, 29, 30, 31] it will be transformed to the last day of each month, avoiding the possibility of skipping a month in the recurrence. 
    String note = "note_example";
    String type = "type_example"; // A valid type according to the payment frequency
    try {
      IncentiveResponse result = client
              .incentives
              .updateIncentive_0(id)
              .amount(amount)
              .amountTaxType(amountTaxType)
              .effectiveDate(effectiveDate)
              .note(note)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling IncentivesApi#updateIncentive_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IncentiveResponse> response = client
              .incentives
              .updateIncentive_0(id)
              .amount(amount)
              .amountTaxType(amountTaxType)
              .effectiveDate(effectiveDate)
              .note(note)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IncentivesApi#updateIncentive_0");
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
| **id** | **String**| Incentive ID | |
| **updateIncentiveParams** | [**UpdateIncentiveParams**](UpdateIncentiveParams.md)| Incentive | [optional] |

### Return type

[**IncentiveResponse**](IncentiveResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

