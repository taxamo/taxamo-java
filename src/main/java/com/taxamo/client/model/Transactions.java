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
import java.util.*;
import com.taxamo.client.model.AdditionalCurrencies;
import com.taxamo.client.model.TransactionLines;
import com.taxamo.client.model.TaxDataSchema;
import com.taxamo.client.model.Evidence;
import com.taxamo.client.model.CustomFields;
import com.taxamo.client.model.InvoiceAddress;
import com.taxamo.client.model.Countries;
public class Transactions {
  /* Date and time of transaction confirmation. */
  @JsonProperty("confirm_timestamp")
  private String confirmTimestamp = null;
  /* Set to true if transaction has only informative lines. */
  @JsonProperty("fully_informative")
  private Boolean fullyInformative = null;
  /* How much tax has been deducted. */
  @JsonProperty("deducted_tax_amount")
  private BigDecimal deductedTaxAmount = null;
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
  /* Date and time of transaction creation. */
  @JsonProperty("create_timestamp")
  private String createTimestamp = null;
  /* Currency code for transaction - e.g. EUR. */
  @JsonProperty("currency_code")
  private String currencyCode = null;
  /* Supply date in yyyy-MM-dd format. */
  @JsonProperty("supply_date")
  private String supplyDate = null;
  /* Invoice image URL - provided by Taxamo. */
  @JsonProperty("invoice_image_url")
  private String invoiceImageUrl = null;
  /* Id generated by taxamo. */
  @JsonProperty("key")
  private String key = null;
  /* Invoice address. */
  @JsonProperty("invoice_address")
  private InvoiceAddress invoiceAddress = null;
  /* If the buyer tax number has been provided and was validated successfully. Always true for domestic transactions (billing country same as merchant's country), tax number doesn't get validated in that case. */
  @JsonProperty("buyer_tax_number_valid")
  private Boolean buyerTaxNumberValid = null;
  /* Verification token */
  @JsonProperty("verification_token")
  private String verificationToken = null;
  /* Is tax calculation supported for a detected tax location? */
  @JsonProperty("tax_supported")
  private Boolean taxSupported = null;
  /* Tax additional information - e.g. US sales tax exemption certificate data. */
  @JsonProperty("tax_data")
  private TaxDataSchema taxData = null;
  /* Transaction lines. */
  @JsonProperty("transaction_lines")
  private List<TransactionLines> transactionLines = new ArrayList<TransactionLines>();
  /*  Buyer's tax number - EU VAT number for example. If using EU VAT number, it is possible to provide country code in it (e.g. IE1234567X) or simply use billing_country_code field for that. In the first case, if billing_country_code value was provided, it will be overwritten with country code value extracted from VAT number - but only if the VAT has been verified properly. */
  @JsonProperty("buyer_tax_number")
  private String buyerTaxNumber = null;
  /* Transaction external key */
  @JsonProperty("external_key")
  private String externalKey = null;
  /* Transaction status: 'N' - new, 'C' - confirmed. Can use 'C' in store-transaction! with private-token to create confirmed transaction, otherwise 'N' is default status. Not applicable for update-transaction!. */
  @JsonProperty("status")
  private String status = null;
  /* Custom fields, stored as key-value pairs. This property is not processed and used mostly with Taxamo-built helpers. */
  @JsonProperty("custom_fields")
  private List<CustomFields> customFields = new ArrayList<CustomFields>();
  /* Two-letter ISO country code, e.g. FR. Use it to force country code for tax calculation. */
  @JsonProperty("force_country_code")
  private String forceCountryCode = null;
  /* Map of countries calculated from evidence provided. This value is not stored and is available only upon tax calculation. */
  @JsonProperty("countries")
  private Countries countries = null;
  /* Invoice number. */
  @JsonProperty("invoice_number")
  private String invoiceNumber = null;
  /* Order date in yyyy-MM-dd format, in merchant's timezone. If provided by the API caller, no timezone conversion is performed. Default value is current date and time. When using public token, the default value is used. */
  @JsonProperty("order_date")
  private String orderDate = null;
  /* Free-form field for storing customer id. */
  @JsonProperty("customer_id")
  private String customerId = null;
  /* Transaction kind: eu-b2c, eu-b2b, domestic, untaxed */
  @JsonProperty("kind")
  private String kind = null;
  /* Transaction source software - e.g. plugin */
  @JsonProperty("source")
  private String source = null;
  /* Amount of transaction without tax. */
  @JsonProperty("amount")
  private BigDecimal amount = null;
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
  /* Tax amount of transaction. */
  @JsonProperty("tax_amount")
  private BigDecimal taxAmount = null;
  /* Additional currency information - can be used to receive additional information about invoice in another currency. */
  @JsonProperty("additional_currencies")
  private AdditionalCurrencies additionalCurrencies = null;
  /* Invoice place of issue. */
  @JsonProperty("invoice_place")
  private String invoicePlace = null;
  /* Total amount of transaction. */
  @JsonProperty("total_amount")
  private BigDecimal totalAmount = null;
  /* To which entity is the tax due. */
  @JsonProperty("tax_entity_name")
  private String taxEntityName = null;
  /* Tax country of residence evidence. */
  @JsonProperty("evidence")
  private Evidence evidence = null;
  /* Refunded tax amount. */
  @JsonProperty("refunded_tax_amount")
  private BigDecimal refundedTaxAmount = null;
  /* Is the transaction created manually - using private token. In manual mode, it is the merchant who calculates tax country and validates evidence. If you need API to do that when accessing the API with private token, just skip the 'manual' flag or use false value there and provide customer's ip address through buyer_ip field. Manual mode is also used when using original_transaction_key field. */
  @JsonProperty("manual")
  private Boolean manual = null;
  /* Timezone name for tax transaction. */
  @JsonProperty("tax_timezone")
  private String taxTimezone = null;
  /* Transaction description. */
  @JsonProperty("description")
  private String description = null;
  /* Was this transaction created in test mode? */
  @JsonProperty("test")
  private Boolean test = null;
  /* If the transaction is in a country supported by Taxamo, but the tax is not calculated due to merchant settings or EU B2B transaction for example. */
  @JsonProperty("tax_deducted")
  private Boolean taxDeducted = null;
  /* Two-letter ISO country code, e.g. FR. This code applies to detected/set country for transaction, but can be set using manual mode. */
  @JsonProperty("tax_country_code")
  private String taxCountryCode = null;
  /* Total amount refunde (including tax). */
  @JsonProperty("refunded_total_amount")
  private BigDecimal refundedTotalAmount = null;
  @JsonProperty("confirm_timestamp")
  public String getConfirmTimestamp() {
    return confirmTimestamp;
  }

  @JsonProperty("confirm_timestamp")
  public Transactions setConfirmTimestamp(String confirmTimestamp) {
    this.confirmTimestamp = confirmTimestamp;
    return this;
  }

  @JsonProperty("fully_informative")
  public Boolean getFullyInformative() {
    return fullyInformative;
  }

  @JsonProperty("fully_informative")
  public Transactions setFullyInformative(Boolean fullyInformative) {
    this.fullyInformative = fullyInformative;
    return this;
  }

  @JsonProperty("deducted_tax_amount")
  public BigDecimal getDeductedTaxAmount() {
    return deductedTaxAmount;
  }

  @JsonProperty("deducted_tax_amount")
  public Transactions setDeductedTaxAmount(BigDecimal deductedTaxAmount) {
    this.deductedTaxAmount = deductedTaxAmount;
    return this;
  }

  @JsonProperty("buyer_credit_card_prefix")
  public String getBuyerCreditCardPrefix() {
    return buyerCreditCardPrefix;
  }

  @JsonProperty("buyer_credit_card_prefix")
  public Transactions setBuyerCreditCardPrefix(String buyerCreditCardPrefix) {
    this.buyerCreditCardPrefix = buyerCreditCardPrefix;
    return this;
  }

  @JsonProperty("custom_data")
  public String getCustomData() {
    return customData;
  }

  @JsonProperty("custom_data")
  public Transactions setCustomData(String customData) {
    this.customData = customData;
    return this;
  }

  @JsonProperty("buyer_name")
  public String getBuyerName() {
    return buyerName;
  }

  @JsonProperty("buyer_name")
  public Transactions setBuyerName(String buyerName) {
    this.buyerName = buyerName;
    return this;
  }

  @JsonProperty("invoice_date")
  public String getInvoiceDate() {
    return invoiceDate;
  }

  @JsonProperty("invoice_date")
  public Transactions setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

  @JsonProperty("create_timestamp")
  public String getCreateTimestamp() {
    return createTimestamp;
  }

  @JsonProperty("create_timestamp")
  public Transactions setCreateTimestamp(String createTimestamp) {
    this.createTimestamp = createTimestamp;
    return this;
  }

  @JsonProperty("currency_code")
  public String getCurrencyCode() {
    return currencyCode;
  }

  @JsonProperty("currency_code")
  public Transactions setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  @JsonProperty("supply_date")
  public String getSupplyDate() {
    return supplyDate;
  }

  @JsonProperty("supply_date")
  public Transactions setSupplyDate(String supplyDate) {
    this.supplyDate = supplyDate;
    return this;
  }

  @JsonProperty("invoice_image_url")
  public String getInvoiceImageUrl() {
    return invoiceImageUrl;
  }

  @JsonProperty("invoice_image_url")
  public Transactions setInvoiceImageUrl(String invoiceImageUrl) {
    this.invoiceImageUrl = invoiceImageUrl;
    return this;
  }

  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  @JsonProperty("key")
  public Transactions setKey(String key) {
    this.key = key;
    return this;
  }

  @JsonProperty("invoice_address")
  public InvoiceAddress getInvoiceAddress() {
    return invoiceAddress;
  }

  @JsonProperty("invoice_address")
  public Transactions setInvoiceAddress(InvoiceAddress invoiceAddress) {
    this.invoiceAddress = invoiceAddress;
    return this;
  }

  @JsonProperty("buyer_tax_number_valid")
  public Boolean getBuyerTaxNumberValid() {
    return buyerTaxNumberValid;
  }

  @JsonProperty("buyer_tax_number_valid")
  public Transactions setBuyerTaxNumberValid(Boolean buyerTaxNumberValid) {
    this.buyerTaxNumberValid = buyerTaxNumberValid;
    return this;
  }

  @JsonProperty("verification_token")
  public String getVerificationToken() {
    return verificationToken;
  }

  @JsonProperty("verification_token")
  public Transactions setVerificationToken(String verificationToken) {
    this.verificationToken = verificationToken;
    return this;
  }

  @JsonProperty("tax_supported")
  public Boolean getTaxSupported() {
    return taxSupported;
  }

  @JsonProperty("tax_supported")
  public Transactions setTaxSupported(Boolean taxSupported) {
    this.taxSupported = taxSupported;
    return this;
  }

  @JsonProperty("tax_data")
  public TaxDataSchema getTaxData() {
    return taxData;
  }

  @JsonProperty("tax_data")
  public Transactions setTaxData(TaxDataSchema taxData) {
    this.taxData = taxData;
    return this;
  }

  @JsonProperty("transaction_lines")
  public List<TransactionLines> getTransactionLines() {
    return transactionLines;
  }

  @JsonProperty("transaction_lines")
  public Transactions setTransactionLines(List<TransactionLines> transactionLines) {
    this.transactionLines = transactionLines;
    return this;
  }

  @JsonProperty("buyer_tax_number")
  public String getBuyerTaxNumber() {
    return buyerTaxNumber;
  }

  @JsonProperty("buyer_tax_number")
  public Transactions setBuyerTaxNumber(String buyerTaxNumber) {
    this.buyerTaxNumber = buyerTaxNumber;
    return this;
  }

  @JsonProperty("external_key")
  public String getExternalKey() {
    return externalKey;
  }

  @JsonProperty("external_key")
  public Transactions setExternalKey(String externalKey) {
    this.externalKey = externalKey;
    return this;
  }

  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  @JsonProperty("status")
  public Transactions setStatus(String status) {
    this.status = status;
    return this;
  }

  @JsonProperty("custom_fields")
  public List<CustomFields> getCustomFields() {
    return customFields;
  }

  @JsonProperty("custom_fields")
  public Transactions setCustomFields(List<CustomFields> customFields) {
    this.customFields = customFields;
    return this;
  }

  @JsonProperty("force_country_code")
  public String getForceCountryCode() {
    return forceCountryCode;
  }

  @JsonProperty("force_country_code")
  public Transactions setForceCountryCode(String forceCountryCode) {
    this.forceCountryCode = forceCountryCode;
    return this;
  }

  @JsonProperty("countries")
  public Countries getCountries() {
    return countries;
  }

  @JsonProperty("countries")
  public Transactions setCountries(Countries countries) {
    this.countries = countries;
    return this;
  }

  @JsonProperty("invoice_number")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  @JsonProperty("invoice_number")
  public Transactions setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

  @JsonProperty("order_date")
  public String getOrderDate() {
    return orderDate;
  }

  @JsonProperty("order_date")
  public Transactions setOrderDate(String orderDate) {
    this.orderDate = orderDate;
    return this;
  }

  @JsonProperty("customer_id")
  public String getCustomerId() {
    return customerId;
  }

  @JsonProperty("customer_id")
  public Transactions setCustomerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  @JsonProperty("kind")
  public Transactions setKind(String kind) {
    this.kind = kind;
    return this;
  }

  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  @JsonProperty("source")
  public Transactions setSource(String source) {
    this.source = source;
    return this;
  }

  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }

  @JsonProperty("amount")
  public Transactions setAmount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  @JsonProperty("buyer_ip")
  public String getBuyerIp() {
    return buyerIp;
  }

  @JsonProperty("buyer_ip")
  public Transactions setBuyerIp(String buyerIp) {
    this.buyerIp = buyerIp;
    return this;
  }

  @JsonProperty("buyer_email")
  public String getBuyerEmail() {
    return buyerEmail;
  }

  @JsonProperty("buyer_email")
  public Transactions setBuyerEmail(String buyerEmail) {
    this.buyerEmail = buyerEmail;
    return this;
  }

  @JsonProperty("original_transaction_key")
  public String getOriginalTransactionKey() {
    return originalTransactionKey;
  }

  @JsonProperty("original_transaction_key")
  public Transactions setOriginalTransactionKey(String originalTransactionKey) {
    this.originalTransactionKey = originalTransactionKey;
    return this;
  }

  @JsonProperty("billing_country_code")
  public String getBillingCountryCode() {
    return billingCountryCode;
  }

  @JsonProperty("billing_country_code")
  public Transactions setBillingCountryCode(String billingCountryCode) {
    this.billingCountryCode = billingCountryCode;
    return this;
  }

  @JsonProperty("custom_id")
  public String getCustomId() {
    return customId;
  }

  @JsonProperty("custom_id")
  public Transactions setCustomId(String customId) {
    this.customId = customId;
    return this;
  }

  @JsonProperty("tax_amount")
  public BigDecimal getTaxAmount() {
    return taxAmount;
  }

  @JsonProperty("tax_amount")
  public Transactions setTaxAmount(BigDecimal taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  @JsonProperty("additional_currencies")
  public AdditionalCurrencies getAdditionalCurrencies() {
    return additionalCurrencies;
  }

  @JsonProperty("additional_currencies")
  public Transactions setAdditionalCurrencies(AdditionalCurrencies additionalCurrencies) {
    this.additionalCurrencies = additionalCurrencies;
    return this;
  }

  @JsonProperty("invoice_place")
  public String getInvoicePlace() {
    return invoicePlace;
  }

  @JsonProperty("invoice_place")
  public Transactions setInvoicePlace(String invoicePlace) {
    this.invoicePlace = invoicePlace;
    return this;
  }

  @JsonProperty("total_amount")
  public BigDecimal getTotalAmount() {
    return totalAmount;
  }

  @JsonProperty("total_amount")
  public Transactions setTotalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  @JsonProperty("tax_entity_name")
  public String getTaxEntityName() {
    return taxEntityName;
  }

  @JsonProperty("tax_entity_name")
  public Transactions setTaxEntityName(String taxEntityName) {
    this.taxEntityName = taxEntityName;
    return this;
  }

  @JsonProperty("evidence")
  public Evidence getEvidence() {
    return evidence;
  }

  @JsonProperty("evidence")
  public Transactions setEvidence(Evidence evidence) {
    this.evidence = evidence;
    return this;
  }

  @JsonProperty("refunded_tax_amount")
  public BigDecimal getRefundedTaxAmount() {
    return refundedTaxAmount;
  }

  @JsonProperty("refunded_tax_amount")
  public Transactions setRefundedTaxAmount(BigDecimal refundedTaxAmount) {
    this.refundedTaxAmount = refundedTaxAmount;
    return this;
  }

  @JsonProperty("manual")
  public Boolean getManual() {
    return manual;
  }

  @JsonProperty("manual")
  public Transactions setManual(Boolean manual) {
    this.manual = manual;
    return this;
  }

  @JsonProperty("tax_timezone")
  public String getTaxTimezone() {
    return taxTimezone;
  }

  @JsonProperty("tax_timezone")
  public Transactions setTaxTimezone(String taxTimezone) {
    this.taxTimezone = taxTimezone;
    return this;
  }

  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public Transactions setDescription(String description) {
    this.description = description;
    return this;
  }

  @JsonProperty("test")
  public Boolean getTest() {
    return test;
  }

  @JsonProperty("test")
  public Transactions setTest(Boolean test) {
    this.test = test;
    return this;
  }

  @JsonProperty("tax_deducted")
  public Boolean getTaxDeducted() {
    return taxDeducted;
  }

  @JsonProperty("tax_deducted")
  public Transactions setTaxDeducted(Boolean taxDeducted) {
    this.taxDeducted = taxDeducted;
    return this;
  }

  @JsonProperty("tax_country_code")
  public String getTaxCountryCode() {
    return taxCountryCode;
  }

  @JsonProperty("tax_country_code")
  public Transactions setTaxCountryCode(String taxCountryCode) {
    this.taxCountryCode = taxCountryCode;
    return this;
  }

  @JsonProperty("refunded_total_amount")
  public BigDecimal getRefundedTotalAmount() {
    return refundedTotalAmount;
  }

  @JsonProperty("refunded_total_amount")
  public Transactions setRefundedTotalAmount(BigDecimal refundedTotalAmount) {
    this.refundedTotalAmount = refundedTotalAmount;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transactions {\n");
    sb.append("  confirmTimestamp: ").append(confirmTimestamp).append("\n");
    sb.append("  fullyInformative: ").append(fullyInformative).append("\n");
    sb.append("  deductedTaxAmount: ").append(deductedTaxAmount).append("\n");
    sb.append("  buyerCreditCardPrefix: ").append(buyerCreditCardPrefix).append("\n");
    sb.append("  customData: ").append(customData).append("\n");
    sb.append("  buyerName: ").append(buyerName).append("\n");
    sb.append("  invoiceDate: ").append(invoiceDate).append("\n");
    sb.append("  createTimestamp: ").append(createTimestamp).append("\n");
    sb.append("  currencyCode: ").append(currencyCode).append("\n");
    sb.append("  supplyDate: ").append(supplyDate).append("\n");
    sb.append("  invoiceImageUrl: ").append(invoiceImageUrl).append("\n");
    sb.append("  key: ").append(key).append("\n");
    sb.append("  invoiceAddress: ").append(invoiceAddress).append("\n");
    sb.append("  buyerTaxNumberValid: ").append(buyerTaxNumberValid).append("\n");
    sb.append("  verificationToken: ").append(verificationToken).append("\n");
    sb.append("  taxSupported: ").append(taxSupported).append("\n");
    sb.append("  taxData: ").append(taxData).append("\n");
    sb.append("  transactionLines: ").append(transactionLines).append("\n");
    sb.append("  buyerTaxNumber: ").append(buyerTaxNumber).append("\n");
    sb.append("  externalKey: ").append(externalKey).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  customFields: ").append(customFields).append("\n");
    sb.append("  forceCountryCode: ").append(forceCountryCode).append("\n");
    sb.append("  countries: ").append(countries).append("\n");
    sb.append("  invoiceNumber: ").append(invoiceNumber).append("\n");
    sb.append("  orderDate: ").append(orderDate).append("\n");
    sb.append("  customerId: ").append(customerId).append("\n");
    sb.append("  kind: ").append(kind).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  buyerIp: ").append(buyerIp).append("\n");
    sb.append("  buyerEmail: ").append(buyerEmail).append("\n");
    sb.append("  originalTransactionKey: ").append(originalTransactionKey).append("\n");
    sb.append("  billingCountryCode: ").append(billingCountryCode).append("\n");
    sb.append("  customId: ").append(customId).append("\n");
    sb.append("  taxAmount: ").append(taxAmount).append("\n");
    sb.append("  additionalCurrencies: ").append(additionalCurrencies).append("\n");
    sb.append("  invoicePlace: ").append(invoicePlace).append("\n");
    sb.append("  totalAmount: ").append(totalAmount).append("\n");
    sb.append("  taxEntityName: ").append(taxEntityName).append("\n");
    sb.append("  evidence: ").append(evidence).append("\n");
    sb.append("  refundedTaxAmount: ").append(refundedTaxAmount).append("\n");
    sb.append("  manual: ").append(manual).append("\n");
    sb.append("  taxTimezone: ").append(taxTimezone).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  test: ").append(test).append("\n");
    sb.append("  taxDeducted: ").append(taxDeducted).append("\n");
    sb.append("  taxCountryCode: ").append(taxCountryCode).append("\n");
    sb.append("  refundedTotalAmount: ").append(refundedTotalAmount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

