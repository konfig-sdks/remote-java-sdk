# CostCalculatorApi

All URIs are relative to *https://gateway.remote.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEmploymentEstimation**](CostCalculatorApi.md#createEmploymentEstimation) | **POST** /v1/cost-calculator/estimation | Creates a cost estimation of employments |
| [**generateEstimationPdf**](CostCalculatorApi.md#generateEstimationPdf) | **POST** /v1/cost-calculator/estimation-pdf | Creates a cost estimation of employments |
| [**listCountries**](CostCalculatorApi.md#listCountries) | **GET** /v1/cost-calculator/countries | List countries |
| [**showRegionFields**](CostCalculatorApi.md#showRegionFields) | **GET** /v1/cost-calculator/regions/{slug}/fields | Show region fields |


<a name="createEmploymentEstimation"></a>
# **createEmploymentEstimation**
> CostCalculatorEstimateResponse createEmploymentEstimation().costCalculatorEstimateParams(costCalculatorEstimateParams).execute();

Creates a cost estimation of employments

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CostCalculatorApi;
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
    String employerCurrencySlug = "employerCurrencySlug_example"; // Currency Slug
    List<CostCalculatorEmploymentParam> employments = Arrays.asList();
    Boolean includeBenefits = true;
    Boolean includeCostBreakdowns = true;
    try {
      CostCalculatorEstimateResponse result = client
              .costCalculator
              .createEmploymentEstimation(employerCurrencySlug, employments)
              .includeBenefits(includeBenefits)
              .includeCostBreakdowns(includeCostBreakdowns)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCalculatorApi#createEmploymentEstimation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CostCalculatorEstimateResponse> response = client
              .costCalculator
              .createEmploymentEstimation(employerCurrencySlug, employments)
              .includeBenefits(includeBenefits)
              .includeCostBreakdowns(includeCostBreakdowns)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCalculatorApi#createEmploymentEstimation");
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
| **costCalculatorEstimateParams** | [**CostCalculatorEstimateParams**](CostCalculatorEstimateParams.md)| Estimate params | [optional] |

### Return type

[**CostCalculatorEstimateResponse**](CostCalculatorEstimateResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="generateEstimationPdf"></a>
# **generateEstimationPdf**
> CostCalculatorEstimatePDFResponse generateEstimationPdf().costCalculatorEstimateParams(costCalculatorEstimateParams).execute();

Creates a cost estimation of employments

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CostCalculatorApi;
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
    String employerCurrencySlug = "employerCurrencySlug_example"; // Currency Slug
    List<CostCalculatorEmploymentParam> employments = Arrays.asList();
    Boolean includeBenefits = true;
    Boolean includeCostBreakdowns = true;
    try {
      CostCalculatorEstimatePDFResponse result = client
              .costCalculator
              .generateEstimationPdf(employerCurrencySlug, employments)
              .includeBenefits(includeBenefits)
              .includeCostBreakdowns(includeCostBreakdowns)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCalculatorApi#generateEstimationPdf");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CostCalculatorEstimatePDFResponse> response = client
              .costCalculator
              .generateEstimationPdf(employerCurrencySlug, employments)
              .includeBenefits(includeBenefits)
              .includeCostBreakdowns(includeCostBreakdowns)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCalculatorApi#generateEstimationPdf");
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
| **costCalculatorEstimateParams** | [**CostCalculatorEstimateParams**](CostCalculatorEstimateParams.md)| Estimate params | [optional] |

### Return type

[**CostCalculatorEstimatePDFResponse**](CostCalculatorEstimatePDFResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listCountries"></a>
# **listCountries**
> CostCalculatorListCountryResponse listCountries().execute();

List countries

Lists active and processing countries

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CostCalculatorApi;
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
      CostCalculatorListCountryResponse result = client
              .costCalculator
              .listCountries()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCalculatorApi#listCountries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CostCalculatorListCountryResponse> response = client
              .costCalculator
              .listCountries()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCalculatorApi#listCountries");
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

[**CostCalculatorListCountryResponse**](CostCalculatorListCountryResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="showRegionFields"></a>
# **showRegionFields**
> JSONSchemaResponse showRegionFields(slug).execute();

Show region fields

Returns required fields JSON Schema for a given region. These are required in order to calculate       the cost of employment for the region. These fields are based on employer contributions that are associated       with the region or any of it&#39;s parent regions.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CostCalculatorApi;
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
    String slug = "slug_example"; // Slug
    try {
      JSONSchemaResponse result = client
              .costCalculator
              .showRegionFields(slug)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCalculatorApi#showRegionFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JSONSchemaResponse> response = client
              .costCalculator
              .showRegionFields(slug)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostCalculatorApi#showRegionFields");
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
| **slug** | **String**| Slug | |

### Return type

[**JSONSchemaResponse**](JSONSchemaResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

