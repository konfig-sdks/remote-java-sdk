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
 * Required params to trigger a webhook event in the Sandbox environment
 */
@ApiModel(description = "Required params to trigger a webhook event in the Sandbox environment")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WebhookTriggerParams {
  public static final String SERIALIZED_NAME_EMPLOYMENT_ID = "employment_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_ID)
  private String employmentId;

  /**
   * Gets or Sets eventType
   */
  @JsonAdapter(EventTypeEnum.Adapter.class)
 public enum EventTypeEnum {
    BILLING_DOCUMENT_ISSUED("billing_document.issued"),
    
    CONTRACT_AMENDMENT_CANCELED("contract_amendment.canceled"),
    
    CONTRACT_AMENDMENT_DELETED("contract_amendment.deleted"),
    
    CONTRACT_AMENDMENT_DONE("contract_amendment.done"),
    
    CONTRACT_AMENDMENT_REVIEW_STARTED("contract_amendment.review_started"),
    
    CONTRACT_AMENDMENT_SUBMITTED("contract_amendment.submitted"),
    
    EMPLOYMENT_CONTRACT_ACTIVE_CONTRACT_UPDATED("employment_contract.active_contract_updated"),
    
    EMPLOYMENT_ACCOUNT_UPDATED("employment.account.updated"),
    
    EMPLOYMENT_DETAILS_UPDATED("employment.details.updated"),
    
    EMPLOYMENT_ONBOARDING_TASK_COMPLETED("employment.onboarding_task.completed"),
    
    EMPLOYMENT_ONBOARDING_COMPLETED("employment.onboarding.completed"),
    
    EMPLOYMENT_PERSONAL_INFORMATION_UPDATED("employment.personal_information.updated"),
    
    EMPLOYMENT_USER_STATUS_ACTIVATED("employment.user_status.activated"),
    
    EMPLOYMENT_USER_STATUS_DEACTIVATED("employment.user_status.deactivated"),
    
    EXPENSE_APPROVED("expense.approved"),
    
    EXPENSE_DECLINED("expense.declined"),
    
    EXPENSE_DELETED("expense.deleted"),
    
    EXPENSE_REIMBURSED("expense.reimbursed"),
    
    EXPENSE_SUBMITTED("expense.submitted"),
    
    EXPENSE_UPDATED("expense.updated"),
    
    INCENTIVE_CREATED("incentive.created"),
    
    INCENTIVE_DELETED("incentive.deleted"),
    
    INCENTIVE_PAID("incentive.paid"),
    
    INCENTIVE_PROCESSING_STARTED("incentive.processing_started"),
    
    INCENTIVE_UPDATED("incentive.updated"),
    
    OFFBOARDING_DELETED("offboarding.deleted"),
    
    OFFBOARDING_DONE("offboarding.done"),
    
    OFFBOARDING_REVIEW_STARTED("offboarding.review_started"),
    
    OFFBOARDING_SUBMITTED("offboarding.submitted"),
    
    PAYSLIP_RELEASED("payslip.released"),
    
    TIMEOFF_APPROVED("timeoff.approved"),
    
    TIMEOFF_CANCELED("timeoff.canceled"),
    
    TIMEOFF_DATE_CHANGED("timeoff.date_changed"),
    
    TIMEOFF_DECLINED("timeoff.declined"),
    
    TIMEOFF_REQUESTED("timeoff.requested"),
    
    TIMEOFF_TAKEN("timeoff.taken"),
    
    TIMEOFF_UPDATED("timeoff.updated");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventTypeEnum fromValue(String value) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private EventTypeEnum eventType;

  public WebhookTriggerParams() {
  }

  public WebhookTriggerParams employmentId(String employmentId) {
    
    
    
    
    this.employmentId = employmentId;
    return this;
  }

   /**
   * Get employmentId
   * @return employmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "e966a8b8-1076-11ee-a5f2-9b3997a968f6", value = "")

  public String getEmploymentId() {
    return employmentId;
  }


  public void setEmploymentId(String employmentId) {
    
    
    
    this.employmentId = employmentId;
  }


  public WebhookTriggerParams eventType(EventTypeEnum eventType) {
    
    
    
    
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EMPLOYMENT_ONBOARDING_TASK_COMPLETED", value = "")

  public EventTypeEnum getEventType() {
    return eventType;
  }


  public void setEventType(EventTypeEnum eventType) {
    
    
    
    this.eventType = eventType;
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
   * @return the WebhookTriggerParams instance itself
   */
  public WebhookTriggerParams putAdditionalProperty(String key, Object value) {
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
    WebhookTriggerParams webhookTriggerParams = (WebhookTriggerParams) o;
    return Objects.equals(this.employmentId, webhookTriggerParams.employmentId) &&
        Objects.equals(this.eventType, webhookTriggerParams.eventType)&&
        Objects.equals(this.additionalProperties, webhookTriggerParams.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employmentId, eventType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookTriggerParams {\n");
    sb.append("    employmentId: ").append(toIndentedString(employmentId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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
    openapiFields.add("employment_id");
    openapiFields.add("event_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookTriggerParams
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebhookTriggerParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookTriggerParams is not found in the empty JSON string", WebhookTriggerParams.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("employment_id") != null && !jsonObj.get("employment_id").isJsonNull()) && !jsonObj.get("employment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employment_id").toString()));
      }
      if ((jsonObj.get("event_type") != null && !jsonObj.get("event_type").isJsonNull()) && !jsonObj.get("event_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookTriggerParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookTriggerParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookTriggerParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookTriggerParams.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookTriggerParams>() {
           @Override
           public void write(JsonWriter out, WebhookTriggerParams value) throws IOException {
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
           public WebhookTriggerParams read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WebhookTriggerParams instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebhookTriggerParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookTriggerParams
  * @throws IOException if the JSON string is invalid with respect to WebhookTriggerParams
  */
  public static WebhookTriggerParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookTriggerParams.class);
  }

 /**
  * Convert an instance of WebhookTriggerParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

