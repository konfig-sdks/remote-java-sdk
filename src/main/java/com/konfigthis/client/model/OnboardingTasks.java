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
import com.konfigthis.client.model.TaskDescription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * All tasks that need to be completed before marking the employment as ready
 */
@ApiModel(description = "All tasks that need to be completed before marking the employment as ready")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OnboardingTasks {
  public static final String SERIALIZED_NAME_ADDRESS_DETAILS = "address_details";
  @SerializedName(SERIALIZED_NAME_ADDRESS_DETAILS)
  private TaskDescription addressDetails;

  public static final String SERIALIZED_NAME_ADMINISTRATIVE_DETAILS = "administrative_details";
  @SerializedName(SERIALIZED_NAME_ADMINISTRATIVE_DETAILS)
  private TaskDescription administrativeDetails;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT_DETAILS = "bank_account_details";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT_DETAILS)
  private TaskDescription bankAccountDetails;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS_DETAILS = "billing_address_details";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS_DETAILS)
  private TaskDescription billingAddressDetails;

  public static final String SERIALIZED_NAME_CONTRACT_DETAILS = "contract_details";
  @SerializedName(SERIALIZED_NAME_CONTRACT_DETAILS)
  private TaskDescription contractDetails;

  public static final String SERIALIZED_NAME_EMERGENCY_CONTACT_DETAILS = "emergency_contact_details";
  @SerializedName(SERIALIZED_NAME_EMERGENCY_CONTACT_DETAILS)
  private TaskDescription emergencyContactDetails;

  public static final String SERIALIZED_NAME_EMPLOYMENT_DOCUMENT_DETAILS = "employment_document_details";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_DOCUMENT_DETAILS)
  private TaskDescription employmentDocumentDetails;

  public static final String SERIALIZED_NAME_PERSONAL_DETAILS = "personal_details";
  @SerializedName(SERIALIZED_NAME_PERSONAL_DETAILS)
  private TaskDescription personalDetails;

  public static final String SERIALIZED_NAME_PRICING_PLAN_DETAILS = "pricing_plan_details";
  @SerializedName(SERIALIZED_NAME_PRICING_PLAN_DETAILS)
  private TaskDescription pricingPlanDetails;

  public OnboardingTasks() {
  }

  public OnboardingTasks addressDetails(TaskDescription addressDetails) {
    
    
    
    
    this.addressDetails = addressDetails;
    return this;
  }

   /**
   * Get addressDetails
   * @return addressDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TaskDescription getAddressDetails() {
    return addressDetails;
  }


  public void setAddressDetails(TaskDescription addressDetails) {
    
    
    
    this.addressDetails = addressDetails;
  }


  public OnboardingTasks administrativeDetails(TaskDescription administrativeDetails) {
    
    
    
    
    this.administrativeDetails = administrativeDetails;
    return this;
  }

   /**
   * Get administrativeDetails
   * @return administrativeDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TaskDescription getAdministrativeDetails() {
    return administrativeDetails;
  }


  public void setAdministrativeDetails(TaskDescription administrativeDetails) {
    
    
    
    this.administrativeDetails = administrativeDetails;
  }


  public OnboardingTasks bankAccountDetails(TaskDescription bankAccountDetails) {
    
    
    
    
    this.bankAccountDetails = bankAccountDetails;
    return this;
  }

   /**
   * Get bankAccountDetails
   * @return bankAccountDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TaskDescription getBankAccountDetails() {
    return bankAccountDetails;
  }


  public void setBankAccountDetails(TaskDescription bankAccountDetails) {
    
    
    
    this.bankAccountDetails = bankAccountDetails;
  }


  public OnboardingTasks billingAddressDetails(TaskDescription billingAddressDetails) {
    
    
    
    
    this.billingAddressDetails = billingAddressDetails;
    return this;
  }

   /**
   * Get billingAddressDetails
   * @return billingAddressDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TaskDescription getBillingAddressDetails() {
    return billingAddressDetails;
  }


  public void setBillingAddressDetails(TaskDescription billingAddressDetails) {
    
    
    
    this.billingAddressDetails = billingAddressDetails;
  }


  public OnboardingTasks contractDetails(TaskDescription contractDetails) {
    
    
    
    
    this.contractDetails = contractDetails;
    return this;
  }

   /**
   * Get contractDetails
   * @return contractDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TaskDescription getContractDetails() {
    return contractDetails;
  }


  public void setContractDetails(TaskDescription contractDetails) {
    
    
    
    this.contractDetails = contractDetails;
  }


  public OnboardingTasks emergencyContactDetails(TaskDescription emergencyContactDetails) {
    
    
    
    
    this.emergencyContactDetails = emergencyContactDetails;
    return this;
  }

   /**
   * Get emergencyContactDetails
   * @return emergencyContactDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TaskDescription getEmergencyContactDetails() {
    return emergencyContactDetails;
  }


  public void setEmergencyContactDetails(TaskDescription emergencyContactDetails) {
    
    
    
    this.emergencyContactDetails = emergencyContactDetails;
  }


  public OnboardingTasks employmentDocumentDetails(TaskDescription employmentDocumentDetails) {
    
    
    
    
    this.employmentDocumentDetails = employmentDocumentDetails;
    return this;
  }

   /**
   * Get employmentDocumentDetails
   * @return employmentDocumentDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TaskDescription getEmploymentDocumentDetails() {
    return employmentDocumentDetails;
  }


  public void setEmploymentDocumentDetails(TaskDescription employmentDocumentDetails) {
    
    
    
    this.employmentDocumentDetails = employmentDocumentDetails;
  }


  public OnboardingTasks personalDetails(TaskDescription personalDetails) {
    
    
    
    
    this.personalDetails = personalDetails;
    return this;
  }

   /**
   * Get personalDetails
   * @return personalDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TaskDescription getPersonalDetails() {
    return personalDetails;
  }


  public void setPersonalDetails(TaskDescription personalDetails) {
    
    
    
    this.personalDetails = personalDetails;
  }


  public OnboardingTasks pricingPlanDetails(TaskDescription pricingPlanDetails) {
    
    
    
    
    this.pricingPlanDetails = pricingPlanDetails;
    return this;
  }

   /**
   * Get pricingPlanDetails
   * @return pricingPlanDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TaskDescription getPricingPlanDetails() {
    return pricingPlanDetails;
  }


  public void setPricingPlanDetails(TaskDescription pricingPlanDetails) {
    
    
    
    this.pricingPlanDetails = pricingPlanDetails;
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
   * @return the OnboardingTasks instance itself
   */
  public OnboardingTasks putAdditionalProperty(String key, Object value) {
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
    OnboardingTasks onboardingTasks = (OnboardingTasks) o;
    return Objects.equals(this.addressDetails, onboardingTasks.addressDetails) &&
        Objects.equals(this.administrativeDetails, onboardingTasks.administrativeDetails) &&
        Objects.equals(this.bankAccountDetails, onboardingTasks.bankAccountDetails) &&
        Objects.equals(this.billingAddressDetails, onboardingTasks.billingAddressDetails) &&
        Objects.equals(this.contractDetails, onboardingTasks.contractDetails) &&
        Objects.equals(this.emergencyContactDetails, onboardingTasks.emergencyContactDetails) &&
        Objects.equals(this.employmentDocumentDetails, onboardingTasks.employmentDocumentDetails) &&
        Objects.equals(this.personalDetails, onboardingTasks.personalDetails) &&
        Objects.equals(this.pricingPlanDetails, onboardingTasks.pricingPlanDetails)&&
        Objects.equals(this.additionalProperties, onboardingTasks.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressDetails, administrativeDetails, bankAccountDetails, billingAddressDetails, contractDetails, emergencyContactDetails, employmentDocumentDetails, personalDetails, pricingPlanDetails, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnboardingTasks {\n");
    sb.append("    addressDetails: ").append(toIndentedString(addressDetails)).append("\n");
    sb.append("    administrativeDetails: ").append(toIndentedString(administrativeDetails)).append("\n");
    sb.append("    bankAccountDetails: ").append(toIndentedString(bankAccountDetails)).append("\n");
    sb.append("    billingAddressDetails: ").append(toIndentedString(billingAddressDetails)).append("\n");
    sb.append("    contractDetails: ").append(toIndentedString(contractDetails)).append("\n");
    sb.append("    emergencyContactDetails: ").append(toIndentedString(emergencyContactDetails)).append("\n");
    sb.append("    employmentDocumentDetails: ").append(toIndentedString(employmentDocumentDetails)).append("\n");
    sb.append("    personalDetails: ").append(toIndentedString(personalDetails)).append("\n");
    sb.append("    pricingPlanDetails: ").append(toIndentedString(pricingPlanDetails)).append("\n");
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
    openapiFields.add("administrative_details");
    openapiFields.add("bank_account_details");
    openapiFields.add("billing_address_details");
    openapiFields.add("contract_details");
    openapiFields.add("emergency_contact_details");
    openapiFields.add("employment_document_details");
    openapiFields.add("personal_details");
    openapiFields.add("pricing_plan_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("address_details");
    openapiRequiredFields.add("administrative_details");
    openapiRequiredFields.add("bank_account_details");
    openapiRequiredFields.add("billing_address_details");
    openapiRequiredFields.add("contract_details");
    openapiRequiredFields.add("emergency_contact_details");
    openapiRequiredFields.add("employment_document_details");
    openapiRequiredFields.add("personal_details");
    openapiRequiredFields.add("pricing_plan_details");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OnboardingTasks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OnboardingTasks.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OnboardingTasks is not found in the empty JSON string", OnboardingTasks.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OnboardingTasks.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `address_details`
      TaskDescription.validateJsonObject(jsonObj.getAsJsonObject("address_details"));
      // validate the required field `administrative_details`
      TaskDescription.validateJsonObject(jsonObj.getAsJsonObject("administrative_details"));
      // validate the required field `bank_account_details`
      TaskDescription.validateJsonObject(jsonObj.getAsJsonObject("bank_account_details"));
      // validate the required field `billing_address_details`
      TaskDescription.validateJsonObject(jsonObj.getAsJsonObject("billing_address_details"));
      // validate the required field `contract_details`
      TaskDescription.validateJsonObject(jsonObj.getAsJsonObject("contract_details"));
      // validate the required field `emergency_contact_details`
      TaskDescription.validateJsonObject(jsonObj.getAsJsonObject("emergency_contact_details"));
      // validate the required field `employment_document_details`
      TaskDescription.validateJsonObject(jsonObj.getAsJsonObject("employment_document_details"));
      // validate the required field `personal_details`
      TaskDescription.validateJsonObject(jsonObj.getAsJsonObject("personal_details"));
      // validate the required field `pricing_plan_details`
      TaskDescription.validateJsonObject(jsonObj.getAsJsonObject("pricing_plan_details"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OnboardingTasks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OnboardingTasks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OnboardingTasks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OnboardingTasks.class));

       return (TypeAdapter<T>) new TypeAdapter<OnboardingTasks>() {
           @Override
           public void write(JsonWriter out, OnboardingTasks value) throws IOException {
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
           public OnboardingTasks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OnboardingTasks instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OnboardingTasks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OnboardingTasks
  * @throws IOException if the JSON string is invalid with respect to OnboardingTasks
  */
  public static OnboardingTasks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OnboardingTasks.class);
  }

 /**
  * Convert an instance of OnboardingTasks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

