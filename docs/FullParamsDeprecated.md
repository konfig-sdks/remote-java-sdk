

# FullParamsDeprecated

Providing the params in the root level of the request is now deprecated and will be removed in the future. Please, use the \"FullParams\" instead. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addressDetails** | **Object** | Home address information. As its properties may vary depending on the country,                you must query the [Show form schema](https://gateway.remote.com/v1/docs/openapi.html) endpoint             passing the country code and &#x60;address_details&#x60; as path parameters. |  [optional] |
|**administrativeDetails** | **Object** | Administrative information. As its properties may vary depending on the country,                you must query the [Show form schema](https://gateway.remote.com/v1/docs/openapi.html) endpoint             passing the country code and &#x60;administrative_details&#x60; as path parameters. |  [optional] |
|**bankAccountDetails** | **Object** | Bank account information. As its properties may vary depending on the country,                you must query the [Show form schema](https://gateway.remote.com/v1/docs/openapi.html) endpoint             passing the country code and &#x60;bank_account_details&#x60; as path parameters. |  [optional] |
|**billingAddressDetails** | **Object** | Billing address information. As its properties may vary depending on the country,                you must query the [Show form schema](https://gateway.remote.com/v1/docs/openapi.html) endpoint             passing the country code and &#x60;billing_address_details&#x60; as path parameters. |  [optional] |
|**companyId** | **String** |  |  [optional] |
|**contractDetails** | **Object** | Contract information. As its properties may vary depending on the country,                you must query the [Show form schema](https://gateway.remote.com/v1/docs/openapi.html) endpoint             passing the country code and &#x60;contract_details&#x60; as path parameters. |  [optional] |
|**country** | [**Country**](Country.md) |  |  [optional] |
|**emergencyContactDetails** | **Object** | Emergency contact information. As its properties may vary depending on the country,                you must query the [Show form schema](https://gateway.remote.com/v1/docs/openapi.html) endpoint             passing the country code and &#x60;emergency_contact_details&#x60; as path parameters. |  [optional] |
|**fullName** | **String** |  |  [optional] |
|**jobTitle** | **String** |  |  [optional] |
|**managerId** | **String** | The user id of the manager, who should have an &#x60;admin&#x60;, &#x60;owner&#x60; or &#x60;people_manager&#x60; role. You can find these users by querying the [Company Managers endpoint](https://gateway.remote.com/v1/docs/openapi.html). **Update of this field is only available for active employments.**  |  [optional] |
|**personalDetails** | **Object** | Personal details information. As its properties may vary depending on the country,                you must query the [Show form schema](https://gateway.remote.com/v1/docs/openapi.html) endpoint             passing the country code and &#x60;personal_details&#x60; as path parameters. |  [optional] |
|**personalEmail** | **String** |  |  [optional] |
|**pricingPlanDetails** | [**PricingPlanDetails**](PricingPlanDetails.md) |  |  [optional] |
|**provisionalStartDate** | **LocalDate** | Indicates the expected start date of the employee or contractor.  Required for employees, but optional for contractors. Date format is in ISO8601 without the time component.  See the **Date and Time Format** documentation for more details on how the Remote API works with dates.  |  [optional] |
|**seniorityDate** | **OffsetDateTime** | The date the employee first started working for your company. If you don’t include a seniority date, the employee’s start date with Remote will be deemed as the start of the employee’s seniority.  **Example**: Your employee started working for your company on Feb 1, 2022. On Aug 1, 2022, you transferred the employee to Remote and started managing them on the platform. Feb 1, 2022 would be their seniority date. Aug 1, 2022 would be their starting date.  |  [optional] |



