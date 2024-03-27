# TimeOffApi

All URIs are relative to *https://gateway.remote.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRecord**](TimeOffApi.md#getRecord) | **GET** /v1/timeoff/{id} | Show Time Off |
| [**listRecords**](TimeOffApi.md#listRecords) | **GET** /v1/timeoff | List Time Off |
| [**listTypes**](TimeOffApi.md#listTypes) | **GET** /v1/timeoff/types | List Time Off Types |
| [**recordCreate**](TimeOffApi.md#recordCreate) | **POST** /v1/timeoff | Create Time Off |
| [**updateRecord**](TimeOffApi.md#updateRecord) | **PUT** /v1/timeoff/{id} | Update Time Off |
| [**updateRecord_0**](TimeOffApi.md#updateRecord_0) | **PATCH** /v1/timeoff/{id} | Update Time Off |


<a name="getRecord"></a>
# **getRecord**
> TimeoffResponse getRecord(id).execute();

Show Time Off

Shows a single Time Off record

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String id = "93t3j-timeoff-id-9suej43"; // Timeoff ID
    try {
      TimeoffResponse result = client
              .timeOff
              .getRecord(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeoffResponse> response = client
              .timeOff
              .getRecord(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getRecord");
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
| **id** | **String**| Timeoff ID | |

### Return type

[**TimeoffResponse**](TimeoffResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listRecords"></a>
# **listRecords**
> ListTimeoffResponse listRecords().employmentId(employmentId).timeoffType(timeoffType).status(status).order(order).sortBy(sortBy).page(page).pageSize(pageSize).execute();

List Time Off

Lists all Time Off records.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String employmentId = "31b8e49b-aa1c-47af-849c-3d0a53e20e0d"; // Only show time off for a specific employment
    TimeoffType timeoffType = TimeoffType.fromValue("paid_time_off"); // Filter time off by its type
    TimeoffStatus status = TimeoffStatus.fromValue("approved"); // Filter time off by its status
    String order = "asc"; // Sort order
    String sortBy = "timeoff_type"; // Field to sort by
    Integer page = 1; // Starts fetching records after the given page
    Integer pageSize = 20; // Number of items per page
    try {
      ListTimeoffResponse result = client
              .timeOff
              .listRecords()
              .employmentId(employmentId)
              .timeoffType(timeoffType)
              .status(status)
              .order(order)
              .sortBy(sortBy)
              .page(page)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#listRecords");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListTimeoffResponse> response = client
              .timeOff
              .listRecords()
              .employmentId(employmentId)
              .timeoffType(timeoffType)
              .status(status)
              .order(order)
              .sortBy(sortBy)
              .page(page)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#listRecords");
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
| **employmentId** | **String**| Only show time off for a specific employment | [optional] |
| **timeoffType** | [**TimeoffType**](.md)| Filter time off by its type | [optional] [enum: paid_time_off, sick_leave, public_holiday, unpaid_leave, extended_leave, in_lieu_time, maternity_leave, paternity_leave, parental_leave, bereavement, military_leave, other] |
| **status** | [**TimeoffStatus**](.md)| Filter time off by its status | [optional] [enum: approved, cancelled, declined, requested, taken, cancel_requested] |
| **order** | **String**| Sort order | [optional] [enum: asc, desc] |
| **sortBy** | **String**| Field to sort by | [optional] [enum: timeoff_type, status] |
| **page** | **Integer**| Starts fetching records after the given page | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of items per page | [optional] [default to 20] |

### Return type

[**ListTimeoffResponse**](ListTimeoffResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listTypes"></a>
# **listTypes**
> ListTimeoffTypesResponse listTypes().execute();

List Time Off Types

Lists all time off types that can be used for the &#x60;timeoff_type&#x60; parameter

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
      ListTimeoffTypesResponse result = client
              .timeOff
              .listTypes()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#listTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListTimeoffTypesResponse> response = client
              .timeOff
              .listTypes()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#listTypes");
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

[**ListTimeoffTypesResponse**](ListTimeoffTypesResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="recordCreate"></a>
# **recordCreate**
> TimeoffResponse recordCreate(createApprovedTimeoffParams).execute();

Create Time Off

Creates a Time Off record

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    OffsetDateTime approvedAt = OffsetDateTime.now(); // UTC date time in [ISO 8601][] format.  [ISO 8601]: https://en.wikipedia.org/wiki/ISO_8601 
    String approverId = "approverId_example"; // The field matches the `id` of a user in the Remote Platform that has permission to approve time off requests. [Available users][] can be found fetching the [List Company Manager][] endpoint.  [Available users]: https://support.remote.com/hc/en-us/articles/360054668651-Approving-Declining-time-off-requests#h_01G0014GZKZ3EMN6P7C99HAK55 [List Company Manager]: https://gateway.remote.com/v1/docs/openapi.html#tag/Company-Managers 
    String status = "approved";
    TimeoffDocumentParams document = new TimeoffDocumentParams();
    String employmentId = "employmentId_example";
    String endDate = "endDate_example";
    String notes = "notes_example";
    String startDate = "startDate_example";
    List<TimeoffDaysParams> timeoffDays = Arrays.asList();
    TimeoffType timeoffType = TimeoffType.fromValue("paid_time_off");
    String timezone = "timezone_example"; // [TZ identifier](https://www.iana.org/time-zones)
    try {
      TimeoffResponse result = client
              .timeOff
              .recordCreate(approvedAt, approverId, status)
              .document(document)
              .employmentId(employmentId)
              .endDate(endDate)
              .notes(notes)
              .startDate(startDate)
              .timeoffDays(timeoffDays)
              .timeoffType(timeoffType)
              .timezone(timezone)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#recordCreate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeoffResponse> response = client
              .timeOff
              .recordCreate(approvedAt, approverId, status)
              .document(document)
              .employmentId(employmentId)
              .endDate(endDate)
              .notes(notes)
              .startDate(startDate)
              .timeoffDays(timeoffDays)
              .timeoffType(timeoffType)
              .timezone(timezone)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#recordCreate");
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
| **createApprovedTimeoffParams** | [**CreateApprovedTimeoffParams**](CreateApprovedTimeoffParams.md)| Timeoff | |

### Return type

[**TimeoffResponse**](TimeoffResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="updateRecord"></a>
# **updateRecord**
> TimeoffResponse updateRecord(id, updateApprovedTimeoffParams).execute();

Update Time Off

Updates a Time Off record. This endpoint can also be used for cancelling a time off.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String cancelReason = "cancelReason_example"; // The reason for cancelling a time off. Required when updating to status `cancelled`.
    String editReason = "editReason_example"; // The reason for the update. Required when updating the time off data but not changing the status.
    String id = "93t3j-timeoff-id-9suej43"; // Timeoff ID
    OffsetDateTime approvedAt = OffsetDateTime.now(); // UTC date time in [ISO 8601][] format.  [ISO 8601]: https://en.wikipedia.org/wiki/ISO_8601 
    String approverId = "approverId_example"; // The field matches the `id` of a user in the Remote Platform that has permission to approve time off requests. [Available users][] can be found fetching the [List Company Manager][] endpoint.  [Available users]: https://support.remote.com/hc/en-us/articles/360054668651-Approving-Declining-time-off-requests#h_01G0014GZKZ3EMN6P7C99HAK55 [List Company Manager]: https://gateway.remote.com/v1/docs/openapi.html#tag/Company-Managers 
    TimeoffDocumentParams document = new TimeoffDocumentParams();
    LocalDate endDate = LocalDate.now(); // UTC date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
    String notes = "notes_example";
    LocalDate startDate = LocalDate.now(); // UTC date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
    String status = "approved";
    List<TimeoffDaysParams> timeoffDays = Arrays.asList();
    TimeoffType timeoffType = TimeoffType.fromValue("paid_time_off");
    String timezone = "timezone_example"; // [TZ identifier](https://www.iana.org/time-zones)
    try {
      TimeoffResponse result = client
              .timeOff
              .updateRecord(cancelReason, editReason, id)
              .approvedAt(approvedAt)
              .approverId(approverId)
              .document(document)
              .endDate(endDate)
              .notes(notes)
              .startDate(startDate)
              .status(status)
              .timeoffDays(timeoffDays)
              .timeoffType(timeoffType)
              .timezone(timezone)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#updateRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeoffResponse> response = client
              .timeOff
              .updateRecord(cancelReason, editReason, id)
              .approvedAt(approvedAt)
              .approverId(approverId)
              .document(document)
              .endDate(endDate)
              .notes(notes)
              .startDate(startDate)
              .status(status)
              .timeoffDays(timeoffDays)
              .timeoffType(timeoffType)
              .timezone(timezone)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#updateRecord");
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
| **id** | **String**| Timeoff ID | |
| **updateApprovedTimeoffParams** | [**UpdateApprovedTimeoffParams**](UpdateApprovedTimeoffParams.md)| UpdateTimeoff | |

### Return type

[**TimeoffResponse**](TimeoffResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateRecord_0"></a>
# **updateRecord_0**
> TimeoffResponse updateRecord_0(id, updateApprovedTimeoffParams).execute();

Update Time Off

Updates a Time Off record. This endpoint can also be used for cancelling a time off.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
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
    String cancelReason = "cancelReason_example"; // The reason for cancelling a time off. Required when updating to status `cancelled`.
    String editReason = "editReason_example"; // The reason for the update. Required when updating the time off data but not changing the status.
    String id = "93t3j-timeoff-id-9suej43"; // Timeoff ID
    OffsetDateTime approvedAt = OffsetDateTime.now(); // UTC date time in [ISO 8601][] format.  [ISO 8601]: https://en.wikipedia.org/wiki/ISO_8601 
    String approverId = "approverId_example"; // The field matches the `id` of a user in the Remote Platform that has permission to approve time off requests. [Available users][] can be found fetching the [List Company Manager][] endpoint.  [Available users]: https://support.remote.com/hc/en-us/articles/360054668651-Approving-Declining-time-off-requests#h_01G0014GZKZ3EMN6P7C99HAK55 [List Company Manager]: https://gateway.remote.com/v1/docs/openapi.html#tag/Company-Managers 
    TimeoffDocumentParams document = new TimeoffDocumentParams();
    LocalDate endDate = LocalDate.now(); // UTC date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
    String notes = "notes_example";
    LocalDate startDate = LocalDate.now(); // UTC date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
    String status = "approved";
    List<TimeoffDaysParams> timeoffDays = Arrays.asList();
    TimeoffType timeoffType = TimeoffType.fromValue("paid_time_off");
    String timezone = "timezone_example"; // [TZ identifier](https://www.iana.org/time-zones)
    try {
      TimeoffResponse result = client
              .timeOff
              .updateRecord_0(cancelReason, editReason, id)
              .approvedAt(approvedAt)
              .approverId(approverId)
              .document(document)
              .endDate(endDate)
              .notes(notes)
              .startDate(startDate)
              .status(status)
              .timeoffDays(timeoffDays)
              .timeoffType(timeoffType)
              .timezone(timezone)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#updateRecord_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeoffResponse> response = client
              .timeOff
              .updateRecord_0(cancelReason, editReason, id)
              .approvedAt(approvedAt)
              .approverId(approverId)
              .document(document)
              .endDate(endDate)
              .notes(notes)
              .startDate(startDate)
              .status(status)
              .timeoffDays(timeoffDays)
              .timeoffType(timeoffType)
              .timezone(timezone)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#updateRecord_0");
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
| **id** | **String**| Timeoff ID | |
| **updateApprovedTimeoffParams** | [**UpdateApprovedTimeoffParams**](UpdateApprovedTimeoffParams.md)| UpdateTimeoff | |

### Return type

[**TimeoffResponse**](TimeoffResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

