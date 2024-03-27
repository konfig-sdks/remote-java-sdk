

# FullParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addressDetails** | **Object** | Home address information. As its properties may vary depending on the country,                you must query the [Show form schema](https://gateway.remote.com/v1/docs/openapi.html) endpoint             passing the country code and &#x60;address_details&#x60; as path parameters. |  [optional] |
|**administrativeDetails** | **Object** | Administrative information. As its properties may vary depending on the country,                you must query the [Show form schema](https://gateway.remote.com/v1/docs/openapi.html) endpoint             passing the country code and &#x60;administrative_details&#x60; as path parameters. |  [optional] |
|**bankAccountDetails** | **Object** | Bank account information. As its properties may vary depending on the country,                you must query the [Show form schema](https://gateway.remote.com/v1/docs/openapi.html) endpoint             passing the country code and &#x60;bank_account_details&#x60; as path parameters. |  [optional] |
|**basicInformation** | **Object** | Employment basic information. As its properties may vary depending on the country,                you must query the [Show form schema](https://gateway.remote.com/v1/docs/openapi.html) endpoint             passing the country code and &#x60;employment_basic_information&#x60; as path parameters. |  [optional] |
|**billingAddressDetails** | **Object** | Billing address information. As its properties may vary depending on the country,                you must query the [Show form schema](https://gateway.remote.com/v1/docs/openapi.html) endpoint             passing the country code and &#x60;billing_address_details&#x60; as path parameters. |  [optional] |
|**companyId** | **String** |  |  [optional] |
|**contractDetails** | **Object** | Contract information. As its properties may vary depending on the country,                you must query the [Show form schema](https://gateway.remote.com/v1/docs/openapi.html) endpoint             passing the country code and &#x60;contract_details&#x60; as path parameters. |  [optional] |
|**country** | [**Country**](Country.md) |  |  [optional] |
|**departmentId** | **String** | The department of the employment. The department must belong to the same company as the employment.  |  [optional] |
|**emergencyContactDetails** | **Object** | Emergency contact information. As its properties may vary depending on the country,                you must query the [Show form schema](https://gateway.remote.com/v1/docs/openapi.html) endpoint             passing the country code and &#x60;emergency_contact_details&#x60; as path parameters. |  [optional] |
|**fullName** | **String** |  |  [optional] |
|**jobTitle** | **String** |  |  [optional] |
|**managerId** | **String** | The user id of the manager, who should have an &#x60;admin&#x60;, &#x60;owner&#x60; or &#x60;people_manager&#x60; role. You can find these users by querying the [Company Managers endpoint](https://gateway.remote.com/v1/docs/openapi.html). **Update of this field is only available for active employments.**  |  [optional] |
|**personalDetails** | **Object** | Personal details information. As its properties may vary depending on the country,                you must query the [Show form schema](https://gateway.remote.com/v1/docs/openapi.html) endpoint             passing the country code and &#x60;personal_details&#x60; as path parameters. |  [optional] |
|**pricingPlanDetails** | [**PricingPlanDetails**](PricingPlanDetails.md) |  |  [optional] |



