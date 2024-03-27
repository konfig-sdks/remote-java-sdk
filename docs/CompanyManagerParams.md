

# CompanyManagerParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**companyId** | **String** | The Company ID. Required if the access token can access multiple companies. Optional otherwise. |  [optional] |
|**email** | **String** | The work email of the company manager |  |
|**name** | **String** | The name of the company manager |  |
|**role** | **String** | The role assigned for the new manager. The value should be one of the following:  - &#x60;admin&#x60;: an Admin can manage most of the resources in remote. - &#x60;onboarding_manager&#x60;: an Onboarding Manager can add, see and manage new hires. - &#x60;people_manager&#x60;: a People Manager can view employee profiles of the team members they manage and approve and decline time off and expenses for their employees.  |  |



