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
import com.taxamo.client.model.InputTransactionLine;
import com.taxamo.client.model.AdditionalCurrencies;
import com.taxamo.client.model.TaxDataSchema;
import com.taxamo.client.model.Evidence;
import com.taxamo.client.model.CustomFields;
import com.taxamo.client.model.InvoiceAddress;
public class InputTransactionUpdate {
  /* Buyer's credit card prefix. */
  @JsonProperty("buyer_credit_card_prefix")
  private String buyerCreditCardPrefix = null;
  /* Custom data related to transaction. */
  @JsonProperty("custom_data")
  private String customData = null;
  /* Buyer's name - first name and last name or company name. */
  @JsonProperty("buyer_name")
  private String buyerName = null;
  /* Invoice date of issue. */
  @JsonProperty("invoice_date")
  private String invoiceDate = null;
  /* Currency code for transaction - e.g. EUR. */
  @JsonProperty("currency_code")
  private String currencyCode = null;
  /* Supply date in yyyy-MM-dd format. */
  @JsonProperty("supply_date")
  private String supplyDate = null;
  /* Invoice address. */
  @JsonProperty("invoice_address")
  private InvoiceAddress invoiceAddress = null;
  /* Verification token */
  @JsonProperty("verification_token")
  private String verificationToken = null;
  /* Tax additional information - e.g. US sales tax exemption certificate data. */
  @JsonProperty("tax_data")
  private TaxDataSchema taxData = null;
  /* Transaction lines. */
  @JsonProperty("transaction_lines")
  private List<InputTransactionLine> transactionLines = new ArrayList<InputTransactionLine>();
  /*  Buyer's tax number - EU VAT number for example. If using EU VAT number, it is possible to provide country code in it (e.g. IE1234567X) or simply use billing_country_code field for that. In the first case, if billing_country_code value was provided, it will be overwritten with country code value extracted from VAT number - but only if the VAT has been verified properly. */
  @JsonProperty("buyer_tax_number")
  private String buyerTaxNumber = null;
  /* Transaction status: 'N' - new, 'C' - confirmed, 'X' - cancelled, 'S' - settled. Can use 'C' in store-transaction! with private-token to create confirmed transaction, otherwise 'N' is default state. Not applicable for update-transaction!. */
  @JsonProperty("status")
  private String status = null;
  /* Custom fields, stored as key-value pairs. This property is not processed and used mostly with Taxamo-built helpers. */
  @JsonProperty("custom_fields")
  private List<CustomFields> customFields = new ArrayList<CustomFields>();
  /* Two-letter ISO country code, e.g. FR. Use it to force country code for tax calculation. */
  @JsonProperty("force_country_code")
  private String forceCountryCode = null;
  /* Invoice number. */
  @JsonProperty("invoice_number")
  private String invoiceNumber = null;
  /* Order date in yyyy-MM-dd format, in merchant's timezone. If provided by the API caller, no timezone conversion is performed. Default value is current date and time. When using public token, the default value is used. */
  @JsonProperty("order_date")
  private String orderDate = null;
  /* Free-form field for storing customer id. */
  @JsonProperty("customer_id")
  private String customerId = null;
  /* IP address of the buyer in dotted decimal (IPv4) or text format (IPv6). */
  @JsonProperty("buyer_ip")
  private String buyerIp = null;
  /* Buyer's declared email address. */
  @JsonProperty("buyer_email")
  private String buyerEmail = null;
  /* Use data and evidence from original transaction. Tax will be re-calculated, but evidence won't be re-checked. This parameter is taken into account only when 'manual' flag is raised. */
  @JsonProperty("original_transaction_key")
  private String originalTransactionKey = null;
  /* Billing two letter ISO country code. */
  @JsonProperty("billing_country_code")
  private String billingCountryCode = null;
  /* Custom identifier provided upon transaction creation. */
  @JsonProperty("custom_id")
  private String customId = null;
  /* Additional currency information - can be used to receive additional information about invoice in another currency. */
  @JsonProperty("additional_currencies")
  private AdditionalCurrencies additionalCurrencies = null;
  /* Invoice place of issue. */
  @JsonProperty("invoice_place")
  private String invoicePlace = null;
  /* Tax country of residence evidence. */
  @JsonProperty("evidence")
  private Evidence evidence = null;
  /* Transaction description. */
  @JsonProperty("description")
  private String description = null;
  /* True if the transaction is deducted from tax and no tax is applied (it is untaxed). Either set automatically when VAT number validates with VIES correctly, but can also be provided in manual mode. */
  @JsonProperty("tax_deducted")
  private Boolean taxDeducted = null;
  /* Two-letter ISO country code, e.g. FR. This code applies to detected/set country for transaction, but can be set using manual mode. */
  @JsonProperty("tax_country_code")
  private String taxCountryCode = null;
  @JsonProperty("buyer_credit_card_prefix")
  public String getBuyerCreditCardPrefix() {
    return buyerCreditCardPrefix;
  }

  @JsonProperty("buyer_credit_card_prefix")
  public InputTransactionUpdate setBuyerCreditCardPrefix(String buyerCreditCardPrefix) {
    this.buyerCreditCardPrefix = buyerCreditCardPrefix;
    return this;
  }

  @JsonProperty("custom_data")
  public String getCustomData() {
    return customData;
  }

  @JsonProperty("custom_data")
  public InputTransactionUpdate setCustomData(String customData) {
    this.customData = customData;
    return this;
  }

  @JsonProperty("buyer_name")
  public String getBuyerName() {
    return buyerName;
  }

  @JsonProperty("buyer_name")
  public InputTransactionUpdate setBuyerName(String buyerName) {
    this.buyerName = buyerName;
    return this;
  }

  @JsonProperty("invoice_date")
  public String getInvoiceDate() {
    return invoiceDate;
  }

  @JsonProperty("invoice_date")
  public InputTransactionUpdate setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

  @JsonProperty("currency_code")
  public String getCurrencyCode() {
    return currencyCode;
  }

  @JsonProperty("currency_code")
  public InputTransactionUpdate setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  @JsonProperty("supply_date")
  public String getSupplyDate() {
    return supplyDate;
  }

  @JsonProperty("supply_date")
  public InputTransactionUpdate setSupplyDate(String supplyDate) {
    this.supplyDate = supplyDate;
    return this;
  }

  @JsonProperty("invoice_address")
  public InvoiceAddress getInvoiceAddress() {
    return invoiceAddress;
  }

  @JsonProperty("invoice_address")
  public InputTransactionUpdate setInvoiceAddress(InvoiceAddress invoiceAddress) {
    this.invoiceAddress = invoiceAddress;
    return this;
  }

  @JsonProperty("verification_token")
  public String getVerificationToken() {
    return verificationToken;
  }

  @JsonProperty("verification_token")
  public InputTransactionUpdate setVerificationToken(String verificationToken) {
    this.verificationToken = verificationToken;
    return this;
  }

  @JsonProperty("tax_data")
  public TaxDataSchema getTaxData() {
    return taxData;
  }

  @JsonProperty("tax_data")
  public InputTransactionUpdate setTaxData(TaxDataSchema taxData) {
    this.taxData = taxData;
    return this;
  }

  @JsonProperty("transaction_lines")
  public List<InputTransactionLine> getTransactionLines() {
    return transactionLines;
  }

  @JsonProperty("transaction_lines")
  public InputTransactionUpdate setTransactionLines(List<InputTransactionLine> transactionLines) {
    this.transactionLines = transactionLines;
    return this;
  }

  @JsonProperty("buyer_tax_number")
  public String getBuyerTaxNumber() {
    return buyerTaxNumber;
  }

  @JsonProperty("buyer_tax_number")
  public InputTransactionUpdate setBuyerTaxNumber(String buyerTaxNumber) {
    this.buyerTaxNumber = buyerTaxNumber;
    return this;
  }

  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  @JsonProperty("status")
  public InputTransactionUpdate setStatus(String status) {
    this.status = status;
    return this;
  }

  @JsonProperty("custom_fields")
  public List<CustomFields> getCustomFields() {
    return customFields;
  }

  @JsonProperty("custom_fields")
  public InputTransactionUpdate setCustomFields(List<CustomFields> customFields) {
    this.customFields = customFields;
    return this;
  }

  @JsonProperty("force_country_code")
  public String getForceCountryCode() {
    return forceCountryCode;
  }

  @JsonProperty("force_country_code")
  public InputTransactionUpdate setForceCountryCode(String forceCountryCode) {
    this.forceCountryCode = forceCountryCode;
    return this;
  }

  @JsonProperty("invoice_number")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  @JsonProperty("invoice_number")
  public InputTransactionUpdate setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

  @JsonProperty("order_date")
  public String getOrderDate() {
    return orderDate;
  }

  @JsonProperty("order_date")
  public InputTransactionUpdate setOrderDate(String orderDate) {
    this.orderDate = orderDate;
    return this;
  }

  @JsonProperty("customer_id")
  public String getCustomerId() {
    return customerId;
  }

  @JsonProperty("customer_id")
  public InputTransactionUpdate setCustomerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  @JsonProperty("buyer_ip")
  public String getBuyerIp() {
    return buyerIp;
  }

  @JsonProperty("buyer_ip")
  public InputTransactionUpdate setBuyerIp(String buyerIp) {
    this.buyerIp = buyerIp;
    return this;
  }

  @JsonProperty("buyer_email")
  public String getBuyerEmail() {
    return buyerEmail;
  }

  @JsonProperty("buyer_email")
  public InputTransactionUpdate setBuyerEmail(String buyerEmail) {
    this.buyerEmail = buyerEmail;
    return this;
  }

  @JsonProperty("original_transaction_key")
  public String getOriginalTransactionKey() {
    return originalTransactionKey;
  }

  @JsonProperty("original_transaction_key")
  public InputTransactionUpdate setOriginalTransactionKey(String originalTransactionKey) {
    this.originalTransactionKey = originalTransactionKey;
    return this;
  }

  @JsonProperty("billing_country_code")
  public String getBillingCountryCode() {
    return billingCountryCode;
  }

  @JsonProperty("billing_country_code")
  public InputTransactionUpdate setBillingCountryCode(String billingCountryCode) {
    this.billingCountryCode = billingCountryCode;
    return this;
  }

  @JsonProperty("custom_id")
  public String getCustomId() {
    return customId;
  }

  @JsonProperty("custom_id")
  public InputTransactionUpdate setCustomId(String customId) {
    this.customId = customId;
    return this;
  }

  @JsonProperty("additional_currencies")
  public AdditionalCurrencies getAdditionalCurrencies() {
    return additionalCurrencies;
  }

  @JsonProperty("additional_currencies")
  public InputTransactionUpdate setAdditionalCurrencies(AdditionalCurrencies additionalCurrencies) {
    this.additionalCurrencies = additionalCurrencies;
    return this;
  }

  @JsonProperty("invoice_place")
  public String getInvoicePlace() {
    return invoicePlace;
  }

  @JsonProperty("invoice_place")
  public InputTransactionUpdate setInvoicePlace(String invoicePlace) {
    this.invoicePlace = invoicePlace;
    return this;
  }

  @JsonProperty("evidence")
  public Evidence getEvidence() {
    return evidence;
  }

  @JsonProperty("evidence")
  public InputTransactionUpdate setEvidence(Evidence evidence) {
    this.evidence = evidence;
    return this;
  }

  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public InputTransactionUpdate setDescription(String description) {
    this.description = description;
    return this;
  }

  @JsonProperty("tax_deducted")
  public Boolean getTaxDeducted() {
    return taxDeducted;
  }

  @JsonProperty("tax_deducted")
  public InputTransactionUpdate setTaxDeducted(Boolean taxDeducted) {
    this.taxDeducted = taxDeducted;
    return this;
  }

  @JsonProperty("tax_country_code")
  public String getTaxCountryCode() {
    return taxCountryCode;
  }

  @JsonProperty("tax_country_code")
  public InputTransactionUpdate setTaxCountryCode(String taxCountryCode) {
    this.taxCountryCode = taxCountryCode;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputTransactionUpdate {\n");
    sb.append("  buyerCreditCardPrefix: ").append(buyerCreditCardPrefix).append("\n");
    sb.append("  customData: ").append(customData).append("\n");
    sb.append("  buyerName: ").append(buyerName).append("\n");
    sb.append("  invoiceDate: ").append(invoiceDate).append("\n");
    sb.append("  currencyCode: ").append(currencyCode).append("\n");
    sb.append("  supplyDate: ").append(supplyDate).append("\n");
    sb.append("  invoiceAddress: ").append(invoiceAddress).append("\n");
    sb.append("  verificationToken: ").append(verificationToken).append("\n");
    sb.append("  taxData: ").append(taxData).append("\n");
    sb.append("  transactionLines: ").append(transactionLines).append("\n");
    sb.append("  buyerTaxNumber: ").append(buyerTaxNumber).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("  forceCountryCode: ").append(forceCountryCode).append("\n");
    sb.append("  invoiceNumber: ").append(invoiceNumber).append("\n");
    sb.append("  orderDate: ").append(orderDate).append("\n");
    sb.append("  customerId: ").append(customerId).append("\n");
    sb.append("  buyerIp: ").append(buyerIp).append("\n");
    sb.append("  buyerEmail: ").append(buyerEmail).append("\n");
    sb.append("  originalTransactionKey: ").append(originalTransactionKey).append("\n");
    sb.append("  billingCountryCode: ").append(billingCountryCode).append("\n");
    sb.append("  customId: ").append(customId).append("\n");
    sb.append("  additionalCurrencies: ").append(additionalCurrencies).append("\n");
    sb.append("  invoicePlace: ").append(invoicePlace).append("\n");
    sb.append("  evidence: ").append(evidence).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  taxDeducted: ").append(taxDeducted).append("\n");
    sb.append("  taxCountryCode: ").append(taxCountryCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

