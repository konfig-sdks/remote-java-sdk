

# TerminationOffboarding


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**additionalComments** | **String** |  |  |
|**agreesToPtoAmount** | **String** |  |  [optional] |
|**confidential** | **Boolean** |  |  |
|**employeeAwareness** | [**TerminationOffboardingEmployeeAwareness**](TerminationOffboardingEmployeeAwareness.md) |  |  [optional] |
|**employmentId** | **String** |  |  |
|**id** | **String** |  |  |
|**proposedTerminationDate** | **LocalDate** |  |  |
|**reasonDescription** | **String** |  |  |
|**requestedBy** | **String** |  |  |
|**riskAssessmentReasons** | [**List&lt;RiskAssessmentReasonsEnum&gt;**](#List&lt;RiskAssessmentReasonsEnum&gt;) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**submittedAt** | **String** |  |  |
|**terminationDate** | **LocalDate** | Most updated termination date for the offboarding. This date is subject to change through the offboarding process even after it is finalized. |  |
|**terminationReason** | [**TerminationReasonEnum**](#TerminationReasonEnum) |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**willChallengeTermination** | **Boolean** |  |  |
|**willChallengeTerminationDescription** | **String** |  |  [optional] |



## Enum: List&lt;RiskAssessmentReasonsEnum&gt;

| Name | Value |
|---- | -----|
| CARING_RESPONSIBILITIES | &quot;caring_responsibilities&quot; |
| DISABLED_OR_HEALTH_CONDITION | &quot;disabled_or_health_condition&quot; |
| FAMILY_LEAVE | &quot;family_leave&quot; |
| MEMBER_OF_UNION_OR_WORKS_COUNCIL | &quot;member_of_union_or_works_council&quot; |
| NONE_OF_THESE | &quot;none_of_these&quot; |
| PREGNANT_OR_BREASTFEEDING | &quot;pregnant_or_breastfeeding&quot; |
| REPORTED_CONCERNS_WITH_WORKPLACE | &quot;reported_concerns_with_workplace&quot; |
| REQUESTED_MEDICAL_OR_FAMILY_LEAVE | &quot;requested_medical_or_family_leave&quot; |
| SICK_LEAVE | &quot;sick_leave&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUBMITTED | &quot;submitted&quot; |
| IN_REVIEW | &quot;in_review&quot; |
| DONE | &quot;done&quot; |
| CANCELED | &quot;canceled&quot; |



## Enum: TerminationReasonEnum

| Name | Value |
|---- | -----|
| CANCELLATION_BEFORE_START_DATE | &quot;cancellation_before_start_date&quot; |
| COMPLIANCE_ISSUE | &quot;compliance_issue&quot; |
| CONVERSION_TO_CONTRACTOR | &quot;conversion_to_contractor&quot; |
| DISSATISFACTION_WITH_REMOTE_SERVICE | &quot;dissatisfaction_with_remote_service&quot; |
| END_OF_FIXED_TERM_CONTRACT_COMPLIANCE_ISSUE | &quot;end_of_fixed_term_contract_compliance_issue&quot; |
| END_OF_FIXED_TERM_CONTRACT_INCAPACITY_TO_PERFORM_INHERENT_DUTIES | &quot;end_of_fixed_term_contract_incapacity_to_perform_inherent_duties&quot; |
| END_OF_FIXED_TERM_CONTRACT_LOCAL_REGULATIONS_MAX_TERM_REACHED | &quot;end_of_fixed_term_contract_local_regulations_max_term_reached&quot; |
| END_OF_FIXED_TERM_CONTRACT_MISCONDUCT | &quot;end_of_fixed_term_contract_misconduct&quot; |
| END_OF_FIXED_TERM_CONTRACT_OPERATIONAL_REASONS | &quot;end_of_fixed_term_contract_operational_reasons&quot; |
| END_OF_FIXED_TERM_CONTRACT_OTHER | &quot;end_of_fixed_term_contract_other&quot; |
| END_OF_FIXED_TERM_CONTRACT_PERFORMANCE | &quot;end_of_fixed_term_contract_performance&quot; |
| END_OF_FIXED_TERM_CONTRACT_REDUNDANCY | &quot;end_of_fixed_term_contract_redundancy&quot; |
| END_OF_FIXED_TERM_CONTRACT_VALUES | &quot;end_of_fixed_term_contract_values&quot; |
| GROSS_MISCONDUCT | &quot;gross_misconduct&quot; |
| INCAPACITY_TO_PERFORM_INHERENT_DUTIES | &quot;incapacity_to_perform_inherent_duties&quot; |
| JOB_ABANDONMENT | &quot;job_abandonment&quot; |
| MUTUAL_AGREEMENT | &quot;mutual_agreement&quot; |
| OTHER | &quot;other&quot; |
| PERFORMANCE | &quot;performance&quot; |
| VALUES | &quot;values&quot; |
| WORKFORCE_REDUCTION | &quot;workforce_reduction&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TERMINATION | &quot;termination&quot; |



