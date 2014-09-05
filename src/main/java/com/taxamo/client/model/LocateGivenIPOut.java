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


import com.taxamo.client.model.Country;
public class LocateGivenIPOut {
  /* Remote IP address. */
  private String remoteAddr = null;
  /* Detected country code. */
  private String countryCode = null;
  /* Detected country details */
  private Country country = null;
  public String getRemoteAddr() {
    return remoteAddr;
  }
  public LocateGivenIPOut setRemoteAddr(String remoteAddr) {
    this.remoteAddr = remoteAddr;
    return this;
  }

  public String getCountryCode() {
    return countryCode;
  }
  public LocateGivenIPOut setCountryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  public Country getCountry() {
    return country;
  }
  public LocateGivenIPOut setCountry(Country country) {
    this.country = country;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocateGivenIPOut {\n");
    sb.append("  remoteAddr: ").append(remoteAddr).append("\n");
    sb.append("  countryCode: ").append(countryCode).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

