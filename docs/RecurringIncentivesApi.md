# RecurringIncentivesApi

All URIs are relative to *https://gateway.remote.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMonthlyIncentive**](RecurringIncentivesApi.md#createMonthlyIncentive) | **POST** /v1/incentives/recurring | Create Recurring Incentive |
| [**deleteScheduled**](RecurringIncentivesApi.md#deleteScheduled) | **DELETE** /v1/incentives/recurring/{id} | Delete a Recurring Incentive |
| [**listIncentives**](RecurringIncentivesApi.md#listIncentives) | **GET** /v1/incentives/recurring | List Recurring Incentive |


<a name="createMonthlyIncentive"></a>
# **createMonthlyIncentive**
> RecurringIncentiveResponse createMonthlyIncentive().createRecurringIncentiveParams(createRecurringIncentiveParams).execute();

Create Recurring Incentive

Create a Recurring Incentive, that is, a monthly paid incentive.  Incentives use the currency of the employment specified provided in the &#x60;employment_id&#x60; field. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecurringIncentivesApi;
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
    Integer durationInMonths = 56; // How many times the payment will repeat. At the moment we only fully support monthly frequency.  This field is only necessary if the recurring incentive has an end date. 
    try {
      RecurringIncentiveResponse result = client
              .recurringIncentives
              .createMonthlyIncentive(amount, amountTaxType, effectiveDate, employmentId, type)
              .note(note)
              .durationInMonths(durationInMonths)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecurringIncentivesApi#createMonthlyIncentive");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecurringIncentiveResponse> response = client
              .recurringIncentives
              .createMonthlyIncentive(amount, amountTaxType, effectiveDate, employmentId, type)
              .note(note)
              .durationInMonths(durationInMonths)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecurringIncentivesApi#createMonthlyIncentive");
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
| **createRecurringIncentiveParams** | [**CreateRecurringIncentiveParams**](CreateRecurringIncentiveParams.md)| RecurringIncentive | [optional] |

### Return type

[**RecurringIncentiveResponse**](RecurringIncentiveResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |

<a name="deleteScheduled"></a>
# **deleteScheduled**
> DeleteRecurringIncentiveResponse deleteScheduled(id).execute();

Delete a Recurring Incentive

Delete a Recurring Incentive, that is, a monthly paid incentive.  Internally, Remote schedules upcoming incentives. As such, when you attempt to delete a recurring incentive, Remote will **ONLY** delete scheduled incentives with the &#x60;pending&#x60; status.  Incentives payments that are already scheduled and cannot be deleted will be included in the response, in case you need to reference them. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecurringIncentivesApi;
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
    String id = "id_example"; // Recurring Incentive ID
    try {
      DeleteRecurringIncentiveResponse result = client
              .recurringIncentives
              .deleteScheduled(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecurringIncentivesApi#deleteScheduled");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DeleteRecurringIncentiveResponse> response = client
              .recurringIncentives
              .deleteScheduled(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecurringIncentivesApi#deleteScheduled");
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
| **id** | **String**| Recurring Incentive ID | |

### Return type

[**DeleteRecurringIncentiveResponse**](DeleteRecurringIncentiveResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listIncentives"></a>
# **listIncentives**
> ListRecurringIncentivesResponse listIncentives().status(status).type(type).note(note).page(page).pageSize(pageSize).execute();

List Recurring Incentive

List all Recurring Incentives of a company. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecurringIncentivesApi;
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
    String status = "active"; // Filter by recurring incentive status: active or deactive.
    String type = "meal_allowance"; // Filter by recurring incentive type.
    String note = "meal"; // Filter by recurring incentives that contain the value in their notes.
    Integer page = 1; // Starts fetching records after the given page
    Integer pageSize = 30; // Change the amount of records returned per page, defaults to 20, limited to 100
    try {
      ListRecurringIncentivesResponse result = client
              .recurringIncentives
              .listIncentives()
              .status(status)
              .type(type)
              .note(note)
              .page(page)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecurringIncentivesApi#listIncentives");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListRecurringIncentivesResponse> response = client
              .recurringIncentives
              .listIncentives()
              .status(status)
              .type(type)
              .note(note)
              .page(page)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecurringIncentivesApi#listIncentives");
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
| **status** | **String**| Filter by recurring incentive status: active or deactive. | [optional] |
| **type** | **String**| Filter by recurring incentive type. | [optional] |
| **note** | **String**| Filter by recurring incentives that contain the value in their notes. | [optional] |
| **page** | **Integer**| Starts fetching records after the given page | [optional] |
| **pageSize** | **Integer**| Change the amount of records returned per page, defaults to 20, limited to 100 | [optional] |

### Return type

[**ListRecurringIncentivesResponse**](ListRecurringIncentivesResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |

