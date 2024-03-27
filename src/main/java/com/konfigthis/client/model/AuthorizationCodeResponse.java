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
 * AuthorizationCodeResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AuthorizationCodeResponse {
  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_EXPIRES_IN = "expires_in";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private Integer expiresIn;

  public static final String SERIALIZED_NAME_TOKEN_TYPE = "token_type";
  @SerializedName(SERIALIZED_NAME_TOKEN_TYPE)
  private String tokenType;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private String companyId;

  public static final String SERIALIZED_NAME_REFRESH_TOKEN = "refresh_token";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN)
  private String refreshToken;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public AuthorizationCodeResponse() {
  }

  public AuthorizationCodeResponse accessToken(String accessToken) {
    
    
    
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * A JWT token.
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.cThIIoDvwdueQB468K5xDc5633seEFoqwxjF_xSJyQQ", value = "A JWT token.")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    
    
    
    this.accessToken = accessToken;
  }


  public AuthorizationCodeResponse expiresIn(Integer expiresIn) {
    
    
    
    
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Number of seconds until token is expired.
   * @return expiresIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7200", value = "Number of seconds until token is expired.")

  public Integer getExpiresIn() {
    return expiresIn;
  }


  public void setExpiresIn(Integer expiresIn) {
    
    
    
    this.expiresIn = expiresIn;
  }


  public AuthorizationCodeResponse tokenType(String tokenType) {
    
    
    
    
    this.tokenType = tokenType;
    return this;
  }

   /**
   * The type of the token. For now, always &#x60;Bearer&#x60;.
   * @return tokenType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Bearer", value = "The type of the token. For now, always `Bearer`.")

  public String getTokenType() {
    return tokenType;
  }


  public void setTokenType(String tokenType) {
    
    
    
    this.tokenType = tokenType;
  }


  public AuthorizationCodeResponse companyId(String companyId) {
    
    
    
    
    this.companyId = companyId;
    return this;
  }

   /**
   * The ID of the connected company.
   * @return companyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6e60f5f9-e6a6-4b04-b13c-84bced848bab", value = "The ID of the connected company.")

  public String getCompanyId() {
    return companyId;
  }


  public void setCompanyId(String companyId) {
    
    
    
    this.companyId = companyId;
  }


  public AuthorizationCodeResponse refreshToken(String refreshToken) {
    
    
    
    
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * The refresh token. This token must be stored and used for issuing new access tokens for managing the company&#39;s resources.
   * @return refreshToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "b480036a-d229-49ef-a606-7e8fba58a5eb", value = "The refresh token. This token must be stored and used for issuing new access tokens for managing the company's resources.")

  public String getRefreshToken() {
    return refreshToken;
  }


  public void setRefreshToken(String refreshToken) {
    
    
    
    this.refreshToken = refreshToken;
  }


  public AuthorizationCodeResponse userId(String userId) {
    
    
    
    
    this.userId = userId;
    return this;
  }

   /**
   * The ID of the user who connected the company.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6550e536-8655-4bce-8bd9-b295f786ad71", value = "The ID of the user who connected the company.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    
    
    
    this.userId = userId;
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
   * @return the AuthorizationCodeResponse instance itself
   */
  public AuthorizationCodeResponse putAdditionalProperty(String key, Object value) {
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
    AuthorizationCodeResponse authorizationCodeResponse = (AuthorizationCodeResponse) o;
    return Objects.equals(this.accessToken, authorizationCodeResponse.accessToken) &&
        Objects.equals(this.expiresIn, authorizationCodeResponse.expiresIn) &&
        Objects.equals(this.tokenType, authorizationCodeResponse.tokenType) &&
        Objects.equals(this.companyId, authorizationCodeResponse.companyId) &&
        Objects.equals(this.refreshToken, authorizationCodeResponse.refreshToken) &&
        Objects.equals(this.userId, authorizationCodeResponse.userId)&&
        Objects.equals(this.additionalProperties, authorizationCodeResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresIn, tokenType, companyId, refreshToken, userId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationCodeResponse {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("access_token");
    openapiFields.add("expires_in");
    openapiFields.add("token_type");
    openapiFields.add("company_id");
    openapiFields.add("refresh_token");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthorizationCodeResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AuthorizationCodeResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthorizationCodeResponse is not found in the empty JSON string", AuthorizationCodeResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("access_token") != null && !jsonObj.get("access_token").isJsonNull()) && !jsonObj.get("access_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_token").toString()));
      }
      if ((jsonObj.get("token_type") != null && !jsonObj.get("token_type").isJsonNull()) && !jsonObj.get("token_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_type").toString()));
      }
      if ((jsonObj.get("company_id") != null && !jsonObj.get("company_id").isJsonNull()) && !jsonObj.get("company_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company_id").toString()));
      }
      if ((jsonObj.get("refresh_token") != null && !jsonObj.get("refresh_token").isJsonNull()) && !jsonObj.get("refresh_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refresh_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refresh_token").toString()));
      }
      if ((jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonNull()) && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthorizationCodeResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthorizationCodeResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthorizationCodeResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthorizationCodeResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthorizationCodeResponse>() {
           @Override
           public void write(JsonWriter out, AuthorizationCodeResponse value) throws IOException {
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
           public AuthorizationCodeResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AuthorizationCodeResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AuthorizationCodeResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthorizationCodeResponse
  * @throws IOException if the JSON string is invalid with respect to AuthorizationCodeResponse
  */
  public static AuthorizationCodeResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthorizationCodeResponse.class);
  }

 /**
  * Convert an instance of AuthorizationCodeResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

