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
import com.konfigthis.client.model.CurrencyDefinition;
import com.konfigthis.client.model.ExpenseReviewer;
import com.konfigthis.client.model.ModelFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
 * Expense
 */
@ApiModel(description = "Expense")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Expense {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  /**
   * Categories allowed for an expense
   */
  @JsonAdapter(CategoryEnum.Adapter.class)
 public enum CategoryEnum {
    EDUCATION_TRAINING("education_training"),
    
    HOME_OFFICE("home_office"),
    
    MEALS("meals"),
    
    OTHER("other"),
    
    PHONE_UTILITIES("phone_utilities"),
    
    TECH_EQUIPMENT("tech_equipment"),
    
    TRAVEL("travel"),
    
    COWORKING("coworking");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CategoryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private CategoryEnum category;

  public static final String SERIALIZED_NAME_CONVERTED_AMOUNT = "converted_amount";
  @SerializedName(SERIALIZED_NAME_CONVERTED_AMOUNT)
  private Integer convertedAmount;

  public static final String SERIALIZED_NAME_CONVERTED_CURRENCY = "converted_currency";
  @SerializedName(SERIALIZED_NAME_CONVERTED_CURRENCY)
  private CurrencyDefinition convertedCurrency;

  public static final String SERIALIZED_NAME_CONVERTED_TAX_AMOUNT = "converted_tax_amount";
  @SerializedName(SERIALIZED_NAME_CONVERTED_TAX_AMOUNT)
  private Integer convertedTaxAmount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private CurrencyDefinition currency;

  public static final String SERIALIZED_NAME_EMPLOYMENT_ID = "employment_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_ID)
  private String employmentId;

  public static final String SERIALIZED_NAME_EXPENSE_DATE = "expense_date";
  @SerializedName(SERIALIZED_NAME_EXPENSE_DATE)
  private LocalDate expenseDate;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INVOICE_PERIOD = "invoice_period";
  @SerializedName(SERIALIZED_NAME_INVOICE_PERIOD)
  private String invoicePeriod;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_RECEIPTS = "receipts";
  @SerializedName(SERIALIZED_NAME_RECEIPTS)
  private List<ModelFile> receipts = null;

  public static final String SERIALIZED_NAME_REVIEWED_AT = "reviewed_at";
  @SerializedName(SERIALIZED_NAME_REVIEWED_AT)
  private LocalDate reviewedAt;

  public static final String SERIALIZED_NAME_REVIEWER = "reviewer";
  @SerializedName(SERIALIZED_NAME_REVIEWER)
  private ExpenseReviewer reviewer;

  /**
   * Expense status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    CANCELED("canceled"),
    
    PENDING("pending"),
    
    DECLINED("declined"),
    
    APPROVED("approved"),
    
    PROCESSING("processing"),
    
    REIMBURSED("reimbursed");

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

  public static final String SERIALIZED_NAME_TAX_AMOUNT = "tax_amount";
  @SerializedName(SERIALIZED_NAME_TAX_AMOUNT)
  private Integer taxAmount;

  public Expense() {
  }

  public Expense title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "New desk", required = true, value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public Expense amount(Integer amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1000", required = true, value = "")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    
    
    
    this.amount = amount;
  }


  public Expense category(CategoryEnum category) {
    
    
    
    
    this.category = category;
    return this;
  }

   /**
   * Categories allowed for an expense
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Categories allowed for an expense")

  public CategoryEnum getCategory() {
    return category;
  }


  public void setCategory(CategoryEnum category) {
    
    
    
    this.category = category;
  }


  public Expense convertedAmount(Integer convertedAmount) {
    
    
    
    
    this.convertedAmount = convertedAmount;
    return this;
  }

   /**
   * Get convertedAmount
   * @return convertedAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1000", required = true, value = "")

  public Integer getConvertedAmount() {
    return convertedAmount;
  }


  public void setConvertedAmount(Integer convertedAmount) {
    
    
    
    this.convertedAmount = convertedAmount;
  }


  public Expense convertedCurrency(CurrencyDefinition convertedCurrency) {
    
    
    
    
    this.convertedCurrency = convertedCurrency;
    return this;
  }

   /**
   * Get convertedCurrency
   * @return convertedCurrency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CurrencyDefinition getConvertedCurrency() {
    return convertedCurrency;
  }


  public void setConvertedCurrency(CurrencyDefinition convertedCurrency) {
    
    
    
    this.convertedCurrency = convertedCurrency;
  }


  public Expense convertedTaxAmount(Integer convertedTaxAmount) {
    
    
    
    
    this.convertedTaxAmount = convertedTaxAmount;
    return this;
  }

   /**
   * Get convertedTaxAmount
   * @return convertedTaxAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "500", required = true, value = "")

  public Integer getConvertedTaxAmount() {
    return convertedTaxAmount;
  }


  public void setConvertedTaxAmount(Integer convertedTaxAmount) {
    
    
    
    this.convertedTaxAmount = convertedTaxAmount;
  }


  public Expense currency(CurrencyDefinition currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CurrencyDefinition getCurrency() {
    return currency;
  }


  public void setCurrency(CurrencyDefinition currency) {
    
    
    
    this.currency = currency;
  }


  public Expense employmentId(String employmentId) {
    
    
    
    
    this.employmentId = employmentId;
    return this;
  }

   /**
   * Get employmentId
   * @return employmentId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ba9ead59-e471-4043-a7ea-07dbb105e72c", required = true, value = "")

  public String getEmploymentId() {
    return employmentId;
  }


  public void setEmploymentId(String employmentId) {
    
    
    
    this.employmentId = employmentId;
  }


  public Expense expenseDate(LocalDate expenseDate) {
    
    
    
    
    this.expenseDate = expenseDate;
    return this;
  }

   /**
   * Get expenseDate
   * @return expenseDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Thu Sep 02 17:00:00 PDT 2021", required = true, value = "")

  public LocalDate getExpenseDate() {
    return expenseDate;
  }


  public void setExpenseDate(LocalDate expenseDate) {
    
    
    
    this.expenseDate = expenseDate;
  }


  public Expense id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public Expense invoicePeriod(String invoicePeriod) {
    
    
    
    
    this.invoicePeriod = invoicePeriod;
    return this;
  }

   /**
   * Get invoicePeriod
   * @return invoicePeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInvoicePeriod() {
    return invoicePeriod;
  }


  public void setInvoicePeriod(String invoicePeriod) {
    
    
    
    this.invoicePeriod = invoicePeriod;
  }


  public Expense notes(String notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    
    
    
    this.notes = notes;
  }


  public Expense reason(String reason) {
    
    
    
    
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    
    
    
    this.reason = reason;
  }


  public Expense receipts(List<ModelFile> receipts) {
    
    
    
    
    this.receipts = receipts;
    return this;
  }

  public Expense addReceiptsItem(ModelFile receiptsItem) {
    if (this.receipts == null) {
      this.receipts = new ArrayList<>();
    }
    this.receipts.add(receiptsItem);
    return this;
  }

   /**
   * Get receipts
   * @return receipts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ModelFile> getReceipts() {
    return receipts;
  }


  public void setReceipts(List<ModelFile> receipts) {
    
    
    
    this.receipts = receipts;
  }


  public Expense reviewedAt(LocalDate reviewedAt) {
    
    
    
    
    this.reviewedAt = reviewedAt;
    return this;
  }

   /**
   * Get reviewedAt
   * @return reviewedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getReviewedAt() {
    return reviewedAt;
  }


  public void setReviewedAt(LocalDate reviewedAt) {
    
    
    
    this.reviewedAt = reviewedAt;
  }


  public Expense reviewer(ExpenseReviewer reviewer) {
    
    
    
    
    this.reviewer = reviewer;
    return this;
  }

   /**
   * Get reviewer
   * @return reviewer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExpenseReviewer getReviewer() {
    return reviewer;
  }


  public void setReviewer(ExpenseReviewer reviewer) {
    
    
    
    this.reviewer = reviewer;
  }


  public Expense status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Expense status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expense status")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public Expense taxAmount(Integer taxAmount) {
    
    
    
    
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Get taxAmount
   * @return taxAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "500", required = true, value = "")

  public Integer getTaxAmount() {
    return taxAmount;
  }


  public void setTaxAmount(Integer taxAmount) {
    
    
    
    this.taxAmount = taxAmount;
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
   * @return the Expense instance itself
   */
  public Expense putAdditionalProperty(String key, Object value) {
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
    Expense expense = (Expense) o;
    return Objects.equals(this.title, expense.title) &&
        Objects.equals(this.amount, expense.amount) &&
        Objects.equals(this.category, expense.category) &&
        Objects.equals(this.convertedAmount, expense.convertedAmount) &&
        Objects.equals(this.convertedCurrency, expense.convertedCurrency) &&
        Objects.equals(this.convertedTaxAmount, expense.convertedTaxAmount) &&
        Objects.equals(this.currency, expense.currency) &&
        Objects.equals(this.employmentId, expense.employmentId) &&
        Objects.equals(this.expenseDate, expense.expenseDate) &&
        Objects.equals(this.id, expense.id) &&
        Objects.equals(this.invoicePeriod, expense.invoicePeriod) &&
        Objects.equals(this.notes, expense.notes) &&
        Objects.equals(this.reason, expense.reason) &&
        Objects.equals(this.receipts, expense.receipts) &&
        Objects.equals(this.reviewedAt, expense.reviewedAt) &&
        Objects.equals(this.reviewer, expense.reviewer) &&
        Objects.equals(this.status, expense.status) &&
        Objects.equals(this.taxAmount, expense.taxAmount)&&
        Objects.equals(this.additionalProperties, expense.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, amount, category, convertedAmount, convertedCurrency, convertedTaxAmount, currency, employmentId, expenseDate, id, invoicePeriod, notes, reason, receipts, reviewedAt, reviewer, status, taxAmount, additionalProperties);
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
    sb.append("class Expense {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    convertedAmount: ").append(toIndentedString(convertedAmount)).append("\n");
    sb.append("    convertedCurrency: ").append(toIndentedString(convertedCurrency)).append("\n");
    sb.append("    convertedTaxAmount: ").append(toIndentedString(convertedTaxAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    employmentId: ").append(toIndentedString(employmentId)).append("\n");
    sb.append("    expenseDate: ").append(toIndentedString(expenseDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoicePeriod: ").append(toIndentedString(invoicePeriod)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    receipts: ").append(toIndentedString(receipts)).append("\n");
    sb.append("    reviewedAt: ").append(toIndentedString(reviewedAt)).append("\n");
    sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("amount");
    openapiFields.add("category");
    openapiFields.add("converted_amount");
    openapiFields.add("converted_currency");
    openapiFields.add("converted_tax_amount");
    openapiFields.add("currency");
    openapiFields.add("employment_id");
    openapiFields.add("expense_date");
    openapiFields.add("id");
    openapiFields.add("invoice_period");
    openapiFields.add("notes");
    openapiFields.add("reason");
    openapiFields.add("receipts");
    openapiFields.add("reviewed_at");
    openapiFields.add("reviewer");
    openapiFields.add("status");
    openapiFields.add("tax_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("converted_amount");
    openapiRequiredFields.add("converted_currency");
    openapiRequiredFields.add("converted_tax_amount");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("employment_id");
    openapiRequiredFields.add("expense_date");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("tax_amount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Expense
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Expense.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Expense is not found in the empty JSON string", Expense.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Expense.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      // validate the required field `converted_currency`
      CurrencyDefinition.validateJsonObject(jsonObj.getAsJsonObject("converted_currency"));
      // validate the required field `currency`
      CurrencyDefinition.validateJsonObject(jsonObj.getAsJsonObject("currency"));
      if (!jsonObj.get("employment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employment_id").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("invoice_period").isJsonNull() && (jsonObj.get("invoice_period") != null && !jsonObj.get("invoice_period").isJsonNull()) && !jsonObj.get("invoice_period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_period").toString()));
      }
      if (!jsonObj.get("notes").isJsonNull() && (jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      if (!jsonObj.get("reason").isJsonNull() && (jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
      if (jsonObj.get("receipts") != null && !jsonObj.get("receipts").isJsonNull()) {
        JsonArray jsonArrayreceipts = jsonObj.getAsJsonArray("receipts");
        if (jsonArrayreceipts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("receipts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `receipts` to be an array in the JSON string but got `%s`", jsonObj.get("receipts").toString()));
          }

          // validate the optional field `receipts` (array)
          for (int i = 0; i < jsonArrayreceipts.size(); i++) {
            ModelFile.validateJsonObject(jsonArrayreceipts.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `reviewer`
      if (jsonObj.get("reviewer") != null && !jsonObj.get("reviewer").isJsonNull()) {
        ExpenseReviewer.validateJsonObject(jsonObj.getAsJsonObject("reviewer"));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Expense.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Expense' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Expense> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Expense.class));

       return (TypeAdapter<T>) new TypeAdapter<Expense>() {
           @Override
           public void write(JsonWriter out, Expense value) throws IOException {
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
           public Expense read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Expense instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Expense given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Expense
  * @throws IOException if the JSON string is invalid with respect to Expense
  */
  public static Expense fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Expense.class);
  }

 /**
  * Convert an instance of Expense to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

