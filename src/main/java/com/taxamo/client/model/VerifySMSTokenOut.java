package com.taxamo.client.model;

/*
*  Copyright 2014 Taxamo, Ltd.
*
*  Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*/

/*
* NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
*/

import com.owlike.genson.annotation.JsonProperty;

public class VerifySMSTokenOut {
  /* Verified country code, returned if operation was successful. */
  @JsonProperty("country_code")
  private String countryCode = null;
  @JsonProperty("country_code")
  public String getCountryCode() {
    return countryCode;
  }

  @JsonProperty("country_code")
  public VerifySMSTokenOut setCountryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifySMSTokenOut {\n");
    sb.append("  countryCode: ").append(countryCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

