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
import com.konfigthis.client.model.CostCalculatorEmploymentParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * CostCalculatorEstimateParams
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CostCalculatorEstimateParams {
  public static final String SERIALIZED_NAME_EMPLOYER_CURRENCY_SLUG = "employer_currency_slug";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_CURRENCY_SLUG)
  private String employerCurrencySlug;

  public static final String SERIALIZED_NAME_EMPLOYMENTS = "employments";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENTS)
  private List<CostCalculatorEmploymentParam> employments = new ArrayList<>();

  public static final String SERIALIZED_NAME_INCLUDE_BENEFITS = "include_benefits";
  @SerializedName(SERIALIZED_NAME_INCLUDE_BENEFITS)
  private Boolean includeBenefits;

  public static final String SERIALIZED_NAME_INCLUDE_COST_BREAKDOWNS = "include_cost_breakdowns";
  @SerializedName(SERIALIZED_NAME_INCLUDE_COST_BREAKDOWNS)
  private Boolean includeCostBreakdowns;

  public CostCalculatorEstimateParams() {
  }

  public CostCalculatorEstimateParams employerCurrencySlug(String employerCurrencySlug) {
    
    
    
    
    this.employerCurrencySlug = employerCurrencySlug;
    return this;
  }

   /**
   * Currency Slug
   * @return employerCurrencySlug
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "663e0b79-c893-45ff-a1b2-f6dcabc098b5", required = true, value = "Currency Slug")

  public String getEmployerCurrencySlug() {
    return employerCurrencySlug;
  }


  public void setEmployerCurrencySlug(String employerCurrencySlug) {
    
    
    
    this.employerCurrencySlug = employerCurrencySlug;
  }


  public CostCalculatorEstimateParams employments(List<CostCalculatorEmploymentParam> employments) {
    
    
    
    
    this.employments = employments;
    return this;
  }

  public CostCalculatorEstimateParams addEmploymentsItem(CostCalculatorEmploymentParam employmentsItem) {
    this.employments.add(employmentsItem);
    return this;
  }

   /**
   * Get employments
   * @return employments
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<CostCalculatorEmploymentParam> getEmployments() {
    return employments;
  }


  public void setEmployments(List<CostCalculatorEmploymentParam> employments) {
    
    
    
    this.employments = employments;
  }


  public CostCalculatorEstimateParams includeBenefits(Boolean includeBenefits) {
    
    
    
    
    this.includeBenefits = includeBenefits;
    return this;
  }

   /**
   * Get includeBenefits
   * @return includeBenefits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIncludeBenefits() {
    return includeBenefits;
  }


  public void setIncludeBenefits(Boolean includeBenefits) {
    
    
    
    this.includeBenefits = includeBenefits;
  }


  public CostCalculatorEstimateParams includeCostBreakdowns(Boolean includeCostBreakdowns) {
    
    
    
    
    this.includeCostBreakdowns = includeCostBreakdowns;
    return this;
  }

   /**
   * Get includeCostBreakdowns
   * @return includeCostBreakdowns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIncludeCostBreakdowns() {
    return includeCostBreakdowns;
  }


  public void setIncludeCostBreakdowns(Boolean includeCostBreakdowns) {
    
    
    
    this.includeCostBreakdowns = includeCostBreakdowns;
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
   * @return the CostCalculatorEstimateParams instance itself
   */
  public CostCalculatorEstimateParams putAdditionalProperty(String key, Object value) {
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
    CostCalculatorEstimateParams costCalculatorEstimateParams = (CostCalculatorEstimateParams) o;
    return Objects.equals(this.employerCurrencySlug, costCalculatorEstimateParams.employerCurrencySlug) &&
        Objects.equals(this.employments, costCalculatorEstimateParams.employments) &&
        Objects.equals(this.includeBenefits, costCalculatorEstimateParams.includeBenefits) &&
        Objects.equals(this.includeCostBreakdowns, costCalculatorEstimateParams.includeCostBreakdowns)&&
        Objects.equals(this.additionalProperties, costCalculatorEstimateParams.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employerCurrencySlug, employments, includeBenefits, includeCostBreakdowns, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostCalculatorEstimateParams {\n");
    sb.append("    employerCurrencySlug: ").append(toIndentedString(employerCurrencySlug)).append("\n");
    sb.append("    employments: ").append(toIndentedString(employments)).append("\n");
    sb.append("    includeBenefits: ").append(toIndentedString(includeBenefits)).append("\n");
    sb.append("    includeCostBreakdowns: ").append(toIndentedString(includeCostBreakdowns)).append("\n");
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
    openapiFields.add("employer_currency_slug");
    openapiFields.add("employments");
    openapiFields.add("include_benefits");
    openapiFields.add("include_cost_breakdowns");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("employer_currency_slug");
    openapiRequiredFields.add("employments");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CostCalculatorEstimateParams
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CostCalculatorEstimateParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CostCalculatorEstimateParams is not found in the empty JSON string", CostCalculatorEstimateParams.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CostCalculatorEstimateParams.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("employer_currency_slug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employer_currency_slug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employer_currency_slug").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("employments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `employments` to be an array in the JSON string but got `%s`", jsonObj.get("employments").toString()));
      }

      JsonArray jsonArrayemployments = jsonObj.getAsJsonArray("employments");
      // validate the required field `employments` (array)
      for (int i = 0; i < jsonArrayemployments.size(); i++) {
        CostCalculatorEmploymentParam.validateJsonObject(jsonArrayemployments.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CostCalculatorEstimateParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CostCalculatorEstimateParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CostCalculatorEstimateParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CostCalculatorEstimateParams.class));

       return (TypeAdapter<T>) new TypeAdapter<CostCalculatorEstimateParams>() {
           @Override
           public void write(JsonWriter out, CostCalculatorEstimateParams value) throws IOException {
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
           public CostCalculatorEstimateParams read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CostCalculatorEstimateParams instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CostCalculatorEstimateParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CostCalculatorEstimateParams
  * @throws IOException if the JSON string is invalid with respect to CostCalculatorEstimateParams
  */
  public static CostCalculatorEstimateParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CostCalculatorEstimateParams.class);
  }

 /**
  * Convert an instance of CostCalculatorEstimateParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

