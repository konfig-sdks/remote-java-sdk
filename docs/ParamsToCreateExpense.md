

# ParamsToCreateExpense

  All the params needed to create an expense.    An expense can be created using the `receipt` or `receipts` fields; however, these fields are not allowed together within the same object.\" 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** |  |  |
|**amount** | **Integer** |  |  |
|**category** | [**CategoryEnum**](#CategoryEnum) | Categories allowed for an expense |  [optional] |
|**currency** | **String** |   The three-letter code for the expense currency.&lt;br/&gt;   Examples: &#x60;\&quot;USD\&quot;&#x60;, &#x60;\&quot;EUR\&quot;&#x60;, &#x60;\&quot;CAD\&quot;&#x60;  |  |
|**employmentId** | **String** | The ID for the employment to which this expense relates. |  |
|**expenseDate** | **String** | Date of the purchase, which must be in the past |  |
|**receipt** | [**Base64File**](Base64File.md) |  |  [optional] |
|**receipts** | [**List&lt;Base64File&gt;**](Base64File.md) |  |  [optional] |
|**reviewedAt** | **LocalDate** | The date and time that the expense was reviewed in ISO8601 format. If not provided, it defaults to the current datetime. |  [optional] |
|**reviewerId** | **String** | If the person reviewing the expense is a user in Remote, you can provide its user id for this field. If a value is not provided, defaults to the user that generated the API token. |  [optional] |
|**taxAmount** | **Integer** |  |  [optional] |
|**timezone** | **String** | [TZ identifier](https://www.iana.org/time-zones) |  [optional] |



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



