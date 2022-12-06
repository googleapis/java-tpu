// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

package com.google.cloud.tpu.v2alpha1;

public interface QueuedResourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2alpha1.QueuedResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Immutable. The name of the QueuedResource.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Immutable. The name of the QueuedResource.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Defines a TPU resource.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResource.Tpu tpu = 2;</code>
   * @return Whether the tpu field is set.
   */
  boolean hasTpu();
  /**
   * <pre>
   * Defines a TPU resource.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResource.Tpu tpu = 2;</code>
   * @return The tpu.
   */
  com.google.cloud.tpu.v2alpha1.QueuedResource.Tpu getTpu();
  /**
   * <pre>
   * Defines a TPU resource.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResource.Tpu tpu = 2;</code>
   */
  com.google.cloud.tpu.v2alpha1.QueuedResource.TpuOrBuilder getTpuOrBuilder();

  /**
   * <pre>
   * The BestEffort tier.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResource.BestEffort best_effort = 3;</code>
   * @return Whether the bestEffort field is set.
   */
  boolean hasBestEffort();
  /**
   * <pre>
   * The BestEffort tier.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResource.BestEffort best_effort = 3;</code>
   * @return The bestEffort.
   */
  com.google.cloud.tpu.v2alpha1.QueuedResource.BestEffort getBestEffort();
  /**
   * <pre>
   * The BestEffort tier.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResource.BestEffort best_effort = 3;</code>
   */
  com.google.cloud.tpu.v2alpha1.QueuedResource.BestEffortOrBuilder getBestEffortOrBuilder();

  /**
   * <pre>
   * The Guaranteed tier
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResource.Guaranteed guaranteed = 4;</code>
   * @return Whether the guaranteed field is set.
   */
  boolean hasGuaranteed();
  /**
   * <pre>
   * The Guaranteed tier
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResource.Guaranteed guaranteed = 4;</code>
   * @return The guaranteed.
   */
  com.google.cloud.tpu.v2alpha1.QueuedResource.Guaranteed getGuaranteed();
  /**
   * <pre>
   * The Guaranteed tier
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResource.Guaranteed guaranteed = 4;</code>
   */
  com.google.cloud.tpu.v2alpha1.QueuedResource.GuaranteedOrBuilder getGuaranteedOrBuilder();

  /**
   * <pre>
   * The queueing policy of the QueuedRequest.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResource.QueueingPolicy queueing_policy = 5;</code>
   * @return Whether the queueingPolicy field is set.
   */
  boolean hasQueueingPolicy();
  /**
   * <pre>
   * The queueing policy of the QueuedRequest.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResource.QueueingPolicy queueing_policy = 5;</code>
   * @return The queueingPolicy.
   */
  com.google.cloud.tpu.v2alpha1.QueuedResource.QueueingPolicy getQueueingPolicy();
  /**
   * <pre>
   * The queueing policy of the QueuedRequest.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResource.QueueingPolicy queueing_policy = 5;</code>
   */
  com.google.cloud.tpu.v2alpha1.QueuedResource.QueueingPolicyOrBuilder getQueueingPolicyOrBuilder();

  /**
   * <pre>
   * Output only. State of the QueuedResource request
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   * <pre>
   * Output only. State of the QueuedResource request
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.tpu.v2alpha1.QueuedResourceState getState();
  /**
   * <pre>
   * Output only. State of the QueuedResource request
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.QueuedResourceState state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.tpu.v2alpha1.QueuedResourceStateOrBuilder getStateOrBuilder();

  public com.google.cloud.tpu.v2alpha1.QueuedResource.ResourceCase getResourceCase();

  public com.google.cloud.tpu.v2alpha1.QueuedResource.TierCase getTierCase();
}
