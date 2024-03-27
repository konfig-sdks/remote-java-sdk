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
import com.konfigthis.client.model.BenefitsCountrySummary;
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
 * ListBenefitsCountrySummaryResponseData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ListBenefitsCountrySummaryResponseData {
  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_COUNTRY_SUMMARIES = "country_summaries";
  @SerializedName(SERIALIZED_NAME_COUNTRY_SUMMARIES)
  private List<BenefitsCountrySummary> countrySummaries = new ArrayList<>();

  public ListBenefitsCountrySummaryResponseData() {
  }

  public ListBenefitsCountrySummaryResponseData companyId(String companyId) {
    
    
    
    
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "79297cfd-cf60-4cf4-a70f-ac2061d72a74", required = true, value = "")

  public String getCompanyId() {
    return companyId;
  }


  public void setCompanyId(String companyId) {
    
    
    
    this.companyId = companyId;
  }


  public ListBenefitsCountrySummaryResponseData countrySummaries(List<BenefitsCountrySummary> countrySummaries) {
    
    
    
    
    this.countrySummaries = countrySummaries;
    return this;
  }

  public ListBenefitsCountrySummaryResponseData addCountrySummariesItem(BenefitsCountrySummary countrySummariesItem) {
    this.countrySummaries.add(countrySummariesItem);
    return this;
  }

   /**
   * Get countrySummaries
   * @return countrySummaries
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<BenefitsCountrySummary> getCountrySummaries() {
    return countrySummaries;
  }


  public void setCountrySummaries(List<BenefitsCountrySummary> countrySummaries) {
    
    
    
    this.countrySummaries = countrySummaries;
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
   * @return the ListBenefitsCountrySummaryResponseData instance itself
   */
  public ListBenefitsCountrySummaryResponseData putAdditionalProperty(String key, Object value) {
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
    ListBenefitsCountrySummaryResponseData listBenefitsCountrySummaryResponseData = (ListBenefitsCountrySummaryResponseData) o;
    return Objects.equals(this.companyId, listBenefitsCountrySummaryResponseData.companyId) &&
        Objects.equals(this.countrySummaries, listBenefitsCountrySummaryResponseData.countrySummaries)&&
        Objects.equals(this.additionalProperties, listBenefitsCountrySummaryResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, countrySummaries, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBenefitsCountrySummaryResponseData {\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    countrySummaries: ").append(toIndentedString(countrySummaries)).append("\n");
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
    openapiFields.add("company_id");
    openapiFields.add("country_summaries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("company_id");
    openapiRequiredFields.add("country_summaries");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListBenefitsCountrySummaryResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListBenefitsCountrySummaryResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListBenefitsCountrySummaryResponseData is not found in the empty JSON string", ListBenefitsCountrySummaryResponseData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListBenefitsCountrySummaryResponseData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("company_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_id").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("country_summaries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_summaries` to be an array in the JSON string but got `%s`", jsonObj.get("country_summaries").toString()));
      }

      JsonArray jsonArraycountrySummaries = jsonObj.getAsJsonArray("country_summaries");
      // validate the required field `country_summaries` (array)
      for (int i = 0; i < jsonArraycountrySummaries.size(); i++) {
        BenefitsCountrySummary.validateJsonObject(jsonArraycountrySummaries.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListBenefitsCountrySummaryResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListBenefitsCountrySummaryResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListBenefitsCountrySummaryResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListBenefitsCountrySummaryResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ListBenefitsCountrySummaryResponseData>() {
           @Override
           public void write(JsonWriter out, ListBenefitsCountrySummaryResponseData value) throws IOException {
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
           public ListBenefitsCountrySummaryResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ListBenefitsCountrySummaryResponseData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ListBenefitsCountrySummaryResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListBenefitsCountrySummaryResponseData
  * @throws IOException if the JSON string is invalid with respect to ListBenefitsCountrySummaryResponseData
  */
  public static ListBenefitsCountrySummaryResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListBenefitsCountrySummaryResponseData.class);
  }

 /**
  * Convert an instance of ListBenefitsCountrySummaryResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

