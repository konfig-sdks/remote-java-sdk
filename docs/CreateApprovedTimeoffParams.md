

# CreateApprovedTimeoffParams

Approved timeoff creation params

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**document** | [**TimeoffDocumentParams**](TimeoffDocumentParams.md) |  |  [optional] |
|**employmentId** | **String** |  |  |
|**endDate** | **String** |  |  |
|**notes** | **String** |  |  [optional] |
|**startDate** | **String** |  |  |
|**timeoffDays** | [**List&lt;TimeoffDaysParams&gt;**](TimeoffDaysParams.md) |  |  |
|**timeoffType** | **TimeoffType** |  |  |
|**timezone** | **String** | [TZ identifier](https://www.iana.org/time-zones) |  |
|**approvedAt** | **OffsetDateTime** | UTC date time in [ISO 8601][] format.  [ISO 8601]: https://en.wikipedia.org/wiki/ISO_8601  |  |
|**approverId** | **String** | The field matches the &#x60;id&#x60; of a user in the Remote Platform that has permission to approve time off requests. [Available users][] can be found fetching the [List Company Manager][] endpoint.  [Available users]: https://support.remote.com/hc/en-us/articles/360054668651-Approving-Declining-time-off-requests#h_01G0014GZKZ3EMN6P7C99HAK55 [List Company Manager]: https://gateway.remote.com/v1/docs/openapi.html#tag/Company-Managers  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;approved&quot; |



