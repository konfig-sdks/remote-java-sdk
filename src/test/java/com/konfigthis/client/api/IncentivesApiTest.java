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
import com.konfigthis.client.model.AmountTaxType;
import com.konfigthis.client.model.CreateOneTimeIncentiveParams;
import com.konfigthis.client.model.IncentiveResponse;
import com.konfigthis.client.model.ListIncentivesResponse;
import java.time.LocalDate;
import com.konfigthis.client.model.SuccessResponse;
import com.konfigthis.client.model.UpdateIncentiveParams;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IncentivesApi
 */
@Disabled
public class IncentivesApiTest {

    private static IncentivesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new IncentivesApi(apiClient);
    }

    /**
     * Create Incentive
     *
     * Creates an Incentive.  Incentives use the currency of the employment specified provided in the &#x60;employment_id&#x60; field. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createIncentiveTest() throws ApiException {
        Integer amount = null;
        AmountTaxType amountTaxType = null;
        LocalDate effectiveDate = null;
        String employmentId = null;
        String type = null;
        String note = null;
        IncentiveResponse response = api.createIncentive(amount, amountTaxType, effectiveDate, employmentId, type)
                .note(note)
                .execute();
        // TODO: test validations
    }

    /**
     * List Incentives
     *
     * Lists all Incentives of a company
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllTest() throws ApiException {
        String employmentId = null;
        String status = null;
        String recurringIncentiveId = null;
        Integer page = null;
        Integer pageSize = null;
        ListIncentivesResponse response = api.listAll()
                .employmentId(employmentId)
                .status(status)
                .recurringIncentiveId(recurringIncentiveId)
                .page(page)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete an Incentive
     *
     * Delete an incentive.  &#x60;one_time&#x60; incentives that have the following status **CANNOT** be deleted: * &#x60;processing&#x60; * &#x60;paid&#x60; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeIncentiveTest() throws ApiException {
        String id = null;
        SuccessResponse response = api.removeIncentive(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Show Incentive
     *
     * Show an Incentive&#39;s details
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void showDetailsTest() throws ApiException {
        String id = null;
        IncentiveResponse response = api.showDetails(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Incentive
     *
     * Updates an Incentive.  Incentives use the currency of the employment specified provided in the &#x60;employment_id&#x60; field.  The API doesn&#39;t support updating paid incentives. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateIncentiveTest() throws ApiException {
        String id = null;
        Integer amount = null;
        AmountTaxType amountTaxType = null;
        LocalDate effectiveDate = null;
        String note = null;
        String type = null;
        IncentiveResponse response = api.updateIncentive(id)
                .amount(amount)
                .amountTaxType(amountTaxType)
                .effectiveDate(effectiveDate)
                .note(note)
                .type(type)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Incentive
     *
     * Updates an Incentive.  Incentives use the currency of the employment specified provided in the &#x60;employment_id&#x60; field.  The API doesn&#39;t support updating paid incentives. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateIncentive_0Test() throws ApiException {
        String id = null;
        Integer amount = null;
        AmountTaxType amountTaxType = null;
        LocalDate effectiveDate = null;
        String note = null;
        String type = null;
        IncentiveResponse response = api.updateIncentive_0(id)
                .amount(amount)
                .amountTaxType(amountTaxType)
                .effectiveDate(effectiveDate)
                .note(note)
                .type(type)
                .execute();
        // TODO: test validations
    }

}
