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
import java.io.File;
import com.konfigthis.client.model.ListPayslipsResponse;
import com.konfigthis.client.model.PayslipResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PayslipsApi
 */
@Disabled
public class PayslipsApiTest {

    private static PayslipsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PayslipsApi(apiClient);
    }

    /**
     * Download payslip in the PDF format
     *
     * Given a Payslip ID, downloads a payslip. It is important to note that each country has a different payslip format and they are not authored by Remote. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void downloadPdfTest() throws ApiException {
        String payslipId = null;
        File response = api.downloadPdf(payslipId)
                .execute();
        // TODO: test validations
    }

    /**
     * List payslips
     *
     * Lists all payslips belonging to a company. Can also filter for a single employment belonging to that company. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllTest() throws ApiException {
        String employmentId = null;
        String startDate = null;
        String endDate = null;
        String expectedPayoutStartDate = null;
        String expectedPayoutEndDate = null;
        Integer page = null;
        Integer pageSize = null;
        ListPayslipsResponse response = api.listAll()
                .employmentId(employmentId)
                .startDate(startDate)
                .endDate(endDate)
                .expectedPayoutStartDate(expectedPayoutStartDate)
                .expectedPayoutEndDate(expectedPayoutEndDate)
                .page(page)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * Show payslip
     *
     * Given an ID, shows a payslip.  Please contact api-support@remote.com to request access to this endpoint. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void showPayslipTest() throws ApiException {
        String id = null;
        PayslipResponse response = api.showPayslip(id)
                .execute();
        // TODO: test validations
    }

}
