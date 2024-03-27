

# ResignationOffboarding


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**additionalComments** | **String** |  |  [optional] |
|**employerAwareness** | **String** |  |  [optional] |
|**employmentId** | **String** |  |  |
|**id** | **String** |  |  |
|**proposedLastWorkingDay** | **LocalDate** |  |  |
|**reasonDescription** | **String** |  |  [optional] |
|**requestedBy** | **String** |  |  |
|**resignationReason** | [**ResignationReasonEnum**](#ResignationReasonEnum) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**submittedAt** | **String** |  |  |
|**terminationDate** | **LocalDate** | Most updated termination date for the offboarding. This date is subject to change through the offboarding process even after it is finalized. |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |



## Enum: ResignationReasonEnum

| Name | Value |
|---- | -----|
| CANCELLATION_BEFORE_START_DATE | &quot;cancellation_before_start_date&quot; |
| COMPANY_CULTURE_OR_VALUES | &quot;company_culture_or_values&quot; |
| CONVERSION_TO_CONTRACTOR | &quot;conversion_to_contractor&quot; |
| DISSATISFACTION_WITH_REMOTE_SERVICE | &quot;dissatisfaction_with_remote_service&quot; |
| INCAPACITY_TO_PERFORM_INHERENT_DUTIES | &quot;incapacity_to_perform_inherent_duties&quot; |
| INFRASTRUCTURE_CHALLENGES | &quot;infrastructure_challenges&quot; |
| LACK_OF_RECOGNITION | &quot;lack_of_recognition&quot; |
| LEADERSHIP | &quot;leadership&quot; |
| MUTUAL_AGREEMENT | &quot;mutual_agreement&quot; |
| OTHER | &quot;other&quot; |
| OTHER_JOB_OPPORTUNITY | &quot;other_job_opportunity&quot; |
| PERSONAL_REASONS | &quot;personal_reasons&quot; |
| POSITION_DOES_NOT_MEET_EXPECTATIONS | &quot;position_does_not_meet_expectations&quot; |
| RELATIONSHIP_WITH_COWORKERS | &quot;relationship_with_coworkers&quot; |
| RELOCATION_FROM_ENTITY_TO_ENTITY_BY_EMPLOYEE | &quot;relocation_from_entity_to_entity_by_employee&quot; |
| RELOCATION_LEAVING_REMOTE | &quot;relocation_leaving_remote&quot; |
| REMUNERATION_AND_BENEFITS | &quot;remuneration_and_benefits&quot; |
| RETIREMENT | &quot;retirement&quot; |
| TRANSFER_AND_RELOCATION_NEW_CUSTOMER_AND_NEW_COUNTRY | &quot;transfer_and_relocation_new_customer_and_new_country&quot; |
| TRANSFER_BETWEEN_REMOTE_CUSTOMER | &quot;transfer_between_remote_customer&quot; |
| TRANSFER_FROM_REMOTE_TO_CUSTOMER | &quot;transfer_from_remote_to_customer&quot; |
| TRANSFER_FROM_REMOTE_TO_OTHER_EOR | &quot;transfer_from_remote_to_other_eor&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUBMITTED | &quot;submitted&quot; |
| IN_REVIEW | &quot;in_review&quot; |
| DONE | &quot;done&quot; |
| CANCELED | &quot;canceled&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| RESIGNATION | &quot;resignation&quot; |



