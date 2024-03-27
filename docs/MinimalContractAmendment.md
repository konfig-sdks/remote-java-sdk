

# MinimalContractAmendment

Minimal Contract Amendment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employmentId** | **String** |  |  |
|**id** | **String** |  |  |
|**jobTitle** | **String** |  |  [optional] |
|**reasonForChange** | [**ReasonForChangeEnum**](#ReasonForChangeEnum) |  |  |
|**requestedBy** | **String** |  |  |
|**requestedEffectiveDate** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**submittedAt** | **String** |  |  |



## Enum: ReasonForChangeEnum

| Name | Value |
|---- | -----|
| ANNUAL_PAY_ADJUSTMENT | &quot;annual_pay_adjustment&quot; |
| COUNTRY_RULE_CHANGE | &quot;country_rule_change&quot; |
| ERROR_CORRECTION | &quot;error_correction&quot; |
| JOB_CHANGE_REEVALUATION | &quot;job_change_reevaluation&quot; |
| PROMOTION | &quot;promotion&quot; |
| OTHER | &quot;other&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUBMITTED | &quot;submitted&quot; |
| IN_REVIEW | &quot;in_review&quot; |
| DONE | &quot;done&quot; |
| CANCELED | &quot;canceled&quot; |
| DELETED | &quot;deleted&quot; |



