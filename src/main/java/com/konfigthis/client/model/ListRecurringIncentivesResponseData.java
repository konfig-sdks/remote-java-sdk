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
import com.konfigthis.client.model.RecurringIncentive;
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
 * ListRecurringIncentivesResponseData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ListRecurringIncentivesResponseData {
  public static final String SERIALIZED_NAME_CURRENT_PAGE = "current_page";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE)
  private Integer currentPage;

  public static final String SERIALIZED_NAME_RECURRING_INCENTIVES = "recurring_incentives";
  @SerializedName(SERIALIZED_NAME_RECURRING_INCENTIVES)
  private List<RecurringIncentive> recurringIncentives = null;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "total_pages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Integer totalPages;

  public ListRecurringIncentivesResponseData() {
  }

  public ListRecurringIncentivesResponseData currentPage(Integer currentPage) {
    
    
    
    
    this.currentPage = currentPage;
    return this;
  }

   /**
   * The current page among all of the total_pages
   * @return currentPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current page among all of the total_pages")

  public Integer getCurrentPage() {
    return currentPage;
  }


  public void setCurrentPage(Integer currentPage) {
    
    
    
    this.currentPage = currentPage;
  }


  public ListRecurringIncentivesResponseData recurringIncentives(List<RecurringIncentive> recurringIncentives) {
    
    
    
    
    this.recurringIncentives = recurringIncentives;
    return this;
  }

  public ListRecurringIncentivesResponseData addRecurringIncentivesItem(RecurringIncentive recurringIncentivesItem) {
    if (this.recurringIncentives == null) {
      this.recurringIncentives = new ArrayList<>();
    }
    this.recurringIncentives.add(recurringIncentivesItem);
    return this;
  }

   /**
   * Get recurringIncentives
   * @return recurringIncentives
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RecurringIncentive> getRecurringIncentives() {
    return recurringIncentives;
  }


  public void setRecurringIncentives(List<RecurringIncentive> recurringIncentives) {
    
    
    
    this.recurringIncentives = recurringIncentives;
  }


  public ListRecurringIncentivesResponseData totalCount(Integer totalCount) {
    
    
    
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * The total number of records in the result
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of records in the result")

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    
    
    
    this.totalCount = totalCount;
  }


  public ListRecurringIncentivesResponseData totalPages(Integer totalPages) {
    
    
    
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * The total number of pages the user can go through
   * @return totalPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of pages the user can go through")

  public Integer getTotalPages() {
    return totalPages;
  }


  public void setTotalPages(Integer totalPages) {
    
    
    
    this.totalPages = totalPages;
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
   * @return the ListRecurringIncentivesResponseData instance itself
   */
  public ListRecurringIncentivesResponseData putAdditionalProperty(String key, Object value) {
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
    ListRecurringIncentivesResponseData listRecurringIncentivesResponseData = (ListRecurringIncentivesResponseData) o;
    return Objects.equals(this.currentPage, listRecurringIncentivesResponseData.currentPage) &&
        Objects.equals(this.recurringIncentives, listRecurringIncentivesResponseData.recurringIncentives) &&
        Objects.equals(this.totalCount, listRecurringIncentivesResponseData.totalCount) &&
        Objects.equals(this.totalPages, listRecurringIncentivesResponseData.totalPages)&&
        Objects.equals(this.additionalProperties, listRecurringIncentivesResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, recurringIncentives, totalCount, totalPages, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRecurringIncentivesResponseData {\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    recurringIncentives: ").append(toIndentedString(recurringIncentives)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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
    openapiFields.add("current_page");
    openapiFields.add("recurring_incentives");
    openapiFields.add("total_count");
    openapiFields.add("total_pages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListRecurringIncentivesResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListRecurringIncentivesResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListRecurringIncentivesResponseData is not found in the empty JSON string", ListRecurringIncentivesResponseData.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("recurring_incentives") != null && !jsonObj.get("recurring_incentives").isJsonNull()) {
        JsonArray jsonArrayrecurringIncentives = jsonObj.getAsJsonArray("recurring_incentives");
        if (jsonArrayrecurringIncentives != null) {
          // ensure the json data is an array
          if (!jsonObj.get("recurring_incentives").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `recurring_incentives` to be an array in the JSON string but got `%s`", jsonObj.get("recurring_incentives").toString()));
          }

          // validate the optional field `recurring_incentives` (array)
          for (int i = 0; i < jsonArrayrecurringIncentives.size(); i++) {
            RecurringIncentive.validateJsonObject(jsonArrayrecurringIncentives.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListRecurringIncentivesResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListRecurringIncentivesResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListRecurringIncentivesResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListRecurringIncentivesResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ListRecurringIncentivesResponseData>() {
           @Override
           public void write(JsonWriter out, ListRecurringIncentivesResponseData value) throws IOException {
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
           public ListRecurringIncentivesResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ListRecurringIncentivesResponseData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ListRecurringIncentivesResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListRecurringIncentivesResponseData
  * @throws IOException if the JSON string is invalid with respect to ListRecurringIncentivesResponseData
  */
  public static ListRecurringIncentivesResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListRecurringIncentivesResponseData.class);
  }

 /**
  * Convert an instance of ListRecurringIncentivesResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

