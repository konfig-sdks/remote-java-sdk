

# TimeoffBalance


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contractualEntitled** | **Integer** | Number of time off days for the employment, based on their contract.  The value of this field is &#x60;0&#x60; if the employment&#39;s contract does not include that information.  |  [optional] |
|**contractualLeaveEntitlementType** | **String** | Leave entitlement type for the employment, based on their contract.  The value of this field is &#x60;fixed&#x60; when the employment has a fixed limit of time off days to be taken, and &#x60;unlimited&#x60; otherwise.  |  |
|**taken** | **Object** |  |  |
|**timeoffEntitlements** | [**List&lt;TimeoffEntitlement&gt;**](TimeoffEntitlement.md) | A list of individual time off entitlements for the employment. This list gives more granular details for the type of time off that&#39;s available to the employment.  |  |
|**totalEntitledDays** | **Integer** | Number of time off days for the employment, based on their contract and any additional time off that&#39;s granted to them.  This is the sum of all &#x60;entitled&#x60; fields in the &#x60;leave_entitlements&#x60; array, but does not take the hours into account.  |  [optional] |
|**upcomingApproved** | **Object** |  |  |
|**upcomingRequested** | **Object** |  |  |
|**workingHoursPerDay** | **Integer** |  |  |



