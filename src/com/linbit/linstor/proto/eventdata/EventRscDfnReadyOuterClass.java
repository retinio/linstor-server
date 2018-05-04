// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: linstor/proto/eventdata/EventRscDfnReady.proto

package com.linbit.linstor.proto.eventdata;

public final class EventRscDfnReadyOuterClass {
  private EventRscDfnReadyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EventRscDfnReadyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.linbit.linstor.proto.eventdata.EventRscDfnReady)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 ready_count = 1;</code>
     */
    boolean hasReadyCount();
    /**
     * <code>optional int32 ready_count = 1;</code>
     */
    int getReadyCount();

    /**
     * <code>optional int32 error_count = 2;</code>
     */
    boolean hasErrorCount();
    /**
     * <code>optional int32 error_count = 2;</code>
     */
    int getErrorCount();
  }
  /**
   * Protobuf type {@code com.linbit.linstor.proto.eventdata.EventRscDfnReady}
   */
  public  static final class EventRscDfnReady extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.linbit.linstor.proto.eventdata.EventRscDfnReady)
      EventRscDfnReadyOrBuilder {
    // Use EventRscDfnReady.newBuilder() to construct.
    private EventRscDfnReady(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EventRscDfnReady() {
      readyCount_ = 0;
      errorCount_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EventRscDfnReady(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              readyCount_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              errorCount_ = input.readInt32();
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
      return com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.internal_static_com_linbit_linstor_proto_eventdata_EventRscDfnReady_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.internal_static_com_linbit_linstor_proto_eventdata_EventRscDfnReady_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady.class, com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady.Builder.class);
    }

    private int bitField0_;
    public static final int READY_COUNT_FIELD_NUMBER = 1;
    private int readyCount_;
    /**
     * <code>optional int32 ready_count = 1;</code>
     */
    public boolean hasReadyCount() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 ready_count = 1;</code>
     */
    public int getReadyCount() {
      return readyCount_;
    }

    public static final int ERROR_COUNT_FIELD_NUMBER = 2;
    private int errorCount_;
    /**
     * <code>optional int32 error_count = 2;</code>
     */
    public boolean hasErrorCount() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 error_count = 2;</code>
     */
    public int getErrorCount() {
      return errorCount_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, readyCount_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, errorCount_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, readyCount_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, errorCount_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady)) {
        return super.equals(obj);
      }
      com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady other = (com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady) obj;

      boolean result = true;
      result = result && (hasReadyCount() == other.hasReadyCount());
      if (hasReadyCount()) {
        result = result && (getReadyCount()
            == other.getReadyCount());
      }
      result = result && (hasErrorCount() == other.hasErrorCount());
      if (hasErrorCount()) {
        result = result && (getErrorCount()
            == other.getErrorCount());
      }
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
      if (hasReadyCount()) {
        hash = (37 * hash) + READY_COUNT_FIELD_NUMBER;
        hash = (53 * hash) + getReadyCount();
      }
      if (hasErrorCount()) {
        hash = (37 * hash) + ERROR_COUNT_FIELD_NUMBER;
        hash = (53 * hash) + getErrorCount();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code com.linbit.linstor.proto.eventdata.EventRscDfnReady}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.linbit.linstor.proto.eventdata.EventRscDfnReady)
        com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReadyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.internal_static_com_linbit_linstor_proto_eventdata_EventRscDfnReady_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.internal_static_com_linbit_linstor_proto_eventdata_EventRscDfnReady_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady.class, com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady.Builder.class);
      }

      // Construct using com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady.newBuilder()
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
      public Builder clear() {
        super.clear();
        readyCount_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        errorCount_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.internal_static_com_linbit_linstor_proto_eventdata_EventRscDfnReady_descriptor;
      }

      public com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady getDefaultInstanceForType() {
        return com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady.getDefaultInstance();
      }

      public com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady build() {
        com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady buildPartial() {
        com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady result = new com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.readyCount_ = readyCount_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.errorCount_ = errorCount_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady) {
          return mergeFrom((com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady other) {
        if (other == com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady.getDefaultInstance()) return this;
        if (other.hasReadyCount()) {
          setReadyCount(other.getReadyCount());
        }
        if (other.hasErrorCount()) {
          setErrorCount(other.getErrorCount());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int readyCount_ ;
      /**
       * <code>optional int32 ready_count = 1;</code>
       */
      public boolean hasReadyCount() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 ready_count = 1;</code>
       */
      public int getReadyCount() {
        return readyCount_;
      }
      /**
       * <code>optional int32 ready_count = 1;</code>
       */
      public Builder setReadyCount(int value) {
        bitField0_ |= 0x00000001;
        readyCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 ready_count = 1;</code>
       */
      public Builder clearReadyCount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        readyCount_ = 0;
        onChanged();
        return this;
      }

      private int errorCount_ ;
      /**
       * <code>optional int32 error_count = 2;</code>
       */
      public boolean hasErrorCount() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 error_count = 2;</code>
       */
      public int getErrorCount() {
        return errorCount_;
      }
      /**
       * <code>optional int32 error_count = 2;</code>
       */
      public Builder setErrorCount(int value) {
        bitField0_ |= 0x00000002;
        errorCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 error_count = 2;</code>
       */
      public Builder clearErrorCount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        errorCount_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.linbit.linstor.proto.eventdata.EventRscDfnReady)
    }

    // @@protoc_insertion_point(class_scope:com.linbit.linstor.proto.eventdata.EventRscDfnReady)
    private static final com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady();
    }

    public static com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<EventRscDfnReady>
        PARSER = new com.google.protobuf.AbstractParser<EventRscDfnReady>() {
      public EventRscDfnReady parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new EventRscDfnReady(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EventRscDfnReady> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EventRscDfnReady> getParserForType() {
      return PARSER;
    }

    public com.linbit.linstor.proto.eventdata.EventRscDfnReadyOuterClass.EventRscDfnReady getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_linbit_linstor_proto_eventdata_EventRscDfnReady_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_linbit_linstor_proto_eventdata_EventRscDfnReady_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.linstor/proto/eventdata/EventRscDfnRea" +
      "dy.proto\022\"com.linbit.linstor.proto.event" +
      "data\"<\n\020EventRscDfnReady\022\023\n\013ready_count\030" +
      "\001 \001(\005\022\023\n\013error_count\030\002 \001(\005"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_linbit_linstor_proto_eventdata_EventRscDfnReady_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_linbit_linstor_proto_eventdata_EventRscDfnReady_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_linbit_linstor_proto_eventdata_EventRscDfnReady_descriptor,
        new java.lang.String[] { "ReadyCount", "ErrorCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
