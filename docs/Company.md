

# Company


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addressDetails** | **Object** | Fields can vary depending on the country. Please, check the required fields structure using the [Show form schema endpoint](https://gateway.remote.com/v1/docs/openapi.html). Use the desired country and &#x60;address_details&#x60; as the form name for the placeholders. The response complies with the [JSON Schema](https://remote.com/resources/api/how-json-schemas-work) specification.  |  |
|**bankAccountDetails** | **Object** | Fields can vary depending on the country. Please, check the required fields structure using the [Show form schema endpoint](https://gateway.remote.com/v1/docs/openapi.html). Use the desired country and &#x60;bank_account_details&#x60; as the form name for the placeholders. The response complies with the [JSON Schema](https://remote.com/resources/api/how-json-schemas-work) specification.  |  [optional] |
|**companyOwnerEmail** | **String** |  |  |
|**companyOwnerName** | **String** |  |  [optional] |
|**countryCode** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**desiredCurrency** | **String** |  |  |
|**externalId** | **String** |  |  [optional] |
|**id** | **String** |  |  |
|**name** | **String** |  |  |
|**phoneNumber** | **String** |  |  [optional] |
|**registrationNumber** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The company status determines what a company is allowed to do: - &#x60;pending&#x60;: The company has been created and the company owner invited. Remote is waiting for the company owner to complete onboarding. - &#x60;review&#x60;: The company is under review. In rare occasions, a company may not automatically get created in &#x60;active&#x60; status because Remote needs to   manually review the company that was created. The company will become &#x60;active&#x60; once the review is completed and no further action is necessary   through the Remote API. - &#x60;active&#x60;: The company owner has completed onboarding and the company is ready to employ. - &#x60;archived&#x60;: The company is no longer active on the Remote platform and no changes can be made to the company.  |  |
|**taxNumber** | **String** |  |  [optional] |
|**termsOfServiceAcceptedAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| REVIEW | &quot;review&quot; |
| ACTIVE | &quot;active&quot; |
| ARCHIVED | &quot;archived&quot; |



