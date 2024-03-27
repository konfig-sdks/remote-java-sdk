# PayslipsApi

All URIs are relative to *https://gateway.remote.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadPdf**](PayslipsApi.md#downloadPdf) | **GET** /v1/payslips/{payslip_id}/pdf | Download payslip in the PDF format |
| [**listAll**](PayslipsApi.md#listAll) | **GET** /v1/payslips | List payslips |
| [**showPayslip**](PayslipsApi.md#showPayslip) | **GET** /v1/payslips/{id} | Show payslip |


<a name="downloadPdf"></a>
# **downloadPdf**
> File downloadPdf(payslipId).execute();

Download payslip in the PDF format

Given a Payslip ID, downloads a payslip. It is important to note that each country has a different payslip format and they are not authored by Remote. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayslipsApi;
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
    String payslipId = "93t3j-payslip-id-9suej43"; // Payslip ID
    try {
      File result = client
              .payslips
              .downloadPdf(payslipId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PayslipsApi#downloadPdf");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .payslips
              .downloadPdf(payslipId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayslipsApi#downloadPdf");
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
| **payslipId** | **String**| Payslip ID | |

### Return type

[**File**](File.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listAll"></a>
# **listAll**
> ListPayslipsResponse listAll().employmentId(employmentId).startDate(startDate).endDate(endDate).expectedPayoutStartDate(expectedPayoutStartDate).expectedPayoutEndDate(expectedPayoutEndDate).page(page).pageSize(pageSize).execute();

List payslips

Lists all payslips belonging to a company. Can also filter for a single employment belonging to that company. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayslipsApi;
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
    String startDate = "\"2022-12-15\""; // Filters by payslips `issued_at` field, after or on the same day than the given date
    String endDate = "\"2023-12-15\""; // Filters by payslips `issued_at` field, before or or the same day than the given date
    String expectedPayoutStartDate = "\"2022-12-15\""; // Filters by payslips `expected_payout_date` field, after or on the same day than the given date
    String expectedPayoutEndDate = "\"2023-12-15\""; // Filters by payslips `expected_payout_date` field, before or or the same day than the given date
    Integer page = 1; // Starts fetching records after the given page
    Integer pageSize = 30; // Change the amount of records returned per page, defaults to 20, limited to 100
    try {
      ListPayslipsResponse result = client
              .payslips
              .listAll()
              .employmentId(employmentId)
              .startDate(startDate)
              .endDate(endDate)
              .expectedPayoutStartDate(expectedPayoutStartDate)
              .expectedPayoutEndDate(expectedPayoutEndDate)
              .page(page)
              .pageSize(pageSize)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayslipsApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListPayslipsResponse> response = client
              .payslips
              .listAll()
              .employmentId(employmentId)
              .startDate(startDate)
              .endDate(endDate)
              .expectedPayoutStartDate(expectedPayoutStartDate)
              .expectedPayoutEndDate(expectedPayoutEndDate)
              .page(page)
              .pageSize(pageSize)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayslipsApi#listAll");
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
| **employmentId** | **String**| Employment ID | [optional] |
| **startDate** | **String**| Filters by payslips &#x60;issued_at&#x60; field, after or on the same day than the given date | [optional] |
| **endDate** | **String**| Filters by payslips &#x60;issued_at&#x60; field, before or or the same day than the given date | [optional] |
| **expectedPayoutStartDate** | **String**| Filters by payslips &#x60;expected_payout_date&#x60; field, after or on the same day than the given date | [optional] |
| **expectedPayoutEndDate** | **String**| Filters by payslips &#x60;expected_payout_date&#x60; field, before or or the same day than the given date | [optional] |
| **page** | **Integer**| Starts fetching records after the given page | [optional] |
| **pageSize** | **Integer**| Change the amount of records returned per page, defaults to 20, limited to 100 | [optional] |

### Return type

[**ListPayslipsResponse**](ListPayslipsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="showPayslip"></a>
# **showPayslip**
> PayslipResponse showPayslip(id).execute();

Show payslip

Given an ID, shows a payslip.  Please contact api-support@remote.com to request access to this endpoint. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayslipsApi;
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
    String id = "93t3j-payslip-id-9suej43"; // Payslip ID
    try {
      PayslipResponse result = client
              .payslips
              .showPayslip(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayslipsApi#showPayslip");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PayslipResponse> response = client
              .payslips
              .showPayslip(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayslipsApi#showPayslip");
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
| **id** | **String**| Payslip ID | |

### Return type

[**PayslipResponse**](PayslipResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

