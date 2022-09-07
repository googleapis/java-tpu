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

// [START tpu_v2alpha1_generated_tpuclient_listruntimeversions_paged_async]
import com.google.cloud.tpu.v2alpha1.ListRuntimeVersionsRequest;
import com.google.cloud.tpu.v2alpha1.ListRuntimeVersionsResponse;
import com.google.cloud.tpu.v2alpha1.RuntimeVersion;
import com.google.cloud.tpu.v2alpha1.RuntimeVersionName;
import com.google.cloud.tpu.v2alpha1.TpuClient;
import com.google.common.base.Strings;

public class AsyncListRuntimeVersionsPaged {

  public static void main(String[] args) throws Exception {
    asyncListRuntimeVersionsPaged();
  }

  public static void asyncListRuntimeVersionsPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TpuClient tpuClient = TpuClient.create()) {
      ListRuntimeVersionsRequest request =
          ListRuntimeVersionsRequest.newBuilder()
              .setParent(
                  RuntimeVersionName.of("[PROJECT]", "[LOCATION]", "[RUNTIME_VERSION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .setOrderBy("orderBy-1207110587")
              .build();
      while (true) {
        ListRuntimeVersionsResponse response =
            tpuClient.listRuntimeVersionsCallable().call(request);
        for (RuntimeVersion element : response.getRuntimeVersionsList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END tpu_v2alpha1_generated_tpuclient_listruntimeversions_paged_async]
