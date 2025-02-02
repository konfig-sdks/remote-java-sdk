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
 * CreateApprovedTimeoffParamsAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CreateApprovedTimeoffParamsAllOf {
  public static final String SERIALIZED_NAME_APPROVED_AT = "approved_at";
  @SerializedName(SERIALIZED_NAME_APPROVED_AT)
  private OffsetDateTime approvedAt;

  public static final String SERIALIZED_NAME_APPROVER_ID = "approver_id";
  @SerializedName(SERIALIZED_NAME_APPROVER_ID)
  private String approverId;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    APPROVED("approved");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public CreateApprovedTimeoffParamsAllOf() {
  }

  public CreateApprovedTimeoffParamsAllOf approvedAt(OffsetDateTime approvedAt) {
    
    
    
    
    this.approvedAt = approvedAt;
    return this;
  }

   /**
   * UTC date time in [ISO 8601][] format.  [ISO 8601]: https://en.wikipedia.org/wiki/ISO_8601 
   * @return approvedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-07-15T18:18:17Z", value = "UTC date time in [ISO 8601][] format.  [ISO 8601]: https://en.wikipedia.org/wiki/ISO_8601 ")

  public OffsetDateTime getApprovedAt() {
    return approvedAt;
  }


  public void setApprovedAt(OffsetDateTime approvedAt) {
    
    
    
    this.approvedAt = approvedAt;
  }


  public CreateApprovedTimeoffParamsAllOf approverId(String approverId) {
    
    
    
    
    this.approverId = approverId;
    return this;
  }

   /**
   * The field matches the &#x60;id&#x60; of a user in the Remote Platform that has permission to approve time off requests. [Available users][] can be found fetching the [List Company Manager][] endpoint.  [Available users]: https://support.remote.com/hc/en-us/articles/360054668651-Approving-Declining-time-off-requests#h_01G0014GZKZ3EMN6P7C99HAK55 [List Company Manager]: https://gateway.remote.com/v1/docs/openapi.html#tag/Company-Managers 
   * @return approverId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "51546f60-dd71-4223-9312-4efede68a497", value = "The field matches the `id` of a user in the Remote Platform that has permission to approve time off requests. [Available users][] can be found fetching the [List Company Manager][] endpoint.  [Available users]: https://support.remote.com/hc/en-us/articles/360054668651-Approving-Declining-time-off-requests#h_01G0014GZKZ3EMN6P7C99HAK55 [List Company Manager]: https://gateway.remote.com/v1/docs/openapi.html#tag/Company-Managers ")

  public String getApproverId() {
    return approverId;
  }


  public void setApproverId(String approverId) {
    
    
    
    this.approverId = approverId;
  }


  public CreateApprovedTimeoffParamsAllOf status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
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
   * @return the CreateApprovedTimeoffParamsAllOf instance itself
   */
  public CreateApprovedTimeoffParamsAllOf putAdditionalProperty(String key, Object value) {
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
    CreateApprovedTimeoffParamsAllOf createApprovedTimeoffParamsAllOf = (CreateApprovedTimeoffParamsAllOf) o;
    return Objects.equals(this.approvedAt, createApprovedTimeoffParamsAllOf.approvedAt) &&
        Objects.equals(this.approverId, createApprovedTimeoffParamsAllOf.approverId) &&
        Objects.equals(this.status, createApprovedTimeoffParamsAllOf.status)&&
        Objects.equals(this.additionalProperties, createApprovedTimeoffParamsAllOf.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvedAt, approverId, status, additionalProperties);
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
    sb.append("class CreateApprovedTimeoffParamsAllOf {\n");
    sb.append("    approvedAt: ").append(toIndentedString(approvedAt)).append("\n");
    sb.append("    approverId: ").append(toIndentedString(approverId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("approved_at");
    openapiFields.add("approver_id");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateApprovedTimeoffParamsAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateApprovedTimeoffParamsAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateApprovedTimeoffParamsAllOf is not found in the empty JSON string", CreateApprovedTimeoffParamsAllOf.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("approver_id").isJsonNull() && (jsonObj.get("approver_id") != null && !jsonObj.get("approver_id").isJsonNull()) && !jsonObj.get("approver_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `approver_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("approver_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateApprovedTimeoffParamsAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateApprovedTimeoffParamsAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateApprovedTimeoffParamsAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateApprovedTimeoffParamsAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateApprovedTimeoffParamsAllOf>() {
           @Override
           public void write(JsonWriter out, CreateApprovedTimeoffParamsAllOf value) throws IOException {
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
           public CreateApprovedTimeoffParamsAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CreateApprovedTimeoffParamsAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateApprovedTimeoffParamsAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateApprovedTimeoffParamsAllOf
  * @throws IOException if the JSON string is invalid with respect to CreateApprovedTimeoffParamsAllOf
  */
  public static CreateApprovedTimeoffParamsAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateApprovedTimeoffParamsAllOf.class);
  }

 /**
  * Convert an instance of CreateApprovedTimeoffParamsAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

