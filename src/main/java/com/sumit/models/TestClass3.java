package com.sumit.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.immutables.value.Value;
@Value.Immutable
@Schema(type = SchemaType.STRING)
public interface TestClass3 {
  String name();

  @JsonProperty(value = "model_type")
  String modelType();
}
