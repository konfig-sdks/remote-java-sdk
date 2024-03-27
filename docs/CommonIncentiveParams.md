

# CommonIncentiveParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Integer** | The amount (in the currency of the employment) to be given to the employee.  This field accepts fractional amounts as well. However to avoid precision issues and errors that can arise from storing fractional amounts, the Remote API only accepts currencies and their fractional amounts as integers. This means you should append fractional amounts to the end of the amount you&#39;re passing in with this field.  For example, if the incentive you&#39;re offering is EUR 500.25, you would specify &#x60;50025&#x60; as the amount for this field.  |  [optional] |
|**amountTaxType** | **AmountTaxType** |  |  [optional] |
|**effectiveDate** | **LocalDate** | The date at which the incentive should take effect.  Note that the incentive is not paid out on the effective date, but during the next payroll cycle. The effective date determines which payroll cycle the incentive will be paid out in.  The effective date needs to be today or a future date.  Note for recurring incentives: since the months don&#39;t have the same amount of days, if day of month of &#x60;effective_date&#x60; is one of [28, 29, 30, 31] it will be transformed to the last day of each month, avoiding the possibility of skipping a month in the recurrence.  |  [optional] |
|**note** | **String** |  |  [optional] |



