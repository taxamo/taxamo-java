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


import java.lang.Integer;
public class CurrencySchema {
  /* Currency 3-letter ISO code. */
  private String code = null;
  /* Number of minor units for currency. */
  private Integer minorunits = null;
  /* Currency description. */
  private String description = null;
  /* Currency 3-letter ISO code. */
  private String isocode = null;
  /* Currency iso numeric code. */
  private Integer isonum = null;
  public String getCode() {
    return code;
  }
  public CurrencySchema setCode(String code) {
    this.code = code;
    return this;
  }

  public Integer getMinorunits() {
    return minorunits;
  }
  public CurrencySchema setMinorunits(Integer minorunits) {
    this.minorunits = minorunits;
    return this;
  }

  public String getDescription() {
    return description;
  }
  public CurrencySchema setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getIsocode() {
    return isocode;
  }
  public CurrencySchema setIsocode(String isocode) {
    this.isocode = isocode;
    return this;
  }

  public Integer getIsonum() {
    return isonum;
  }
  public CurrencySchema setIsonum(Integer isonum) {
    this.isonum = isonum;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencySchema {\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("  minorunits: ").append(minorunits).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  isocode: ").append(isocode).append("\n");
    sb.append("  isonum: ").append(isonum).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

