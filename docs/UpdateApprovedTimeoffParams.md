

# UpdateApprovedTimeoffParams

Update timeoff params

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approvedAt** | **OffsetDateTime** | UTC date time in [ISO 8601][] format.  [ISO 8601]: https://en.wikipedia.org/wiki/ISO_8601  |  [optional] |
|**approverId** | **String** | The field matches the &#x60;id&#x60; of a user in the Remote Platform that has permission to approve time off requests. [Available users][] can be found fetching the [List Company Manager][] endpoint.  [Available users]: https://support.remote.com/hc/en-us/articles/360054668651-Approving-Declining-time-off-requests#h_01G0014GZKZ3EMN6P7C99HAK55 [List Company Manager]: https://gateway.remote.com/v1/docs/openapi.html#tag/Company-Managers  |  [optional] |
|**cancelReason** | **String** | The reason for cancelling a time off. Required when updating to status &#x60;cancelled&#x60;. |  |
|**document** | [**TimeoffDocumentParams**](TimeoffDocumentParams.md) |  |  [optional] |
|**editReason** | **String** | The reason for the update. Required when updating the time off data but not changing the status. |  |
|**endDate** | **LocalDate** | UTC date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format |  [optional] |
|**notes** | **String** |  |  [optional] |
|**startDate** | **LocalDate** | UTC date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**timeoffDays** | [**List&lt;TimeoffDaysParams&gt;**](TimeoffDaysParams.md) |  |  [optional] |
|**timeoffType** | **TimeoffType** |  |  [optional] |
|**timezone** | **String** | [TZ identifier](https://www.iana.org/time-zones) |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;approved&quot; |
| CANCELLED | &quot;cancelled&quot; |



