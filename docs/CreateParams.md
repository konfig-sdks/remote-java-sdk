

# CreateParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**basicInformation** | **Object** | Employment basic information. When using this field, the same other root level fields (name, personal_email, job_title, provisional_start_date, and seniority_date) will be ignored. Its properties may vary depending on the country, you must query the [Show form schema](https://gateway.remote.com/v1/docs/openapi.html) endpoint passing the country code and &#x60;employment_basic_information&#x60; as path parameters.  |  [optional] |
|**companyId** | **String** | This optional field is deprecated. |  [optional] |
|**countryCode** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | If not provided, it will default to &#x60;employee&#x60;. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EMPLOYEE | &quot;employee&quot; |
| CONTRACTOR | &quot;contractor&quot; |



