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


import java.util.*;
import com.taxamo.client.model.N;
import com.taxamo.client.model.C;
public class ByStatus {
  /* New transactions */
  private List<N> n = new ArrayList<N>();
  /* Confirmed transactions */
  private List<C> c = new ArrayList<C>();
  public List<N> getN() {
    return n;
  }
  public ByStatus setN(List<N> n) {
    this.n = n;
    return this;
  }

  public List<C> getC() {
    return c;
  }
  public ByStatus setC(List<C> c) {
    this.c = c;
    return this;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ByStatus {\n");
    sb.append("  n: ").append(n).append("\n");
    sb.append("  c: ").append(c).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
