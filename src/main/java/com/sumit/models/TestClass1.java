package com.sumit.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

/**
 * @author Sumit Choudhary (sumit.choudhary@addepar.com)
 */

@Schema(type = SchemaType.DEFAULT)
public record TestClass1 (
    String name,
    @JsonProperty(value = "schema_type")
    org.jooq.Schema schemaType) {
}
