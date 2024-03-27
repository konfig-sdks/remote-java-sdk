

# AuthorizationCodeResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessToken** | **String** | A JWT token. |  [optional] |
|**expiresIn** | **Integer** | Number of seconds until token is expired. |  [optional] |
|**tokenType** | **String** | The type of the token. For now, always &#x60;Bearer&#x60;. |  [optional] |
|**companyId** | **String** | The ID of the connected company. |  [optional] |
|**refreshToken** | **String** | The refresh token. This token must be stored and used for issuing new access tokens for managing the company&#39;s resources. |  [optional] |
|**userId** | **String** | The ID of the user who connected the company. |  [optional] |



