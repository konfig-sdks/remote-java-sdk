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


import com.konfigthis.client.model.EmploymentCreationResponse;
import com.konfigthis.client.model.EmploymentResponse;
import com.konfigthis.client.model.EmploymentStatus;
import com.konfigthis.client.model.EmploymentUpdateParams;
import com.konfigthis.client.model.SuccessResponse;
import com.konfigthis.client.model.WebhookTriggerParams;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class SandboxApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SandboxApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public SandboxApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call createEmploymentWithoutValidationsCall(Object body, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v1/sandbox/employments";

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
    private okhttp3.Call createEmploymentWithoutValidationsValidateBeforeCall(Object body, final ApiCallback _callback) throws ApiException {
        return createEmploymentWithoutValidationsCall(body, _callback);

    }


    private ApiResponse<EmploymentCreationResponse> createEmploymentWithoutValidationsWithHttpInfo(Object body) throws ApiException {
        okhttp3.Call localVarCall = createEmploymentWithoutValidationsValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<EmploymentCreationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createEmploymentWithoutValidationsAsync(Object body, final ApiCallback<EmploymentCreationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createEmploymentWithoutValidationsValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<EmploymentCreationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateEmploymentWithoutValidationsRequestBuilder {
        private Object body;

        private CreateEmploymentWithoutValidationsRequestBuilder() {
        }

        /**
         * Set body
         * @param body Employment params (optional)
         * @return CreateEmploymentWithoutValidationsRequestBuilder
         */
        public CreateEmploymentWithoutValidationsRequestBuilder body(Object body) {
            this.body = body;
            return this;
        }

        /**
         * Build call for createEmploymentWithoutValidations
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
            Object body = buildBodyParams();
            return createEmploymentWithoutValidationsCall(body, _callback);
        }

        private Object buildBodyParams() {
            return this.body;
        }

        /**
         * Execute createEmploymentWithoutValidations request
         * @return EmploymentCreationResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public EmploymentCreationResponse execute() throws ApiException {
            Object body = buildBodyParams();
            ApiResponse<EmploymentCreationResponse> localVarResp = createEmploymentWithoutValidationsWithHttpInfo(body);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createEmploymentWithoutValidations request with HTTP info returned
         * @return ApiResponse&lt;EmploymentCreationResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<EmploymentCreationResponse> executeWithHttpInfo() throws ApiException {
            Object body = buildBodyParams();
            return createEmploymentWithoutValidationsWithHttpInfo(body);
        }

        /**
         * Execute createEmploymentWithoutValidations request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<EmploymentCreationResponse> _callback) throws ApiException {
            Object body = buildBodyParams();
            return createEmploymentWithoutValidationsAsync(body, _callback);
        }
    }

    /**
     * Create employment
     * Creates an employment without provisional_start_date validation.  This endpoint is only available in Sandbox and allows creating employments which &#x60;provisional_start_date&#x60; is in the past. This is especially helpful for:   * Testing the Timeoff Balance endpoints   * Testing the Offboarding endpoints   * Testing features around probation periods  This endpoint will respond with a 404 outside of the Sandbox environment.  For creating an employment&#39;s parameters outside of testing purposes, use [this Employment create endpoint](https://gateway.remote.com/v1/docs/openapi.html) 
     * @return CreateEmploymentWithoutValidationsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CreateEmploymentWithoutValidationsRequestBuilder createEmploymentWithoutValidations() throws IllegalArgumentException {
        return new CreateEmploymentWithoutValidationsRequestBuilder();
    }
    private okhttp3.Call employmentUpdateCall(String employmentId, EmploymentUpdateParams employmentUpdateParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = employmentUpdateParams;

        // create path and map variables
        String localVarPath = "/v1/sandbox/employments/{employment_id}"
            .replace("{" + "employment_id" + "}", localVarApiClient.escapeString(employmentId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call employmentUpdateValidateBeforeCall(String employmentId, EmploymentUpdateParams employmentUpdateParams, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'employmentId' is set
        if (employmentId == null) {
            throw new ApiException("Missing the required parameter 'employmentId' when calling employmentUpdate(Async)");
        }

        return employmentUpdateCall(employmentId, employmentUpdateParams, _callback);

    }


    private ApiResponse<EmploymentResponse> employmentUpdateWithHttpInfo(String employmentId, EmploymentUpdateParams employmentUpdateParams) throws ApiException {
        okhttp3.Call localVarCall = employmentUpdateValidateBeforeCall(employmentId, employmentUpdateParams, null);
        Type localVarReturnType = new TypeToken<EmploymentResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call employmentUpdateAsync(String employmentId, EmploymentUpdateParams employmentUpdateParams, final ApiCallback<EmploymentResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = employmentUpdateValidateBeforeCall(employmentId, employmentUpdateParams, _callback);
        Type localVarReturnType = new TypeToken<EmploymentResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class EmploymentUpdateRequestBuilder {
        private final String employmentId;
        private EmploymentStatus status;

        private EmploymentUpdateRequestBuilder(String employmentId) {
            this.employmentId = employmentId;
        }

        /**
         * Set status
         * @param status  (optional)
         * @return EmploymentUpdateRequestBuilder
         */
        public EmploymentUpdateRequestBuilder status(EmploymentStatus status) {
            this.status = status;
            return this;
        }
        
        /**
         * Build call for employmentUpdate
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
            EmploymentUpdateParams employmentUpdateParams = buildBodyParams();
            return employmentUpdateCall(employmentId, employmentUpdateParams, _callback);
        }

        private EmploymentUpdateParams buildBodyParams() {
            EmploymentUpdateParams employmentUpdateParams = new EmploymentUpdateParams();
            employmentUpdateParams.status(this.status);
            return employmentUpdateParams;
        }

        /**
         * Execute employmentUpdate request
         * @return EmploymentResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public EmploymentResponse execute() throws ApiException {
            EmploymentUpdateParams employmentUpdateParams = buildBodyParams();
            ApiResponse<EmploymentResponse> localVarResp = employmentUpdateWithHttpInfo(employmentId, employmentUpdateParams);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute employmentUpdate request with HTTP info returned
         * @return ApiResponse&lt;EmploymentResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<EmploymentResponse> executeWithHttpInfo() throws ApiException {
            EmploymentUpdateParams employmentUpdateParams = buildBodyParams();
            return employmentUpdateWithHttpInfo(employmentId, employmentUpdateParams);
        }

        /**
         * Execute employmentUpdate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<EmploymentResponse> _callback) throws ApiException {
            EmploymentUpdateParams employmentUpdateParams = buildBodyParams();
            return employmentUpdateAsync(employmentId, employmentUpdateParams, _callback);
        }
    }

    /**
     * Update employment
     * Updates an employment. Use this endpoint to modify employment states for testing in the Sandbox environment. This endpoint will respond with a 404 outside of the Sandbox environment.  For updating an employment&#39;s parameters outside of testing purposes, use [this Employment update endpoint](https://gateway.remote.com/v1/docs/openapi.html). 
     * @param employmentId Employment ID (required)
     * @return EmploymentUpdateRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public EmploymentUpdateRequestBuilder employmentUpdate(String employmentId) throws IllegalArgumentException {
        if (employmentId == null) throw new IllegalArgumentException("\"employmentId\" is required but got null");
            

        return new EmploymentUpdateRequestBuilder(employmentId);
    }
    private okhttp3.Call triggerWebhookCallbackCall(WebhookTriggerParams webhookTriggerParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = webhookTriggerParams;

        // create path and map variables
        String localVarPath = "/v1/sandbox/webhook-callbacks/trigger";

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
    private okhttp3.Call triggerWebhookCallbackValidateBeforeCall(WebhookTriggerParams webhookTriggerParams, final ApiCallback _callback) throws ApiException {
        return triggerWebhookCallbackCall(webhookTriggerParams, _callback);

    }


    private ApiResponse<SuccessResponse> triggerWebhookCallbackWithHttpInfo(WebhookTriggerParams webhookTriggerParams) throws ApiException {
        okhttp3.Call localVarCall = triggerWebhookCallbackValidateBeforeCall(webhookTriggerParams, null);
        Type localVarReturnType = new TypeToken<SuccessResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call triggerWebhookCallbackAsync(WebhookTriggerParams webhookTriggerParams, final ApiCallback<SuccessResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = triggerWebhookCallbackValidateBeforeCall(webhookTriggerParams, _callback);
        Type localVarReturnType = new TypeToken<SuccessResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class TriggerWebhookCallbackRequestBuilder {
        private String employmentId;
        private String eventType;

        private TriggerWebhookCallbackRequestBuilder() {
        }

        /**
         * Set employmentId
         * @param employmentId  (optional)
         * @return TriggerWebhookCallbackRequestBuilder
         */
        public TriggerWebhookCallbackRequestBuilder employmentId(String employmentId) {
            this.employmentId = employmentId;
            return this;
        }
        
        /**
         * Set eventType
         * @param eventType  (optional)
         * @return TriggerWebhookCallbackRequestBuilder
         */
        public TriggerWebhookCallbackRequestBuilder eventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        
        /**
         * Build call for triggerWebhookCallback
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
            WebhookTriggerParams webhookTriggerParams = buildBodyParams();
            return triggerWebhookCallbackCall(webhookTriggerParams, _callback);
        }

        private WebhookTriggerParams buildBodyParams() {
            WebhookTriggerParams webhookTriggerParams = new WebhookTriggerParams();
            webhookTriggerParams.employmentId(this.employmentId);
            if (this.eventType != null)
            webhookTriggerParams.eventType(WebhookTriggerParams.EventTypeEnum.fromValue(this.eventType));
            return webhookTriggerParams;
        }

        /**
         * Execute triggerWebhookCallback request
         * @return SuccessResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public SuccessResponse execute() throws ApiException {
            WebhookTriggerParams webhookTriggerParams = buildBodyParams();
            ApiResponse<SuccessResponse> localVarResp = triggerWebhookCallbackWithHttpInfo(webhookTriggerParams);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute triggerWebhookCallback request with HTTP info returned
         * @return ApiResponse&lt;SuccessResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<SuccessResponse> executeWithHttpInfo() throws ApiException {
            WebhookTriggerParams webhookTriggerParams = buildBodyParams();
            return triggerWebhookCallbackWithHttpInfo(webhookTriggerParams);
        }

        /**
         * Execute triggerWebhookCallback request (asynchronously)
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
            WebhookTriggerParams webhookTriggerParams = buildBodyParams();
            return triggerWebhookCallbackAsync(webhookTriggerParams, _callback);
        }
    }

    /**
     * Trigger a Webhook
     * Triggers a callback previously registered for webhooks. Use this endpoint to emit a webhook for testing in the Sandbox environment. This endpoint will respond with a 404 outside of the Sandbox environment. 
     * @return TriggerWebhookCallbackRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public TriggerWebhookCallbackRequestBuilder triggerWebhookCallback() throws IllegalArgumentException {
        return new TriggerWebhookCallbackRequestBuilder();
    }
    private okhttp3.Call updateEmploymentStateCall(String employmentId, EmploymentUpdateParams employmentUpdateParams, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = employmentUpdateParams;

        // create path and map variables
        String localVarPath = "/v1/sandbox/employments/{employment_id}"
            .replace("{" + "employment_id" + "}", localVarApiClient.escapeString(employmentId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateEmploymentStateValidateBeforeCall(String employmentId, EmploymentUpdateParams employmentUpdateParams, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'employmentId' is set
        if (employmentId == null) {
            throw new ApiException("Missing the required parameter 'employmentId' when calling updateEmploymentState(Async)");
        }

        return updateEmploymentStateCall(employmentId, employmentUpdateParams, _callback);

    }


    private ApiResponse<EmploymentResponse> updateEmploymentStateWithHttpInfo(String employmentId, EmploymentUpdateParams employmentUpdateParams) throws ApiException {
        okhttp3.Call localVarCall = updateEmploymentStateValidateBeforeCall(employmentId, employmentUpdateParams, null);
        Type localVarReturnType = new TypeToken<EmploymentResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call updateEmploymentStateAsync(String employmentId, EmploymentUpdateParams employmentUpdateParams, final ApiCallback<EmploymentResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateEmploymentStateValidateBeforeCall(employmentId, employmentUpdateParams, _callback);
        Type localVarReturnType = new TypeToken<EmploymentResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class UpdateEmploymentStateRequestBuilder {
        private final String employmentId;
        private EmploymentStatus status;

        private UpdateEmploymentStateRequestBuilder(String employmentId) {
            this.employmentId = employmentId;
        }

        /**
         * Set status
         * @param status  (optional)
         * @return UpdateEmploymentStateRequestBuilder
         */
        public UpdateEmploymentStateRequestBuilder status(EmploymentStatus status) {
            this.status = status;
            return this;
        }
        
        /**
         * Build call for updateEmploymentState
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
            EmploymentUpdateParams employmentUpdateParams = buildBodyParams();
            return updateEmploymentStateCall(employmentId, employmentUpdateParams, _callback);
        }

        private EmploymentUpdateParams buildBodyParams() {
            EmploymentUpdateParams employmentUpdateParams = new EmploymentUpdateParams();
            employmentUpdateParams.status(this.status);
            return employmentUpdateParams;
        }

        /**
         * Execute updateEmploymentState request
         * @return EmploymentResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public EmploymentResponse execute() throws ApiException {
            EmploymentUpdateParams employmentUpdateParams = buildBodyParams();
            ApiResponse<EmploymentResponse> localVarResp = updateEmploymentStateWithHttpInfo(employmentId, employmentUpdateParams);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute updateEmploymentState request with HTTP info returned
         * @return ApiResponse&lt;EmploymentResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<EmploymentResponse> executeWithHttpInfo() throws ApiException {
            EmploymentUpdateParams employmentUpdateParams = buildBodyParams();
            return updateEmploymentStateWithHttpInfo(employmentId, employmentUpdateParams);
        }

        /**
         * Execute updateEmploymentState request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<EmploymentResponse> _callback) throws ApiException {
            EmploymentUpdateParams employmentUpdateParams = buildBodyParams();
            return updateEmploymentStateAsync(employmentId, employmentUpdateParams, _callback);
        }
    }

    /**
     * Update employment
     * Updates an employment. Use this endpoint to modify employment states for testing in the Sandbox environment. This endpoint will respond with a 404 outside of the Sandbox environment.  For updating an employment&#39;s parameters outside of testing purposes, use [this Employment update endpoint](https://gateway.remote.com/v1/docs/openapi.html). 
     * @param employmentId Employment ID (required)
     * @return UpdateEmploymentStateRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public UpdateEmploymentStateRequestBuilder updateEmploymentState(String employmentId) throws IllegalArgumentException {
        if (employmentId == null) throw new IllegalArgumentException("\"employmentId\" is required but got null");
            

        return new UpdateEmploymentStateRequestBuilder(employmentId);
    }
}
