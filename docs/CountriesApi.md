# CountriesApi

All URIs are relative to *https://gateway.remote.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFormSchema**](CountriesApi.md#getFormSchema) | **GET** /v1/countries/{country_code}/{form} | Show form schema |
| [**listAlphabetically**](CountriesApi.md#listAlphabetically) | **GET** /v1/countries | List countries |
| [**listHolidaysByYear**](CountriesApi.md#listHolidaysByYear) | **GET** /v1/countries/{country_code}/holidays/{year} | List all holidays of a country |


<a name="getFormSchema"></a>
# **getFormSchema**
> CountryFormResponse getFormSchema(countryCode, form).employmentId(employmentId).execute();

Show form schema

Returns the json schema of a supported form. Possible form names are: &#x60;&#x60;&#x60; - address_details  - administrative_details  - bank_account_details  - employment_basic_information  - billing_address_details  - contract_details  - emergency_contact  - employment_document_details  - personal_details  - pricing_plan_details   &#x60;&#x60;&#x60;  This endpoint requires a company access token, as forms are dependent on certain properties of companies and their current employments.  

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CountriesApi;
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
    String countryCode = "PRT"; // Country code according to ISO 3-digit alphabetic codes
    String form = "address_details"; // Name of the desired form
    String employmentId = "663e0b79-c893-45ff-a1b2-f6dcabc098b5"; // Required for `contract_amendment` form
    try {
      CountryFormResponse result = client
              .countries
              .getFormSchema(countryCode, form)
              .employmentId(employmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#getFormSchema");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CountryFormResponse> response = client
              .countries
              .getFormSchema(countryCode, form)
              .employmentId(employmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#getFormSchema");
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
| **countryCode** | **String**| Country code according to ISO 3-digit alphabetic codes | |
| **form** | **String**| Name of the desired form | |
| **employmentId** | **String**| Required for &#x60;contract_amendment&#x60; form | [optional] |

### Return type

[**CountryFormResponse**](CountryFormResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listAlphabetically"></a>
# **listAlphabetically**
> CountriesResponse listAlphabetically().execute();

List countries

Returns a list of all countries that are supported by Remote API alphabetically ordered. The supported list accounts for creating employment with basic information and it does not imply fully onboarding employment via JSON Schema. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CountriesApi;
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
      CountriesResponse result = client
              .countries
              .listAlphabetically()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#listAlphabetically");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CountriesResponse> response = client
              .countries
              .listAlphabetically()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#listAlphabetically");
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

[**CountriesResponse**](CountriesResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listHolidaysByYear"></a>
# **listHolidaysByYear**
> HolidaysResponse listHolidaysByYear(countryCode, year).countrySubdivisionCode(countrySubdivisionCode).execute();

List all holidays of a country

List all holidays of a country for a specific year. Optionally, it can be filtered by country subdivision.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CountriesApi;
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
    String countryCode = "PRT"; // Country code according to ISO 3166-1 3-digit alphabetic codes
    String year = "2022"; // Year for the holidays
    String countrySubdivisionCode = "PT-10"; // Country subdivision code according to ISO 3166-2 codes
    try {
      HolidaysResponse result = client
              .countries
              .listHolidaysByYear(countryCode, year)
              .countrySubdivisionCode(countrySubdivisionCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#listHolidaysByYear");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HolidaysResponse> response = client
              .countries
              .listHolidaysByYear(countryCode, year)
              .countrySubdivisionCode(countrySubdivisionCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CountriesApi#listHolidaysByYear");
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
| **countryCode** | **String**| Country code according to ISO 3166-1 3-digit alphabetic codes | |
| **year** | **String**| Year for the holidays | |
| **countrySubdivisionCode** | **String**| Country subdivision code according to ISO 3166-2 codes | [optional] |

### Return type

[**HolidaysResponse**](HolidaysResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

