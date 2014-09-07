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


import java.util.*;
public class CountrySchema {
  /* Country ISO 3-digit code. */
  private String ccn3 = null;
  /* Country name. */
  private String name = null;
  /* Two letter ISO country code. */
  private String code = null;
  /* Three letter ISO country code. */
  private String codeLong = null;
  /* Two letter ISO country code. */
  private String cca2 = null;
  /* List of phone number calling codes. */
  private List<String> callingCode = new ArrayList<String>();
  /* Three letter ISO country code. */
  private String cca3 = null;
  /* Country ISO 3-digit code. */
  private String codenum = null;
  /* True if tax calculation supported for this country. */
  private Boolean taxSupported = null;
  public String getCcn3() {
    return ccn3;
  }
  public CountrySchema setCcn3(String ccn3) {
    this.ccn3 = ccn3;
    return this;
  }

  public String getName() {
    return name;
  }
  public CountrySchema setName(String name) {
    this.name = name;
    return this;
  }

  public String getCode() {
    return code;
  }
  public CountrySchema setCode(String code) {
    this.code = code;
    return this;
  }

  public String getCodeLong() {
    return codeLong;
  }
  public CountrySchema setCodeLong(String codeLong) {
    this.codeLong = codeLong;
    return this;
  }

  public String getCca2() {
    return cca2;
  }
  public CountrySchema setCca2(String cca2) {
    this.cca2 = cca2;
    return this;
  }

  public List<String> getCallingCode() {
    return callingCode;
  }
  public CountrySchema setCallingCode(List<String> callingCode) {
    this.callingCode = callingCode;
    return this;
  }

  public String getCca3() {
    return cca3;
  }
  public CountrySchema setCca3(String cca3) {
    this.cca3 = cca3;
    return this;
  }

  public String getCodenum() {
    return codenum;
  }
  public CountrySchema setCodenum(String codenum) {
    this.codenum = codenum;
    return this;
  }

  public Boolean getTaxSupported() {
    return taxSupported;
  }
  public CountrySchema setTaxSupported(Boolean taxSupported) {
    this.taxSupported = taxSupported;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountrySchema {\n");
    sb.append("  ccn3: ").append(ccn3).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  codeLong: ").append(codeLong).append("\n");
    sb.append("  cca2: ").append(cca2).append("\n");
    sb.append("  callingCode: ").append(callingCode).append("\n");
    sb.append("  cca3: ").append(cca3).append("\n");
    sb.append("  codenum: ").append(codenum).append("\n");
    sb.append("  taxSupported: ").append(taxSupported).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
