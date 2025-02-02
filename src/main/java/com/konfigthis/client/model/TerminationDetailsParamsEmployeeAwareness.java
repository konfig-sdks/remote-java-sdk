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
import java.time.LocalDate;
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
 * Remote advises not to inform the employee of their termination until we review your request for legal risks. When we approve your request, you can inform the employee and we’ll take it from there. This field is only required if employee was informed before creating the offboarding request.
 */
@ApiModel(description = "Remote advises not to inform the employee of their termination until we review your request for legal risks. When we approve your request, you can inform the employee and we’ll take it from there. This field is only required if employee was informed before creating the offboarding request.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TerminationDetailsParamsEmployeeAwareness {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public TerminationDetailsParamsEmployeeAwareness() {
  }

  public TerminationDetailsParamsEmployeeAwareness date(LocalDate date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * When the employee was told about the termination.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mon Dec 11 16:00:00 PST 2023", value = "When the employee was told about the termination.")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    
    
    
    this.date = date;
  }


  public TerminationDetailsParamsEmployeeAwareness note(String note) {
    
    
    
    
    this.note = note;
    return this;
  }

   /**
   * Notes describing how the termination was shared with the employee. Remote advises being as specific as possible, and include details about the employee’s response, if applicable.
   * @return note
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "optional text to add details", value = "Notes describing how the termination was shared with the employee. Remote advises being as specific as possible, and include details about the employee’s response, if applicable.")

  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    
    
    
    this.note = note;
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
   * @return the TerminationDetailsParamsEmployeeAwareness instance itself
   */
  public TerminationDetailsParamsEmployeeAwareness putAdditionalProperty(String key, Object value) {
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
    TerminationDetailsParamsEmployeeAwareness terminationDetailsParamsEmployeeAwareness = (TerminationDetailsParamsEmployeeAwareness) o;
    return Objects.equals(this.date, terminationDetailsParamsEmployeeAwareness.date) &&
        Objects.equals(this.note, terminationDetailsParamsEmployeeAwareness.note)&&
        Objects.equals(this.additionalProperties, terminationDetailsParamsEmployeeAwareness.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, note, additionalProperties);
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
    sb.append("class TerminationDetailsParamsEmployeeAwareness {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("note");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TerminationDetailsParamsEmployeeAwareness
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TerminationDetailsParamsEmployeeAwareness.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TerminationDetailsParamsEmployeeAwareness is not found in the empty JSON string", TerminationDetailsParamsEmployeeAwareness.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("note").isJsonNull() && (jsonObj.get("note") != null && !jsonObj.get("note").isJsonNull()) && !jsonObj.get("note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TerminationDetailsParamsEmployeeAwareness.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TerminationDetailsParamsEmployeeAwareness' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TerminationDetailsParamsEmployeeAwareness> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TerminationDetailsParamsEmployeeAwareness.class));

       return (TypeAdapter<T>) new TypeAdapter<TerminationDetailsParamsEmployeeAwareness>() {
           @Override
           public void write(JsonWriter out, TerminationDetailsParamsEmployeeAwareness value) throws IOException {
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
           public TerminationDetailsParamsEmployeeAwareness read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TerminationDetailsParamsEmployeeAwareness instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TerminationDetailsParamsEmployeeAwareness given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TerminationDetailsParamsEmployeeAwareness
  * @throws IOException if the JSON string is invalid with respect to TerminationDetailsParamsEmployeeAwareness
  */
  public static TerminationDetailsParamsEmployeeAwareness fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TerminationDetailsParamsEmployeeAwareness.class);
  }

 /**
  * Convert an instance of TerminationDetailsParamsEmployeeAwareness to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

