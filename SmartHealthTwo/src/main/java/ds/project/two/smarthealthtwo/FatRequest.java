// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: serviceTwo.proto

package ds.project.two.smarthealthtwo;

/**
 * Protobuf type {@code smarthealthtwo.FatRequest}
 */
public  final class FatRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:smarthealthtwo.FatRequest)
    FatRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FatRequest.newBuilder() to construct.
  private FatRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FatRequest() {
    bmi_ = 0F;
    age_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FatRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 13: {

            bmi_ = input.readFloat();
            break;
          }
          case 21: {

            age_ = input.readFloat();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ds.project.two.smarthealthtwo.SmartHealthTwoImp.internal_static_smarthealthtwo_FatRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.project.two.smarthealthtwo.SmartHealthTwoImp.internal_static_smarthealthtwo_FatRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.project.two.smarthealthtwo.FatRequest.class, ds.project.two.smarthealthtwo.FatRequest.Builder.class);
  }

  public static final int BMI_FIELD_NUMBER = 1;
  private float bmi_;
  /**
   * <code>float bmi = 1;</code>
   */
  public float getBmi() {
    return bmi_;
  }

  public static final int AGE_FIELD_NUMBER = 2;
  private float age_;
  /**
   * <code>float age = 2;</code>
   */
  public float getAge() {
    return age_;
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
    if (bmi_ != 0F) {
      output.writeFloat(1, bmi_);
    }
    if (age_ != 0F) {
      output.writeFloat(2, age_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bmi_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, bmi_);
    }
    if (age_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, age_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ds.project.two.smarthealthtwo.FatRequest)) {
      return super.equals(obj);
    }
    ds.project.two.smarthealthtwo.FatRequest other = (ds.project.two.smarthealthtwo.FatRequest) obj;

    boolean result = true;
    result = result && (
        java.lang.Float.floatToIntBits(getBmi())
        == java.lang.Float.floatToIntBits(
            other.getBmi()));
    result = result && (
        java.lang.Float.floatToIntBits(getAge())
        == java.lang.Float.floatToIntBits(
            other.getAge()));
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BMI_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getBmi());
    hash = (37 * hash) + AGE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getAge());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.project.two.smarthealthtwo.FatRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.project.two.smarthealthtwo.FatRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.project.two.smarthealthtwo.FatRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.project.two.smarthealthtwo.FatRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.project.two.smarthealthtwo.FatRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.project.two.smarthealthtwo.FatRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.project.two.smarthealthtwo.FatRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.project.two.smarthealthtwo.FatRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.project.two.smarthealthtwo.FatRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.project.two.smarthealthtwo.FatRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.project.two.smarthealthtwo.FatRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.project.two.smarthealthtwo.FatRequest parseFrom(
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
  public static Builder newBuilder(ds.project.two.smarthealthtwo.FatRequest prototype) {
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
   * Protobuf type {@code smarthealthtwo.FatRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:smarthealthtwo.FatRequest)
      ds.project.two.smarthealthtwo.FatRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.project.two.smarthealthtwo.SmartHealthTwoImp.internal_static_smarthealthtwo_FatRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.project.two.smarthealthtwo.SmartHealthTwoImp.internal_static_smarthealthtwo_FatRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.project.two.smarthealthtwo.FatRequest.class, ds.project.two.smarthealthtwo.FatRequest.Builder.class);
    }

    // Construct using ds.project.two.smarthealthtwo.FatRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bmi_ = 0F;

      age_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.project.two.smarthealthtwo.SmartHealthTwoImp.internal_static_smarthealthtwo_FatRequest_descriptor;
    }

    @java.lang.Override
    public ds.project.two.smarthealthtwo.FatRequest getDefaultInstanceForType() {
      return ds.project.two.smarthealthtwo.FatRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ds.project.two.smarthealthtwo.FatRequest build() {
      ds.project.two.smarthealthtwo.FatRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.project.two.smarthealthtwo.FatRequest buildPartial() {
      ds.project.two.smarthealthtwo.FatRequest result = new ds.project.two.smarthealthtwo.FatRequest(this);
      result.bmi_ = bmi_;
      result.age_ = age_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ds.project.two.smarthealthtwo.FatRequest) {
        return mergeFrom((ds.project.two.smarthealthtwo.FatRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.project.two.smarthealthtwo.FatRequest other) {
      if (other == ds.project.two.smarthealthtwo.FatRequest.getDefaultInstance()) return this;
      if (other.getBmi() != 0F) {
        setBmi(other.getBmi());
      }
      if (other.getAge() != 0F) {
        setAge(other.getAge());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      ds.project.two.smarthealthtwo.FatRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.project.two.smarthealthtwo.FatRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float bmi_ ;
    /**
     * <code>float bmi = 1;</code>
     */
    public float getBmi() {
      return bmi_;
    }
    /**
     * <code>float bmi = 1;</code>
     */
    public Builder setBmi(float value) {
      
      bmi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float bmi = 1;</code>
     */
    public Builder clearBmi() {
      
      bmi_ = 0F;
      onChanged();
      return this;
    }

    private float age_ ;
    /**
     * <code>float age = 2;</code>
     */
    public float getAge() {
      return age_;
    }
    /**
     * <code>float age = 2;</code>
     */
    public Builder setAge(float value) {
      
      age_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float age = 2;</code>
     */
    public Builder clearAge() {
      
      age_ = 0F;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:smarthealthtwo.FatRequest)
  }

  // @@protoc_insertion_point(class_scope:smarthealthtwo.FatRequest)
  private static final ds.project.two.smarthealthtwo.FatRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.project.two.smarthealthtwo.FatRequest();
  }

  public static ds.project.two.smarthealthtwo.FatRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FatRequest>
      PARSER = new com.google.protobuf.AbstractParser<FatRequest>() {
    @java.lang.Override
    public FatRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FatRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FatRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FatRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.project.two.smarthealthtwo.FatRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

