

# TerminationDetailsParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**additionalComments** | **String** | Additional details regarding the termination process. |  [optional] |
|**confidential** | **Boolean** | Confidential requests are visible for who authorized the token or integration. Non-confidential requests are visible to all admins in the company. |  |
|**employeeAwareness** | [**TerminationDetailsParamsEmployeeAwareness**](TerminationDetailsParamsEmployeeAwareness.md) |  |  [optional] |
|**personalEmail** | **String** | Remote will use this email address for post-termination communication. If it is not provided, this field will be derived from the employment record. Therefore, it is important to ensure that it is not a company email.  |  [optional] |
|**proposedTerminationDate** | **LocalDate** | In most cases, employee needs to be notified before termination. The required notice period depends on local labor laws, the employment agreement, and other factors. Remote will use those factors to determine the required notice period. Please note that we cannot commit to a termination date until we conduct a full review of the information you submit. |  |
|**reasonDescription** | **String** | Description of the reason for termination |  |
|**riskAssessmentReasons** | [**List&lt;RiskAssessmentReasonsEnum&gt;**](#List&lt;RiskAssessmentReasonsEnum&gt;) | Possible reasons for offboarding risk assessment |  |
|**terminationReason** | [**TerminationReasonEnum**](#TerminationReasonEnum) | Choose an accurate termination reason to avoid unfair or unlawful dismissal claims.  If the termination is created before the employee&#39;s start date, this field will be set to &#x60;cancellation_before_start_date&#x60;.  |  |
|**terminationReasonFiles** | [**List&lt;OffboardingFile&gt;**](OffboardingFile.md) | Any supporting documents regarding the termination reason |  [optional] |
|**timesheetFile** | [**OffboardingFile**](OffboardingFile.md) | Paid time off accuracy  Typically, any vacation pay accrued and unpaid at the time of termination must be paid out to the employee. To avoid overpaying or underpaying, please make sure we have an accurate account of their paid time off by querying the [Show Time Off Balance](https://gateway.remote.com/v1/docs/openapi.html) endpoint, filtering by the &#x60;employment_id&#x60;. This optional document should be sent in case of any discrepancies.  |  [optional] |
|**willChallengeTermination** | **Boolean** | Whether is it likely or not that the employee will challenge their termination |  |
|**willChallengeTerminationDescription** | **String** | If it is likely that the employee will challenge their termination, please provide additional details explaining the risk |  [optional] |



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



