

# MinimalEmployment

Minimal information of an employment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**country** | [**Country**](Country.md) |  |  |
|**department** | **String** | Name of related department, if any. Otherwise, null. |  [optional] |
|**departmentId** | **String** | Unique ID of related department, if any. Otherwise, null. |  [optional] |
|**fullName** | **String** |  |  |
|**id** | **String** |  |  |
|**jobTitle** | **String** |  |  |
|**personalEmail** | **String** |  |  |
|**status** | **EmploymentStatus** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EMPLOYEE | &quot;employee&quot; |
| CONTRACTOR | &quot;contractor&quot; |
| DIRECT_EMPLOYEE | &quot;direct_employee&quot; |
| GLOBAL_PAYROLL_EMPLOYEE | &quot;global_payroll_employee&quot; |



