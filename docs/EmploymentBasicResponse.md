

# EmploymentBasicResponse

Complete information of an employment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**basicInformation** | **Object** | Employment basic information. As its properties may vary depending on the country,                you must query the [Show form schema](https://gateway.remote.com/v1/docs/openapi.html) endpoint             passing the country code and &#x60;basic_information&#x60; as path parameters. |  [optional] |
|**companyId** | **String** |  |  [optional] |
|**countryCode** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**employmentLifecycleStage** | **EmploymentLifecycleStage** |  |  [optional] |
|**fullName** | **String** |  |  [optional] |
|**id** | **String** | Unique ID of related department, if any. Otherwise, null. |  [optional] |
|**jobTitle** | **String** |  |  [optional] |
|**personalEmail** | **String** |  |  [optional] |
|**provisionalStartDate** | **LocalDate** | Required for employees, optional for contractors |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EMPLOYEE | &quot;employee&quot; |
| CONTRACTOR | &quot;contractor&quot; |



