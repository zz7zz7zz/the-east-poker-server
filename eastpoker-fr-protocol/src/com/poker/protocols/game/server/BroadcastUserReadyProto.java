// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/com/poker/protocols/game/server/proto/BroadcastUserReady.proto

package com.poker.protocols.game.server;

public final class BroadcastUserReadyProto {
  private BroadcastUserReadyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BroadcastUserReadyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.poker.protocols.game.server.proto.BroadcastUserReady)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 seatId = 1;</code>
     */
    int getSeatId();
  }
  /**
   * Protobuf type {@code com.poker.protocols.game.server.proto.BroadcastUserReady}
   */
  public  static final class BroadcastUserReady extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.poker.protocols.game.server.proto.BroadcastUserReady)
      BroadcastUserReadyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BroadcastUserReady.newBuilder() to construct.
    private BroadcastUserReady(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BroadcastUserReady() {
      seatId_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BroadcastUserReady(
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

              seatId_ = input.readInt32();
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
      return com.poker.protocols.game.server.BroadcastUserReadyProto.internal_static_com_poker_protocols_game_server_proto_BroadcastUserReady_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.poker.protocols.game.server.BroadcastUserReadyProto.internal_static_com_poker_protocols_game_server_proto_BroadcastUserReady_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady.class, com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady.Builder.class);
    }

    public static final int SEATID_FIELD_NUMBER = 1;
    private int seatId_;
    /**
     * <code>int32 seatId = 1;</code>
     */
    public int getSeatId() {
      return seatId_;
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
      if (seatId_ != 0) {
        output.writeInt32(1, seatId_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (seatId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, seatId_);
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
      if (!(obj instanceof com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady)) {
        return super.equals(obj);
      }
      com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady other = (com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady) obj;

      boolean result = true;
      result = result && (getSeatId()
          == other.getSeatId());
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
      hash = (37 * hash) + SEATID_FIELD_NUMBER;
      hash = (53 * hash) + getSeatId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    //-----------------------------------------------------
    public static com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady parseFrom(byte[] data,int offset ,int length)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return PARSER.parseFrom(data,offset,length);
        }
    //-----------------------------------------------------
    public static com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    //-----------------------------------------------------
    public static com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady parseFrom(
    		byte[] data,int offset ,int length,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return PARSER.parseFrom(data,offset,length, extensionRegistry);
        }
   //-----------------------------------------------------
    public static com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady parseFrom(
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
    public static Builder newBuilder(com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady prototype) {
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
     * Protobuf type {@code com.poker.protocols.game.server.proto.BroadcastUserReady}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.poker.protocols.game.server.proto.BroadcastUserReady)
        com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReadyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.poker.protocols.game.server.BroadcastUserReadyProto.internal_static_com_poker_protocols_game_server_proto_BroadcastUserReady_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.poker.protocols.game.server.BroadcastUserReadyProto.internal_static_com_poker_protocols_game_server_proto_BroadcastUserReady_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady.class, com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady.Builder.class);
      }

      // Construct using com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady.newBuilder()
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
        seatId_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.poker.protocols.game.server.BroadcastUserReadyProto.internal_static_com_poker_protocols_game_server_proto_BroadcastUserReady_descriptor;
      }

      public com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady getDefaultInstanceForType() {
        return com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady.getDefaultInstance();
      }

      public com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady build() {
        com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady buildPartial() {
        com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady result = new com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady(this);
        result.seatId_ = seatId_;
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
        if (other instanceof com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady) {
          return mergeFrom((com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady other) {
        if (other == com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady.getDefaultInstance()) return this;
        if (other.getSeatId() != 0) {
          setSeatId(other.getSeatId());
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
        com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int seatId_ ;
      /**
       * <code>int32 seatId = 1;</code>
       */
      public int getSeatId() {
        return seatId_;
      }
      /**
       * <code>int32 seatId = 1;</code>
       */
      public Builder setSeatId(int value) {
        
        seatId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 seatId = 1;</code>
       */
      public Builder clearSeatId() {
        
        seatId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:com.poker.protocols.game.server.proto.BroadcastUserReady)
    }

    // @@protoc_insertion_point(class_scope:com.poker.protocols.game.server.proto.BroadcastUserReady)
    private static final com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady();
    }

    public static com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BroadcastUserReady>
        PARSER = new com.google.protobuf.AbstractParser<BroadcastUserReady>() {
      public BroadcastUserReady parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BroadcastUserReady(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BroadcastUserReady> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BroadcastUserReady> getParserForType() {
      return PARSER;
    }

    public com.poker.protocols.game.server.BroadcastUserReadyProto.BroadcastUserReady getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_poker_protocols_game_server_proto_BroadcastUserReady_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_poker_protocols_game_server_proto_BroadcastUserReady_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBsrc/com/poker/protocols/game/server/pr" +
      "oto/BroadcastUserReady.proto\022%com.poker." +
      "protocols.game.server.proto\"$\n\022Broadcast" +
      "UserReady\022\016\n\006seatId\030\001 \001(\005B:\n\037com.poker.p" +
      "rotocols.game.serverB\027BroadcastUserReady" +
      "Protob\006proto3"
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
    internal_static_com_poker_protocols_game_server_proto_BroadcastUserReady_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_poker_protocols_game_server_proto_BroadcastUserReady_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_poker_protocols_game_server_proto_BroadcastUserReady_descriptor,
        new java.lang.String[] { "SeatId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
