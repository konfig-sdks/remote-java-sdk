

# Expense

Expense

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** |  |  |
|**amount** | **Integer** |  |  |
|**category** | [**CategoryEnum**](#CategoryEnum) | Categories allowed for an expense |  [optional] |
|**convertedAmount** | **Integer** |  |  |
|**convertedCurrency** | [**CurrencyDefinition**](CurrencyDefinition.md) |  |  |
|**convertedTaxAmount** | **Integer** |  |  |
|**currency** | [**CurrencyDefinition**](CurrencyDefinition.md) |  |  |
|**employmentId** | **String** |  |  |
|**expenseDate** | **LocalDate** |  |  |
|**id** | **String** |  |  |
|**invoicePeriod** | **String** |  |  [optional] |
|**notes** | **String** |  |  [optional] |
|**reason** | **String** |  |  [optional] |
|**receipts** | [**List&lt;ModelFile&gt;**](ModelFile.md) |  |  [optional] |
|**reviewedAt** | **LocalDate** |  |  [optional] |
|**reviewer** | [**ExpenseReviewer**](ExpenseReviewer.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Expense status |  [optional] |
|**taxAmount** | **Integer** |  |  |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| EDUCATION_TRAINING | &quot;education_training&quot; |
| HOME_OFFICE | &quot;home_office&quot; |
| MEALS | &quot;meals&quot; |
| OTHER | &quot;other&quot; |
| PHONE_UTILITIES | &quot;phone_utilities&quot; |
| TECH_EQUIPMENT | &quot;tech_equipment&quot; |
| TRAVEL | &quot;travel&quot; |
| COWORKING | &quot;coworking&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;canceled&quot; |
| PENDING | &quot;pending&quot; |
| DECLINED | &quot;declined&quot; |
| APPROVED | &quot;approved&quot; |
| PROCESSING | &quot;processing&quot; |
| REIMBURSED | &quot;reimbursed&quot; |



