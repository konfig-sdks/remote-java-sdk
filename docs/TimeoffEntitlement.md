

# TimeoffEntitlement

Detailed breakdown of an employment's time off balance. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**canExpire** | **Boolean** | Indicates whether this entitlement can expire.  When &#x60;false&#x60;, &#x60;expiry_date&#x60; will be &#x60;nil&#x60;.  |  |
|**entitled** | **Object** |  |  |
|**expiryDate** | **LocalDate** | Indicates the date this entitlement expires and is no longer counted towards the total time off entitlement for the employment.  When this entitlement doesn&#39;t expire, &#x60;expiry_date&#x60; will be set to &#x60;nil&#x60;. Use the &#x60;can_expire&#x60; parameter to determine whether an entitlement can expire or not.  |  |
|**name** | **String** |  |  |
|**remaining** | **Object** |  |  |
|**taken** | **Object** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) | Indicates the type of the time off entitlement.  &#x60;annual_paid_timeoff&#x60; entitlements are calculated from the employment&#39;s contract. All other time off entitlements are granted by the employer or automatically by the country of employment.  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CARRYOVER_PTO | &quot;carryover_pto&quot; |
| ADDITIONAL_PTO | &quot;additional_pto&quot; |
| TRANSFER_PTO | &quot;transfer_pto&quot; |
| ANNUAL_PAID_TIMEOFF | &quot;annual_paid_timeoff&quot; |



