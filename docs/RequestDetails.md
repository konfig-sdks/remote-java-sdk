

# RequestDetails

The details of the requested changes for the contract amendment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**additionalComments** | **String** |  |  [optional] |
|**effectiveDate** | **LocalDate** |  |  [optional] |
|**reasonForChange** | [**ReasonForChangeEnum**](#ReasonForChangeEnum) |  |  [optional] |
|**reasonForChangeDescription** | **String** | This is filled when the reason_for_change is &#39;other&#39;. |  [optional] |
|**salaryDecreaseDetails** | [**SalaryDecreaseDetails**](SalaryDecreaseDetails.md) |  |  [optional] |



## Enum: ReasonForChangeEnum

| Name | Value |
|---- | -----|
| ANNUAL_PAY_ADJUSTMENT | &quot;annual_pay_adjustment&quot; |
| COUNTRY_RULE_CHANGE | &quot;country_rule_change&quot; |
| ERROR_CORRECTION | &quot;error_correction&quot; |
| JOB_CHANGE_REEVALUATION | &quot;job_change_reevaluation&quot; |
| PROMOTION | &quot;promotion&quot; |
| OTHER | &quot;other&quot; |



