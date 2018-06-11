// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/com/poker/protocols/server/proto/ServerConfig.proto

package com.poker.protocols.server;

public final class ServerConfigProto {
  private ServerConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ServerConfigOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ServerConfig)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 heat_beat_interval = 1;</code>
     */
    int getHeatBeatInterval();
  }
  /**
   * Protobuf type {@code ServerConfig}
   */
  public  static final class ServerConfig extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ServerConfig)
      ServerConfigOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ServerConfig.newBuilder() to construct.
    private ServerConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ServerConfig() {
      heatBeatInterval_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ServerConfig(
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
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              heatBeatInterval_ = input.readInt32();
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
      return com.poker.protocols.server.ServerConfigProto.internal_static_ServerConfig_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.poker.protocols.server.ServerConfigProto.internal_static_ServerConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.poker.protocols.server.ServerConfigProto.ServerConfig.class, com.poker.protocols.server.ServerConfigProto.ServerConfig.Builder.class);
    }

    public static final int HEAT_BEAT_INTERVAL_FIELD_NUMBER = 1;
    private int heatBeatInterval_;
    /**
     * <code>int32 heat_beat_interval = 1;</code>
     */
    public int getHeatBeatInterval() {
      return heatBeatInterval_;
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
      if (heatBeatInterval_ != 0) {
        output.writeInt32(1, heatBeatInterval_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (heatBeatInterval_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, heatBeatInterval_);
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
      if (!(obj instanceof com.poker.protocols.server.ServerConfigProto.ServerConfig)) {
        return super.equals(obj);
      }
      com.poker.protocols.server.ServerConfigProto.ServerConfig other = (com.poker.protocols.server.ServerConfigProto.ServerConfig) obj;

      boolean result = true;
      result = result && (getHeatBeatInterval()
          == other.getHeatBeatInterval());
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
      hash = (37 * hash) + HEAT_BEAT_INTERVAL_FIELD_NUMBER;
      hash = (53 * hash) + getHeatBeatInterval();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.poker.protocols.server.ServerConfigProto.ServerConfig parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    //-----------------------------------------------------
    public static com.poker.protocols.server.ServerConfigProto.ServerConfig parseFrom(byte[] data,int offset ,int length)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return PARSER.parseFrom(data,offset,length);
        }
    //-----------------------------------------------------
    public static com.poker.protocols.server.ServerConfigProto.ServerConfig parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    //-----------------------------------------------------
    public static com.poker.protocols.server.ServerConfigProto.ServerConfig parseFrom(
    		byte[] data,int offset ,int length,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return PARSER.parseFrom(data,offset,length, extensionRegistry);
        }
   //-----------------------------------------------------
    public static com.poker.protocols.server.ServerConfigProto.ServerConfig parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.poker.protocols.server.ServerConfigProto.ServerConfig parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.poker.protocols.server.ServerConfigProto.ServerConfig parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.poker.protocols.server.ServerConfigProto.ServerConfig parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.poker.protocols.server.ServerConfigProto.ServerConfig parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.poker.protocols.server.ServerConfigProto.ServerConfig parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.poker.protocols.server.ServerConfigProto.ServerConfig parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.poker.protocols.server.ServerConfigProto.ServerConfig parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.poker.protocols.server.ServerConfigProto.ServerConfig parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.poker.protocols.server.ServerConfigProto.ServerConfig parseFrom(
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
    public static Builder newBuilder(com.poker.protocols.server.ServerConfigProto.ServerConfig prototype) {
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
     * Protobuf type {@code ServerConfig}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ServerConfig)
        com.poker.protocols.server.ServerConfigProto.ServerConfigOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.poker.protocols.server.ServerConfigProto.internal_static_ServerConfig_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.poker.protocols.server.ServerConfigProto.internal_static_ServerConfig_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.poker.protocols.server.ServerConfigProto.ServerConfig.class, com.poker.protocols.server.ServerConfigProto.ServerConfig.Builder.class);
      }

      // Construct using com.poker.protocols.server.ServerConfigProto.ServerConfig.newBuilder()
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
        heatBeatInterval_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.poker.protocols.server.ServerConfigProto.internal_static_ServerConfig_descriptor;
      }

      public com.poker.protocols.server.ServerConfigProto.ServerConfig getDefaultInstanceForType() {
        return com.poker.protocols.server.ServerConfigProto.ServerConfig.getDefaultInstance();
      }

      public com.poker.protocols.server.ServerConfigProto.ServerConfig build() {
        com.poker.protocols.server.ServerConfigProto.ServerConfig result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.poker.protocols.server.ServerConfigProto.ServerConfig buildPartial() {
        com.poker.protocols.server.ServerConfigProto.ServerConfig result = new com.poker.protocols.server.ServerConfigProto.ServerConfig(this);
        result.heatBeatInterval_ = heatBeatInterval_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
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
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.poker.protocols.server.ServerConfigProto.ServerConfig) {
          return mergeFrom((com.poker.protocols.server.ServerConfigProto.ServerConfig)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.poker.protocols.server.ServerConfigProto.ServerConfig other) {
        if (other == com.poker.protocols.server.ServerConfigProto.ServerConfig.getDefaultInstance()) return this;
        if (other.getHeatBeatInterval() != 0) {
          setHeatBeatInterval(other.getHeatBeatInterval());
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
        com.poker.protocols.server.ServerConfigProto.ServerConfig parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.poker.protocols.server.ServerConfigProto.ServerConfig) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int heatBeatInterval_ ;
      /**
       * <code>int32 heat_beat_interval = 1;</code>
       */
      public int getHeatBeatInterval() {
        return heatBeatInterval_;
      }
      /**
       * <code>int32 heat_beat_interval = 1;</code>
       */
      public Builder setHeatBeatInterval(int value) {
        
        heatBeatInterval_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 heat_beat_interval = 1;</code>
       */
      public Builder clearHeatBeatInterval() {
        
        heatBeatInterval_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ServerConfig)
    }

    // @@protoc_insertion_point(class_scope:ServerConfig)
    private static final com.poker.protocols.server.ServerConfigProto.ServerConfig DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.poker.protocols.server.ServerConfigProto.ServerConfig();
    }

    public static com.poker.protocols.server.ServerConfigProto.ServerConfig getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ServerConfig>
        PARSER = new com.google.protobuf.AbstractParser<ServerConfig>() {
      public ServerConfig parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ServerConfig(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ServerConfig> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ServerConfig> getParserForType() {
      return PARSER;
    }

    public com.poker.protocols.server.ServerConfigProto.ServerConfig getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServerConfig_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServerConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7src/com/poker/protocols/server/proto/S" +
      "erverConfig.proto\"*\n\014ServerConfig\022\032\n\022hea" +
      "t_beat_interval\030\001 \001(\005B/\n\032com.poker.proto" +
      "cols.serverB\021ServerConfigProtob\006proto3"
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
    internal_static_ServerConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ServerConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServerConfig_descriptor,
        new java.lang.String[] { "HeatBeatInterval", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
