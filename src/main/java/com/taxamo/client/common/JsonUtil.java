package com.taxamo.client.common;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.core.JsonGenerator.Feature;

import com.fasterxml.jackson.datatype.joda.*;

public class JsonUtil {
  public static ObjectMapper mapper;

  static {
  	  mapper = new ObjectMapper();
	  mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	  mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
	  mapper.registerModule(new JodaModule());
      mapper.configure(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS, true);
      mapper.setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
      mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

  }

	public static ObjectMapper getJsonMapper() {
		return mapper;
	}
}

