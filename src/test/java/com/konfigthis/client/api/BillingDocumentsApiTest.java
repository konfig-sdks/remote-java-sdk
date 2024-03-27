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
import com.konfigthis.client.model.BillingDocumentResponse;
import com.konfigthis.client.model.BillingDocumentsResponse;
import java.io.File;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BillingDocumentsApi
 */
@Disabled
public class BillingDocumentsApiTest {

    private static BillingDocumentsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new BillingDocumentsApi(apiClient);
    }

    /**
     * Download a billing document PDF
     *
     * Downloads a billing document PDF
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void downloadPdfTest() throws ApiException {
        String billingDocumentId = null;
        File response = api.downloadPdf(billingDocumentId)
                .execute();
        // TODO: test validations
    }

    /**
     * List Billing Documents
     *
     * List billing documents for a company
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        String period = null;
        Integer page = null;
        Integer pageSize = null;
        BillingDocumentsResponse response = api.list()
                .period(period)
                .page(page)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * Show Billing Document
     *
     * Shows a billing document details.  Please contact api-support@remote.com to request access to this endpoint. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void showDetailsTest() throws ApiException {
        String billingDocumentId = null;
        BillingDocumentResponse response = api.showDetails(billingDocumentId)
                .execute();
        // TODO: test validations
    }

}
