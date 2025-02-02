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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * The details of the salary decrease request if there is one
 */
@ApiModel(description = "The details of the salary decrease request if there is one")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SalaryDecreaseDetails {
  /**
   * Gets or Sets salaryDecreaseReason
   */
  @JsonAdapter(SalaryDecreaseReasonEnum.Adapter.class)
 public enum SalaryDecreaseReasonEnum {
    CHANGE_IN_WORKING_HOURS("change_in_working_hours"),
    
    TRADE_SALARY_FOR_EQUITY("trade_salary_for_equity"),
    
    ERROR_IN_INITIAL_SALARY("error_in_initial_salary"),
    
    ROLE_CHANGE_OR_DEMOTION("role_change_or_demotion"),
    
    COMPENSATION_RESTRUCTURE("compensation_restructure"),
    
    OTHER("other");

    private String value;

    SalaryDecreaseReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SalaryDecreaseReasonEnum fromValue(String value) {
      for (SalaryDecreaseReasonEnum b : SalaryDecreaseReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SalaryDecreaseReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SalaryDecreaseReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SalaryDecreaseReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SalaryDecreaseReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SALARY_DECREASE_REASON = "salary_decrease_reason";
  @SerializedName(SERIALIZED_NAME_SALARY_DECREASE_REASON)
  private SalaryDecreaseReasonEnum salaryDecreaseReason;

  public static final String SERIALIZED_NAME_SALARY_DECREASE_REASON_DESCRIPTION = "salary_decrease_reason_description";
  @SerializedName(SERIALIZED_NAME_SALARY_DECREASE_REASON_DESCRIPTION)
  private String salaryDecreaseReasonDescription;

  public static final String SERIALIZED_NAME_WAS_EMPLOYEE_INFORMED = "was_employee_informed";
  @SerializedName(SERIALIZED_NAME_WAS_EMPLOYEE_INFORMED)
  private String wasEmployeeInformed;

  public SalaryDecreaseDetails() {
  }

  public SalaryDecreaseDetails salaryDecreaseReason(SalaryDecreaseReasonEnum salaryDecreaseReason) {
    
    
    
    
    this.salaryDecreaseReason = salaryDecreaseReason;
    return this;
  }

   /**
   * Get salaryDecreaseReason
   * @return salaryDecreaseReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SalaryDecreaseReasonEnum getSalaryDecreaseReason() {
    return salaryDecreaseReason;
  }


  public void setSalaryDecreaseReason(SalaryDecreaseReasonEnum salaryDecreaseReason) {
    
    
    
    this.salaryDecreaseReason = salaryDecreaseReason;
  }


  public SalaryDecreaseDetails salaryDecreaseReasonDescription(String salaryDecreaseReasonDescription) {
    
    
    
    
    this.salaryDecreaseReasonDescription = salaryDecreaseReasonDescription;
    return this;
  }

   /**
   * Get salaryDecreaseReasonDescription
   * @return salaryDecreaseReasonDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSalaryDecreaseReasonDescription() {
    return salaryDecreaseReasonDescription;
  }


  public void setSalaryDecreaseReasonDescription(String salaryDecreaseReasonDescription) {
    
    
    
    this.salaryDecreaseReasonDescription = salaryDecreaseReasonDescription;
  }


  public SalaryDecreaseDetails wasEmployeeInformed(String wasEmployeeInformed) {
    
    
    
    
    this.wasEmployeeInformed = wasEmployeeInformed;
    return this;
  }

   /**
   * Get wasEmployeeInformed
   * @return wasEmployeeInformed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWasEmployeeInformed() {
    return wasEmployeeInformed;
  }


  public void setWasEmployeeInformed(String wasEmployeeInformed) {
    
    
    
    this.wasEmployeeInformed = wasEmployeeInformed;
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
   * @return the SalaryDecreaseDetails instance itself
   */
  public SalaryDecreaseDetails putAdditionalProperty(String key, Object value) {
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
    SalaryDecreaseDetails salaryDecreaseDetails = (SalaryDecreaseDetails) o;
    return Objects.equals(this.salaryDecreaseReason, salaryDecreaseDetails.salaryDecreaseReason) &&
        Objects.equals(this.salaryDecreaseReasonDescription, salaryDecreaseDetails.salaryDecreaseReasonDescription) &&
        Objects.equals(this.wasEmployeeInformed, salaryDecreaseDetails.wasEmployeeInformed)&&
        Objects.equals(this.additionalProperties, salaryDecreaseDetails.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(salaryDecreaseReason, salaryDecreaseReasonDescription, wasEmployeeInformed, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalaryDecreaseDetails {\n");
    sb.append("    salaryDecreaseReason: ").append(toIndentedString(salaryDecreaseReason)).append("\n");
    sb.append("    salaryDecreaseReasonDescription: ").append(toIndentedString(salaryDecreaseReasonDescription)).append("\n");
    sb.append("    wasEmployeeInformed: ").append(toIndentedString(wasEmployeeInformed)).append("\n");
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
    openapiFields.add("salary_decrease_reason");
    openapiFields.add("salary_decrease_reason_description");
    openapiFields.add("was_employee_informed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SalaryDecreaseDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SalaryDecreaseDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SalaryDecreaseDetails is not found in the empty JSON string", SalaryDecreaseDetails.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("salary_decrease_reason") != null && !jsonObj.get("salary_decrease_reason").isJsonNull()) && !jsonObj.get("salary_decrease_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salary_decrease_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salary_decrease_reason").toString()));
      }
      if (!jsonObj.get("salary_decrease_reason_description").isJsonNull() && (jsonObj.get("salary_decrease_reason_description") != null && !jsonObj.get("salary_decrease_reason_description").isJsonNull()) && !jsonObj.get("salary_decrease_reason_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salary_decrease_reason_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salary_decrease_reason_description").toString()));
      }
      if ((jsonObj.get("was_employee_informed") != null && !jsonObj.get("was_employee_informed").isJsonNull()) && !jsonObj.get("was_employee_informed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `was_employee_informed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("was_employee_informed").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SalaryDecreaseDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SalaryDecreaseDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SalaryDecreaseDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SalaryDecreaseDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<SalaryDecreaseDetails>() {
           @Override
           public void write(JsonWriter out, SalaryDecreaseDetails value) throws IOException {
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
           public SalaryDecreaseDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SalaryDecreaseDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SalaryDecreaseDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SalaryDecreaseDetails
  * @throws IOException if the JSON string is invalid with respect to SalaryDecreaseDetails
  */
  public static SalaryDecreaseDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SalaryDecreaseDetails.class);
  }

 /**
  * Convert an instance of SalaryDecreaseDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

