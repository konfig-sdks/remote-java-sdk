

# ResignationAfterStartDateRequestParamsOwedOutstandingReimbursements

required if `is_owed_outstanding_reimbursements` is set to true.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Integer** | The amount (in the currency of the employment) to be given to the employee.  This field accepts fractional amounts as well. However to avoid precision issues and errors that can arise from storing fractional amounts, the Remote API only accepts currencies and their fractional amounts as integers. This means you should append fractional amounts to the end of the amount you&#39;re passing in with this field.  For example, if the amount you&#39;re offering is EUR 500.25, you would specify &#x60;50025&#x60; as the amount for this field.  |  [optional] |
|**notes** | **String** |  |  [optional] |



