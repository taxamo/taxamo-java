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

import java.math.BigDecimal;
public class AdditionalCurrency {
  /* 3-letter ISO currency code. */
  @JsonProperty("currency_code")
  private String currencyCode = null;
  /* Amount (w/o TAX) in designated currency. */
  @JsonProperty("amount")
  private BigDecimal amount = null;
  /* Tax amount in designated currency. */
  @JsonProperty("tax_amount")
  private BigDecimal taxAmount = null;
  /* Foreign exchange rate used in calculation */
  @JsonProperty("fx_rate")
  private BigDecimal fxRate = null;
  /* Total amount in designated currency. */
  @JsonProperty("total_amount")
  private BigDecimal totalAmount = null;
  @JsonProperty("currency_code")
  public String getCurrencyCode() {
    return currencyCode;
  }

  @JsonProperty("currency_code")
  public AdditionalCurrency setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }

  @JsonProperty("amount")
  public AdditionalCurrency setAmount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  @JsonProperty("tax_amount")
  public BigDecimal getTaxAmount() {
    return taxAmount;
  }

  @JsonProperty("tax_amount")
  public AdditionalCurrency setTaxAmount(BigDecimal taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  @JsonProperty("fx_rate")
  public BigDecimal getFxRate() {
    return fxRate;
  }

  @JsonProperty("fx_rate")
  public AdditionalCurrency setFxRate(BigDecimal fxRate) {
    this.fxRate = fxRate;
    return this;
  }

  @JsonProperty("total_amount")
  public BigDecimal getTotalAmount() {
    return totalAmount;
  }

  @JsonProperty("total_amount")
  public AdditionalCurrency setTotalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalCurrency {\n");
    sb.append("  currencyCode: ").append(currencyCode).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  taxAmount: ").append(taxAmount).append("\n");
    sb.append("  fxRate: ").append(fxRate).append("\n");
    sb.append("  totalAmount: ").append(totalAmount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

