/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hive.druid.serde;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.hadoop.io.Writable;

import com.google.common.base.Objects;

/**
 * Writable for Druid results.
 */
public class DruidWritable implements Writable {

  private final Map<String, Object> value;

  public DruidWritable() {
    value = new HashMap<>();
  }

  public DruidWritable(Map<String, Object> value) {
    this.value = value;
  }

  public Map<String, Object> getValue() {
    return value;
  }

  @Override
  public void write(DataOutput out) throws IOException {
    throw new UnsupportedOperationException();
  }

  @Override
  public void readFields(DataInput in) throws IOException {
    throw new UnsupportedOperationException();
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(value);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    return Objects.equal(value, ((DruidWritable) o).value);
  }

  @Override
  public String toString() {
    return "DruidWritable{value=" + value + '}';
  }

}
