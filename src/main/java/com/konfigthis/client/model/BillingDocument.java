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
import com.konfigthis.client.model.BillingDocumentAmountItem;
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
 * Information of a billing document
 */
@ApiModel(description = "Information of a billing document")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BillingDocument {
  public static final String SERIALIZED_NAME_BILLING_DOCUMENT_CURRENCY = "billing_document_currency";
  @SerializedName(SERIALIZED_NAME_BILLING_DOCUMENT_CURRENCY)
  private String billingDocumentCurrency;

  public static final String SERIALIZED_NAME_BILLING_DOCUMENT_PERIOD = "billing_document_period";
  @SerializedName(SERIALIZED_NAME_BILLING_DOCUMENT_PERIOD)
  private String billingDocumentPeriod;

  /**
   * Gets or Sets billingDocumentType
   */
  @JsonAdapter(BillingDocumentTypeEnum.Adapter.class)
 public enum BillingDocumentTypeEnum {
    RECONCILIATION_INVOICE("reconciliation_invoice"),
    
    PREFUNDING_INVOICE("prefunding_invoice"),
    
    SUPPLEMENTAL_SERVICE_INVOICE("supplemental_service_invoice"),
    
    RECONCILIATION_CREDIT_NOTE("reconciliation_credit_note");

    private String value;

    BillingDocumentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BillingDocumentTypeEnum fromValue(String value) {
      for (BillingDocumentTypeEnum b : BillingDocumentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BillingDocumentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BillingDocumentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BillingDocumentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BillingDocumentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BILLING_DOCUMENT_TYPE = "billing_document_type";
  @SerializedName(SERIALIZED_NAME_BILLING_DOCUMENT_TYPE)
  private BillingDocumentTypeEnum billingDocumentType;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ISSUED_DATE = "issued_date";
  @SerializedName(SERIALIZED_NAME_ISSUED_DATE)
  private String issuedDate;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<BillingDocumentAmountItem> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public BillingDocument() {
  }

  public BillingDocument billingDocumentCurrency(String billingDocumentCurrency) {
    
    
    
    
    this.billingDocumentCurrency = billingDocumentCurrency;
    return this;
  }

   /**
   * Get billingDocumentCurrency
   * @return billingDocumentCurrency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "EUR", required = true, value = "")

  public String getBillingDocumentCurrency() {
    return billingDocumentCurrency;
  }


  public void setBillingDocumentCurrency(String billingDocumentCurrency) {
    
    
    
    this.billingDocumentCurrency = billingDocumentCurrency;
  }


  public BillingDocument billingDocumentPeriod(String billingDocumentPeriod) {
    
    
    
    
    this.billingDocumentPeriod = billingDocumentPeriod;
    return this;
  }

   /**
   * Get billingDocumentPeriod
   * @return billingDocumentPeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2021-12", required = true, value = "")

  public String getBillingDocumentPeriod() {
    return billingDocumentPeriod;
  }


  public void setBillingDocumentPeriod(String billingDocumentPeriod) {
    
    
    
    this.billingDocumentPeriod = billingDocumentPeriod;
  }


  public BillingDocument billingDocumentType(BillingDocumentTypeEnum billingDocumentType) {
    
    
    
    
    this.billingDocumentType = billingDocumentType;
    return this;
  }

   /**
   * Get billingDocumentType
   * @return billingDocumentType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "RECONCILIATION_INVOICE", required = true, value = "")

  public BillingDocumentTypeEnum getBillingDocumentType() {
    return billingDocumentType;
  }


  public void setBillingDocumentType(BillingDocumentTypeEnum billingDocumentType) {
    
    
    
    this.billingDocumentType = billingDocumentType;
  }


  public BillingDocument companyId(String companyId) {
    
    
    
    
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2f889520-9a21-44b0-990d-e4ae37d8db53", required = true, value = "")

  public String getCompanyId() {
    return companyId;
  }


  public void setCompanyId(String companyId) {
    
    
    
    this.companyId = companyId;
  }


  public BillingDocument id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8772a9f1-b43c-46be-a1ce-e50b6819f5eeX", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public BillingDocument issuedDate(String issuedDate) {
    
    
    
    
    this.issuedDate = issuedDate;
    return this;
  }

   /**
   * Get issuedDate
   * @return issuedDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2023-08-22", required = true, value = "")

  public String getIssuedDate() {
    return issuedDate;
  }


  public void setIssuedDate(String issuedDate) {
    
    
    
    this.issuedDate = issuedDate;
  }


  public BillingDocument items(List<BillingDocumentAmountItem> items) {
    
    
    
    
    this.items = items;
    return this;
  }

  public BillingDocument addItemsItem(BillingDocumentAmountItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<BillingDocumentAmountItem> getItems() {
    return items;
  }


  public void setItems(List<BillingDocumentAmountItem> items) {
    
    
    
    this.items = items;
  }


  public BillingDocument total(Integer total) {
    
    
    
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1100000", required = true, value = "")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    
    
    
    this.total = total;
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
   * @return the BillingDocument instance itself
   */
  public BillingDocument putAdditionalProperty(String key, Object value) {
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
    BillingDocument billingDocument = (BillingDocument) o;
    return Objects.equals(this.billingDocumentCurrency, billingDocument.billingDocumentCurrency) &&
        Objects.equals(this.billingDocumentPeriod, billingDocument.billingDocumentPeriod) &&
        Objects.equals(this.billingDocumentType, billingDocument.billingDocumentType) &&
        Objects.equals(this.companyId, billingDocument.companyId) &&
        Objects.equals(this.id, billingDocument.id) &&
        Objects.equals(this.issuedDate, billingDocument.issuedDate) &&
        Objects.equals(this.items, billingDocument.items) &&
        Objects.equals(this.total, billingDocument.total)&&
        Objects.equals(this.additionalProperties, billingDocument.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingDocumentCurrency, billingDocumentPeriod, billingDocumentType, companyId, id, issuedDate, items, total, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingDocument {\n");
    sb.append("    billingDocumentCurrency: ").append(toIndentedString(billingDocumentCurrency)).append("\n");
    sb.append("    billingDocumentPeriod: ").append(toIndentedString(billingDocumentPeriod)).append("\n");
    sb.append("    billingDocumentType: ").append(toIndentedString(billingDocumentType)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuedDate: ").append(toIndentedString(issuedDate)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("billing_document_currency");
    openapiFields.add("billing_document_period");
    openapiFields.add("billing_document_type");
    openapiFields.add("company_id");
    openapiFields.add("id");
    openapiFields.add("issued_date");
    openapiFields.add("items");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("billing_document_currency");
    openapiRequiredFields.add("billing_document_period");
    openapiRequiredFields.add("billing_document_type");
    openapiRequiredFields.add("company_id");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("issued_date");
    openapiRequiredFields.add("items");
    openapiRequiredFields.add("total");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BillingDocument
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BillingDocument.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BillingDocument is not found in the empty JSON string", BillingDocument.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BillingDocument.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("billing_document_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billing_document_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billing_document_currency").toString()));
      }
      if (!jsonObj.get("billing_document_period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billing_document_period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billing_document_period").toString()));
      }
      if (!jsonObj.get("billing_document_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billing_document_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billing_document_type").toString()));
      }
      if (!jsonObj.get("company_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_id").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("issued_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issued_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issued_date").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("items").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
      }

      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      // validate the required field `items` (array)
      for (int i = 0; i < jsonArrayitems.size(); i++) {
        BillingDocumentAmountItem.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BillingDocument.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BillingDocument' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BillingDocument> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BillingDocument.class));

       return (TypeAdapter<T>) new TypeAdapter<BillingDocument>() {
           @Override
           public void write(JsonWriter out, BillingDocument value) throws IOException {
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
           public BillingDocument read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BillingDocument instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BillingDocument given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BillingDocument
  * @throws IOException if the JSON string is invalid with respect to BillingDocument
  */
  public static BillingDocument fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BillingDocument.class);
  }

 /**
  * Convert an instance of BillingDocument to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

