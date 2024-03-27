/*
 * Remote API
 * Talent is everywhere. Opportunity is not. Remote's mission is to create opportunity everywhere, empowering employers to find and hire the best talent, and enabling individuals to build financial and personal freedom.   Remote is a Global HR Platform that helps companies hire, manage, and pay their entire team — and more effectively compete in the modern global economy through our comprehensive set of core solutions including, HRIS, payroll, international employment, contractor management, and more.   Whether you're just starting your global journey, or looking to optimize your existing operations, sign up or book a demo - and see how Remote makes global HR simple.
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.CompanyManagerData;
import com.konfigthis.client.model.CompanyManagerParams;
import com.konfigthis.client.model.CompanyManagerResponse;
import com.konfigthis.client.model.CompanyManagersResponse;
import com.konfigthis.client.model.SuccessResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CompanyManagersApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CompanyManagersApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public CompanyManagersApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call createInviteCall(CompanyManagerParams companyManagerParams, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = companyManagerParams;

        // create path and map variables
        String localVarPath = "/v1/company-managers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2", "OAuth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createInviteValidateBeforeCall(CompanyManagerParams companyManagerParams, final ApiCallback _callback) throws ApiException {
        return createInviteCall(companyManagerParams, _callback);

    }


    private ApiResponse<CompanyManagerData> createInviteWithHttpInfo(CompanyManagerParams companyManagerParams) throws ApiException {
        okhttp3.Call localVarCall = createInviteValidateBeforeCall(companyManagerParams, null);
        Type localVarReturnType = new TypeToken<CompanyManagerData>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createInviteAsync(CompanyManagerParams companyManagerParams, final ApiCallback<CompanyManagerData> _callback) throws ApiException {

        okhttp3.Call localVarCall = createInviteValidateBeforeCall(companyManagerParams, _callback);
        Type localVarReturnType = new TypeToken<CompanyManagerData>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateInviteRequestBuilder {
        private final String email;
        private final String name;
        private final String role;
        private String companyId;

        private CreateInviteRequestBuilder(String email, String name, String role) {
            this.email = email;
            this.name = name;
            this.role = role;
        }

        /**
         * Set companyId
         * @param companyId The Company ID. Required if the access token can access multiple companies. Optional otherwise. (optional)
         * @return CreateInviteRequestBuilder
         */
        public CreateInviteRequestBuilder companyId(String companyId) {
            this.companyId = companyId;
            return this;
        }
        
        /**
         * Build call for createInvite
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            CompanyManagerParams companyManagerParams = buildBodyParams();
            return createInviteCall(companyManagerParams, _callback);
        }

        private CompanyManagerParams buildBodyParams() {
            CompanyManagerParams companyManagerParams = new CompanyManagerParams();
            companyManagerParams.companyId(this.companyId);
            companyManagerParams.email(this.email);
            companyManagerParams.name(this.name);
            companyManagerParams.role(this.role);
            return companyManagerParams;
        }

        /**
         * Execute createInvite request
         * @return CompanyManagerData
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public CompanyManagerData execute() throws ApiException {
            CompanyManagerParams companyManagerParams = buildBodyParams();
            ApiResponse<CompanyManagerData> localVarResp = createInviteWithHttpInfo(companyManagerParams);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createInvite request with HTTP info returned
         * @return ApiResponse&lt;CompanyManagerData&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CompanyManagerData> executeWithHttpInfo() throws ApiException {
            CompanyManagerParams companyManagerParams = buildBodyParams();
            return createInviteWithHttpInfo(companyManagerParams);
        }

        /**
         * Execute createInvite request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<CompanyManagerData> _callback) throws ApiException {
            CompanyManagerParams companyManagerParams = buildBodyParams();
            return createInviteAsync(companyManagerParams, _callback);
        }
    }

    /**
     * Create and invite a Company Manager
     * Create a Company Manager and sends the invitation email for signing in to the Remote Platform.
     * @return CreateInviteRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CreateInviteRequestBuilder createInvite(String email, String name, String role) throws IllegalArgumentException {
        if (email == null) throw new IllegalArgumentException("\"email\" is required but got null");
            

        if (name == null) throw new IllegalArgumentException("\"name\" is required but got null");
            

        if (role == null) throw new IllegalArgumentException("\"role\" is required but got null");
            

        return new CreateInviteRequestBuilder(email, name, role);
    }
    private okhttp3.Call deleteUserCall(String userId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/company-managers/{user_id}"
            .replace("{" + "user_id" + "}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2", "OAuth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteUserValidateBeforeCall(String userId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling deleteUser(Async)");
        }

        return deleteUserCall(userId, _callback);

    }


    private ApiResponse<SuccessResponse> deleteUserWithHttpInfo(String userId) throws ApiException {
        okhttp3.Call localVarCall = deleteUserValidateBeforeCall(userId, null);
        Type localVarReturnType = new TypeToken<SuccessResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteUserAsync(String userId, final ApiCallback<SuccessResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteUserValidateBeforeCall(userId, _callback);
        Type localVarReturnType = new TypeToken<SuccessResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class DeleteUserRequestBuilder {
        private final String userId;

        private DeleteUserRequestBuilder(String userId) {
            this.userId = userId;
        }

        /**
         * Build call for deleteUser
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteUserCall(userId, _callback);
        }


        /**
         * Execute deleteUser request
         * @return SuccessResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public SuccessResponse execute() throws ApiException {
            ApiResponse<SuccessResponse> localVarResp = deleteUserWithHttpInfo(userId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute deleteUser request with HTTP info returned
         * @return ApiResponse&lt;SuccessResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<SuccessResponse> executeWithHttpInfo() throws ApiException {
            return deleteUserWithHttpInfo(userId);
        }

        /**
         * Execute deleteUser request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<SuccessResponse> _callback) throws ApiException {
            return deleteUserAsync(userId, _callback);
        }
    }

    /**
     * Deletes a Company Manager user
     * Deletes a Company Manager user
     * @param userId User ID (required)
     * @return DeleteUserRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public DeleteUserRequestBuilder deleteUser(String userId) throws IllegalArgumentException {
        if (userId == null) throw new IllegalArgumentException("\"userId\" is required but got null");
            

        return new DeleteUserRequestBuilder(userId);
    }
    private okhttp3.Call listManagersCall(String companyId, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/company-managers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (companyId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("company_id", companyId));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2", "OAuth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listManagersValidateBeforeCall(String companyId, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        return listManagersCall(companyId, page, pageSize, _callback);

    }


    private ApiResponse<CompanyManagersResponse> listManagersWithHttpInfo(String companyId, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = listManagersValidateBeforeCall(companyId, page, pageSize, null);
        Type localVarReturnType = new TypeToken<CompanyManagersResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listManagersAsync(String companyId, Integer page, Integer pageSize, final ApiCallback<CompanyManagersResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listManagersValidateBeforeCall(companyId, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<CompanyManagersResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListManagersRequestBuilder {
        private String companyId;
        private Integer page;
        private Integer pageSize;

        private ListManagersRequestBuilder() {
        }

        /**
         * Set companyId
         * @param companyId A Company ID to filter the results (only applicable for Integration Partners). (optional)
         * @return ListManagersRequestBuilder
         */
        public ListManagersRequestBuilder companyId(String companyId) {
            this.companyId = companyId;
            return this;
        }
        
        /**
         * Set page
         * @param page Starts fetching records after the given page (optional)
         * @return ListManagersRequestBuilder
         */
        public ListManagersRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set pageSize
         * @param pageSize Change the amount of records returned per page, defaults to 20, limited to 100 (optional)
         * @return ListManagersRequestBuilder
         */
        public ListManagersRequestBuilder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        
        /**
         * Build call for listManagers
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listManagersCall(companyId, page, pageSize, _callback);
        }


        /**
         * Execute listManagers request
         * @return CompanyManagersResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public CompanyManagersResponse execute() throws ApiException {
            ApiResponse<CompanyManagersResponse> localVarResp = listManagersWithHttpInfo(companyId, page, pageSize);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listManagers request with HTTP info returned
         * @return ApiResponse&lt;CompanyManagersResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CompanyManagersResponse> executeWithHttpInfo() throws ApiException {
            return listManagersWithHttpInfo(companyId, page, pageSize);
        }

        /**
         * Execute listManagers request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<CompanyManagersResponse> _callback) throws ApiException {
            return listManagersAsync(companyId, page, pageSize, _callback);
        }
    }

    /**
     * List Company Managers
     * List all company managers of an integration. If filtered by the company_id param, it lists only company managers belonging to the specified company. 
     * @return ListManagersRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ListManagersRequestBuilder listManagers() throws IllegalArgumentException {
        return new ListManagersRequestBuilder();
    }
    private okhttp3.Call showUserCall(String userId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/company-managers/{user_id}"
            .replace("{" + "user_id" + "}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2", "OAuth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call showUserValidateBeforeCall(String userId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling showUser(Async)");
        }

        return showUserCall(userId, _callback);

    }


    private ApiResponse<CompanyManagerResponse> showUserWithHttpInfo(String userId) throws ApiException {
        okhttp3.Call localVarCall = showUserValidateBeforeCall(userId, null);
        Type localVarReturnType = new TypeToken<CompanyManagerResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call showUserAsync(String userId, final ApiCallback<CompanyManagerResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = showUserValidateBeforeCall(userId, _callback);
        Type localVarReturnType = new TypeToken<CompanyManagerResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ShowUserRequestBuilder {
        private final String userId;

        private ShowUserRequestBuilder(String userId) {
            this.userId = userId;
        }

        /**
         * Build call for showUser
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return showUserCall(userId, _callback);
        }


        /**
         * Execute showUser request
         * @return CompanyManagerResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public CompanyManagerResponse execute() throws ApiException {
            ApiResponse<CompanyManagerResponse> localVarResp = showUserWithHttpInfo(userId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute showUser request with HTTP info returned
         * @return ApiResponse&lt;CompanyManagerResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CompanyManagerResponse> executeWithHttpInfo() throws ApiException {
            return showUserWithHttpInfo(userId);
        }

        /**
         * Execute showUser request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<CompanyManagerResponse> _callback) throws ApiException {
            return showUserAsync(userId, _callback);
        }
    }

    /**
     * Show company manager user
     * Shows a single company manager user
     * @param userId User ID (required)
     * @return ShowUserRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ShowUserRequestBuilder showUser(String userId) throws IllegalArgumentException {
        if (userId == null) throw new IllegalArgumentException("\"userId\" is required but got null");
            

        return new ShowUserRequestBuilder(userId);
    }
}
