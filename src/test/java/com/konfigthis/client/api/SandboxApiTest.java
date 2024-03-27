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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.EmploymentCreationResponse;
import com.konfigthis.client.model.EmploymentResponse;
import com.konfigthis.client.model.EmploymentStatus;
import com.konfigthis.client.model.EmploymentUpdateParams;
import com.konfigthis.client.model.SuccessResponse;
import com.konfigthis.client.model.WebhookTriggerParams;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SandboxApi
 */
@Disabled
public class SandboxApiTest {

    private static SandboxApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new SandboxApi(apiClient);
    }

    /**
     * Create employment
     *
     * Creates an employment without provisional_start_date validation.  This endpoint is only available in Sandbox and allows creating employments which &#x60;provisional_start_date&#x60; is in the past. This is especially helpful for:   * Testing the Timeoff Balance endpoints   * Testing the Offboarding endpoints   * Testing features around probation periods  This endpoint will respond with a 404 outside of the Sandbox environment.  For creating an employment&#39;s parameters outside of testing purposes, use [this Employment create endpoint](https://gateway.remote.com/v1/docs/openapi.html) 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createEmploymentWithoutValidationsTest() throws ApiException {
        EmploymentCreationResponse response = api.createEmploymentWithoutValidations()
                .execute();
        // TODO: test validations
    }

    /**
     * Update employment
     *
     * Updates an employment. Use this endpoint to modify employment states for testing in the Sandbox environment. This endpoint will respond with a 404 outside of the Sandbox environment.  For updating an employment&#39;s parameters outside of testing purposes, use [this Employment update endpoint](https://gateway.remote.com/v1/docs/openapi.html). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void employmentUpdateTest() throws ApiException {
        String employmentId = null;
        EmploymentStatus status = null;
        EmploymentResponse response = api.employmentUpdate(employmentId)
                .status(status)
                .execute();
        // TODO: test validations
    }

    /**
     * Trigger a Webhook
     *
     * Triggers a callback previously registered for webhooks. Use this endpoint to emit a webhook for testing in the Sandbox environment. This endpoint will respond with a 404 outside of the Sandbox environment. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void triggerWebhookCallbackTest() throws ApiException {
        String employmentId = null;
        String eventType = null;
        SuccessResponse response = api.triggerWebhookCallback()
                .employmentId(employmentId)
                .eventType(eventType)
                .execute();
        // TODO: test validations
    }

    /**
     * Update employment
     *
     * Updates an employment. Use this endpoint to modify employment states for testing in the Sandbox environment. This endpoint will respond with a 404 outside of the Sandbox environment.  For updating an employment&#39;s parameters outside of testing purposes, use [this Employment update endpoint](https://gateway.remote.com/v1/docs/openapi.html). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateEmploymentStateTest() throws ApiException {
        String employmentId = null;
        EmploymentStatus status = null;
        EmploymentResponse response = api.updateEmploymentState(employmentId)
                .status(status)
                .execute();
        // TODO: test validations
    }

}
