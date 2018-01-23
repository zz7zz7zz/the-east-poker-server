// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/com/poker/protocols/game/proto/BroadcastUserReady.proto

package com.poker.protocols.game;

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
      // @@protoc_insertion_point(interface_extends:com.poker.protocols.game.proto.BroadcastUserReady)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
     */
    java.util.List<com.poker.protocols.game.GameUserProto.GameUser> 
        getUsersList();
    /**
     * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
     */
    com.poker.protocols.game.GameUserProto.GameUser getUsers(int index);
    /**
     * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
     */
    int getUsersCount();
    /**
     * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
     */
    java.util.List<? extends com.poker.protocols.game.GameUserProto.GameUserOrBuilder> 
        getUsersOrBuilderList();
    /**
     * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
     */
    com.poker.protocols.game.GameUserProto.GameUserOrBuilder getUsersOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code com.poker.protocols.game.proto.BroadcastUserReady}
   */
  public  static final class BroadcastUserReady extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.poker.protocols.game.proto.BroadcastUserReady)
      BroadcastUserReadyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BroadcastUserReady.newBuilder() to construct.
    private BroadcastUserReady(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BroadcastUserReady() {
      users_ = java.util.Collections.emptyList();
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                users_ = new java.util.ArrayList<com.poker.protocols.game.GameUserProto.GameUser>();
                mutable_bitField0_ |= 0x00000001;
              }
              users_.add(
                  input.readMessage(com.poker.protocols.game.GameUserProto.GameUser.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          users_ = java.util.Collections.unmodifiableList(users_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.poker.protocols.game.BroadcastUserReadyProto.internal_static_com_poker_protocols_game_proto_BroadcastUserReady_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.poker.protocols.game.BroadcastUserReadyProto.internal_static_com_poker_protocols_game_proto_BroadcastUserReady_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady.class, com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady.Builder.class);
    }

    public static final int USERS_FIELD_NUMBER = 1;
    private java.util.List<com.poker.protocols.game.GameUserProto.GameUser> users_;
    /**
     * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
     */
    public java.util.List<com.poker.protocols.game.GameUserProto.GameUser> getUsersList() {
      return users_;
    }
    /**
     * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
     */
    public java.util.List<? extends com.poker.protocols.game.GameUserProto.GameUserOrBuilder> 
        getUsersOrBuilderList() {
      return users_;
    }
    /**
     * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
     */
    public int getUsersCount() {
      return users_.size();
    }
    /**
     * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
     */
    public com.poker.protocols.game.GameUserProto.GameUser getUsers(int index) {
      return users_.get(index);
    }
    /**
     * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
     */
    public com.poker.protocols.game.GameUserProto.GameUserOrBuilder getUsersOrBuilder(
        int index) {
      return users_.get(index);
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
      for (int i = 0; i < users_.size(); i++) {
        output.writeMessage(1, users_.get(i));
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < users_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, users_.get(i));
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
      if (!(obj instanceof com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady)) {
        return super.equals(obj);
      }
      com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady other = (com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady) obj;

      boolean result = true;
      result = result && getUsersList()
          .equals(other.getUsersList());
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
      if (getUsersCount() > 0) {
        hash = (37 * hash) + USERS_FIELD_NUMBER;
        hash = (53 * hash) + getUsersList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    //-----------------------------------------------------
    public static com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady parseFrom(byte[] data,int offset ,int length)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return PARSER.parseFrom(data,offset,length);
        }
    //-----------------------------------------------------
    public static com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    //-----------------------------------------------------
    public static com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady parseFrom(
    		byte[] data,int offset ,int length,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return PARSER.parseFrom(data,offset,length, extensionRegistry);
        }
   //-----------------------------------------------------
    public static com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady parseFrom(
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
    public static Builder newBuilder(com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady prototype) {
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
     * Protobuf type {@code com.poker.protocols.game.proto.BroadcastUserReady}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.poker.protocols.game.proto.BroadcastUserReady)
        com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReadyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.poker.protocols.game.BroadcastUserReadyProto.internal_static_com_poker_protocols_game_proto_BroadcastUserReady_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.poker.protocols.game.BroadcastUserReadyProto.internal_static_com_poker_protocols_game_proto_BroadcastUserReady_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady.class, com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady.Builder.class);
      }

      // Construct using com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady.newBuilder()
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
          getUsersFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (usersBuilder_ == null) {
          users_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          usersBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.poker.protocols.game.BroadcastUserReadyProto.internal_static_com_poker_protocols_game_proto_BroadcastUserReady_descriptor;
      }

      public com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady getDefaultInstanceForType() {
        return com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady.getDefaultInstance();
      }

      public com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady build() {
        com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady buildPartial() {
        com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady result = new com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady(this);
        int from_bitField0_ = bitField0_;
        if (usersBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            users_ = java.util.Collections.unmodifiableList(users_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.users_ = users_;
        } else {
          result.users_ = usersBuilder_.build();
        }
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
        if (other instanceof com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady) {
          return mergeFrom((com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady other) {
        if (other == com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady.getDefaultInstance()) return this;
        if (usersBuilder_ == null) {
          if (!other.users_.isEmpty()) {
            if (users_.isEmpty()) {
              users_ = other.users_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureUsersIsMutable();
              users_.addAll(other.users_);
            }
            onChanged();
          }
        } else {
          if (!other.users_.isEmpty()) {
            if (usersBuilder_.isEmpty()) {
              usersBuilder_.dispose();
              usersBuilder_ = null;
              users_ = other.users_;
              bitField0_ = (bitField0_ & ~0x00000001);
              usersBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUsersFieldBuilder() : null;
            } else {
              usersBuilder_.addAllMessages(other.users_);
            }
          }
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
        com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.poker.protocols.game.GameUserProto.GameUser> users_ =
        java.util.Collections.emptyList();
      private void ensureUsersIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          users_ = new java.util.ArrayList<com.poker.protocols.game.GameUserProto.GameUser>(users_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.poker.protocols.game.GameUserProto.GameUser, com.poker.protocols.game.GameUserProto.GameUser.Builder, com.poker.protocols.game.GameUserProto.GameUserOrBuilder> usersBuilder_;

      /**
       * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
       */
      public java.util.List<com.poker.protocols.game.GameUserProto.GameUser> getUsersList() {
        if (usersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(users_);
        } else {
          return usersBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
       */
      public int getUsersCount() {
        if (usersBuilder_ == null) {
          return users_.size();
        } else {
          return usersBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
       */
      public com.poker.protocols.game.GameUserProto.GameUser getUsers(int index) {
        if (usersBuilder_ == null) {
          return users_.get(index);
        } else {
          return usersBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
       */
      public Builder setUsers(
          int index, com.poker.protocols.game.GameUserProto.GameUser value) {
        if (usersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUsersIsMutable();
          users_.set(index, value);
          onChanged();
        } else {
          usersBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
       */
      public Builder setUsers(
          int index, com.poker.protocols.game.GameUserProto.GameUser.Builder builderForValue) {
        if (usersBuilder_ == null) {
          ensureUsersIsMutable();
          users_.set(index, builderForValue.build());
          onChanged();
        } else {
          usersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
       */
      public Builder addUsers(com.poker.protocols.game.GameUserProto.GameUser value) {
        if (usersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUsersIsMutable();
          users_.add(value);
          onChanged();
        } else {
          usersBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
       */
      public Builder addUsers(
          int index, com.poker.protocols.game.GameUserProto.GameUser value) {
        if (usersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUsersIsMutable();
          users_.add(index, value);
          onChanged();
        } else {
          usersBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
       */
      public Builder addUsers(
          com.poker.protocols.game.GameUserProto.GameUser.Builder builderForValue) {
        if (usersBuilder_ == null) {
          ensureUsersIsMutable();
          users_.add(builderForValue.build());
          onChanged();
        } else {
          usersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
       */
      public Builder addUsers(
          int index, com.poker.protocols.game.GameUserProto.GameUser.Builder builderForValue) {
        if (usersBuilder_ == null) {
          ensureUsersIsMutable();
          users_.add(index, builderForValue.build());
          onChanged();
        } else {
          usersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
       */
      public Builder addAllUsers(
          java.lang.Iterable<? extends com.poker.protocols.game.GameUserProto.GameUser> values) {
        if (usersBuilder_ == null) {
          ensureUsersIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, users_);
          onChanged();
        } else {
          usersBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
       */
      public Builder clearUsers() {
        if (usersBuilder_ == null) {
          users_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          usersBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
       */
      public Builder removeUsers(int index) {
        if (usersBuilder_ == null) {
          ensureUsersIsMutable();
          users_.remove(index);
          onChanged();
        } else {
          usersBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
       */
      public com.poker.protocols.game.GameUserProto.GameUser.Builder getUsersBuilder(
          int index) {
        return getUsersFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
       */
      public com.poker.protocols.game.GameUserProto.GameUserOrBuilder getUsersOrBuilder(
          int index) {
        if (usersBuilder_ == null) {
          return users_.get(index);  } else {
          return usersBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
       */
      public java.util.List<? extends com.poker.protocols.game.GameUserProto.GameUserOrBuilder> 
           getUsersOrBuilderList() {
        if (usersBuilder_ != null) {
          return usersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(users_);
        }
      }
      /**
       * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
       */
      public com.poker.protocols.game.GameUserProto.GameUser.Builder addUsersBuilder() {
        return getUsersFieldBuilder().addBuilder(
            com.poker.protocols.game.GameUserProto.GameUser.getDefaultInstance());
      }
      /**
       * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
       */
      public com.poker.protocols.game.GameUserProto.GameUser.Builder addUsersBuilder(
          int index) {
        return getUsersFieldBuilder().addBuilder(
            index, com.poker.protocols.game.GameUserProto.GameUser.getDefaultInstance());
      }
      /**
       * <code>repeated .com.poker.protocols.game.proto.GameUser users = 1;</code>
       */
      public java.util.List<com.poker.protocols.game.GameUserProto.GameUser.Builder> 
           getUsersBuilderList() {
        return getUsersFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.poker.protocols.game.GameUserProto.GameUser, com.poker.protocols.game.GameUserProto.GameUser.Builder, com.poker.protocols.game.GameUserProto.GameUserOrBuilder> 
          getUsersFieldBuilder() {
        if (usersBuilder_ == null) {
          usersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.poker.protocols.game.GameUserProto.GameUser, com.poker.protocols.game.GameUserProto.GameUser.Builder, com.poker.protocols.game.GameUserProto.GameUserOrBuilder>(
                  users_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          users_ = null;
        }
        return usersBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.poker.protocols.game.proto.BroadcastUserReady)
    }

    // @@protoc_insertion_point(class_scope:com.poker.protocols.game.proto.BroadcastUserReady)
    private static final com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady();
    }

    public static com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady getDefaultInstance() {
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

    public com.poker.protocols.game.BroadcastUserReadyProto.BroadcastUserReady getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_poker_protocols_game_proto_BroadcastUserReady_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_poker_protocols_game_proto_BroadcastUserReady_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;src/com/poker/protocols/game/proto/Bro" +
      "adcastUserReady.proto\022\036com.poker.protoco" +
      "ls.game.proto\0321src/com/poker/protocols/g" +
      "ame/proto/GameUser.proto\"M\n\022BroadcastUse" +
      "rReady\0227\n\005users\030\001 \003(\0132(.com.poker.protoc" +
      "ols.game.proto.GameUserB3\n\030com.poker.pro" +
      "tocols.gameB\027BroadcastUserReadyProtob\006pr" +
      "oto3"
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
          com.poker.protocols.game.GameUserProto.getDescriptor(),
        }, assigner);
    internal_static_com_poker_protocols_game_proto_BroadcastUserReady_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_poker_protocols_game_proto_BroadcastUserReady_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_poker_protocols_game_proto_BroadcastUserReady_descriptor,
        new java.lang.String[] { "Users", });
    com.poker.protocols.game.GameUserProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
