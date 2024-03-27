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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets EmploymentTermType
 */
@JsonAdapter(EmploymentTermType.Adapter.class)public enum EmploymentTermType {
  
  FIXED("fixed"),
  
  INDEFINITE("indefinite");

  private String value;

  EmploymentTermType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EmploymentTermType fromValue(String value) {
    for (EmploymentTermType b : EmploymentTermType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EmploymentTermType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EmploymentTermType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EmploymentTermType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EmploymentTermType.fromValue(value);
    }
  }
}

