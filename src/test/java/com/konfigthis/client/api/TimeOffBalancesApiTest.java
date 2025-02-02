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
import com.konfigthis.client.model.TimeoffBalanceResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TimeOffBalancesApi
 */
@Disabled
public class TimeOffBalancesApiTest {

    private static TimeOffBalancesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TimeOffBalancesApi(apiClient);
    }

    /**
     * Show Time Off Balance
     *
     * Shows the time off balance for the given employment_id.  Please note, this endpoint is only supported for employments in certain countries. For countries where it&#39;s not supported, this endpoint will respond with a &#x60;404 Not Found&#x60;. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void showBalanceTest() throws ApiException {
        String employmentId = null;
        TimeoffBalanceResponse response = api.showBalance(employmentId)
                .execute();
        // TODO: test validations
    }

}
