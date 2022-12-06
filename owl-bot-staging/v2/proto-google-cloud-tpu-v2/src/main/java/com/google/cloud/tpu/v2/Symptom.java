// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v2/cloud_tpu.proto

package com.google.cloud.tpu.v2;

/**
 * <pre>
 * A Symptom instance.
 * </pre>
 *
 * Protobuf type {@code google.cloud.tpu.v2.Symptom}
 */
public final class Symptom extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.tpu.v2.Symptom)
    SymptomOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Symptom.newBuilder() to construct.
  private Symptom(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Symptom() {
    symptomType_ = 0;
    details_ = "";
    workerId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Symptom();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.tpu.v2.CloudTpuProto.internal_static_google_cloud_tpu_v2_Symptom_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tpu.v2.CloudTpuProto.internal_static_google_cloud_tpu_v2_Symptom_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tpu.v2.Symptom.class, com.google.cloud.tpu.v2.Symptom.Builder.class);
  }

  /**
   * <pre>
   * SymptomType represents the different types of Symptoms that a TPU can be
   * at.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.tpu.v2.Symptom.SymptomType}
   */
  public enum SymptomType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified symptom.
     * </pre>
     *
     * <code>SYMPTOM_TYPE_UNSPECIFIED = 0;</code>
     */
    SYMPTOM_TYPE_UNSPECIFIED(0),
    /**
     * <pre>
     * TPU VM memory is low.
     * </pre>
     *
     * <code>LOW_MEMORY = 1;</code>
     */
    LOW_MEMORY(1),
    /**
     * <pre>
     * TPU runtime is out of memory.
     * </pre>
     *
     * <code>OUT_OF_MEMORY = 2;</code>
     */
    OUT_OF_MEMORY(2),
    /**
     * <pre>
     * TPU runtime execution has timed out.
     * </pre>
     *
     * <code>EXECUTE_TIMED_OUT = 3;</code>
     */
    EXECUTE_TIMED_OUT(3),
    /**
     * <pre>
     * TPU runtime fails to construct a mesh that recognizes each TPU device's
     * neighbors.
     * </pre>
     *
     * <code>MESH_BUILD_FAIL = 4;</code>
     */
    MESH_BUILD_FAIL(4),
    /**
     * <pre>
     * TPU HBM is out of memory.
     * </pre>
     *
     * <code>HBM_OUT_OF_MEMORY = 5;</code>
     */
    HBM_OUT_OF_MEMORY(5),
    /**
     * <pre>
     * Abusive behaviors have been identified on the current project.
     * </pre>
     *
     * <code>PROJECT_ABUSE = 6;</code>
     */
    PROJECT_ABUSE(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified symptom.
     * </pre>
     *
     * <code>SYMPTOM_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int SYMPTOM_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * TPU VM memory is low.
     * </pre>
     *
     * <code>LOW_MEMORY = 1;</code>
     */
    public static final int LOW_MEMORY_VALUE = 1;
    /**
     * <pre>
     * TPU runtime is out of memory.
     * </pre>
     *
     * <code>OUT_OF_MEMORY = 2;</code>
     */
    public static final int OUT_OF_MEMORY_VALUE = 2;
    /**
     * <pre>
     * TPU runtime execution has timed out.
     * </pre>
     *
     * <code>EXECUTE_TIMED_OUT = 3;</code>
     */
    public static final int EXECUTE_TIMED_OUT_VALUE = 3;
    /**
     * <pre>
     * TPU runtime fails to construct a mesh that recognizes each TPU device's
     * neighbors.
     * </pre>
     *
     * <code>MESH_BUILD_FAIL = 4;</code>
     */
    public static final int MESH_BUILD_FAIL_VALUE = 4;
    /**
     * <pre>
     * TPU HBM is out of memory.
     * </pre>
     *
     * <code>HBM_OUT_OF_MEMORY = 5;</code>
     */
    public static final int HBM_OUT_OF_MEMORY_VALUE = 5;
    /**
     * <pre>
     * Abusive behaviors have been identified on the current project.
     * </pre>
     *
     * <code>PROJECT_ABUSE = 6;</code>
     */
    public static final int PROJECT_ABUSE_VALUE = 6;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SymptomType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SymptomType forNumber(int value) {
      switch (value) {
        case 0: return SYMPTOM_TYPE_UNSPECIFIED;
        case 1: return LOW_MEMORY;
        case 2: return OUT_OF_MEMORY;
        case 3: return EXECUTE_TIMED_OUT;
        case 4: return MESH_BUILD_FAIL;
        case 5: return HBM_OUT_OF_MEMORY;
        case 6: return PROJECT_ABUSE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SymptomType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SymptomType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SymptomType>() {
            public SymptomType findValueByNumber(int number) {
              return SymptomType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.tpu.v2.Symptom.getDescriptor().getEnumTypes().get(0);
    }

    private static final SymptomType[] VALUES = values();

    public static SymptomType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private SymptomType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.tpu.v2.Symptom.SymptomType)
  }

  public static final int CREATE_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp createTime_;
  /**
   * <pre>
   * Timestamp when the Symptom is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   * @return Whether the createTime field is set.
   */
  @java.lang.Override
  public boolean hasCreateTime() {
    return createTime_ != null;
  }
  /**
   * <pre>
   * Timestamp when the Symptom is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   * @return The createTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCreateTime() {
    return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
  }
  /**
   * <pre>
   * Timestamp when the Symptom is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
    return getCreateTime();
  }

  public static final int SYMPTOM_TYPE_FIELD_NUMBER = 2;
  private int symptomType_;
  /**
   * <pre>
   * Type of the Symptom.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.Symptom.SymptomType symptom_type = 2;</code>
   * @return The enum numeric value on the wire for symptomType.
   */
  @java.lang.Override public int getSymptomTypeValue() {
    return symptomType_;
  }
  /**
   * <pre>
   * Type of the Symptom.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.Symptom.SymptomType symptom_type = 2;</code>
   * @return The symptomType.
   */
  @java.lang.Override public com.google.cloud.tpu.v2.Symptom.SymptomType getSymptomType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.tpu.v2.Symptom.SymptomType result = com.google.cloud.tpu.v2.Symptom.SymptomType.valueOf(symptomType_);
    return result == null ? com.google.cloud.tpu.v2.Symptom.SymptomType.UNRECOGNIZED : result;
  }

  public static final int DETAILS_FIELD_NUMBER = 3;
  private volatile java.lang.Object details_;
  /**
   * <pre>
   * Detailed information of the current Symptom.
   * </pre>
   *
   * <code>string details = 3;</code>
   * @return The details.
   */
  @java.lang.Override
  public java.lang.String getDetails() {
    java.lang.Object ref = details_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      details_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Detailed information of the current Symptom.
   * </pre>
   *
   * <code>string details = 3;</code>
   * @return The bytes for details.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDetailsBytes() {
    java.lang.Object ref = details_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      details_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WORKER_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object workerId_;
  /**
   * <pre>
   * A string used to uniquely distinguish a worker within a TPU node.
   * </pre>
   *
   * <code>string worker_id = 4;</code>
   * @return The workerId.
   */
  @java.lang.Override
  public java.lang.String getWorkerId() {
    java.lang.Object ref = workerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      workerId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A string used to uniquely distinguish a worker within a TPU node.
   * </pre>
   *
   * <code>string worker_id = 4;</code>
   * @return The bytes for workerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWorkerIdBytes() {
    java.lang.Object ref = workerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      workerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (createTime_ != null) {
      output.writeMessage(1, getCreateTime());
    }
    if (symptomType_ != com.google.cloud.tpu.v2.Symptom.SymptomType.SYMPTOM_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, symptomType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(details_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, details_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, workerId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (createTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCreateTime());
    }
    if (symptomType_ != com.google.cloud.tpu.v2.Symptom.SymptomType.SYMPTOM_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, symptomType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(details_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, details_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, workerId_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.tpu.v2.Symptom)) {
      return super.equals(obj);
    }
    com.google.cloud.tpu.v2.Symptom other = (com.google.cloud.tpu.v2.Symptom) obj;

    if (hasCreateTime() != other.hasCreateTime()) return false;
    if (hasCreateTime()) {
      if (!getCreateTime()
          .equals(other.getCreateTime())) return false;
    }
    if (symptomType_ != other.symptomType_) return false;
    if (!getDetails()
        .equals(other.getDetails())) return false;
    if (!getWorkerId()
        .equals(other.getWorkerId())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCreateTime()) {
      hash = (37 * hash) + CREATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCreateTime().hashCode();
    }
    hash = (37 * hash) + SYMPTOM_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + symptomType_;
    hash = (37 * hash) + DETAILS_FIELD_NUMBER;
    hash = (53 * hash) + getDetails().hashCode();
    hash = (37 * hash) + WORKER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getWorkerId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tpu.v2.Symptom parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2.Symptom parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2.Symptom parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2.Symptom parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2.Symptom parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.tpu.v2.Symptom parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2.Symptom parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tpu.v2.Symptom parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2.Symptom parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.tpu.v2.Symptom parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.tpu.v2.Symptom parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.tpu.v2.Symptom parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.tpu.v2.Symptom prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A Symptom instance.
   * </pre>
   *
   * Protobuf type {@code google.cloud.tpu.v2.Symptom}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tpu.v2.Symptom)
      com.google.cloud.tpu.v2.SymptomOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.tpu.v2.CloudTpuProto.internal_static_google_cloud_tpu_v2_Symptom_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tpu.v2.CloudTpuProto.internal_static_google_cloud_tpu_v2_Symptom_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tpu.v2.Symptom.class, com.google.cloud.tpu.v2.Symptom.Builder.class);
    }

    // Construct using com.google.cloud.tpu.v2.Symptom.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (createTimeBuilder_ == null) {
        createTime_ = null;
      } else {
        createTime_ = null;
        createTimeBuilder_ = null;
      }
      symptomType_ = 0;

      details_ = "";

      workerId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.tpu.v2.CloudTpuProto.internal_static_google_cloud_tpu_v2_Symptom_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2.Symptom getDefaultInstanceForType() {
      return com.google.cloud.tpu.v2.Symptom.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2.Symptom build() {
      com.google.cloud.tpu.v2.Symptom result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tpu.v2.Symptom buildPartial() {
      com.google.cloud.tpu.v2.Symptom result = new com.google.cloud.tpu.v2.Symptom(this);
      if (createTimeBuilder_ == null) {
        result.createTime_ = createTime_;
      } else {
        result.createTime_ = createTimeBuilder_.build();
      }
      result.symptomType_ = symptomType_;
      result.details_ = details_;
      result.workerId_ = workerId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.tpu.v2.Symptom) {
        return mergeFrom((com.google.cloud.tpu.v2.Symptom)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tpu.v2.Symptom other) {
      if (other == com.google.cloud.tpu.v2.Symptom.getDefaultInstance()) return this;
      if (other.hasCreateTime()) {
        mergeCreateTime(other.getCreateTime());
      }
      if (other.symptomType_ != 0) {
        setSymptomTypeValue(other.getSymptomTypeValue());
      }
      if (!other.getDetails().isEmpty()) {
        details_ = other.details_;
        onChanged();
      }
      if (!other.getWorkerId().isEmpty()) {
        workerId_ = other.workerId_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getCreateTimeFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 16: {
              symptomType_ = input.readEnum();

              break;
            } // case 16
            case 26: {
              details_ = input.readStringRequireUtf8();

              break;
            } // case 26
            case 34: {
              workerId_ = input.readStringRequireUtf8();

              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private com.google.protobuf.Timestamp createTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createTimeBuilder_;
    /**
     * <pre>
     * Timestamp when the Symptom is created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     * @return Whether the createTime field is set.
     */
    public boolean hasCreateTime() {
      return createTimeBuilder_ != null || createTime_ != null;
    }
    /**
     * <pre>
     * Timestamp when the Symptom is created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     * @return The createTime.
     */
    public com.google.protobuf.Timestamp getCreateTime() {
      if (createTimeBuilder_ == null) {
        return createTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      } else {
        return createTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Timestamp when the Symptom is created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     */
    public Builder setCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        createTime_ = value;
        onChanged();
      } else {
        createTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Timestamp when the Symptom is created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     */
    public Builder setCreateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createTimeBuilder_ == null) {
        createTime_ = builderForValue.build();
        onChanged();
      } else {
        createTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Timestamp when the Symptom is created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     */
    public Builder mergeCreateTime(com.google.protobuf.Timestamp value) {
      if (createTimeBuilder_ == null) {
        if (createTime_ != null) {
          createTime_ =
            com.google.protobuf.Timestamp.newBuilder(createTime_).mergeFrom(value).buildPartial();
        } else {
          createTime_ = value;
        }
        onChanged();
      } else {
        createTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Timestamp when the Symptom is created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     */
    public Builder clearCreateTime() {
      if (createTimeBuilder_ == null) {
        createTime_ = null;
        onChanged();
      } else {
        createTime_ = null;
        createTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Timestamp when the Symptom is created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreateTimeBuilder() {
      
      onChanged();
      return getCreateTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Timestamp when the Symptom is created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder() {
      if (createTimeBuilder_ != null) {
        return createTimeBuilder_.getMessageOrBuilder();
      } else {
        return createTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : createTime_;
      }
    }
    /**
     * <pre>
     * Timestamp when the Symptom is created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreateTimeFieldBuilder() {
      if (createTimeBuilder_ == null) {
        createTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreateTime(),
                getParentForChildren(),
                isClean());
        createTime_ = null;
      }
      return createTimeBuilder_;
    }

    private int symptomType_ = 0;
    /**
     * <pre>
     * Type of the Symptom.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.Symptom.SymptomType symptom_type = 2;</code>
     * @return The enum numeric value on the wire for symptomType.
     */
    @java.lang.Override public int getSymptomTypeValue() {
      return symptomType_;
    }
    /**
     * <pre>
     * Type of the Symptom.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.Symptom.SymptomType symptom_type = 2;</code>
     * @param value The enum numeric value on the wire for symptomType to set.
     * @return This builder for chaining.
     */
    public Builder setSymptomTypeValue(int value) {
      
      symptomType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of the Symptom.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.Symptom.SymptomType symptom_type = 2;</code>
     * @return The symptomType.
     */
    @java.lang.Override
    public com.google.cloud.tpu.v2.Symptom.SymptomType getSymptomType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.tpu.v2.Symptom.SymptomType result = com.google.cloud.tpu.v2.Symptom.SymptomType.valueOf(symptomType_);
      return result == null ? com.google.cloud.tpu.v2.Symptom.SymptomType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Type of the Symptom.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.Symptom.SymptomType symptom_type = 2;</code>
     * @param value The symptomType to set.
     * @return This builder for chaining.
     */
    public Builder setSymptomType(com.google.cloud.tpu.v2.Symptom.SymptomType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      symptomType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of the Symptom.
     * </pre>
     *
     * <code>.google.cloud.tpu.v2.Symptom.SymptomType symptom_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSymptomType() {
      
      symptomType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object details_ = "";
    /**
     * <pre>
     * Detailed information of the current Symptom.
     * </pre>
     *
     * <code>string details = 3;</code>
     * @return The details.
     */
    public java.lang.String getDetails() {
      java.lang.Object ref = details_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        details_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Detailed information of the current Symptom.
     * </pre>
     *
     * <code>string details = 3;</code>
     * @return The bytes for details.
     */
    public com.google.protobuf.ByteString
        getDetailsBytes() {
      java.lang.Object ref = details_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        details_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Detailed information of the current Symptom.
     * </pre>
     *
     * <code>string details = 3;</code>
     * @param value The details to set.
     * @return This builder for chaining.
     */
    public Builder setDetails(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      details_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Detailed information of the current Symptom.
     * </pre>
     *
     * <code>string details = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDetails() {
      
      details_ = getDefaultInstance().getDetails();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Detailed information of the current Symptom.
     * </pre>
     *
     * <code>string details = 3;</code>
     * @param value The bytes for details to set.
     * @return This builder for chaining.
     */
    public Builder setDetailsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      details_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object workerId_ = "";
    /**
     * <pre>
     * A string used to uniquely distinguish a worker within a TPU node.
     * </pre>
     *
     * <code>string worker_id = 4;</code>
     * @return The workerId.
     */
    public java.lang.String getWorkerId() {
      java.lang.Object ref = workerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        workerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A string used to uniquely distinguish a worker within a TPU node.
     * </pre>
     *
     * <code>string worker_id = 4;</code>
     * @return The bytes for workerId.
     */
    public com.google.protobuf.ByteString
        getWorkerIdBytes() {
      java.lang.Object ref = workerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        workerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A string used to uniquely distinguish a worker within a TPU node.
     * </pre>
     *
     * <code>string worker_id = 4;</code>
     * @param value The workerId to set.
     * @return This builder for chaining.
     */
    public Builder setWorkerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      workerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A string used to uniquely distinguish a worker within a TPU node.
     * </pre>
     *
     * <code>string worker_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearWorkerId() {
      
      workerId_ = getDefaultInstance().getWorkerId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A string used to uniquely distinguish a worker within a TPU node.
     * </pre>
     *
     * <code>string worker_id = 4;</code>
     * @param value The bytes for workerId to set.
     * @return This builder for chaining.
     */
    public Builder setWorkerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      workerId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.tpu.v2.Symptom)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tpu.v2.Symptom)
  private static final com.google.cloud.tpu.v2.Symptom DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.tpu.v2.Symptom();
  }

  public static com.google.cloud.tpu.v2.Symptom getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Symptom>
      PARSER = new com.google.protobuf.AbstractParser<Symptom>() {
    @java.lang.Override
    public Symptom parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Symptom> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Symptom> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tpu.v2.Symptom getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

