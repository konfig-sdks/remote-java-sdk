

# DeleteRecurringIncentiveResponse

`\"status\": \"ok\"` indicates that any recurring incentives with `pending` status were successfully deleted.  `already_scheduled_incentives` returns a list of incentives that were already scheduled for payout and as such, cannot be deleted. You will notice that these incentives do not have a `pending` status. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | [**DeleteRecurringIncentiveResponseData**](DeleteRecurringIncentiveResponseData.md) |  |  |



