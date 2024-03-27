

# Timeoff


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approvedAt** | **OffsetDateTime** |  |  [optional] |
|**approverId** | **String** | The field matches the &#x60;id&#x60; of a user in the Remote Platform that has permission to approve time off requests. [Available users][] can be found fetching the [List Company Manager][] endpoint.  [Available users]: https://support.remote.com/hc/en-us/articles/360054668651-Approving-Declining-time-off-requests#h_01G0014GZKZ3EMN6P7C99HAK55 [List Company Manager]: https://gateway.remote.com/v1/docs/openapi.html#tag/Company-Managers  |  [optional] |
|**cancelReason** | **String** |  |  [optional] |
|**cancelledAt** | **String** | Optional UTC date time in YYYY-MM-DDTHH:mm:ss format |  [optional] |
|**document** | [**ModelFile**](ModelFile.md) |  |  [optional] |
|**employmentId** | **String** |  |  |
|**endDate** | **LocalDate** |  |  |
|**id** | **String** |  |  |
|**notes** | **String** |  |  [optional] |
|**startDate** | **LocalDate** |  |  |
|**status** | **String** |  |  |
|**timeoffDays** | [**List&lt;TimeoffDay&gt;**](TimeoffDay.md) |  |  |
|**timeoffType** | **TimeoffType** |  |  |
|**timezone** | **String** | [TZ identifier](https://www.iana.org/time-zones) |  |



