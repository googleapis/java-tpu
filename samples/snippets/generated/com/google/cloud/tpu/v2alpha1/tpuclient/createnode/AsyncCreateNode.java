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

package com.google.cloud.tpu.v2alpha1.samples;

// [START tpu_v2alpha1_generated_tpuclient_createnode_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.tpu.v2alpha1.CreateNodeRequest;
import com.google.cloud.tpu.v2alpha1.LocationName;
import com.google.cloud.tpu.v2alpha1.Node;
import com.google.cloud.tpu.v2alpha1.TpuClient;
import com.google.longrunning.Operation;

public class AsyncCreateNode {

  public static void main(String[] args) throws Exception {
    asyncCreateNode();
  }

  public static void asyncCreateNode() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TpuClient tpuClient = TpuClient.create()) {
      CreateNodeRequest request =
          CreateNodeRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setNodeId("nodeId-1040171331")
              .setNode(Node.newBuilder().build())
              .build();
      ApiFuture<Operation> future = tpuClient.createNodeCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END tpu_v2alpha1_generated_tpuclient_createnode_async]
