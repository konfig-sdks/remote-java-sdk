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
import com.konfigthis.client.model.CostCalculatorCosts;
import com.konfigthis.client.model.MinimalCountry;
import com.konfigthis.client.model.MinimalRegion;
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
 * CostCalculatorEmployment
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CostCalculatorEmployment {
  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private MinimalCountry country;

  public static final String SERIALIZED_NAME_EMPLOYER_CURRENCY_COSTS = "employer_currency_costs";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_CURRENCY_COSTS)
  private CostCalculatorCosts employerCurrencyCosts;

  public static final String SERIALIZED_NAME_HAS_EXTRA_STATUTORY_PAYMENT = "has_extra_statutory_payment";
  @SerializedName(SERIALIZED_NAME_HAS_EXTRA_STATUTORY_PAYMENT)
  private Boolean hasExtraStatutoryPayment;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private MinimalRegion region;

  public static final String SERIALIZED_NAME_REGIONAL_CURRENCY_COSTS = "regional_currency_costs";
  @SerializedName(SERIALIZED_NAME_REGIONAL_CURRENCY_COSTS)
  private CostCalculatorCosts regionalCurrencyCosts;

  public CostCalculatorEmployment() {
  }

  public CostCalculatorEmployment country(MinimalCountry country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MinimalCountry getCountry() {
    return country;
  }


  public void setCountry(MinimalCountry country) {
    
    
    
    this.country = country;
  }


  public CostCalculatorEmployment employerCurrencyCosts(CostCalculatorCosts employerCurrencyCosts) {
    
    
    
    
    this.employerCurrencyCosts = employerCurrencyCosts;
    return this;
  }

   /**
   * Get employerCurrencyCosts
   * @return employerCurrencyCosts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CostCalculatorCosts getEmployerCurrencyCosts() {
    return employerCurrencyCosts;
  }


  public void setEmployerCurrencyCosts(CostCalculatorCosts employerCurrencyCosts) {
    
    
    
    this.employerCurrencyCosts = employerCurrencyCosts;
  }


  public CostCalculatorEmployment hasExtraStatutoryPayment(Boolean hasExtraStatutoryPayment) {
    
    
    
    
    this.hasExtraStatutoryPayment = hasExtraStatutoryPayment;
    return this;
  }

   /**
   * Get hasExtraStatutoryPayment
   * @return hasExtraStatutoryPayment
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "")

  public Boolean getHasExtraStatutoryPayment() {
    return hasExtraStatutoryPayment;
  }


  public void setHasExtraStatutoryPayment(Boolean hasExtraStatutoryPayment) {
    
    
    
    this.hasExtraStatutoryPayment = hasExtraStatutoryPayment;
  }


  public CostCalculatorEmployment region(MinimalRegion region) {
    
    
    
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public MinimalRegion getRegion() {
    return region;
  }


  public void setRegion(MinimalRegion region) {
    
    
    
    this.region = region;
  }


  public CostCalculatorEmployment regionalCurrencyCosts(CostCalculatorCosts regionalCurrencyCosts) {
    
    
    
    
    this.regionalCurrencyCosts = regionalCurrencyCosts;
    return this;
  }

   /**
   * Get regionalCurrencyCosts
   * @return regionalCurrencyCosts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CostCalculatorCosts getRegionalCurrencyCosts() {
    return regionalCurrencyCosts;
  }


  public void setRegionalCurrencyCosts(CostCalculatorCosts regionalCurrencyCosts) {
    
    
    
    this.regionalCurrencyCosts = regionalCurrencyCosts;
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
   * @return the CostCalculatorEmployment instance itself
   */
  public CostCalculatorEmployment putAdditionalProperty(String key, Object value) {
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
    CostCalculatorEmployment costCalculatorEmployment = (CostCalculatorEmployment) o;
    return Objects.equals(this.country, costCalculatorEmployment.country) &&
        Objects.equals(this.employerCurrencyCosts, costCalculatorEmployment.employerCurrencyCosts) &&
        Objects.equals(this.hasExtraStatutoryPayment, costCalculatorEmployment.hasExtraStatutoryPayment) &&
        Objects.equals(this.region, costCalculatorEmployment.region) &&
        Objects.equals(this.regionalCurrencyCosts, costCalculatorEmployment.regionalCurrencyCosts)&&
        Objects.equals(this.additionalProperties, costCalculatorEmployment.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, employerCurrencyCosts, hasExtraStatutoryPayment, region, regionalCurrencyCosts, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostCalculatorEmployment {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    employerCurrencyCosts: ").append(toIndentedString(employerCurrencyCosts)).append("\n");
    sb.append("    hasExtraStatutoryPayment: ").append(toIndentedString(hasExtraStatutoryPayment)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    regionalCurrencyCosts: ").append(toIndentedString(regionalCurrencyCosts)).append("\n");
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
    openapiFields.add("country");
    openapiFields.add("employer_currency_costs");
    openapiFields.add("has_extra_statutory_payment");
    openapiFields.add("region");
    openapiFields.add("regional_currency_costs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("country");
    openapiRequiredFields.add("employer_currency_costs");
    openapiRequiredFields.add("has_extra_statutory_payment");
    openapiRequiredFields.add("region");
    openapiRequiredFields.add("regional_currency_costs");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CostCalculatorEmployment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CostCalculatorEmployment.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CostCalculatorEmployment is not found in the empty JSON string", CostCalculatorEmployment.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CostCalculatorEmployment.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `country`
      MinimalCountry.validateJsonObject(jsonObj.getAsJsonObject("country"));
      // validate the required field `employer_currency_costs`
      CostCalculatorCosts.validateJsonObject(jsonObj.getAsJsonObject("employer_currency_costs"));
      // validate the required field `region`
      MinimalRegion.validateJsonObject(jsonObj.getAsJsonObject("region"));
      // validate the required field `regional_currency_costs`
      CostCalculatorCosts.validateJsonObject(jsonObj.getAsJsonObject("regional_currency_costs"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CostCalculatorEmployment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CostCalculatorEmployment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CostCalculatorEmployment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CostCalculatorEmployment.class));

       return (TypeAdapter<T>) new TypeAdapter<CostCalculatorEmployment>() {
           @Override
           public void write(JsonWriter out, CostCalculatorEmployment value) throws IOException {
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
           public CostCalculatorEmployment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CostCalculatorEmployment instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CostCalculatorEmployment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CostCalculatorEmployment
  * @throws IOException if the JSON string is invalid with respect to CostCalculatorEmployment
  */
  public static CostCalculatorEmployment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CostCalculatorEmployment.class);
  }

 /**
  * Convert an instance of CostCalculatorEmployment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

