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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * CreateCompanyParams
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateCompanyParams {
  public static final String SERIALIZED_NAME_ADDRESS_DETAILS = "address_details";
  @SerializedName(SERIALIZED_NAME_ADDRESS_DETAILS)
  private Object addressDetails;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT_DETAILS = "bank_account_details";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT_DETAILS)
  private Object bankAccountDetails;

  public static final String SERIALIZED_NAME_COMPANY_OWNER_EMAIL = "company_owner_email";
  @SerializedName(SERIALIZED_NAME_COMPANY_OWNER_EMAIL)
  private String companyOwnerEmail;

  public static final String SERIALIZED_NAME_COMPANY_OWNER_NAME = "company_owner_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_OWNER_NAME)
  private String companyOwnerName;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  /**
   * Desired currency for invoicing and displaying converted salaries in Remote UI regardless of the employee&#39;s country.
   */
  @JsonAdapter(DesiredCurrencyEnum.Adapter.class)
 public enum DesiredCurrencyEnum {
    AUD("AUD"),
    
    CAD("CAD"),
    
    CHF("CHF"),
    
    DKK("DKK"),
    
    EUR("EUR"),
    
    GBP("GBP"),
    
    JPY("JPY"),
    
    NOK("NOK"),
    
    NZD("NZD"),
    
    SEK("SEK"),
    
    SGD("SGD"),
    
    USD("USD");

    private String value;

    DesiredCurrencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DesiredCurrencyEnum fromValue(String value) {
      for (DesiredCurrencyEnum b : DesiredCurrencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DesiredCurrencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DesiredCurrencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DesiredCurrencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DesiredCurrencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DESIRED_CURRENCY = "desired_currency";
  @SerializedName(SERIALIZED_NAME_DESIRED_CURRENCY)
  private DesiredCurrencyEnum desiredCurrency;

  public static final String SERIALIZED_NAME_EMAIL_DOMAIN = "email_domain";
  @SerializedName(SERIALIZED_NAME_EMAIL_DOMAIN)
  private String emailDomain;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_REGISTRATION_NUMBER = "registration_number";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_NUMBER)
  private String registrationNumber;

  public static final String SERIALIZED_NAME_TAX_NUMBER = "tax_number";
  @SerializedName(SERIALIZED_NAME_TAX_NUMBER)
  private String taxNumber;

  public static final String SERIALIZED_NAME_TERMS_OF_SERVICE_ACCEPTED_AT = "terms_of_service_accepted_at";
  @SerializedName(SERIALIZED_NAME_TERMS_OF_SERVICE_ACCEPTED_AT)
  private OffsetDateTime termsOfServiceAcceptedAt;

  public CreateCompanyParams() {
  }

  public CreateCompanyParams addressDetails(Object addressDetails) {
    
    
    
    
    this.addressDetails = addressDetails;
    return this;
  }

   /**
   * Fields can vary depending on the country. Please, check the required fields structure using the [Show form schema endpoint](https://gateway.remote.com/v1/docs/openapi.html). Use the desired country and &#x60;address_details&#x60; as the form name for the placeholders. The response complies with the [JSON Schema](https://remote.com/resources/api/how-json-schemas-work) specification. 
   * @return addressDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fields can vary depending on the country. Please, check the required fields structure using the [Show form schema endpoint](https://gateway.remote.com/v1/docs/openapi.html). Use the desired country and `address_details` as the form name for the placeholders. The response complies with the [JSON Schema](https://remote.com/resources/api/how-json-schemas-work) specification. ")

  public Object getAddressDetails() {
    return addressDetails;
  }


  public void setAddressDetails(Object addressDetails) {
    
    
    
    this.addressDetails = addressDetails;
  }


  public CreateCompanyParams bankAccountDetails(Object bankAccountDetails) {
    
    
    
    
    this.bankAccountDetails = bankAccountDetails;
    return this;
  }

   /**
   * Fields can vary depending on the country. Please, check the required fields structure using the [Show form schema endpoint](https://gateway.remote.com/v1/docs/openapi.html). Use the desired country and &#x60;bank_account_details&#x60; as the form name for the placeholders. The response complies with the [JSON Schema](https://remote.com/resources/api/how-json-schemas-work) specification. 
   * @return bankAccountDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fields can vary depending on the country. Please, check the required fields structure using the [Show form schema endpoint](https://gateway.remote.com/v1/docs/openapi.html). Use the desired country and `bank_account_details` as the form name for the placeholders. The response complies with the [JSON Schema](https://remote.com/resources/api/how-json-schemas-work) specification. ")

  public Object getBankAccountDetails() {
    return bankAccountDetails;
  }


  public void setBankAccountDetails(Object bankAccountDetails) {
    
    
    
    this.bankAccountDetails = bankAccountDetails;
  }


  public CreateCompanyParams companyOwnerEmail(String companyOwnerEmail) {
    
    
    
    
    this.companyOwnerEmail = companyOwnerEmail;
    return this;
  }

   /**
   * The company owner email.  This value cannot be changed once set. 
   * @return companyOwnerEmail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ceo@techvision.com", required = true, value = "The company owner email.  This value cannot be changed once set. ")

  public String getCompanyOwnerEmail() {
    return companyOwnerEmail;
  }


  public void setCompanyOwnerEmail(String companyOwnerEmail) {
    
    
    
    this.companyOwnerEmail = companyOwnerEmail;
  }


  public CreateCompanyParams companyOwnerName(String companyOwnerName) {
    
    
    
    
    this.companyOwnerName = companyOwnerName;
    return this;
  }

   /**
   * The company owner name.  This value cannot be changed from the Remote API once set. 
   * @return companyOwnerName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Joe Smith", required = true, value = "The company owner name.  This value cannot be changed from the Remote API once set. ")

  public String getCompanyOwnerName() {
    return companyOwnerName;
  }


  public void setCompanyOwnerName(String companyOwnerName) {
    
    
    
    this.companyOwnerName = companyOwnerName;
  }


  public CreateCompanyParams countryCode(String countryCode) {
    
    
    
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * 3-letter country code of the country the company address is located in.  For a list of countries supported through the Remote API, make a call to the [list countries endpoint](https://gateway.remote.com/v1/docs/openapi.html). This endpoint will also include the 3-letter country codes you can use for this field. 
   * @return countryCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "USA", required = true, value = "3-letter country code of the country the company address is located in.  For a list of countries supported through the Remote API, make a call to the [list countries endpoint](https://gateway.remote.com/v1/docs/openapi.html). This endpoint will also include the 3-letter country codes you can use for this field. ")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    
    
    
    this.countryCode = countryCode;
  }


  public CreateCompanyParams desiredCurrency(DesiredCurrencyEnum desiredCurrency) {
    
    
    
    
    this.desiredCurrency = desiredCurrency;
    return this;
  }

   /**
   * Desired currency for invoicing and displaying converted salaries in Remote UI regardless of the employee&#39;s country.
   * @return desiredCurrency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "USD", required = true, value = "Desired currency for invoicing and displaying converted salaries in Remote UI regardless of the employee's country.")

  public DesiredCurrencyEnum getDesiredCurrency() {
    return desiredCurrency;
  }


  public void setDesiredCurrency(DesiredCurrencyEnum desiredCurrency) {
    
    
    
    this.desiredCurrency = desiredCurrency;
  }


  public CreateCompanyParams emailDomain(String emailDomain) {
    
    
    
    
    this.emailDomain = emailDomain;
    return this;
  }

   /**
   * The domain of the company. Use this field to specify the company domain name when it&#39;s different from the domain in the company owner&#39;s email.
   * @return emailDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The domain of the company. Use this field to specify the company domain name when it's different from the domain in the company owner's email.")

  public String getEmailDomain() {
    return emailDomain;
  }


  public void setEmailDomain(String emailDomain) {
    
    
    
    this.emailDomain = emailDomain;
  }


  public CreateCompanyParams externalId(String externalId) {
    
    
    
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Id of the company as represented in the external partner system.
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00001111", value = "Id of the company as represented in the external partner system.")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    
    
    
    this.externalId = externalId;
  }


  public CreateCompanyParams name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The company name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Tech Vision", required = true, value = "The company name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public CreateCompanyParams phoneNumber(String phoneNumber) {
    
    
    
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * A phone number the company can be contacted with.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+11123123456", value = "A phone number the company can be contacted with.")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    
    
    
    this.phoneNumber = phoneNumber;
  }


  public CreateCompanyParams registrationNumber(String registrationNumber) {
    
    
    
    
    this.registrationNumber = registrationNumber;
    return this;
  }

   /**
   * The company registration number. This field or &#x60;tax_number&#x60; (but not both) should be submitted.
   * @return registrationNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The company registration number. This field or `tax_number` (but not both) should be submitted.")

  public String getRegistrationNumber() {
    return registrationNumber;
  }


  public void setRegistrationNumber(String registrationNumber) {
    
    
    
    this.registrationNumber = registrationNumber;
  }


  public CreateCompanyParams taxNumber(String taxNumber) {
    
    
    
    
    this.taxNumber = taxNumber;
    return this;
  }

   /**
   * The tax identifier of the company. This field or &#x60;registration_number&#x60; (but not both) should be submitted.
   * @return taxNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456789", value = "The tax identifier of the company. This field or `registration_number` (but not both) should be submitted.")

  public String getTaxNumber() {
    return taxNumber;
  }


  public void setTaxNumber(String taxNumber) {
    
    
    
    this.taxNumber = taxNumber;
  }


  public CreateCompanyParams termsOfServiceAcceptedAt(OffsetDateTime termsOfServiceAcceptedAt) {
    
    
    
    
    this.termsOfServiceAcceptedAt = termsOfServiceAcceptedAt;
    return this;
  }

   /**
   * Date and time the Terms of Service were accepted. To ensure users read the most recent version of Remote&#39;s Terms of Service, their action cannot have been done more than fifteen minutes ago. The UTC offset must be included in the ISO 8601 format: &#x60;YYYY-MM-DD HOURS:MINUTES:SECONDSZ&#x60;
   * @return termsOfServiceAcceptedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Date and time the Terms of Service were accepted. To ensure users read the most recent version of Remote's Terms of Service, their action cannot have been done more than fifteen minutes ago. The UTC offset must be included in the ISO 8601 format: `YYYY-MM-DD HOURS:MINUTES:SECONDSZ`")

  public OffsetDateTime getTermsOfServiceAcceptedAt() {
    return termsOfServiceAcceptedAt;
  }


  public void setTermsOfServiceAcceptedAt(OffsetDateTime termsOfServiceAcceptedAt) {
    
    
    
    this.termsOfServiceAcceptedAt = termsOfServiceAcceptedAt;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the CreateCompanyParams instance itself
   */
  public CreateCompanyParams putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCompanyParams createCompanyParams = (CreateCompanyParams) o;
    return Objects.equals(this.addressDetails, createCompanyParams.addressDetails) &&
        Objects.equals(this.bankAccountDetails, createCompanyParams.bankAccountDetails) &&
        Objects.equals(this.companyOwnerEmail, createCompanyParams.companyOwnerEmail) &&
        Objects.equals(this.companyOwnerName, createCompanyParams.companyOwnerName) &&
        Objects.equals(this.countryCode, createCompanyParams.countryCode) &&
        Objects.equals(this.desiredCurrency, createCompanyParams.desiredCurrency) &&
        Objects.equals(this.emailDomain, createCompanyParams.emailDomain) &&
        Objects.equals(this.externalId, createCompanyParams.externalId) &&
        Objects.equals(this.name, createCompanyParams.name) &&
        Objects.equals(this.phoneNumber, createCompanyParams.phoneNumber) &&
        Objects.equals(this.registrationNumber, createCompanyParams.registrationNumber) &&
        Objects.equals(this.taxNumber, createCompanyParams.taxNumber) &&
        Objects.equals(this.termsOfServiceAcceptedAt, createCompanyParams.termsOfServiceAcceptedAt)&&
        Objects.equals(this.additionalProperties, createCompanyParams.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressDetails, bankAccountDetails, companyOwnerEmail, companyOwnerName, countryCode, desiredCurrency, emailDomain, externalId, name, phoneNumber, registrationNumber, taxNumber, termsOfServiceAcceptedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompanyParams {\n");
    sb.append("    addressDetails: ").append(toIndentedString(addressDetails)).append("\n");
    sb.append("    bankAccountDetails: ").append(toIndentedString(bankAccountDetails)).append("\n");
    sb.append("    companyOwnerEmail: ").append(toIndentedString(companyOwnerEmail)).append("\n");
    sb.append("    companyOwnerName: ").append(toIndentedString(companyOwnerName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    desiredCurrency: ").append(toIndentedString(desiredCurrency)).append("\n");
    sb.append("    emailDomain: ").append(toIndentedString(emailDomain)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    taxNumber: ").append(toIndentedString(taxNumber)).append("\n");
    sb.append("    termsOfServiceAcceptedAt: ").append(toIndentedString(termsOfServiceAcceptedAt)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("address_details");
    openapiFields.add("bank_account_details");
    openapiFields.add("company_owner_email");
    openapiFields.add("company_owner_name");
    openapiFields.add("country_code");
    openapiFields.add("desired_currency");
    openapiFields.add("email_domain");
    openapiFields.add("external_id");
    openapiFields.add("name");
    openapiFields.add("phone_number");
    openapiFields.add("registration_number");
    openapiFields.add("tax_number");
    openapiFields.add("terms_of_service_accepted_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("company_owner_email");
    openapiRequiredFields.add("company_owner_name");
    openapiRequiredFields.add("country_code");
    openapiRequiredFields.add("desired_currency");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("terms_of_service_accepted_at");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateCompanyParams
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateCompanyParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCompanyParams is not found in the empty JSON string", CreateCompanyParams.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCompanyParams.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("company_owner_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_owner_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_owner_email").toString()));
      }
      if (!jsonObj.get("company_owner_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_owner_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_owner_name").toString()));
      }
      if (!jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
      if (!jsonObj.get("desired_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desired_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desired_currency").toString()));
      }
      if ((jsonObj.get("email_domain") != null && !jsonObj.get("email_domain").isJsonNull()) && !jsonObj.get("email_domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_domain").toString()));
      }
      if ((jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonNull()) && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("phone_number") != null && !jsonObj.get("phone_number").isJsonNull()) && !jsonObj.get("phone_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_number").toString()));
      }
      if ((jsonObj.get("registration_number") != null && !jsonObj.get("registration_number").isJsonNull()) && !jsonObj.get("registration_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registration_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registration_number").toString()));
      }
      if ((jsonObj.get("tax_number") != null && !jsonObj.get("tax_number").isJsonNull()) && !jsonObj.get("tax_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCompanyParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCompanyParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCompanyParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCompanyParams.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCompanyParams>() {
           @Override
           public void write(JsonWriter out, CreateCompanyParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCompanyParams read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateCompanyParams instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCompanyParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCompanyParams
  * @throws IOException if the JSON string is invalid with respect to CreateCompanyParams
  */
  public static CreateCompanyParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCompanyParams.class);
  }

 /**
  * Convert an instance of CreateCompanyParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

