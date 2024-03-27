

# UpdateCompanyParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addressDetails** | **Object** | Fields can vary depending on the country. Please, check the required fields structure using the [Show form schema endpoint](https://gateway.remote.com/v1/docs/openapi.html). Use the desired country and &#x60;address_details&#x60; as the form name for the placeholders. The response complies with the [JSON Schema](https://remote.com/resources/api/how-json-schemas-work) specification.  |  [optional] |
|**bankAccountDetails** | **Object** | Fields can vary depending on the country. Please, check the required fields structure using the [Show form schema endpoint](https://gateway.remote.com/v1/docs/openapi.html). Use the desired country and &#x60;bank_account_details&#x60; as the form name for the placeholders. The response complies with the [JSON Schema](https://remote.com/resources/api/how-json-schemas-work) specification.  |  [optional] |
|**countryCode** | **String** | Country of company address |  [optional] |
|**desiredCurrency** | [**DesiredCurrencyEnum**](#DesiredCurrencyEnum) | Desired currency for invoicing and displaying converted salaries in Remote UI regardless of the employee&#39;s country.  This field is only accepted if company is in status &#x60;pending&#x60;. Please contact Remote if you wish to update it.  |  [optional] |
|**name** | **String** | This field is only accepted if company is in status &#x60;pending&#x60;. Please contact Remote if you wish to update it.  |  [optional] |
|**phoneNumber** | **String** | A phone number the company can be contacted with. |  [optional] |
|**registrationNumber** | **String** | The company registration number. This field or tax_number (but not both) should be submitted.  This field is only accepted if company is in status &#x60;pending&#x60;.  |  [optional] |
|**taxNumber** | **String** |   The tax identifier of the company. This field or registration_number (but not both) should be submitted.    This field is only accepted if company is in status &#x60;pending&#x60;.  |  [optional] |



## Enum: DesiredCurrencyEnum

| Name | Value |
|---- | -----|
| AUD | &quot;AUD&quot; |
| CAD | &quot;CAD&quot; |
| CHF | &quot;CHF&quot; |
| DKK | &quot;DKK&quot; |
| EUR | &quot;EUR&quot; |
| GBP | &quot;GBP&quot; |
| JPY | &quot;JPY&quot; |
| NOK | &quot;NOK&quot; |
| NZD | &quot;NZD&quot; |
| SEK | &quot;SEK&quot; |
| SGD | &quot;SGD&quot; |
| USD | &quot;USD&quot; |



