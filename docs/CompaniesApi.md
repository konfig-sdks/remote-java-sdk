# CompaniesApi

All URIs are relative to *https://gateway.remote.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewCompany**](CompaniesApi.md#createNewCompany) | **POST** /v1/companies | Create a company |
| [**listAll**](CompaniesApi.md#listAll) | **GET** /v1/companies | List all companies |
| [**showCompany**](CompaniesApi.md#showCompany) | **GET** /v1/companies/{company_id} | Show a company |
| [**updateCompany**](CompaniesApi.md#updateCompany) | **PUT** /v1/companies/{company_id} | Update a company |
| [**updateCompany_0**](CompaniesApi.md#updateCompany_0) | **PATCH** /v1/companies/{company_id} | Update a company |


<a name="createNewCompany"></a>
# **createNewCompany**
> CompanyCreationResponse createNewCompany().action(action).createCompanyParams(createCompanyParams).execute();

Create a company

  Creates a new company.    ### Creating a company with only the required request body parameters   When you call this endpoint and omit all the optional parameters in the request body,   the following resources get created upon a successful response:   * A new company with status &#x60;pending&#x60;.   * A company owner for the new company with status &#x60;initiated&#x60;.    See the [update a company endpoint](https://gateway.remote.com/v1/docs/openapi.html) for   more details on how to get your company and its owner to &#x60;active&#x60; status.    If you&#39;d like to create a company and its owner with &#x60;active&#x60; status in a single request,   please provide the optional &#x60;address_details&#x60; parameter as well.    ### Accepting the Terms of Service    A required step for creating a company in Remote is to accept our Terms of Service (ToS).    Company managers need to be aware of our Terms of Service and Privacy Policy,   hence **it&#39;s the responsibility of our partners to advise and ensure company managers read   and accept the ToS**. The terms have to be accepted only once, before creating a company,   and the Remote API will collect the acceptance timestamp as its confirmation.    To ensure users read the most recent version of Remote&#39;s Terms of Service, their **acceptance   must be done within the last fifteen minutes prior the company creation action**.    To retrieve this information, partners can provide an element with any text and a description   explaining that by performing that action they are accepting Remote&#39;s Term of Service. For   instance, the partner can add a checkbox or a \&quot;Create Remote Account\&quot; button followed by a   description saying \&quot;By creating an account, you agree to   [Remote&#39;s Terms of Service](https://remote.com/terms-of-service). Also see Remote&#39;s   [Privacy Policy](https://remote.com/privacy-policy)\&quot;. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompaniesApi;
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
    String companyOwnerEmail = "companyOwnerEmail_example"; // The company owner email.  This value cannot be changed once set. 
    String companyOwnerName = "companyOwnerName_example"; // The company owner name.  This value cannot be changed from the Remote API once set. 
    String countryCode = "countryCode_example"; // 3-letter country code of the country the company address is located in.  For a list of countries supported through the Remote API, make a call to the [list countries endpoint](https://gateway.remote.com/v1/docs/openapi.html). This endpoint will also include the 3-letter country codes you can use for this field. 
    String desiredCurrency = "AUD"; // Desired currency for invoicing and displaying converted salaries in Remote UI regardless of the employee's country.
    String name = "name_example"; // The company name
    OffsetDateTime termsOfServiceAcceptedAt = OffsetDateTime.now(); // Date and time the Terms of Service were accepted. To ensure users read the most recent version of Remote's Terms of Service, their action cannot have been done more than fifteen minutes ago. The UTC offset must be included in the ISO 8601 format: `YYYY-MM-DD HOURS:MINUTES:SECONDSZ`
    Object addressDetails = null; // Fields can vary depending on the country. Please, check the required fields structure using the [Show form schema endpoint](https://gateway.remote.com/v1/docs/openapi.html). Use the desired country and `address_details` as the form name for the placeholders. The response complies with the [JSON Schema](https://remote.com/resources/api/how-json-schemas-work) specification. 
    Object bankAccountDetails = null; // Fields can vary depending on the country. Please, check the required fields structure using the [Show form schema endpoint](https://gateway.remote.com/v1/docs/openapi.html). Use the desired country and `bank_account_details` as the form name for the placeholders. The response complies with the [JSON Schema](https://remote.com/resources/api/how-json-schemas-work) specification. 
    String emailDomain = "emailDomain_example"; // The domain of the company. Use this field to specify the company domain name when it's different from the domain in the company owner's email.
    String externalId = "externalId_example"; // Id of the company as represented in the external partner system.
    String phoneNumber = "phoneNumber_example"; // A phone number the company can be contacted with.
    String registrationNumber = "registrationNumber_example"; // The company registration number. This field or `tax_number` (but not both) should be submitted.
    String taxNumber = "taxNumber_example"; // The tax identifier of the company. This field or `registration_number` (but not both) should be submitted.
    String action = "get_oauth_access_tokens,send_create_password_email"; // Complementary action(s) to perform when creating a company:  - `get_oauth_access_tokens` returns the user's access and refresh tokens - `send_create_password_email ` sends a reset password token to the company owner's email so they can log in using Remote UI (not needed if integration plans to use SSO only)  If `action` contains `send_create_password_email` you can redirect the user to [https://employ.remote.com/api-integration-new-password-send](https://employ.remote.com/api-integration-new-password-send) 
    try {
      CompanyCreationResponse result = client
              .companies
              .createNewCompany(companyOwnerEmail, companyOwnerName, countryCode, desiredCurrency, name, termsOfServiceAcceptedAt)
              .addressDetails(addressDetails)
              .bankAccountDetails(bankAccountDetails)
              .emailDomain(emailDomain)
              .externalId(externalId)
              .phoneNumber(phoneNumber)
              .registrationNumber(registrationNumber)
              .taxNumber(taxNumber)
              .action(action)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#createNewCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompanyCreationResponse> response = client
              .companies
              .createNewCompany(companyOwnerEmail, companyOwnerName, countryCode, desiredCurrency, name, termsOfServiceAcceptedAt)
              .addressDetails(addressDetails)
              .bankAccountDetails(bankAccountDetails)
              .emailDomain(emailDomain)
              .externalId(externalId)
              .phoneNumber(phoneNumber)
              .registrationNumber(registrationNumber)
              .taxNumber(taxNumber)
              .action(action)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#createNewCompany");
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
| **action** | **String**| Complementary action(s) to perform when creating a company:  - &#x60;get_oauth_access_tokens&#x60; returns the user&#39;s access and refresh tokens - &#x60;send_create_password_email &#x60; sends a reset password token to the company owner&#39;s email so they can log in using Remote UI (not needed if integration plans to use SSO only)  If &#x60;action&#x60; contains &#x60;send_create_password_email&#x60; you can redirect the user to [https://employ.remote.com/api-integration-new-password-send](https://employ.remote.com/api-integration-new-password-send)  | [optional] |
| **createCompanyParams** | [**CreateCompanyParams**](CreateCompanyParams.md)| Create Company params | [optional] |

### Return type

[**CompanyCreationResponse**](CompanyCreationResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a name="listAll"></a>
# **listAll**
> CompaniesResponse listAll().execute();

List all companies

List all companies that authorized your integration to act on their behalf. In other words, these are all the companies that your integration can manage. Any company that has completed the authorization flow for your integration will be included in the response.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompaniesApi;
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
      CompaniesResponse result = client
              .companies
              .listAll()
              .execute();
      System.out.println(result);
      System.out.println(result.getCompanies());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompaniesResponse> response = client
              .companies
              .listAll()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#listAll");
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

[**CompaniesResponse**](CompaniesResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="showCompany"></a>
# **showCompany**
> CompanyResponse showCompany(companyId).execute();

Show a company

Given an ID, shows a company

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompaniesApi;
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
    String companyId = "0a8s2d1-company-id-2e3f4th"; // Company ID
    try {
      CompanyResponse result = client
              .companies
              .showCompany(companyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCompany());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#showCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompanyResponse> response = client
              .companies
              .showCompany(companyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#showCompany");
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

### Return type

[**CompanyResponse**](CompanyResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateCompany"></a>
# **updateCompany**
> CompanyResponse updateCompany(companyId).updateCompanyParams(updateCompanyParams).execute();

Update a company

Given an ID and a request object with new information, updates a company.  ### Getting a company and its owner to &#x60;active&#x60; status If you created a company using the [create a company endpoint](https://gateway.remote.com/v1/docs/openapi.html) without all the required request body parameters, you can use this endpoint to provide the missing data. Once the company and its owner have all the necessary data, both their statuses will be set to &#x60;active&#x60; and the company onboarding will be marked as \&quot;completed\&quot;.  The following constitutes a company with \&quot;all the necessary data\&quot;: * Complete &#x60;address&#x60;, with valid &#x60;address&#x60;, &#x60;postal_code&#x60;, &#x60;country&#x60; and &#x60;state&#x60; parameters (Varies by country. Use the [show form schema endpoint](https://gateway.remote.com/v1/docs/openapi.html) to see which address parameters are required). * Company &#x60;tax_number&#x60; or &#x60;registration_number&#x60; is not nil * Company &#x60;name&#x60; is not nil (already required when creating the company) * Company has a &#x60;desired_currency&#x60; in their bank account (already required when creating the company) * Company has accepted terms of service (already required when creating the company) 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompaniesApi;
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
    String companyId = "0a8s2d1-company-id-2e3f4th"; // Company ID
    Object addressDetails = null; // Fields can vary depending on the country. Please, check the required fields structure using the [Show form schema endpoint](https://gateway.remote.com/v1/docs/openapi.html). Use the desired country and `address_details` as the form name for the placeholders. The response complies with the [JSON Schema](https://remote.com/resources/api/how-json-schemas-work) specification. 
    Object bankAccountDetails = null; // Fields can vary depending on the country. Please, check the required fields structure using the [Show form schema endpoint](https://gateway.remote.com/v1/docs/openapi.html). Use the desired country and `bank_account_details` as the form name for the placeholders. The response complies with the [JSON Schema](https://remote.com/resources/api/how-json-schemas-work) specification. 
    String countryCode = "countryCode_example"; // Country of company address
    String desiredCurrency = "AUD"; // Desired currency for invoicing and displaying converted salaries in Remote UI regardless of the employee's country.  This field is only accepted if company is in status `pending`. Please contact Remote if you wish to update it. 
    String name = "name_example"; // This field is only accepted if company is in status `pending`. Please contact Remote if you wish to update it. 
    String phoneNumber = "phoneNumber_example"; // A phone number the company can be contacted with.
    String registrationNumber = "registrationNumber_example"; // The company registration number. This field or tax_number (but not both) should be submitted.  This field is only accepted if company is in status `pending`. 
    String taxNumber = "taxNumber_example"; //   The tax identifier of the company. This field or registration_number (but not both) should be submitted.    This field is only accepted if company is in status `pending`. 
    try {
      CompanyResponse result = client
              .companies
              .updateCompany(companyId)
              .addressDetails(addressDetails)
              .bankAccountDetails(bankAccountDetails)
              .countryCode(countryCode)
              .desiredCurrency(desiredCurrency)
              .name(name)
              .phoneNumber(phoneNumber)
              .registrationNumber(registrationNumber)
              .taxNumber(taxNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getCompany());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#updateCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompanyResponse> response = client
              .companies
              .updateCompany(companyId)
              .addressDetails(addressDetails)
              .bankAccountDetails(bankAccountDetails)
              .countryCode(countryCode)
              .desiredCurrency(desiredCurrency)
              .name(name)
              .phoneNumber(phoneNumber)
              .registrationNumber(registrationNumber)
              .taxNumber(taxNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#updateCompany");
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
| **updateCompanyParams** | [**UpdateCompanyParams**](UpdateCompanyParams.md)| Update Company params | [optional] |

### Return type

[**CompanyResponse**](CompanyResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="updateCompany_0"></a>
# **updateCompany_0**
> CompanyResponse updateCompany_0(companyId).updateCompanyParams(updateCompanyParams).execute();

Update a company

Given an ID and a request object with new information, updates a company.  ### Getting a company and its owner to &#x60;active&#x60; status If you created a company using the [create a company endpoint](https://gateway.remote.com/v1/docs/openapi.html) without all the required request body parameters, you can use this endpoint to provide the missing data. Once the company and its owner have all the necessary data, both their statuses will be set to &#x60;active&#x60; and the company onboarding will be marked as \&quot;completed\&quot;.  The following constitutes a company with \&quot;all the necessary data\&quot;: * Complete &#x60;address&#x60;, with valid &#x60;address&#x60;, &#x60;postal_code&#x60;, &#x60;country&#x60; and &#x60;state&#x60; parameters (Varies by country. Use the [show form schema endpoint](https://gateway.remote.com/v1/docs/openapi.html) to see which address parameters are required). * Company &#x60;tax_number&#x60; or &#x60;registration_number&#x60; is not nil * Company &#x60;name&#x60; is not nil (already required when creating the company) * Company has a &#x60;desired_currency&#x60; in their bank account (already required when creating the company) * Company has accepted terms of service (already required when creating the company) 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompaniesApi;
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
    String companyId = "0a8s2d1-company-id-2e3f4th"; // Company ID
    Object addressDetails = null; // Fields can vary depending on the country. Please, check the required fields structure using the [Show form schema endpoint](https://gateway.remote.com/v1/docs/openapi.html). Use the desired country and `address_details` as the form name for the placeholders. The response complies with the [JSON Schema](https://remote.com/resources/api/how-json-schemas-work) specification. 
    Object bankAccountDetails = null; // Fields can vary depending on the country. Please, check the required fields structure using the [Show form schema endpoint](https://gateway.remote.com/v1/docs/openapi.html). Use the desired country and `bank_account_details` as the form name for the placeholders. The response complies with the [JSON Schema](https://remote.com/resources/api/how-json-schemas-work) specification. 
    String countryCode = "countryCode_example"; // Country of company address
    String desiredCurrency = "AUD"; // Desired currency for invoicing and displaying converted salaries in Remote UI regardless of the employee's country.  This field is only accepted if company is in status `pending`. Please contact Remote if you wish to update it. 
    String name = "name_example"; // This field is only accepted if company is in status `pending`. Please contact Remote if you wish to update it. 
    String phoneNumber = "phoneNumber_example"; // A phone number the company can be contacted with.
    String registrationNumber = "registrationNumber_example"; // The company registration number. This field or tax_number (but not both) should be submitted.  This field is only accepted if company is in status `pending`. 
    String taxNumber = "taxNumber_example"; //   The tax identifier of the company. This field or registration_number (but not both) should be submitted.    This field is only accepted if company is in status `pending`. 
    try {
      CompanyResponse result = client
              .companies
              .updateCompany_0(companyId)
              .addressDetails(addressDetails)
              .bankAccountDetails(bankAccountDetails)
              .countryCode(countryCode)
              .desiredCurrency(desiredCurrency)
              .name(name)
              .phoneNumber(phoneNumber)
              .registrationNumber(registrationNumber)
              .taxNumber(taxNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getCompany());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#updateCompany_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompanyResponse> response = client
              .companies
              .updateCompany_0(companyId)
              .addressDetails(addressDetails)
              .bankAccountDetails(bankAccountDetails)
              .countryCode(countryCode)
              .desiredCurrency(desiredCurrency)
              .name(name)
              .phoneNumber(phoneNumber)
              .registrationNumber(registrationNumber)
              .taxNumber(taxNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#updateCompany_0");
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
| **updateCompanyParams** | [**UpdateCompanyParams**](UpdateCompanyParams.md)| Update Company params | [optional] |

### Return type

[**CompanyResponse**](CompanyResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

