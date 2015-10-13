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
public class Payments {
  /* Amount that has been paid. Use negative value to register refunds. */
  @JsonProperty("amount")
  private BigDecimal amount = null;
  /* When the payment was received in yyyy-MM-dd HH:mm:ss (24 hour format, UTC+0 timezone). */
  @JsonProperty("payment_timestamp")
  private String paymentTimestamp = null;
  /* Additional payment information. */
  @JsonProperty("payment_information")
  private String paymentInformation = null;
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }
  
  @JsonProperty("amount")
  public Payments setAmount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  @JsonProperty("payment_timestamp")
  public String getPaymentTimestamp() {
    return paymentTimestamp;
  }
  
  @JsonProperty("payment_timestamp")
  public Payments setPaymentTimestamp(String paymentTimestamp) {
    this.paymentTimestamp = paymentTimestamp;
    return this;
  }

  @JsonProperty("payment_information")
  public String getPaymentInformation() {
    return paymentInformation;
  }
  
  @JsonProperty("payment_information")
  public Payments setPaymentInformation(String paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payments {\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  paymentTimestamp: ").append(paymentTimestamp).append("\n");
    sb.append("  paymentInformation: ").append(paymentInformation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

