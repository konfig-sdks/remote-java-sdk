

# CreateCompanyParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addressDetails** | **Object** | Fields can vary depending on the country. Please, check the required fields structure using the [Show form schema endpoint](https://gateway.remote.com/v1/docs/openapi.html). Use the desired country and &#x60;address_details&#x60; as the form name for the placeholders. The response complies with the [JSON Schema](https://remote.com/resources/api/how-json-schemas-work) specification.  |  [optional] |
|**bankAccountDetails** | **Object** | Fields can vary depending on the country. Please, check the required fields structure using the [Show form schema endpoint](https://gateway.remote.com/v1/docs/openapi.html). Use the desired country and &#x60;bank_account_details&#x60; as the form name for the placeholders. The response complies with the [JSON Schema](https://remote.com/resources/api/how-json-schemas-work) specification.  |  [optional] |
|**companyOwnerEmail** | **String** | The company owner email.  This value cannot be changed once set.  |  |
|**companyOwnerName** | **String** | The company owner name.  This value cannot be changed from the Remote API once set.  |  |
|**countryCode** | **String** | 3-letter country code of the country the company address is located in.  For a list of countries supported through the Remote API, make a call to the [list countries endpoint](https://gateway.remote.com/v1/docs/openapi.html). This endpoint will also include the 3-letter country codes you can use for this field.  |  |
|**desiredCurrency** | [**DesiredCurrencyEnum**](#DesiredCurrencyEnum) | Desired currency for invoicing and displaying converted salaries in Remote UI regardless of the employee&#39;s country. |  |
|**emailDomain** | **String** | The domain of the company. Use this field to specify the company domain name when it&#39;s different from the domain in the company owner&#39;s email. |  [optional] |
|**externalId** | **String** | Id of the company as represented in the external partner system. |  [optional] |
|**name** | **String** | The company name |  |
|**phoneNumber** | **String** | A phone number the company can be contacted with. |  [optional] |
|**registrationNumber** | **String** | The company registration number. This field or &#x60;tax_number&#x60; (but not both) should be submitted. |  [optional] |
|**taxNumber** | **String** | The tax identifier of the company. This field or &#x60;registration_number&#x60; (but not both) should be submitted. |  [optional] |
|**termsOfServiceAcceptedAt** | **OffsetDateTime** | Date and time the Terms of Service were accepted. To ensure users read the most recent version of Remote&#39;s Terms of Service, their action cannot have been done more than fifteen minutes ago. The UTC offset must be included in the ISO 8601 format: &#x60;YYYY-MM-DD HOURS:MINUTES:SECONDSZ&#x60; |  |



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



