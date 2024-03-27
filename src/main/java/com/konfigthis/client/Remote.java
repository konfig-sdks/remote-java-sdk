package com.konfigthis.client;

import com.konfigthis.client.api.BenefitsCountrySummaryApi;
import com.konfigthis.client.api.BillingDocumentsApi;
import com.konfigthis.client.api.CompaniesApi;
import com.konfigthis.client.api.CompanyDepartmentApi;
import com.konfigthis.client.api.CompanyManagersApi;
import com.konfigthis.client.api.ContractAmendmentsApi;
import com.konfigthis.client.api.CostCalculatorApi;
import com.konfigthis.client.api.CountriesApi;
import com.konfigthis.client.api.CustomFieldsApi;
import com.konfigthis.client.api.EmploymentContractsApi;
import com.konfigthis.client.api.EmploymentsApi;
import com.konfigthis.client.api.ExpensesApi;
import com.konfigthis.client.api.FilesApi;
import com.konfigthis.client.api.IdentityApi;
import com.konfigthis.client.api.IncentivesApi;
import com.konfigthis.client.api.OAuth2Api;
import com.konfigthis.client.api.OffboardingApi;
import com.konfigthis.client.api.PayslipsApi;
import com.konfigthis.client.api.RecurringIncentivesApi;
import com.konfigthis.client.api.ResignationApi;
import com.konfigthis.client.api.SandboxApi;
import com.konfigthis.client.api.TimeOffApi;
import com.konfigthis.client.api.TimeOffBalancesApi;
import com.konfigthis.client.api.WebhookCallbacksApi;

public class Remote {
    private ApiClient apiClient;
    public final BenefitsCountrySummaryApi benefitsCountrySummary;
    public final BillingDocumentsApi billingDocuments;
    public final CompaniesApi companies;
    public final CompanyDepartmentApi companyDepartment;
    public final CompanyManagersApi companyManagers;
    public final ContractAmendmentsApi contractAmendments;
    public final CostCalculatorApi costCalculator;
    public final CountriesApi countries;
    public final CustomFieldsApi customFields;
    public final EmploymentContractsApi employmentContracts;
    public final EmploymentsApi employments;
    public final ExpensesApi expenses;
    public final FilesApi files;
    public final IdentityApi identity;
    public final IncentivesApi incentives;
    public final OAuth2Api oAuth2;
    public final OffboardingApi offboarding;
    public final PayslipsApi payslips;
    public final RecurringIncentivesApi recurringIncentives;
    public final ResignationApi resignation;
    public final SandboxApi sandbox;
    public final TimeOffApi timeOff;
    public final TimeOffBalancesApi timeOffBalances;
    public final WebhookCallbacksApi webhookCallbacks;

    public Remote() {
        this(null);
    }

    public Remote(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.benefitsCountrySummary = new BenefitsCountrySummaryApi(this.apiClient);
        this.billingDocuments = new BillingDocumentsApi(this.apiClient);
        this.companies = new CompaniesApi(this.apiClient);
        this.companyDepartment = new CompanyDepartmentApi(this.apiClient);
        this.companyManagers = new CompanyManagersApi(this.apiClient);
        this.contractAmendments = new ContractAmendmentsApi(this.apiClient);
        this.costCalculator = new CostCalculatorApi(this.apiClient);
        this.countries = new CountriesApi(this.apiClient);
        this.customFields = new CustomFieldsApi(this.apiClient);
        this.employmentContracts = new EmploymentContractsApi(this.apiClient);
        this.employments = new EmploymentsApi(this.apiClient);
        this.expenses = new ExpensesApi(this.apiClient);
        this.files = new FilesApi(this.apiClient);
        this.identity = new IdentityApi(this.apiClient);
        this.incentives = new IncentivesApi(this.apiClient);
        this.oAuth2 = new OAuth2Api(this.apiClient);
        this.offboarding = new OffboardingApi(this.apiClient);
        this.payslips = new PayslipsApi(this.apiClient);
        this.recurringIncentives = new RecurringIncentivesApi(this.apiClient);
        this.resignation = new ResignationApi(this.apiClient);
        this.sandbox = new SandboxApi(this.apiClient);
        this.timeOff = new TimeOffApi(this.apiClient);
        this.timeOffBalances = new TimeOffBalancesApi(this.apiClient);
        this.webhookCallbacks = new WebhookCallbacksApi(this.apiClient);
    }

}
