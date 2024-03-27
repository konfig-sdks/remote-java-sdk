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
import com.konfigthis.client.model.TerminationOffboardingEmployeeAwareness;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
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
 * TerminationOffboarding
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TerminationOffboarding {
  public static final String SERIALIZED_NAME_ADDITIONAL_COMMENTS = "additional_comments";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_COMMENTS)
  private String additionalComments;

  public static final String SERIALIZED_NAME_AGREES_TO_PTO_AMOUNT = "agrees_to_pto_amount";
  @SerializedName(SERIALIZED_NAME_AGREES_TO_PTO_AMOUNT)
  private String agreesToPtoAmount;

  public static final String SERIALIZED_NAME_CONFIDENTIAL = "confidential";
  @SerializedName(SERIALIZED_NAME_CONFIDENTIAL)
  private Boolean confidential;

  public static final String SERIALIZED_NAME_EMPLOYEE_AWARENESS = "employee_awareness";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_AWARENESS)
  private TerminationOffboardingEmployeeAwareness employeeAwareness;

  public static final String SERIALIZED_NAME_EMPLOYMENT_ID = "employment_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_ID)
  private String employmentId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PROPOSED_TERMINATION_DATE = "proposed_termination_date";
  @SerializedName(SERIALIZED_NAME_PROPOSED_TERMINATION_DATE)
  private LocalDate proposedTerminationDate;

  public static final String SERIALIZED_NAME_REASON_DESCRIPTION = "reason_description";
  @SerializedName(SERIALIZED_NAME_REASON_DESCRIPTION)
  private String reasonDescription;

  public static final String SERIALIZED_NAME_REQUESTED_BY = "requested_by";
  @SerializedName(SERIALIZED_NAME_REQUESTED_BY)
  private String requestedBy;

  /**
   * Gets or Sets riskAssessmentReasons
   */
  @JsonAdapter(RiskAssessmentReasonsEnum.Adapter.class)
 public enum RiskAssessmentReasonsEnum {
    CARING_RESPONSIBILITIES("caring_responsibilities"),
    
    DISABLED_OR_HEALTH_CONDITION("disabled_or_health_condition"),
    
    FAMILY_LEAVE("family_leave"),
    
    MEMBER_OF_UNION_OR_WORKS_COUNCIL("member_of_union_or_works_council"),
    
    NONE_OF_THESE("none_of_these"),
    
    PREGNANT_OR_BREASTFEEDING("pregnant_or_breastfeeding"),
    
    REPORTED_CONCERNS_WITH_WORKPLACE("reported_concerns_with_workplace"),
    
    REQUESTED_MEDICAL_OR_FAMILY_LEAVE("requested_medical_or_family_leave"),
    
    SICK_LEAVE("sick_leave");

    private String value;

    RiskAssessmentReasonsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RiskAssessmentReasonsEnum fromValue(String value) {
      for (RiskAssessmentReasonsEnum b : RiskAssessmentReasonsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RiskAssessmentReasonsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RiskAssessmentReasonsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RiskAssessmentReasonsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RiskAssessmentReasonsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RISK_ASSESSMENT_REASONS = "risk_assessment_reasons";
  @SerializedName(SERIALIZED_NAME_RISK_ASSESSMENT_REASONS)
  private List<RiskAssessmentReasonsEnum> riskAssessmentReasons = new ArrayList<>();

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
   * Gets or Sets terminationReason
   */
  @JsonAdapter(TerminationReasonEnum.Adapter.class)
 public enum TerminationReasonEnum {
    CANCELLATION_BEFORE_START_DATE("cancellation_before_start_date"),
    
    COMPLIANCE_ISSUE("compliance_issue"),
    
    CONVERSION_TO_CONTRACTOR("conversion_to_contractor"),
    
    DISSATISFACTION_WITH_REMOTE_SERVICE("dissatisfaction_with_remote_service"),
    
    END_OF_FIXED_TERM_CONTRACT_COMPLIANCE_ISSUE("end_of_fixed_term_contract_compliance_issue"),
    
    END_OF_FIXED_TERM_CONTRACT_INCAPACITY_TO_PERFORM_INHERENT_DUTIES("end_of_fixed_term_contract_incapacity_to_perform_inherent_duties"),
    
    END_OF_FIXED_TERM_CONTRACT_LOCAL_REGULATIONS_MAX_TERM_REACHED("end_of_fixed_term_contract_local_regulations_max_term_reached"),
    
    END_OF_FIXED_TERM_CONTRACT_MISCONDUCT("end_of_fixed_term_contract_misconduct"),
    
    END_OF_FIXED_TERM_CONTRACT_OPERATIONAL_REASONS("end_of_fixed_term_contract_operational_reasons"),
    
    END_OF_FIXED_TERM_CONTRACT_OTHER("end_of_fixed_term_contract_other"),
    
    END_OF_FIXED_TERM_CONTRACT_PERFORMANCE("end_of_fixed_term_contract_performance"),
    
    END_OF_FIXED_TERM_CONTRACT_REDUNDANCY("end_of_fixed_term_contract_redundancy"),
    
    END_OF_FIXED_TERM_CONTRACT_VALUES("end_of_fixed_term_contract_values"),
    
    GROSS_MISCONDUCT("gross_misconduct"),
    
    INCAPACITY_TO_PERFORM_INHERENT_DUTIES("incapacity_to_perform_inherent_duties"),
    
    JOB_ABANDONMENT("job_abandonment"),
    
    MUTUAL_AGREEMENT("mutual_agreement"),
    
    OTHER("other"),
    
    PERFORMANCE("performance"),
    
    VALUES("values"),
    
    WORKFORCE_REDUCTION("workforce_reduction");

    private String value;

    TerminationReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TerminationReasonEnum fromValue(String value) {
      for (TerminationReasonEnum b : TerminationReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TerminationReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TerminationReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TerminationReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TerminationReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TERMINATION_REASON = "termination_reason";
  @SerializedName(SERIALIZED_NAME_TERMINATION_REASON)
  private TerminationReasonEnum terminationReason;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    TERMINATION("termination");

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

  public static final String SERIALIZED_NAME_WILL_CHALLENGE_TERMINATION = "will_challenge_termination";
  @SerializedName(SERIALIZED_NAME_WILL_CHALLENGE_TERMINATION)
  private Boolean willChallengeTermination;

  public static final String SERIALIZED_NAME_WILL_CHALLENGE_TERMINATION_DESCRIPTION = "will_challenge_termination_description";
  @SerializedName(SERIALIZED_NAME_WILL_CHALLENGE_TERMINATION_DESCRIPTION)
  private String willChallengeTerminationDescription;

  public TerminationOffboarding() {
  }

  public TerminationOffboarding additionalComments(String additionalComments) {
    
    
    
    
    this.additionalComments = additionalComments;
    return this;
  }

   /**
   * Get additionalComments
   * @return additionalComments
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "", required = true, value = "")

  public String getAdditionalComments() {
    return additionalComments;
  }


  public void setAdditionalComments(String additionalComments) {
    
    
    
    this.additionalComments = additionalComments;
  }


  public TerminationOffboarding agreesToPtoAmount(String agreesToPtoAmount) {
    
    
    
    
    this.agreesToPtoAmount = agreesToPtoAmount;
    return this;
  }

   /**
   * Get agreesToPtoAmount
   * @return agreesToPtoAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public String getAgreesToPtoAmount() {
    return agreesToPtoAmount;
  }


  public void setAgreesToPtoAmount(String agreesToPtoAmount) {
    
    
    
    this.agreesToPtoAmount = agreesToPtoAmount;
  }


  public TerminationOffboarding confidential(Boolean confidential) {
    
    
    
    
    this.confidential = confidential;
    return this;
  }

   /**
   * Get confidential
   * @return confidential
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "")

  public Boolean getConfidential() {
    return confidential;
  }


  public void setConfidential(Boolean confidential) {
    
    
    
    this.confidential = confidential;
  }


  public TerminationOffboarding employeeAwareness(TerminationOffboardingEmployeeAwareness employeeAwareness) {
    
    
    
    
    this.employeeAwareness = employeeAwareness;
    return this;
  }

   /**
   * Get employeeAwareness
   * @return employeeAwareness
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TerminationOffboardingEmployeeAwareness getEmployeeAwareness() {
    return employeeAwareness;
  }


  public void setEmployeeAwareness(TerminationOffboardingEmployeeAwareness employeeAwareness) {
    
    
    
    this.employeeAwareness = employeeAwareness;
  }


  public TerminationOffboarding employmentId(String employmentId) {
    
    
    
    
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


  public TerminationOffboarding id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ba310525-9282-40c9-8977-14d844bf891a", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public TerminationOffboarding proposedTerminationDate(LocalDate proposedTerminationDate) {
    
    
    
    
    this.proposedTerminationDate = proposedTerminationDate;
    return this;
  }

   /**
   * Get proposedTerminationDate
   * @return proposedTerminationDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Tue Dec 19 16:00:00 PST 2023", required = true, value = "")

  public LocalDate getProposedTerminationDate() {
    return proposedTerminationDate;
  }


  public void setProposedTerminationDate(LocalDate proposedTerminationDate) {
    
    
    
    this.proposedTerminationDate = proposedTerminationDate;
  }


  public TerminationOffboarding reasonDescription(String reasonDescription) {
    
    
    
    
    this.reasonDescription = reasonDescription;
    return this;
  }

   /**
   * Get reasonDescription
   * @return reasonDescription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getReasonDescription() {
    return reasonDescription;
  }


  public void setReasonDescription(String reasonDescription) {
    
    
    
    this.reasonDescription = reasonDescription;
  }


  public TerminationOffboarding requestedBy(String requestedBy) {
    
    
    
    
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


  public TerminationOffboarding riskAssessmentReasons(List<RiskAssessmentReasonsEnum> riskAssessmentReasons) {
    
    
    
    
    this.riskAssessmentReasons = riskAssessmentReasons;
    return this;
  }

  public TerminationOffboarding addRiskAssessmentReasonsItem(RiskAssessmentReasonsEnum riskAssessmentReasonsItem) {
    this.riskAssessmentReasons.add(riskAssessmentReasonsItem);
    return this;
  }

   /**
   * Get riskAssessmentReasons
   * @return riskAssessmentReasons
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<RiskAssessmentReasonsEnum> getRiskAssessmentReasons() {
    return riskAssessmentReasons;
  }


  public void setRiskAssessmentReasons(List<RiskAssessmentReasonsEnum> riskAssessmentReasons) {
    
    
    
    this.riskAssessmentReasons = riskAssessmentReasons;
  }


  public TerminationOffboarding status(StatusEnum status) {
    
    
    
    
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


  public TerminationOffboarding submittedAt(String submittedAt) {
    
    
    
    
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


  public TerminationOffboarding terminationDate(LocalDate terminationDate) {
    
    
    
    
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


  public TerminationOffboarding terminationReason(TerminationReasonEnum terminationReason) {
    
    
    
    
    this.terminationReason = terminationReason;
    return this;
  }

   /**
   * Get terminationReason
   * @return terminationReason
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "WORKFORCE_REDUCTION", required = true, value = "")

  public TerminationReasonEnum getTerminationReason() {
    return terminationReason;
  }


  public void setTerminationReason(TerminationReasonEnum terminationReason) {
    
    
    
    this.terminationReason = terminationReason;
  }


  public TerminationOffboarding type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "TERMINATION", required = true, value = "")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public TerminationOffboarding willChallengeTermination(Boolean willChallengeTermination) {
    
    
    
    
    this.willChallengeTermination = willChallengeTermination;
    return this;
  }

   /**
   * Get willChallengeTermination
   * @return willChallengeTermination
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")

  public Boolean getWillChallengeTermination() {
    return willChallengeTermination;
  }


  public void setWillChallengeTermination(Boolean willChallengeTermination) {
    
    
    
    this.willChallengeTermination = willChallengeTermination;
  }


  public TerminationOffboarding willChallengeTerminationDescription(String willChallengeTerminationDescription) {
    
    
    
    
    this.willChallengeTerminationDescription = willChallengeTerminationDescription;
    return this;
  }

   /**
   * Get willChallengeTerminationDescription
   * @return willChallengeTerminationDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "additional details for the offboarding risk assessment", value = "")

  public String getWillChallengeTerminationDescription() {
    return willChallengeTerminationDescription;
  }


  public void setWillChallengeTerminationDescription(String willChallengeTerminationDescription) {
    
    
    
    this.willChallengeTerminationDescription = willChallengeTerminationDescription;
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
   * @return the TerminationOffboarding instance itself
   */
  public TerminationOffboarding putAdditionalProperty(String key, Object value) {
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
    TerminationOffboarding terminationOffboarding = (TerminationOffboarding) o;
    return Objects.equals(this.additionalComments, terminationOffboarding.additionalComments) &&
        Objects.equals(this.agreesToPtoAmount, terminationOffboarding.agreesToPtoAmount) &&
        Objects.equals(this.confidential, terminationOffboarding.confidential) &&
        Objects.equals(this.employeeAwareness, terminationOffboarding.employeeAwareness) &&
        Objects.equals(this.employmentId, terminationOffboarding.employmentId) &&
        Objects.equals(this.id, terminationOffboarding.id) &&
        Objects.equals(this.proposedTerminationDate, terminationOffboarding.proposedTerminationDate) &&
        Objects.equals(this.reasonDescription, terminationOffboarding.reasonDescription) &&
        Objects.equals(this.requestedBy, terminationOffboarding.requestedBy) &&
        Objects.equals(this.riskAssessmentReasons, terminationOffboarding.riskAssessmentReasons) &&
        Objects.equals(this.status, terminationOffboarding.status) &&
        Objects.equals(this.submittedAt, terminationOffboarding.submittedAt) &&
        Objects.equals(this.terminationDate, terminationOffboarding.terminationDate) &&
        Objects.equals(this.terminationReason, terminationOffboarding.terminationReason) &&
        Objects.equals(this.type, terminationOffboarding.type) &&
        Objects.equals(this.willChallengeTermination, terminationOffboarding.willChallengeTermination) &&
        Objects.equals(this.willChallengeTerminationDescription, terminationOffboarding.willChallengeTerminationDescription)&&
        Objects.equals(this.additionalProperties, terminationOffboarding.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalComments, agreesToPtoAmount, confidential, employeeAwareness, employmentId, id, proposedTerminationDate, reasonDescription, requestedBy, riskAssessmentReasons, status, submittedAt, terminationDate, terminationReason, type, willChallengeTermination, willChallengeTerminationDescription, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminationOffboarding {\n");
    sb.append("    additionalComments: ").append(toIndentedString(additionalComments)).append("\n");
    sb.append("    agreesToPtoAmount: ").append(toIndentedString(agreesToPtoAmount)).append("\n");
    sb.append("    confidential: ").append(toIndentedString(confidential)).append("\n");
    sb.append("    employeeAwareness: ").append(toIndentedString(employeeAwareness)).append("\n");
    sb.append("    employmentId: ").append(toIndentedString(employmentId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    proposedTerminationDate: ").append(toIndentedString(proposedTerminationDate)).append("\n");
    sb.append("    reasonDescription: ").append(toIndentedString(reasonDescription)).append("\n");
    sb.append("    requestedBy: ").append(toIndentedString(requestedBy)).append("\n");
    sb.append("    riskAssessmentReasons: ").append(toIndentedString(riskAssessmentReasons)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
    sb.append("    terminationDate: ").append(toIndentedString(terminationDate)).append("\n");
    sb.append("    terminationReason: ").append(toIndentedString(terminationReason)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    willChallengeTermination: ").append(toIndentedString(willChallengeTermination)).append("\n");
    sb.append("    willChallengeTerminationDescription: ").append(toIndentedString(willChallengeTerminationDescription)).append("\n");
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
    openapiFields.add("agrees_to_pto_amount");
    openapiFields.add("confidential");
    openapiFields.add("employee_awareness");
    openapiFields.add("employment_id");
    openapiFields.add("id");
    openapiFields.add("proposed_termination_date");
    openapiFields.add("reason_description");
    openapiFields.add("requested_by");
    openapiFields.add("risk_assessment_reasons");
    openapiFields.add("status");
    openapiFields.add("submitted_at");
    openapiFields.add("termination_date");
    openapiFields.add("termination_reason");
    openapiFields.add("type");
    openapiFields.add("will_challenge_termination");
    openapiFields.add("will_challenge_termination_description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("additional_comments");
    openapiRequiredFields.add("confidential");
    openapiRequiredFields.add("employment_id");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("proposed_termination_date");
    openapiRequiredFields.add("reason_description");
    openapiRequiredFields.add("requested_by");
    openapiRequiredFields.add("risk_assessment_reasons");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("submitted_at");
    openapiRequiredFields.add("termination_date");
    openapiRequiredFields.add("termination_reason");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("will_challenge_termination");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TerminationOffboarding
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TerminationOffboarding.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TerminationOffboarding is not found in the empty JSON string", TerminationOffboarding.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TerminationOffboarding.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("additional_comments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additional_comments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additional_comments").toString()));
      }
      if ((jsonObj.get("agrees_to_pto_amount") != null && !jsonObj.get("agrees_to_pto_amount").isJsonNull()) && !jsonObj.get("agrees_to_pto_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agrees_to_pto_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agrees_to_pto_amount").toString()));
      }
      // validate the optional field `employee_awareness`
      if (jsonObj.get("employee_awareness") != null && !jsonObj.get("employee_awareness").isJsonNull()) {
        TerminationOffboardingEmployeeAwareness.validateJsonObject(jsonObj.getAsJsonObject("employee_awareness"));
      }
      if (!jsonObj.get("employment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employment_id").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("reason_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason_description").toString()));
      }
      if (!jsonObj.get("requested_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requested_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requested_by").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("risk_assessment_reasons") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("risk_assessment_reasons").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `risk_assessment_reasons` to be an array in the JSON string but got `%s`", jsonObj.get("risk_assessment_reasons").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("submitted_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `submitted_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("submitted_at").toString()));
      }
      if (!jsonObj.get("termination_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `termination_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("termination_reason").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("will_challenge_termination_description") != null && !jsonObj.get("will_challenge_termination_description").isJsonNull()) && !jsonObj.get("will_challenge_termination_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `will_challenge_termination_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("will_challenge_termination_description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TerminationOffboarding.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TerminationOffboarding' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TerminationOffboarding> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TerminationOffboarding.class));

       return (TypeAdapter<T>) new TypeAdapter<TerminationOffboarding>() {
           @Override
           public void write(JsonWriter out, TerminationOffboarding value) throws IOException {
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
           public TerminationOffboarding read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TerminationOffboarding instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TerminationOffboarding given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TerminationOffboarding
  * @throws IOException if the JSON string is invalid with respect to TerminationOffboarding
  */
  public static TerminationOffboarding fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TerminationOffboarding.class);
  }

 /**
  * Convert an instance of TerminationOffboarding to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

