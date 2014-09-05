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


import java.math.BigDecimal;
public class CreateRefundIn {
  /* Line identifier. Either line key or custom id is required. */
  private String lineKey = null;
  /* Line custom identifier. Either line key or custom id is required. */
  private String customId = null;
  /* Amount (without tax) to be refunded. Either amount or total amount is required. */
  private BigDecimal amount = null;
  /* Total amount, including tax, to be refunded. Either amount or total amount is required. */
  private BigDecimal totalAmount = null;
  public String getLineKey() {
    return lineKey;
  }
  public CreateRefundIn setLineKey(String lineKey) {
    this.lineKey = lineKey;
    return this;
  }

  public String getCustomId() {
    return customId;
  }
  public CreateRefundIn setCustomId(String customId) {
    this.customId = customId;
    return this;
  }

  public BigDecimal getAmount() {
    return amount;
  }
  public CreateRefundIn setAmount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  public BigDecimal getTotalAmount() {
    return totalAmount;
  }
  public CreateRefundIn setTotalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRefundIn {\n");
    sb.append("  lineKey: ").append(lineKey).append("\n");
    sb.append("  customId: ").append(customId).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  totalAmount: ").append(totalAmount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

