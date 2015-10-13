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

import java.util.*;
import com.taxamo.client.model.ByCountry;
public class GetTransactionsStatsByCountryOut {
  /* Settlement stats. */
  @JsonProperty("by_country")
  private List<ByCountry> byCountry = new ArrayList<ByCountry>();
  @JsonProperty("by_country")
  public List<ByCountry> getByCountry() {
    return byCountry;
  }
  
  @JsonProperty("by_country")
  public GetTransactionsStatsByCountryOut setByCountry(List<ByCountry> byCountry) {
    this.byCountry = byCountry;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionsStatsByCountryOut {\n");
    sb.append("  byCountry: ").append(byCountry).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

