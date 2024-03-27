<div align="left">

[![Visit Remote](./header.png)](https://remote.com)

# [Remote](https://remote.com)

Talent is everywhere. Opportunity is not. Remote's mission is to create opportunity everywhere, empowering employers to find and hire the best talent, and enabling individuals to build financial and personal freedom. 

Remote is a Global HR Platform that helps companies hire, manage, and pay their entire team — and more effectively compete in the modern global economy through our comprehensive set of core solutions including, HRIS, payroll, international employment, contractor management, and more. 

Whether you're just starting your global journey, or looking to optimize your existing operations, sign up or book a demo - and see how Remote makes global HR simple.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Remote&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>remote-java-sdk</artifactId>
  <version>0.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:remote-java-sdk:0.1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/remote-java-sdk-0.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Remote;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BenefitsCountrySummaryApi;
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
      ListBenefitsCountrySummaryResponse result = client
              .benefitsCountrySummary
              .listSummary()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsCountrySummaryApi#listSummary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListBenefitsCountrySummaryResponse> response = client
              .benefitsCountrySummary
              .listSummary()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BenefitsCountrySummaryApi#listSummary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://gateway.remote.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BenefitsCountrySummaryApi* | [**listSummary**](docs/BenefitsCountrySummaryApi.md#listSummary) | **GET** /v1/benefits/country-summary | List Benefits Country Summary
*BillingDocumentsApi* | [**downloadPdf**](docs/BillingDocumentsApi.md#downloadPdf) | **GET** /v1/billing-documents/{billing_document_id}/pdf | Download a billing document PDF
*BillingDocumentsApi* | [**list**](docs/BillingDocumentsApi.md#list) | **GET** /v1/billing-documents | List Billing Documents
*BillingDocumentsApi* | [**showDetails**](docs/BillingDocumentsApi.md#showDetails) | **GET** /v1/billing-documents/{billing_document_id} | Show Billing Document
*CompaniesApi* | [**createNewCompany**](docs/CompaniesApi.md#createNewCompany) | **POST** /v1/companies | Create a company
*CompaniesApi* | [**listAll**](docs/CompaniesApi.md#listAll) | **GET** /v1/companies | List all companies
*CompaniesApi* | [**showCompany**](docs/CompaniesApi.md#showCompany) | **GET** /v1/companies/{company_id} | Show a company
*CompaniesApi* | [**updateCompany**](docs/CompaniesApi.md#updateCompany) | **PUT** /v1/companies/{company_id} | Update a company
*CompaniesApi* | [**updateCompany_0**](docs/CompaniesApi.md#updateCompany_0) | **PATCH** /v1/companies/{company_id} | Update a company
*CompanyDepartmentApi* | [**createNewDepartment**](docs/CompanyDepartmentApi.md#createNewDepartment) | **POST** /v1/company-departments | Create New Department
*CompanyDepartmentApi* | [**list**](docs/CompanyDepartmentApi.md#list) | **GET** /v1/company-departments | List Company Departments
*CompanyManagersApi* | [**createInvite**](docs/CompanyManagersApi.md#createInvite) | **POST** /v1/company-managers | Create and invite a Company Manager
*CompanyManagersApi* | [**deleteUser**](docs/CompanyManagersApi.md#deleteUser) | **DELETE** /v1/company-managers/{user_id} | Deletes a Company Manager user
*CompanyManagersApi* | [**listManagers**](docs/CompanyManagersApi.md#listManagers) | **GET** /v1/company-managers | List Company Managers
*CompanyManagersApi* | [**showUser**](docs/CompanyManagersApi.md#showUser) | **GET** /v1/company-managers/{user_id} | Show company manager user
*ContractAmendmentsApi* | [**approveAmendment**](docs/ContractAmendmentsApi.md#approveAmendment) | **PUT** /v1/sandbox/contract-amendments/{contract_amendment_request_id}/approve | Approve Contract Amendment in the Sandbox Environment
*ContractAmendmentsApi* | [**checkAutomatability**](docs/ContractAmendmentsApi.md#checkAutomatability) | **POST** /v1/contract-amendments/automatable | Automatable Contract Amendment
*ContractAmendmentsApi* | [**createRequest**](docs/ContractAmendmentsApi.md#createRequest) | **POST** /v1/contract-amendments | Create Contract Amendment
*ContractAmendmentsApi* | [**getFormSchema**](docs/ContractAmendmentsApi.md#getFormSchema) | **POST** /v1/contract-amendments/schema | Show form schema
*ContractAmendmentsApi* | [**listRequests**](docs/ContractAmendmentsApi.md#listRequests) | **GET** /v1/contract-amendments | List Contract Amendment
*ContractAmendmentsApi* | [**showSingleRequest**](docs/ContractAmendmentsApi.md#showSingleRequest) | **GET** /v1/contract-amendments/{id} | Show Contract Amendment
*CostCalculatorApi* | [**createEmploymentEstimation**](docs/CostCalculatorApi.md#createEmploymentEstimation) | **POST** /v1/cost-calculator/estimation | Creates a cost estimation of employments
*CostCalculatorApi* | [**generateEstimationPdf**](docs/CostCalculatorApi.md#generateEstimationPdf) | **POST** /v1/cost-calculator/estimation-pdf | Creates a cost estimation of employments
*CostCalculatorApi* | [**listCountries**](docs/CostCalculatorApi.md#listCountries) | **GET** /v1/cost-calculator/countries | List countries
*CostCalculatorApi* | [**showRegionFields**](docs/CostCalculatorApi.md#showRegionFields) | **GET** /v1/cost-calculator/regions/{slug}/fields | Show region fields
*CountriesApi* | [**getFormSchema**](docs/CountriesApi.md#getFormSchema) | **GET** /v1/countries/{country_code}/{form} | Show form schema
*CountriesApi* | [**listAlphabetically**](docs/CountriesApi.md#listAlphabetically) | **GET** /v1/countries | List countries
*CountriesApi* | [**listHolidaysByYear**](docs/CountriesApi.md#listHolidaysByYear) | **GET** /v1/countries/{country_code}/holidays/{year} | List all holidays of a country
*CustomFieldsApi* | [**listDefinitions**](docs/CustomFieldsApi.md#listDefinitions) | **GET** /v1/custom-fields | Lists custom fields definitions
*CustomFieldsApi* | [**showValue**](docs/CustomFieldsApi.md#showValue) | **GET** /v1/custom-fields/{custom_field_id}/values/{employment_id} | Show a custom field value
*EmploymentContractsApi* | [**getPendingChanges**](docs/EmploymentContractsApi.md#getPendingChanges) | **GET** /v1/employment-contracts/{employment_id}/pending-changes | Get employment contract pending changes
*EmploymentsApi* | [**completeOnboarding**](docs/EmploymentsApi.md#completeOnboarding) | **POST** /v1/ready | Complete onboarding
*EmploymentsApi* | [**createEmployment**](docs/EmploymentsApi.md#createEmployment) | **POST** /v1/employments | Create employment
*EmploymentsApi* | [**getEmploymentInfo**](docs/EmploymentsApi.md#getEmploymentInfo) | **GET** /v1/employments/{employment_id} | Show employment
*EmploymentsApi* | [**inviteStartEnrollment**](docs/EmploymentsApi.md#inviteStartEnrollment) | **POST** /v1/employments/{employment_id}/invite | Invite employment
*EmploymentsApi* | [**listAll**](docs/EmploymentsApi.md#listAll) | **GET** /v1/employments | List employments
*EmploymentsApi* | [**updateData**](docs/EmploymentsApi.md#updateData) | **PATCH** /v1/employments/{employment_id} | Update employment
*EmploymentsApi* | [**updateDetails**](docs/EmploymentsApi.md#updateDetails) | **PUT** /v1/employments/{employment_id} | Update employment
*ExpensesApi* | [**createApprovedExpense**](docs/ExpensesApi.md#createApprovedExpense) | **POST** /v1/expenses | Create expense
*ExpensesApi* | [**downloadReceipt**](docs/ExpensesApi.md#downloadReceipt) | **GET** /v1/expenses/{expense_id}/receipt | Download a receipt
*ExpensesApi* | [**downloadReceiptById**](docs/ExpensesApi.md#downloadReceiptById) | **GET** /v1/expenses/{expense_id}/receipts/{receipt_id} | Download a receipt by id
*ExpensesApi* | [**listRecords**](docs/ExpensesApi.md#listRecords) | **GET** /v1/expenses | List expenses
*ExpensesApi* | [**showRecord**](docs/ExpensesApi.md#showRecord) | **GET** /v1/expenses/{id} | Show expense
*ExpensesApi* | [**updateExpense**](docs/ExpensesApi.md#updateExpense) | **PUT** /v1/expenses/{id} | Update an expense
*ExpensesApi* | [**updateRecord**](docs/ExpensesApi.md#updateRecord) | **PATCH** /v1/expenses/{id} | Update an expense
*FilesApi* | [**downloadFile**](docs/FilesApi.md#downloadFile) | **GET** /v1/files/{id} | Download file
*FilesApi* | [**uploadEmploymentFile**](docs/FilesApi.md#uploadEmploymentFile) | **POST** /v1/documents | Upload file
*IdentityApi* | [**getTokenInfo**](docs/IdentityApi.md#getTokenInfo) | **GET** /v1/identity/current | Get token identity
*IncentivesApi* | [**createIncentive**](docs/IncentivesApi.md#createIncentive) | **POST** /v1/incentives | Create Incentive
*IncentivesApi* | [**listAll**](docs/IncentivesApi.md#listAll) | **GET** /v1/incentives | List Incentives
*IncentivesApi* | [**removeIncentive**](docs/IncentivesApi.md#removeIncentive) | **DELETE** /v1/incentives/{id} | Delete an Incentive
*IncentivesApi* | [**showDetails**](docs/IncentivesApi.md#showDetails) | **GET** /v1/incentives/{id} | Show Incentive
*IncentivesApi* | [**updateIncentive**](docs/IncentivesApi.md#updateIncentive) | **PUT** /v1/incentives/{id} | Update Incentive
*IncentivesApi* | [**updateIncentive_0**](docs/IncentivesApi.md#updateIncentive_0) | **PATCH** /v1/incentives/{id} | Update Incentive
*OAuth2Api* | [**exchangeToken**](docs/OAuth2Api.md#exchangeToken) | **POST** /auth/oauth2/token | Token
*OffboardingApi* | [**createRequest**](docs/OffboardingApi.md#createRequest) | **POST** /v1/offboardings | Create Offboarding
*OffboardingApi* | [**listRequests**](docs/OffboardingApi.md#listRequests) | **GET** /v1/offboardings | List Offboarding
*OffboardingApi* | [**showRequest**](docs/OffboardingApi.md#showRequest) | **GET** /v1/offboardings/{id} | Show Offboarding
*PayslipsApi* | [**downloadPdf**](docs/PayslipsApi.md#downloadPdf) | **GET** /v1/payslips/{payslip_id}/pdf | Download payslip in the PDF format
*PayslipsApi* | [**listAll**](docs/PayslipsApi.md#listAll) | **GET** /v1/payslips | List payslips
*PayslipsApi* | [**showPayslip**](docs/PayslipsApi.md#showPayslip) | **GET** /v1/payslips/{id} | Show payslip
*RecurringIncentivesApi* | [**createMonthlyIncentive**](docs/RecurringIncentivesApi.md#createMonthlyIncentive) | **POST** /v1/incentives/recurring | Create Recurring Incentive
*RecurringIncentivesApi* | [**deleteScheduled**](docs/RecurringIncentivesApi.md#deleteScheduled) | **DELETE** /v1/incentives/recurring/{id} | Delete a Recurring Incentive
*RecurringIncentivesApi* | [**listIncentives**](docs/RecurringIncentivesApi.md#listIncentives) | **GET** /v1/incentives/recurring | List Recurring Incentive
*ResignationApi* | [**downloadLetter**](docs/ResignationApi.md#downloadLetter) | **GET** /v1/resignations/{employment_request_id}/resignation-letter | Download a resignation letter
*SandboxApi* | [**createEmploymentWithoutValidations**](docs/SandboxApi.md#createEmploymentWithoutValidations) | **POST** /v1/sandbox/employments | Create employment
*SandboxApi* | [**employmentUpdate**](docs/SandboxApi.md#employmentUpdate) | **PUT** /v1/sandbox/employments/{employment_id} | Update employment
*SandboxApi* | [**triggerWebhookCallback**](docs/SandboxApi.md#triggerWebhookCallback) | **POST** /v1/sandbox/webhook-callbacks/trigger | Trigger a Webhook
*SandboxApi* | [**updateEmploymentState**](docs/SandboxApi.md#updateEmploymentState) | **PATCH** /v1/sandbox/employments/{employment_id} | Update employment
*TimeOffApi* | [**getRecord**](docs/TimeOffApi.md#getRecord) | **GET** /v1/timeoff/{id} | Show Time Off
*TimeOffApi* | [**listRecords**](docs/TimeOffApi.md#listRecords) | **GET** /v1/timeoff | List Time Off
*TimeOffApi* | [**listTypes**](docs/TimeOffApi.md#listTypes) | **GET** /v1/timeoff/types | List Time Off Types
*TimeOffApi* | [**recordCreate**](docs/TimeOffApi.md#recordCreate) | **POST** /v1/timeoff | Create Time Off
*TimeOffApi* | [**updateRecord**](docs/TimeOffApi.md#updateRecord) | **PUT** /v1/timeoff/{id} | Update Time Off
*TimeOffApi* | [**updateRecord_0**](docs/TimeOffApi.md#updateRecord_0) | **PATCH** /v1/timeoff/{id} | Update Time Off
*TimeOffBalancesApi* | [**showBalance**](docs/TimeOffBalancesApi.md#showBalance) | **GET** /v1/timeoff-balances/{employment_id} | Show Time Off Balance
*WebhookCallbacksApi* | [**deleteCallback**](docs/WebhookCallbacksApi.md#deleteCallback) | **DELETE** /v1/webhook-callbacks/{id} | Delete a Webhook Callback
*WebhookCallbacksApi* | [**registerCallback**](docs/WebhookCallbacksApi.md#registerCallback) | **POST** /v1/webhook-callbacks | Create a Webhook Callback


## Documentation for Models

 - [ActionError](docs/ActionError.md)
 - [AmountTaxType](docs/AmountTaxType.md)
 - [ApproveExpenseParams](docs/ApproveExpenseParams.md)
 - [AuthorizationCodeParams](docs/AuthorizationCodeParams.md)
 - [AuthorizationCodeResponse](docs/AuthorizationCodeResponse.md)
 - [AuthorizationCodeResponseAllOf](docs/AuthorizationCodeResponseAllOf.md)
 - [Base64File](docs/Base64File.md)
 - [BaseTokenResponse](docs/BaseTokenResponse.md)
 - [BenefitsCountrySummary](docs/BenefitsCountrySummary.md)
 - [BillingDocument](docs/BillingDocument.md)
 - [BillingDocumentAmountItem](docs/BillingDocumentAmountItem.md)
 - [BillingDocumentResponse](docs/BillingDocumentResponse.md)
 - [BillingDocumentResponseData](docs/BillingDocumentResponseData.md)
 - [BillingDocumentsResponse](docs/BillingDocumentsResponse.md)
 - [BillingDocumentsResponseData](docs/BillingDocumentsResponseData.md)
 - [BillingDocumentsResponseDataBillingDocumentsInner](docs/BillingDocumentsResponseDataBillingDocumentsInner.md)
 - [ClientCredentialsParams](docs/ClientCredentialsParams.md)
 - [CommonIncentiveParams](docs/CommonIncentiveParams.md)
 - [CompaniesResponse](docs/CompaniesResponse.md)
 - [Company](docs/Company.md)
 - [CompanyAlreadyExistsErrorResponse](docs/CompanyAlreadyExistsErrorResponse.md)
 - [CompanyCreationResponse](docs/CompanyCreationResponse.md)
 - [CompanyDepartment](docs/CompanyDepartment.md)
 - [CompanyDepartmentCreatedResponse](docs/CompanyDepartmentCreatedResponse.md)
 - [CompanyManager](docs/CompanyManager.md)
 - [CompanyManagerData](docs/CompanyManagerData.md)
 - [CompanyManagerParams](docs/CompanyManagerParams.md)
 - [CompanyManagerResponse](docs/CompanyManagerResponse.md)
 - [CompanyManagersResponse](docs/CompanyManagersResponse.md)
 - [CompanyManagersResponseData](docs/CompanyManagersResponseData.md)
 - [CompanyNotEligibleForCreationErrorResponse](docs/CompanyNotEligibleForCreationErrorResponse.md)
 - [CompanyResponse](docs/CompanyResponse.md)
 - [CompanyWithTokensResponse](docs/CompanyWithTokensResponse.md)
 - [CompleteOnboarding](docs/CompleteOnboarding.md)
 - [ContractAmendment](docs/ContractAmendment.md)
 - [ContractAmendmentAutomatableResponse](docs/ContractAmendmentAutomatableResponse.md)
 - [ContractAmendmentAutomatableResponseData](docs/ContractAmendmentAutomatableResponseData.md)
 - [ContractAmendmentFormResponse](docs/ContractAmendmentFormResponse.md)
 - [ContractAmendmentResponse](docs/ContractAmendmentResponse.md)
 - [ContractAmendmentResponseData](docs/ContractAmendmentResponseData.md)
 - [ContractAmendmentSchemaParams](docs/ContractAmendmentSchemaParams.md)
 - [ContractPendingChanges](docs/ContractPendingChanges.md)
 - [CostCalculatorCost](docs/CostCalculatorCost.md)
 - [CostCalculatorCosts](docs/CostCalculatorCosts.md)
 - [CostCalculatorCountryAvailability](docs/CostCalculatorCountryAvailability.md)
 - [CostCalculatorCountryLevelRegion](docs/CostCalculatorCountryLevelRegion.md)
 - [CostCalculatorEmployment](docs/CostCalculatorEmployment.md)
 - [CostCalculatorEmploymentParam](docs/CostCalculatorEmploymentParam.md)
 - [CostCalculatorEstimatePDFResponse](docs/CostCalculatorEstimatePDFResponse.md)
 - [CostCalculatorEstimatePDFResponseData](docs/CostCalculatorEstimatePDFResponseData.md)
 - [CostCalculatorEstimateParams](docs/CostCalculatorEstimateParams.md)
 - [CostCalculatorEstimateResponse](docs/CostCalculatorEstimateResponse.md)
 - [CostCalculatorEstimateResponseData](docs/CostCalculatorEstimateResponseData.md)
 - [CostCalculatorListCountryResponse](docs/CostCalculatorListCountryResponse.md)
 - [CountriesResponse](docs/CountriesResponse.md)
 - [Country](docs/Country.md)
 - [CountryFormResponse](docs/CountryFormResponse.md)
 - [CountrySubdivision](docs/CountrySubdivision.md)
 - [CreateApprovedTimeoffParams](docs/CreateApprovedTimeoffParams.md)
 - [CreateApprovedTimeoffParamsAllOf](docs/CreateApprovedTimeoffParamsAllOf.md)
 - [CreateCompanyDepartmentParams](docs/CreateCompanyDepartmentParams.md)
 - [CreateCompanyParams](docs/CreateCompanyParams.md)
 - [CreateContractAmendmentParams](docs/CreateContractAmendmentParams.md)
 - [CreateOffboardingParams](docs/CreateOffboardingParams.md)
 - [CreateOneTimeIncentiveParams](docs/CreateOneTimeIncentiveParams.md)
 - [CreateOneTimeIncentiveParamsAllOf](docs/CreateOneTimeIncentiveParamsAllOf.md)
 - [CreateParams](docs/CreateParams.md)
 - [CreateParamsDeprecated](docs/CreateParamsDeprecated.md)
 - [CreateRecurringIncentiveParams](docs/CreateRecurringIncentiveParams.md)
 - [CreateRecurringIncentiveParamsAllOf](docs/CreateRecurringIncentiveParamsAllOf.md)
 - [CreateTimeoffParams](docs/CreateTimeoffParams.md)
 - [CreateWebhookCallbackParams](docs/CreateWebhookCallbackParams.md)
 - [Currency](docs/Currency.md)
 - [CurrencyDefinition](docs/CurrencyDefinition.md)
 - [DeclineExpenseParams](docs/DeclineExpenseParams.md)
 - [DeleteRecurringIncentiveResponse](docs/DeleteRecurringIncentiveResponse.md)
 - [DeleteRecurringIncentiveResponseData](docs/DeleteRecurringIncentiveResponseData.md)
 - [Employment](docs/Employment.md)
 - [EmploymentBasicResponse](docs/EmploymentBasicResponse.md)
 - [EmploymentContractPendingChangesResponse](docs/EmploymentContractPendingChangesResponse.md)
 - [EmploymentContractPendingChangesResponseData](docs/EmploymentContractPendingChangesResponseData.md)
 - [EmploymentCreationResponse](docs/EmploymentCreationResponse.md)
 - [EmploymentCreationResponseData](docs/EmploymentCreationResponseData.md)
 - [EmploymentCustomField](docs/EmploymentCustomField.md)
 - [EmploymentCustomFieldValue](docs/EmploymentCustomFieldValue.md)
 - [EmploymentCustomFieldValueResponse](docs/EmploymentCustomFieldValueResponse.md)
 - [EmploymentCustomFieldValueResponseData](docs/EmploymentCustomFieldValueResponseData.md)
 - [EmploymentLifecycleStage](docs/EmploymentLifecycleStage.md)
 - [EmploymentResponse](docs/EmploymentResponse.md)
 - [EmploymentResponseData](docs/EmploymentResponseData.md)
 - [EmploymentStatus](docs/EmploymentStatus.md)
 - [EmploymentTermType](docs/EmploymentTermType.md)
 - [EmploymentUpdateParams](docs/EmploymentUpdateParams.md)
 - [Expense](docs/Expense.md)
 - [ExpenseResponse](docs/ExpenseResponse.md)
 - [ExpenseResponseData](docs/ExpenseResponseData.md)
 - [ExpenseReviewer](docs/ExpenseReviewer.md)
 - [FileParams](docs/FileParams.md)
 - [FileResponse](docs/FileResponse.md)
 - [FullParams](docs/FullParams.md)
 - [FullParamsDeprecated](docs/FullParamsDeprecated.md)
 - [Holiday](docs/Holiday.md)
 - [HolidaysResponse](docs/HolidaysResponse.md)
 - [IdentityClientCredentialsResponse](docs/IdentityClientCredentialsResponse.md)
 - [IdentityClientCredentialsResponseData](docs/IdentityClientCredentialsResponseData.md)
 - [IdentityCompany](docs/IdentityCompany.md)
 - [IdentityCompanyAccessTokenResponse](docs/IdentityCompanyAccessTokenResponse.md)
 - [IdentityCompanyAccessTokenResponseData](docs/IdentityCompanyAccessTokenResponseData.md)
 - [IdentityCustomerAccessTokenResponse](docs/IdentityCustomerAccessTokenResponse.md)
 - [IdentityCustomerAccessTokenResponseData](docs/IdentityCustomerAccessTokenResponseData.md)
 - [IdentityIntegration](docs/IdentityIntegration.md)
 - [IdentityUser](docs/IdentityUser.md)
 - [Incentive](docs/Incentive.md)
 - [IncentiveResponse](docs/IncentiveResponse.md)
 - [IncentiveResponseData](docs/IncentiveResponseData.md)
 - [InternalServerErrorResponse](docs/InternalServerErrorResponse.md)
 - [JSONSchema](docs/JSONSchema.md)
 - [JSONSchemaResponse](docs/JSONSchemaResponse.md)
 - [JSONSchemaSchema](docs/JSONSchemaSchema.md)
 - [ListBenefitsCountrySummaryResponse](docs/ListBenefitsCountrySummaryResponse.md)
 - [ListBenefitsCountrySummaryResponseData](docs/ListBenefitsCountrySummaryResponseData.md)
 - [ListCompanyDepartmentsPaginatedResponse](docs/ListCompanyDepartmentsPaginatedResponse.md)
 - [ListCompanyDepartmentsPaginatedResponseData](docs/ListCompanyDepartmentsPaginatedResponseData.md)
 - [ListContractAmendmentResponse](docs/ListContractAmendmentResponse.md)
 - [ListContractAmendmentResponseData](docs/ListContractAmendmentResponseData.md)
 - [ListEmploymentCustomFieldsResponse](docs/ListEmploymentCustomFieldsResponse.md)
 - [ListEmploymentCustomFieldsResponseData](docs/ListEmploymentCustomFieldsResponseData.md)
 - [ListEmploymentsResponse](docs/ListEmploymentsResponse.md)
 - [ListEmploymentsResponseData](docs/ListEmploymentsResponseData.md)
 - [ListExpenseResponse](docs/ListExpenseResponse.md)
 - [ListExpenseResponseData](docs/ListExpenseResponseData.md)
 - [ListIncentivesResponse](docs/ListIncentivesResponse.md)
 - [ListIncentivesResponseData](docs/ListIncentivesResponseData.md)
 - [ListOffboardingResponse](docs/ListOffboardingResponse.md)
 - [ListOffboardingResponseData](docs/ListOffboardingResponseData.md)
 - [ListPayslipsResponse](docs/ListPayslipsResponse.md)
 - [ListPayslipsResponseData](docs/ListPayslipsResponseData.md)
 - [ListRecurringIncentivesResponse](docs/ListRecurringIncentivesResponse.md)
 - [ListRecurringIncentivesResponseData](docs/ListRecurringIncentivesResponseData.md)
 - [ListTimeoffResponse](docs/ListTimeoffResponse.md)
 - [ListTimeoffResponseData](docs/ListTimeoffResponseData.md)
 - [ListTimeoffTypesResponse](docs/ListTimeoffTypesResponse.md)
 - [ListTimeoffTypesResponseData](docs/ListTimeoffTypesResponseData.md)
 - [MessageResponse](docs/MessageResponse.md)
 - [MinimalContractAmendment](docs/MinimalContractAmendment.md)
 - [MinimalCountry](docs/MinimalCountry.md)
 - [MinimalEmployment](docs/MinimalEmployment.md)
 - [MinimalRegion](docs/MinimalRegion.md)
 - [ModelFile](docs/ModelFile.md)
 - [Offboarding](docs/Offboarding.md)
 - [OffboardingFile](docs/OffboardingFile.md)
 - [OffboardingResponse](docs/OffboardingResponse.md)
 - [OnboardingTasks](docs/OnboardingTasks.md)
 - [ParameterError](docs/ParameterError.md)
 - [ParamsToCreateExpense](docs/ParamsToCreateExpense.md)
 - [Payslip](docs/Payslip.md)
 - [PayslipResponse](docs/PayslipResponse.md)
 - [PayslipResponseData](docs/PayslipResponseData.md)
 - [PricingPlanDetails](docs/PricingPlanDetails.md)
 - [RecurringIncentive](docs/RecurringIncentive.md)
 - [RecurringIncentiveResponse](docs/RecurringIncentiveResponse.md)
 - [RecurringIncentiveResponseData](docs/RecurringIncentiveResponseData.md)
 - [RefreshTokenParams](docs/RefreshTokenParams.md)
 - [RefreshTokenResponse](docs/RefreshTokenResponse.md)
 - [RefreshTokenResponseAllOf](docs/RefreshTokenResponseAllOf.md)
 - [RegionStatus](docs/RegionStatus.md)
 - [RequestDetails](docs/RequestDetails.md)
 - [ResignationAfterStartDateRequestParams](docs/ResignationAfterStartDateRequestParams.md)
 - [ResignationAfterStartDateRequestParamsOwedOutstandingReimbursements](docs/ResignationAfterStartDateRequestParamsOwedOutstandingReimbursements.md)
 - [ResignationAfterStartDateRequestParamsProposedLastDate](docs/ResignationAfterStartDateRequestParamsProposedLastDate.md)
 - [ResignationBeforeStartDateRequestParams](docs/ResignationBeforeStartDateRequestParams.md)
 - [ResignationOffboarding](docs/ResignationOffboarding.md)
 - [ResourceErrorResponse](docs/ResourceErrorResponse.md)
 - [ResourceErrorResponseMessage](docs/ResourceErrorResponseMessage.md)
 - [SalaryDecreaseDetails](docs/SalaryDecreaseDetails.md)
 - [SuccessResponse](docs/SuccessResponse.md)
 - [SuccessResponseData](docs/SuccessResponseData.md)
 - [TaskDescription](docs/TaskDescription.md)
 - [TaskStatus](docs/TaskStatus.md)
 - [TerminationDetailsParams](docs/TerminationDetailsParams.md)
 - [TerminationDetailsParamsEmployeeAwareness](docs/TerminationDetailsParamsEmployeeAwareness.md)
 - [TerminationOffboarding](docs/TerminationOffboarding.md)
 - [TerminationOffboardingEmployeeAwareness](docs/TerminationOffboardingEmployeeAwareness.md)
 - [Timeoff](docs/Timeoff.md)
 - [TimeoffBalance](docs/TimeoffBalance.md)
 - [TimeoffBalanceResponse](docs/TimeoffBalanceResponse.md)
 - [TimeoffBalanceResponseData](docs/TimeoffBalanceResponseData.md)
 - [TimeoffDay](docs/TimeoffDay.md)
 - [TimeoffDaysAndHours](docs/TimeoffDaysAndHours.md)
 - [TimeoffDaysParams](docs/TimeoffDaysParams.md)
 - [TimeoffDocumentParams](docs/TimeoffDocumentParams.md)
 - [TimeoffEntitlement](docs/TimeoffEntitlement.md)
 - [TimeoffResponse](docs/TimeoffResponse.md)
 - [TimeoffResponseData](docs/TimeoffResponseData.md)
 - [TimeoffStatus](docs/TimeoffStatus.md)
 - [TimeoffType](docs/TimeoffType.md)
 - [UpdateApprovedTimeoffParams](docs/UpdateApprovedTimeoffParams.md)
 - [UpdateCompanyParams](docs/UpdateCompanyParams.md)
 - [UpdateIncentiveParams](docs/UpdateIncentiveParams.md)
 - [UpdateIncentiveParamsAllOf](docs/UpdateIncentiveParamsAllOf.md)
 - [UserStatus](docs/UserStatus.md)
 - [VEMR](docs/VEMR.md)
 - [ValidationError](docs/ValidationError.md)
 - [WebhookCallback](docs/WebhookCallback.md)
 - [WebhookCallbackResponse](docs/WebhookCallbackResponse.md)
 - [WebhookCallbackResponseData](docs/WebhookCallbackResponseData.md)
 - [WebhookTriggerParams](docs/WebhookTriggerParams.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
