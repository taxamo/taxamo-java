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


import com.taxamo.client.model.Evidence;
import com.taxamo.client.model.Countries;
public class CalculateTaxLocationOut {
  /* Two-letter ISO country code, e.g. FR. This code applies to detected/set country for transaction, but can be set using manual mode. */
  private String taxCountryCode = null;
  /* If the transaction is in a country supported by Taxamo, but the tax is not calculated due to merchant settings or EU B2B transaction for example. */
  private Boolean taxDeducted = null;
  /* Is tax calculation supported for a detected tax location? */
  private Boolean taxSupported = null;
  /* Map of countries calculated from evidence provided. This value is not stored and is available only upon tax calculation. */
  private Countries countries = null;
  /* IP address of the buyer in dotted decimal (IPv4) or text format (IPv6). */
  private String buyerIp = null;
  /* Billing two letter ISO country code. */
  private String billingCountryCode = null;
  /* Buyer's credit card prefix. */
  private String buyerCreditCardPrefix = null;
  /* Tax country of residence evidence. */
  private Evidence evidence = null;
  public String getTaxCountryCode() {
    return taxCountryCode;
  }
  public CalculateTaxLocationOut setTaxCountryCode(String taxCountryCode) {
    this.taxCountryCode = taxCountryCode;
    return this;
  }

  public Boolean getTaxDeducted() {
    return taxDeducted;
  }
  public CalculateTaxLocationOut setTaxDeducted(Boolean taxDeducted) {
    this.taxDeducted = taxDeducted;
    return this;
  }

  public Boolean getTaxSupported() {
    return taxSupported;
  }
  public CalculateTaxLocationOut setTaxSupported(Boolean taxSupported) {
    this.taxSupported = taxSupported;
    return this;
  }

  public Countries getCountries() {
    return countries;
  }
  public CalculateTaxLocationOut setCountries(Countries countries) {
    this.countries = countries;
    return this;
  }

  public String getBuyerIp() {
    return buyerIp;
  }
  public CalculateTaxLocationOut setBuyerIp(String buyerIp) {
    this.buyerIp = buyerIp;
    return this;
  }

  public String getBillingCountryCode() {
    return billingCountryCode;
  }
  public CalculateTaxLocationOut setBillingCountryCode(String billingCountryCode) {
    this.billingCountryCode = billingCountryCode;
    return this;
  }

  public String getBuyerCreditCardPrefix() {
    return buyerCreditCardPrefix;
  }
  public CalculateTaxLocationOut setBuyerCreditCardPrefix(String buyerCreditCardPrefix) {
    this.buyerCreditCardPrefix = buyerCreditCardPrefix;
    return this;
  }

  public Evidence getEvidence() {
    return evidence;
  }
  public CalculateTaxLocationOut setEvidence(Evidence evidence) {
    this.evidence = evidence;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculateTaxLocationOut {\n");
    sb.append("  taxCountryCode: ").append(taxCountryCode).append("\n");
    sb.append("  taxDeducted: ").append(taxDeducted).append("\n");
    sb.append("  taxSupported: ").append(taxSupported).append("\n");
    sb.append("  countries: ").append(countries).append("\n");
    sb.append("  buyerIp: ").append(buyerIp).append("\n");
    sb.append("  billingCountryCode: ").append(billingCountryCode).append("\n");
    sb.append("  buyerCreditCardPrefix: ").append(buyerCreditCardPrefix).append("\n");
    sb.append("  evidence: ").append(evidence).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

