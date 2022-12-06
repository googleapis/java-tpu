// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

package com.google.cloud.tpu.v2alpha1;

public interface GenerateServiceIdentityResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2alpha1.GenerateServiceIdentityResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ServiceIdentity that was created or retrieved.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.ServiceIdentity identity = 1;</code>
   * @return Whether the identity field is set.
   */
  boolean hasIdentity();
  /**
   * <pre>
   * ServiceIdentity that was created or retrieved.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.ServiceIdentity identity = 1;</code>
   * @return The identity.
   */
  com.google.cloud.tpu.v2alpha1.ServiceIdentity getIdentity();
  /**
   * <pre>
   * ServiceIdentity that was created or retrieved.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.ServiceIdentity identity = 1;</code>
   */
  com.google.cloud.tpu.v2alpha1.ServiceIdentityOrBuilder getIdentityOrBuilder();
}