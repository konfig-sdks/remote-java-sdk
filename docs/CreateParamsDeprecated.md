

# CreateParamsDeprecated

Providing the params in the root level of the request is now deprecated and will be removed in the future. Please, use the \"CreateParams\" instead. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**companyId** | **String** | This optional field is deprecated. |  [optional] |
|**countryCode** | **String** |  |  [optional] |
|**fullName** | **String** |  |  [optional] |
|**jobTitle** | **String** |  |  [optional] |
|**personalEmail** | **String** |  |  [optional] |
|**provisionalStartDate** | **LocalDate** | Indicates the expected start date of the employee or contractor.  Required for employees, but optional for contractors. Date format is in ISO8601 without the time component.  See the **Date and Time Format** documentation for more details on how the Remote API works with dates.  |  [optional] |
|**seniorityDate** | **OffsetDateTime** | The date the employee first started working for your company. If you don’t include a seniority date, the employee’s start date with Remote will be deemed as the start of the employee’s seniority.  **Example**: Your employee started working for your company on Feb 1, 2022. On Aug 1, 2022, you transferred the employee to Remote and started managing them on the platform. Feb 1, 2022 would be their seniority date. Aug 1, 2022 would be their starting date.  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | If not provided, it will default to &#x60;employee&#x60;. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EMPLOYEE | &quot;employee&quot; |
| CONTRACTOR | &quot;contractor&quot; |



