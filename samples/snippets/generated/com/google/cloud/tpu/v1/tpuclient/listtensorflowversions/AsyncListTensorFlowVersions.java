/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.tpu.v1.samples;

// [START tpu_v1_generated_tpuclient_listtensorflowversions_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.tpu.v1.ListTensorFlowVersionsRequest;
import com.google.cloud.tpu.v1.TensorFlowVersion;
import com.google.cloud.tpu.v1.TensorFlowVersionName;
import com.google.cloud.tpu.v1.TpuClient;

public class AsyncListTensorFlowVersions {

  public static void main(String[] args) throws Exception {
    asyncListTensorFlowVersions();
  }

  public static void asyncListTensorFlowVersions() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TpuClient tpuClient = TpuClient.create()) {
      ListTensorFlowVersionsRequest request =
          ListTensorFlowVersionsRequest.newBuilder()
              .setParent(
                  TensorFlowVersionName.of("[PROJECT]", "[LOCATION]", "[TENSOR_FLOW_VERSION]")
                      .toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .setOrderBy("orderBy-1207110587")
              .build();
      ApiFuture<TensorFlowVersion> future =
          tpuClient.listTensorFlowVersionsPagedCallable().futureCall(request);
      // Do something.
      for (TensorFlowVersion element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END tpu_v1_generated_tpuclient_listtensorflowversions_async]
