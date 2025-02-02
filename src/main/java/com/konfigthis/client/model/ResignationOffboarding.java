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
 * ResignationOffboarding
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ResignationOffboarding {
  public static final String SERIALIZED_NAME_ADDITIONAL_COMMENTS = "additional_comments";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_COMMENTS)
  private String additionalComments;

  public static final String SERIALIZED_NAME_EMPLOYER_AWARENESS = "employer_awareness";
  @SerializedName(SERIALIZED_NAME_EMPLOYER_AWARENESS)
  private String employerAwareness;

  public static final String SERIALIZED_NAME_EMPLOYMENT_ID = "employment_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_ID)
  private String employmentId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PROPOSED_LAST_WORKING_DAY = "proposed_last_working_day";
  @SerializedName(SERIALIZED_NAME_PROPOSED_LAST_WORKING_DAY)
  private LocalDate proposedLastWorkingDay;

  public static final String SERIALIZED_NAME_REASON_DESCRIPTION = "reason_description";
  @SerializedName(SERIALIZED_NAME_REASON_DESCRIPTION)
  private String reasonDescription;

  public static final String SERIALIZED_NAME_REQUESTED_BY = "requested_by";
  @SerializedName(SERIALIZED_NAME_REQUESTED_BY)
  private String requestedBy;

  /**
   * Gets or Sets resignationReason
   */
  @JsonAdapter(ResignationReasonEnum.Adapter.class)
 public enum ResignationReasonEnum {
    CANCELLATION_BEFORE_START_DATE("cancellation_before_start_date"),
    
    COMPANY_CULTURE_OR_VALUES("company_culture_or_values"),
    
    CONVERSION_TO_CONTRACTOR("conversion_to_contractor"),
    
    DISSATISFACTION_WITH_REMOTE_SERVICE("dissatisfaction_with_remote_service"),
    
    INCAPACITY_TO_PERFORM_INHERENT_DUTIES("incapacity_to_perform_inherent_duties"),
    
    INFRASTRUCTURE_CHALLENGES("infrastructure_challenges"),
    
    LACK_OF_RECOGNITION("lack_of_recognition"),
    
    LEADERSHIP("leadership"),
    
    MUTUAL_AGREEMENT("mutual_agreement"),
    
    OTHER("other"),
    
    OTHER_JOB_OPPORTUNITY("other_job_opportunity"),
    
    PERSONAL_REASONS("personal_reasons"),
    
    POSITION_DOES_NOT_MEET_EXPECTATIONS("position_does_not_meet_expectations"),
    
    RELATIONSHIP_WITH_COWORKERS("relationship_with_coworkers"),
    
    RELOCATION_FROM_ENTITY_TO_ENTITY_BY_EMPLOYEE("relocation_from_entity_to_entity_by_employee"),
    
    RELOCATION_LEAVING_REMOTE("relocation_leaving_remote"),
    
    REMUNERATION_AND_BENEFITS("remuneration_and_benefits"),
    
    RETIREMENT("retirement"),
    
    TRANSFER_AND_RELOCATION_NEW_CUSTOMER_AND_NEW_COUNTRY("transfer_and_relocation_new_customer_and_new_country"),
    
    TRANSFER_BETWEEN_REMOTE_CUSTOMER("transfer_between_remote_customer"),
    
    TRANSFER_FROM_REMOTE_TO_CUSTOMER("transfer_from_remote_to_customer"),
    
    TRANSFER_FROM_REMOTE_TO_OTHER_EOR("transfer_from_remote_to_other_eor");

    private String value;

    ResignationReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResignationReasonEnum fromValue(String value) {
      for (ResignationReasonEnum b : ResignationReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResignationReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResignationReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResignationReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResignationReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESIGNATION_REASON = "resignation_reason";
  @SerializedName(SERIALIZED_NAME_RESIGNATION_REASON)
  private ResignationReasonEnum resignationReason;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    SUBMITTED("submitted"),
    
    IN_REVIEW("in_review"),
    
    DONE("done"),
    
    CANCELED("canceled");

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

  public static final String SERIALIZED_NAME_SUBMITTED_AT = "submitted_at";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_AT)
  private String submittedAt;

  public static final String SERIALIZED_NAME_TERMINATION_DATE = "termination_date";
  @SerializedName(SERIALIZED_NAME_TERMINATION_DATE)
  private LocalDate terminationDate;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    RESIGNATION("resignation");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public ResignationOffboarding() {
  }

  public ResignationOffboarding additionalComments(String additionalComments) {
    
    
    
    
    this.additionalComments = additionalComments;
    return this;
  }

   /**
   * Get additionalComments
   * @return additionalComments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "")

  public String getAdditionalComments() {
    return additionalComments;
  }


  public void setAdditionalComments(String additionalComments) {
    
    
    
    this.additionalComments = additionalComments;
  }


  public ResignationOffboarding employerAwareness(String employerAwareness) {
    
    
    
    
    this.employerAwareness = employerAwareness;
    return this;
  }

   /**
   * Get employerAwareness
   * @return employerAwareness
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The employer was informed on 2023-12-12", value = "")

  public String getEmployerAwareness() {
    return employerAwareness;
  }


  public void setEmployerAwareness(String employerAwareness) {
    
    
    
    this.employerAwareness = employerAwareness;
  }


  public ResignationOffboarding employmentId(String employmentId) {
    
    
    
    
    this.employmentId = employmentId;
    return this;
  }

   /**
   * Get employmentId
   * @return employmentId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1e74fdc2-7420-4eef-ab0a-b794cbbef4e1", required = true, value = "")

  public String getEmploymentId() {
    return employmentId;
  }


  public void setEmploymentId(String employmentId) {
    
    
    
    this.employmentId = employmentId;
  }


  public ResignationOffboarding id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ba310525-9282-40c9-8977-14d844bf891aX", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public ResignationOffboarding proposedLastWorkingDay(LocalDate proposedLastWorkingDay) {
    
    
    
    
    this.proposedLastWorkingDay = proposedLastWorkingDay;
    return this;
  }

   /**
   * Get proposedLastWorkingDay
   * @return proposedLastWorkingDay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Tue Dec 19 16:00:00 PST 2023", required = true, value = "")

  public LocalDate getProposedLastWorkingDay() {
    return proposedLastWorkingDay;
  }


  public void setProposedLastWorkingDay(LocalDate proposedLastWorkingDay) {
    
    
    
    this.proposedLastWorkingDay = proposedLastWorkingDay;
  }


  public ResignationOffboarding reasonDescription(String reasonDescription) {
    
    
    
    
    this.reasonDescription = reasonDescription;
    return this;
  }

   /**
   * Get reasonDescription
   * @return reasonDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReasonDescription() {
    return reasonDescription;
  }


  public void setReasonDescription(String reasonDescription) {
    
    
    
    this.reasonDescription = reasonDescription;
  }


  public ResignationOffboarding requestedBy(String requestedBy) {
    
    
    
    
    this.requestedBy = requestedBy;
    return this;
  }

   /**
   * Get requestedBy
   * @return requestedBy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5a31f3c1-d7a7-4311-89cb-928959d3d540", required = true, value = "")

  public String getRequestedBy() {
    return requestedBy;
  }


  public void setRequestedBy(String requestedBy) {
    
    
    
    this.requestedBy = requestedBy;
  }


  public ResignationOffboarding resignationReason(ResignationReasonEnum resignationReason) {
    
    
    
    
    this.resignationReason = resignationReason;
    return this;
  }

   /**
   * Get resignationReason
   * @return resignationReason
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "workforce_reduction", required = true, value = "")

  public ResignationReasonEnum getResignationReason() {
    return resignationReason;
  }


  public void setResignationReason(ResignationReasonEnum resignationReason) {
    
    
    
    this.resignationReason = resignationReason;
  }


  public ResignationOffboarding status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "SUBMITTED", required = true, value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public ResignationOffboarding submittedAt(String submittedAt) {
    
    
    
    
    this.submittedAt = submittedAt;
    return this;
  }

   /**
   * Get submittedAt
   * @return submittedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2023-04-13T13:35:06Z", required = true, value = "")

  public String getSubmittedAt() {
    return submittedAt;
  }


  public void setSubmittedAt(String submittedAt) {
    
    
    
    this.submittedAt = submittedAt;
  }


  public ResignationOffboarding terminationDate(LocalDate terminationDate) {
    
    
    
    
    this.terminationDate = terminationDate;
    return this;
  }

   /**
   * Most updated termination date for the offboarding. This date is subject to change through the offboarding process even after it is finalized.
   * @return terminationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue Dec 19 16:00:00 PST 2023", required = true, value = "Most updated termination date for the offboarding. This date is subject to change through the offboarding process even after it is finalized.")

  public LocalDate getTerminationDate() {
    return terminationDate;
  }


  public void setTerminationDate(LocalDate terminationDate) {
    
    
    
    this.terminationDate = terminationDate;
  }


  public ResignationOffboarding type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "RESIGNATION", required = true, value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
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
   * @return the ResignationOffboarding instance itself
   */
  public ResignationOffboarding putAdditionalProperty(String key, Object value) {
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
    ResignationOffboarding resignationOffboarding = (ResignationOffboarding) o;
    return Objects.equals(this.additionalComments, resignationOffboarding.additionalComments) &&
        Objects.equals(this.employerAwareness, resignationOffboarding.employerAwareness) &&
        Objects.equals(this.employmentId, resignationOffboarding.employmentId) &&
        Objects.equals(this.id, resignationOffboarding.id) &&
        Objects.equals(this.proposedLastWorkingDay, resignationOffboarding.proposedLastWorkingDay) &&
        Objects.equals(this.reasonDescription, resignationOffboarding.reasonDescription) &&
        Objects.equals(this.requestedBy, resignationOffboarding.requestedBy) &&
        Objects.equals(this.resignationReason, resignationOffboarding.resignationReason) &&
        Objects.equals(this.status, resignationOffboarding.status) &&
        Objects.equals(this.submittedAt, resignationOffboarding.submittedAt) &&
        Objects.equals(this.terminationDate, resignationOffboarding.terminationDate) &&
        Objects.equals(this.type, resignationOffboarding.type)&&
        Objects.equals(this.additionalProperties, resignationOffboarding.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalComments, employerAwareness, employmentId, id, proposedLastWorkingDay, reasonDescription, requestedBy, resignationReason, status, submittedAt, terminationDate, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResignationOffboarding {\n");
    sb.append("    additionalComments: ").append(toIndentedString(additionalComments)).append("\n");
    sb.append("    employerAwareness: ").append(toIndentedString(employerAwareness)).append("\n");
    sb.append("    employmentId: ").append(toIndentedString(employmentId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    proposedLastWorkingDay: ").append(toIndentedString(proposedLastWorkingDay)).append("\n");
    sb.append("    reasonDescription: ").append(toIndentedString(reasonDescription)).append("\n");
    sb.append("    requestedBy: ").append(toIndentedString(requestedBy)).append("\n");
    sb.append("    resignationReason: ").append(toIndentedString(resignationReason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
    sb.append("    terminationDate: ").append(toIndentedString(terminationDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("additional_comments");
    openapiFields.add("employer_awareness");
    openapiFields.add("employment_id");
    openapiFields.add("id");
    openapiFields.add("proposed_last_working_day");
    openapiFields.add("reason_description");
    openapiFields.add("requested_by");
    openapiFields.add("resignation_reason");
    openapiFields.add("status");
    openapiFields.add("submitted_at");
    openapiFields.add("termination_date");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("employment_id");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("proposed_last_working_day");
    openapiRequiredFields.add("requested_by");
    openapiRequiredFields.add("resignation_reason");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("submitted_at");
    openapiRequiredFields.add("termination_date");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResignationOffboarding
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ResignationOffboarding.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResignationOffboarding is not found in the empty JSON string", ResignationOffboarding.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ResignationOffboarding.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("additional_comments") != null && !jsonObj.get("additional_comments").isJsonNull()) && !jsonObj.get("additional_comments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additional_comments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additional_comments").toString()));
      }
      if ((jsonObj.get("employer_awareness") != null && !jsonObj.get("employer_awareness").isJsonNull()) && !jsonObj.get("employer_awareness").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employer_awareness` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employer_awareness").toString()));
      }
      if (!jsonObj.get("employment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employment_id").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("reason_description") != null && !jsonObj.get("reason_description").isJsonNull()) && !jsonObj.get("reason_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason_description").toString()));
      }
      if (!jsonObj.get("requested_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requested_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requested_by").toString()));
      }
      if (!jsonObj.get("resignation_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resignation_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resignation_reason").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("submitted_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `submitted_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("submitted_at").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResignationOffboarding.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResignationOffboarding' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResignationOffboarding> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResignationOffboarding.class));

       return (TypeAdapter<T>) new TypeAdapter<ResignationOffboarding>() {
           @Override
           public void write(JsonWriter out, ResignationOffboarding value) throws IOException {
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
           public ResignationOffboarding read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ResignationOffboarding instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ResignationOffboarding given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResignationOffboarding
  * @throws IOException if the JSON string is invalid with respect to ResignationOffboarding
  */
  public static ResignationOffboarding fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResignationOffboarding.class);
  }

 /**
  * Convert an instance of ResignationOffboarding to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

