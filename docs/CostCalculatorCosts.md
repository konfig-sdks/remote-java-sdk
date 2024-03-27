

# CostCalculatorCosts


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**annualBenefitsBreakdown** | [**List&lt;CostCalculatorCost&gt;**](CostCalculatorCost.md) | The list of all annual benefit costs |  [optional] |
|**annualBenefitsTotal** | **Integer** | The annual benefits total that a company must pay for this employment |  [optional] |
|**annualContributionsBreakdown** | [**List&lt;CostCalculatorCost&gt;**](CostCalculatorCost.md) | The list of all annual employer contribution costs |  [optional] |
|**annualContributionsTotal** | **Integer** | The annual contributions that a company must pay for this employment |  |
|**annualGrossSalary** | **Integer** | The annual gross salary that the employee is going to earn |  |
|**annualTotal** | **Integer** | The annual gross salary + annual contributions + annual fee (monthly fee * 12) + extra statutory payments if applicable |  |
|**currency** | [**Currency**](Currency.md) |  |  |
|**extraStatutoryPaymentsBreakdown** | [**List&lt;CostCalculatorCost&gt;**](CostCalculatorCost.md) | The list of all annual extra statutory payment costs |  [optional] |
|**extraStatutoryPaymentsTotal** | **Integer** | 13th month salary, this happens for countries such as Philippines |  |
|**monthlyBenefitsBreakdown** | [**List&lt;CostCalculatorCost&gt;**](CostCalculatorCost.md) | The list of all monthly benefit costs |  [optional] |
|**monthlyBenefitsTotal** | **Integer** | The benefits total that the company pays monthly |  [optional] |
|**monthlyContributionsBreakdown** | [**List&lt;CostCalculatorCost&gt;**](CostCalculatorCost.md) | The list of all monthly employer contribution costs |  [optional] |
|**monthlyContributionsTotal** | **Integer** | The contributions that the company pays monthly |  |
|**monthlyGrossSalary** | **Integer** | The gross monthly salary for the Employee |  |
|**monthlyTce** | **Integer** | Monthly gross salary + monthly contributions  (doesn&#39;t include fee) |  |
|**monthlyTotal** | **Integer** | Monthly gross salary + monthly contributions + monthly fee |  |



