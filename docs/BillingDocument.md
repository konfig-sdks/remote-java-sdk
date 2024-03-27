

# BillingDocument

Information of a billing document

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**billingDocumentCurrency** | **String** |  |  |
|**billingDocumentPeriod** | **String** |  |  |
|**billingDocumentType** | [**BillingDocumentTypeEnum**](#BillingDocumentTypeEnum) |  |  |
|**companyId** | **String** |  |  |
|**id** | **String** |  |  |
|**issuedDate** | **String** |  |  |
|**items** | [**List&lt;BillingDocumentAmountItem&gt;**](BillingDocumentAmountItem.md) |  |  |
|**total** | **Integer** |  |  |



## Enum: BillingDocumentTypeEnum

| Name | Value |
|---- | -----|
| RECONCILIATION_INVOICE | &quot;reconciliation_invoice&quot; |
| PREFUNDING_INVOICE | &quot;prefunding_invoice&quot; |
| SUPPLEMENTAL_SERVICE_INVOICE | &quot;supplemental_service_invoice&quot; |
| RECONCILIATION_CREDIT_NOTE | &quot;reconciliation_credit_note&quot; |



