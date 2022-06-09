package com.sumit.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.immutables.value.Value;
import org.jooq.Catalog;
@Value.Immutable
@JsonDeserialize(as = ImmutableTestClass2.class)
public interface TestClass2 {
  String name();
  int value();
  float quantity();

  org.jooq.Schema another();
  Catalog catalog();
}
