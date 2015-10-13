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
import com.taxamo.client.model.Transaction;
import com.taxamo.client.model.StorageRequiredFields;
import com.taxamo.client.model.TaxRequiredFields;
public class UnconfirmTransactionOut {
  /* Transaction data */
  @JsonProperty("transaction")
  private Transaction transaction = null;
  /* Fields required for tax calculation. Depends on the region/transaction type. */
  @JsonProperty("tax_required_fields")
  private List<TaxRequiredFields> taxRequiredFields = new ArrayList<TaxRequiredFields>();
  /* Fields required for transaction storage (can be added later - it's up to merchant software). Depends on the region/transaction type. */
  @JsonProperty("storage_required_fields")
  private List<StorageRequiredFields> storageRequiredFields = new ArrayList<StorageRequiredFields>();
  @JsonProperty("transaction")
  public Transaction getTransaction() {
    return transaction;
  }
  
  @JsonProperty("transaction")
  public UnconfirmTransactionOut setTransaction(Transaction transaction) {
    this.transaction = transaction;
    return this;
  }

  @JsonProperty("tax_required_fields")
  public List<TaxRequiredFields> getTaxRequiredFields() {
    return taxRequiredFields;
  }
  
  @JsonProperty("tax_required_fields")
  public UnconfirmTransactionOut setTaxRequiredFields(List<TaxRequiredFields> taxRequiredFields) {
    this.taxRequiredFields = taxRequiredFields;
    return this;
  }

  @JsonProperty("storage_required_fields")
  public List<StorageRequiredFields> getStorageRequiredFields() {
    return storageRequiredFields;
  }
  
  @JsonProperty("storage_required_fields")
  public UnconfirmTransactionOut setStorageRequiredFields(List<StorageRequiredFields> storageRequiredFields) {
    this.storageRequiredFields = storageRequiredFields;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnconfirmTransactionOut {\n");
    sb.append("  transaction: ").append(transaction).append("\n");
    sb.append("  taxRequiredFields: ").append(taxRequiredFields).append("\n");
    sb.append("  storageRequiredFields: ").append(storageRequiredFields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

