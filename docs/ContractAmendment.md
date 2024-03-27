

# ContractAmendment

Contract Amendment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amendmentContractId** | **String** |  |  |
|**changes** | **Object** | Describes all the changes requested for the contract and contract details with all their previous and current values. |  |
|**employmentId** | **String** |  |  |
|**id** | **String** |  |  |
|**requestDetails** | [**RequestDetails**](RequestDetails.md) |  |  |
|**requestedBy** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**submittedAt** | **String** |  |  |
|**zendeskTicketUrl** | **String** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUBMITTED | &quot;submitted&quot; |
| IN_REVIEW | &quot;in_review&quot; |
| DONE | &quot;done&quot; |
| CANCELED | &quot;canceled&quot; |
| DELETED | &quot;deleted&quot; |



