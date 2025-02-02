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
import com.konfigthis.client.model.EmploymentCustomFieldValueResponse;
import com.konfigthis.client.model.ListEmploymentCustomFieldsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomFieldsApi
 */
@Disabled
public class CustomFieldsApiTest {

    private static CustomFieldsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new CustomFieldsApi(apiClient);
    }

    /**
     * Lists custom fields definitions
     *
     * Returns custom fields definitions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listDefinitionsTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        ListEmploymentCustomFieldsResponse response = api.listDefinitions()
                .page(page)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * Show a custom field value
     *
     * Returns a custom field value for a given employment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void showValueTest() throws ApiException {
        String customFieldId = null;
        String employmentId = null;
        EmploymentCustomFieldValueResponse response = api.showValue(customFieldId, employmentId)
                .execute();
        // TODO: test validations
    }

}
