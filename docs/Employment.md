

# Employment

Complete information of an employment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activeContractId** | **String** |  |  [optional] |
|**addressDetails** | **Object** | Home address information. Its properties may vary depending on the country. |  |
|**administrativeDetails** | **Object** | Administrative information. Its properties may vary depending on the country. |  |
|**bankAccountDetails** | **List&lt;List&gt;** |  |  |
|**basicInformation** | **Object** | Employment basic information. Its properties may vary depending on the country.  |  [optional] |
|**billingAddressDetails** | **Object** | Billing address information. Its properties may vary depending on the country. |  |
|**companyId** | **String** |  |  |
|**contractDetails** | **Object** | Contract information. Its properties may vary depending on the country. |  |
|**country** | [**Country**](Country.md) |  |  |
|**createdAt** | **String** |  |  |
|**department** | **String** | Name of related department, if any. Otherwise, null. |  [optional] |
|**departmentId** | **String** | Unique ID of related department, if any. Otherwise, null. |  [optional] |
|**emergencyContactDetails** | **Object** | Emergency contact information. Its properties may vary depending on the country. |  |
|**employmentLifecycleStage** | **EmploymentLifecycleStage** |  |  |
|**files** | [**List&lt;ModelFile&gt;**](ModelFile.md) |  |  |
|**fullName** | **String** |  |  |
|**id** | **String** |  |  |
|**jobTitle** | **String** |  |  |
|**manager** | **String** |  |  [optional] |
|**onboardingTasks** | [**OnboardingTasks**](OnboardingTasks.md) |  |  |
|**personalDetails** | **Object** | Personal details information. Its properties may vary depending on the country. |  |
|**personalEmail** | **String** |  |  |
|**pricingPlanDetails** | [**PricingPlanDetails**](PricingPlanDetails.md) |  |  |
|**probationPeriodEndDate** | **LocalDate** |  |  [optional] |
|**provisionalStartDate** | **LocalDate** | Indicates the expected start date of the employee or contractor.  Required for employees, but optional for contractors. Date format is in ISO8601 without the time component.  See the **Date and Time Format** documentation for more details on how the Remote API works with dates.  |  [optional] |
|**seniorityDate** | **OffsetDateTime** | The date the employee first started working for your company. If you don’t include a seniority date, the employee’s start date with Remote will be deemed as the start of the employee’s seniority.  **Example**: Your employee started working for your company on Feb 1, 2022. On Aug 1, 2022, you transferred the employee to Remote and started managing them on the platform. Feb 1, 2022 would be their seniority date. Aug 1, 2022 would be their starting date.  |  [optional] |
|**status** | **EmploymentStatus** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) | For the employment types &#x60;contractor&#x60;, &#x60;global_payroll_employee&#x60; and &#x60;direct_employee&#x60;, only [List employments](https://gateway.remote.com/v1/docs/openapi.html) and [Show employment](https://gateway.remote.com/v1/docs/openapi.html) operations are available.  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**userStatus** | **UserStatus** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EMPLOYEE | &quot;employee&quot; |
| CONTRACTOR | &quot;contractor&quot; |
| DIRECT_EMPLOYEE | &quot;direct_employee&quot; |
| GLOBAL_PAYROLL_EMPLOYEE | &quot;global_payroll_employee&quot; |



