// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: net/pocrd/api/resp/Api_Response.proto

package net.pocrd.api.resp;

public final class ApiResponse {
  private ApiResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface Api_ResponseOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int64 systime = 1;
    boolean hasSystime();
    long getSystime();
    
    // repeated .net.pocrd.api.resp.Api_CallState state = 2;
    java.util.List<net.pocrd.api.resp.ApiCallState.Api_CallState> 
        getStateList();
    net.pocrd.api.resp.ApiCallState.Api_CallState getState(int index);
    int getStateCount();
    java.util.List<? extends net.pocrd.api.resp.ApiCallState.Api_CallStateOrBuilder> 
        getStateOrBuilderList();
    net.pocrd.api.resp.ApiCallState.Api_CallStateOrBuilder getStateOrBuilder(
        int index);
    
    // repeated .net.pocrd.api.resp.Api_Notification notification = 3;
    java.util.List<net.pocrd.api.resp.ApiNotification.Api_Notification> 
        getNotificationList();
    net.pocrd.api.resp.ApiNotification.Api_Notification getNotification(int index);
    int getNotificationCount();
    java.util.List<? extends net.pocrd.api.resp.ApiNotification.Api_NotificationOrBuilder> 
        getNotificationOrBuilderList();
    net.pocrd.api.resp.ApiNotification.Api_NotificationOrBuilder getNotificationOrBuilder(
        int index);
  }
  public static final class Api_Response extends
      com.google.protobuf.GeneratedMessage
      implements Api_ResponseOrBuilder {
    // Use Api_Response.newBuilder() to construct.
    private Api_Response(Builder builder) {
      super(builder);
    }
    private Api_Response(boolean noInit) {}
    
    private static final Api_Response defaultInstance;
    public static Api_Response getDefaultInstance() {
      return defaultInstance;
    }
    
    public Api_Response getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pocrd.api.resp.ApiResponse.internal_static_net_pocrd_api_resp_Api_Response_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pocrd.api.resp.ApiResponse.internal_static_net_pocrd_api_resp_Api_Response_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int64 systime = 1;
    public static final int SYSTIME_FIELD_NUMBER = 1;
    private long systime_;
    public boolean hasSystime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getSystime() {
      return systime_;
    }
    
    // repeated .net.pocrd.api.resp.Api_CallState state = 2;
    public static final int STATE_FIELD_NUMBER = 2;
    private java.util.List<net.pocrd.api.resp.ApiCallState.Api_CallState> state_;
    public java.util.List<net.pocrd.api.resp.ApiCallState.Api_CallState> getStateList() {
      return state_;
    }
    public java.util.List<? extends net.pocrd.api.resp.ApiCallState.Api_CallStateOrBuilder> 
        getStateOrBuilderList() {
      return state_;
    }
    public int getStateCount() {
      return state_.size();
    }
    public net.pocrd.api.resp.ApiCallState.Api_CallState getState(int index) {
      return state_.get(index);
    }
    public net.pocrd.api.resp.ApiCallState.Api_CallStateOrBuilder getStateOrBuilder(
        int index) {
      return state_.get(index);
    }
    
    // repeated .net.pocrd.api.resp.Api_Notification notification = 3;
    public static final int NOTIFICATION_FIELD_NUMBER = 3;
    private java.util.List<net.pocrd.api.resp.ApiNotification.Api_Notification> notification_;
    public java.util.List<net.pocrd.api.resp.ApiNotification.Api_Notification> getNotificationList() {
      return notification_;
    }
    public java.util.List<? extends net.pocrd.api.resp.ApiNotification.Api_NotificationOrBuilder> 
        getNotificationOrBuilderList() {
      return notification_;
    }
    public int getNotificationCount() {
      return notification_.size();
    }
    public net.pocrd.api.resp.ApiNotification.Api_Notification getNotification(int index) {
      return notification_.get(index);
    }
    public net.pocrd.api.resp.ApiNotification.Api_NotificationOrBuilder getNotificationOrBuilder(
        int index) {
      return notification_.get(index);
    }
    
    private void initFields() {
      systime_ = 0L;
      state_ = java.util.Collections.emptyList();
      notification_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasSystime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getStateCount(); i++) {
        if (!getState(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, systime_);
      }
      for (int i = 0; i < state_.size(); i++) {
        output.writeMessage(2, state_.get(i));
      }
      for (int i = 0; i < notification_.size(); i++) {
        output.writeMessage(3, notification_.get(i));
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, systime_);
      }
      for (int i = 0; i < state_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, state_.get(i));
      }
      for (int i = 0; i < notification_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, notification_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static net.pocrd.api.resp.ApiResponse.Api_Response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pocrd.api.resp.ApiResponse.Api_Response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pocrd.api.resp.ApiResponse.Api_Response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pocrd.api.resp.ApiResponse.Api_Response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pocrd.api.resp.ApiResponse.Api_Response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pocrd.api.resp.ApiResponse.Api_Response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pocrd.api.resp.ApiResponse.Api_Response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pocrd.api.resp.ApiResponse.Api_Response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pocrd.api.resp.ApiResponse.Api_Response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pocrd.api.resp.ApiResponse.Api_Response parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pocrd.api.resp.ApiResponse.Api_Response prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements net.pocrd.api.resp.ApiResponse.Api_ResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pocrd.api.resp.ApiResponse.internal_static_net_pocrd_api_resp_Api_Response_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pocrd.api.resp.ApiResponse.internal_static_net_pocrd_api_resp_Api_Response_fieldAccessorTable;
      }
      
      // Construct using net.pocrd.api.resp.ApiResponse.Api_Response.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getStateFieldBuilder();
          getNotificationFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        systime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (stateBuilder_ == null) {
          state_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          stateBuilder_.clear();
        }
        if (notificationBuilder_ == null) {
          notification_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          notificationBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pocrd.api.resp.ApiResponse.Api_Response.getDescriptor();
      }
      
      public net.pocrd.api.resp.ApiResponse.Api_Response getDefaultInstanceForType() {
        return net.pocrd.api.resp.ApiResponse.Api_Response.getDefaultInstance();
      }
      
      public net.pocrd.api.resp.ApiResponse.Api_Response build() {
        net.pocrd.api.resp.ApiResponse.Api_Response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pocrd.api.resp.ApiResponse.Api_Response buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pocrd.api.resp.ApiResponse.Api_Response result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pocrd.api.resp.ApiResponse.Api_Response buildPartial() {
        net.pocrd.api.resp.ApiResponse.Api_Response result = new net.pocrd.api.resp.ApiResponse.Api_Response(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.systime_ = systime_;
        if (stateBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            state_ = java.util.Collections.unmodifiableList(state_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.state_ = state_;
        } else {
          result.state_ = stateBuilder_.build();
        }
        if (notificationBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            notification_ = java.util.Collections.unmodifiableList(notification_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.notification_ = notification_;
        } else {
          result.notification_ = notificationBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pocrd.api.resp.ApiResponse.Api_Response) {
          return mergeFrom((net.pocrd.api.resp.ApiResponse.Api_Response)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pocrd.api.resp.ApiResponse.Api_Response other) {
        if (other == net.pocrd.api.resp.ApiResponse.Api_Response.getDefaultInstance()) return this;
        if (other.hasSystime()) {
          setSystime(other.getSystime());
        }
        if (stateBuilder_ == null) {
          if (!other.state_.isEmpty()) {
            if (state_.isEmpty()) {
              state_ = other.state_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureStateIsMutable();
              state_.addAll(other.state_);
            }
            onChanged();
          }
        } else {
          if (!other.state_.isEmpty()) {
            if (stateBuilder_.isEmpty()) {
              stateBuilder_.dispose();
              stateBuilder_ = null;
              state_ = other.state_;
              bitField0_ = (bitField0_ & ~0x00000002);
              stateBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getStateFieldBuilder() : null;
            } else {
              stateBuilder_.addAllMessages(other.state_);
            }
          }
        }
        if (notificationBuilder_ == null) {
          if (!other.notification_.isEmpty()) {
            if (notification_.isEmpty()) {
              notification_ = other.notification_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureNotificationIsMutable();
              notification_.addAll(other.notification_);
            }
            onChanged();
          }
        } else {
          if (!other.notification_.isEmpty()) {
            if (notificationBuilder_.isEmpty()) {
              notificationBuilder_.dispose();
              notificationBuilder_ = null;
              notification_ = other.notification_;
              bitField0_ = (bitField0_ & ~0x00000004);
              notificationBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getNotificationFieldBuilder() : null;
            } else {
              notificationBuilder_.addAllMessages(other.notification_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasSystime()) {
          
          return false;
        }
        for (int i = 0; i < getStateCount(); i++) {
          if (!getState(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              systime_ = input.readInt64();
              break;
            }
            case 18: {
              net.pocrd.api.resp.ApiCallState.Api_CallState.Builder subBuilder = net.pocrd.api.resp.ApiCallState.Api_CallState.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addState(subBuilder.buildPartial());
              break;
            }
            case 26: {
              net.pocrd.api.resp.ApiNotification.Api_Notification.Builder subBuilder = net.pocrd.api.resp.ApiNotification.Api_Notification.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addNotification(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int64 systime = 1;
      private long systime_ ;
      public boolean hasSystime() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getSystime() {
        return systime_;
      }
      public Builder setSystime(long value) {
        bitField0_ |= 0x00000001;
        systime_ = value;
        onChanged();
        return this;
      }
      public Builder clearSystime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        systime_ = 0L;
        onChanged();
        return this;
      }
      
      // repeated .net.pocrd.api.resp.Api_CallState state = 2;
      private java.util.List<net.pocrd.api.resp.ApiCallState.Api_CallState> state_ =
        java.util.Collections.emptyList();
      private void ensureStateIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          state_ = new java.util.ArrayList<net.pocrd.api.resp.ApiCallState.Api_CallState>(state_);
          bitField0_ |= 0x00000002;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          net.pocrd.api.resp.ApiCallState.Api_CallState, net.pocrd.api.resp.ApiCallState.Api_CallState.Builder, net.pocrd.api.resp.ApiCallState.Api_CallStateOrBuilder> stateBuilder_;
      
      public java.util.List<net.pocrd.api.resp.ApiCallState.Api_CallState> getStateList() {
        if (stateBuilder_ == null) {
          return java.util.Collections.unmodifiableList(state_);
        } else {
          return stateBuilder_.getMessageList();
        }
      }
      public int getStateCount() {
        if (stateBuilder_ == null) {
          return state_.size();
        } else {
          return stateBuilder_.getCount();
        }
      }
      public net.pocrd.api.resp.ApiCallState.Api_CallState getState(int index) {
        if (stateBuilder_ == null) {
          return state_.get(index);
        } else {
          return stateBuilder_.getMessage(index);
        }
      }
      public Builder setState(
          int index, net.pocrd.api.resp.ApiCallState.Api_CallState value) {
        if (stateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStateIsMutable();
          state_.set(index, value);
          onChanged();
        } else {
          stateBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setState(
          int index, net.pocrd.api.resp.ApiCallState.Api_CallState.Builder builderForValue) {
        if (stateBuilder_ == null) {
          ensureStateIsMutable();
          state_.set(index, builderForValue.build());
          onChanged();
        } else {
          stateBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addState(net.pocrd.api.resp.ApiCallState.Api_CallState value) {
        if (stateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStateIsMutable();
          state_.add(value);
          onChanged();
        } else {
          stateBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addState(
          int index, net.pocrd.api.resp.ApiCallState.Api_CallState value) {
        if (stateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStateIsMutable();
          state_.add(index, value);
          onChanged();
        } else {
          stateBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addState(
          net.pocrd.api.resp.ApiCallState.Api_CallState.Builder builderForValue) {
        if (stateBuilder_ == null) {
          ensureStateIsMutable();
          state_.add(builderForValue.build());
          onChanged();
        } else {
          stateBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addState(
          int index, net.pocrd.api.resp.ApiCallState.Api_CallState.Builder builderForValue) {
        if (stateBuilder_ == null) {
          ensureStateIsMutable();
          state_.add(index, builderForValue.build());
          onChanged();
        } else {
          stateBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllState(
          java.lang.Iterable<? extends net.pocrd.api.resp.ApiCallState.Api_CallState> values) {
        if (stateBuilder_ == null) {
          ensureStateIsMutable();
          super.addAll(values, state_);
          onChanged();
        } else {
          stateBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearState() {
        if (stateBuilder_ == null) {
          state_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          stateBuilder_.clear();
        }
        return this;
      }
      public Builder removeState(int index) {
        if (stateBuilder_ == null) {
          ensureStateIsMutable();
          state_.remove(index);
          onChanged();
        } else {
          stateBuilder_.remove(index);
        }
        return this;
      }
      public net.pocrd.api.resp.ApiCallState.Api_CallState.Builder getStateBuilder(
          int index) {
        return getStateFieldBuilder().getBuilder(index);
      }
      public net.pocrd.api.resp.ApiCallState.Api_CallStateOrBuilder getStateOrBuilder(
          int index) {
        if (stateBuilder_ == null) {
          return state_.get(index);  } else {
          return stateBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends net.pocrd.api.resp.ApiCallState.Api_CallStateOrBuilder> 
           getStateOrBuilderList() {
        if (stateBuilder_ != null) {
          return stateBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(state_);
        }
      }
      public net.pocrd.api.resp.ApiCallState.Api_CallState.Builder addStateBuilder() {
        return getStateFieldBuilder().addBuilder(
            net.pocrd.api.resp.ApiCallState.Api_CallState.getDefaultInstance());
      }
      public net.pocrd.api.resp.ApiCallState.Api_CallState.Builder addStateBuilder(
          int index) {
        return getStateFieldBuilder().addBuilder(
            index, net.pocrd.api.resp.ApiCallState.Api_CallState.getDefaultInstance());
      }
      public java.util.List<net.pocrd.api.resp.ApiCallState.Api_CallState.Builder> 
           getStateBuilderList() {
        return getStateFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          net.pocrd.api.resp.ApiCallState.Api_CallState, net.pocrd.api.resp.ApiCallState.Api_CallState.Builder, net.pocrd.api.resp.ApiCallState.Api_CallStateOrBuilder> 
          getStateFieldBuilder() {
        if (stateBuilder_ == null) {
          stateBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              net.pocrd.api.resp.ApiCallState.Api_CallState, net.pocrd.api.resp.ApiCallState.Api_CallState.Builder, net.pocrd.api.resp.ApiCallState.Api_CallStateOrBuilder>(
                  state_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          state_ = null;
        }
        return stateBuilder_;
      }
      
      // repeated .net.pocrd.api.resp.Api_Notification notification = 3;
      private java.util.List<net.pocrd.api.resp.ApiNotification.Api_Notification> notification_ =
        java.util.Collections.emptyList();
      private void ensureNotificationIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          notification_ = new java.util.ArrayList<net.pocrd.api.resp.ApiNotification.Api_Notification>(notification_);
          bitField0_ |= 0x00000004;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          net.pocrd.api.resp.ApiNotification.Api_Notification, net.pocrd.api.resp.ApiNotification.Api_Notification.Builder, net.pocrd.api.resp.ApiNotification.Api_NotificationOrBuilder> notificationBuilder_;
      
      public java.util.List<net.pocrd.api.resp.ApiNotification.Api_Notification> getNotificationList() {
        if (notificationBuilder_ == null) {
          return java.util.Collections.unmodifiableList(notification_);
        } else {
          return notificationBuilder_.getMessageList();
        }
      }
      public int getNotificationCount() {
        if (notificationBuilder_ == null) {
          return notification_.size();
        } else {
          return notificationBuilder_.getCount();
        }
      }
      public net.pocrd.api.resp.ApiNotification.Api_Notification getNotification(int index) {
        if (notificationBuilder_ == null) {
          return notification_.get(index);
        } else {
          return notificationBuilder_.getMessage(index);
        }
      }
      public Builder setNotification(
          int index, net.pocrd.api.resp.ApiNotification.Api_Notification value) {
        if (notificationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNotificationIsMutable();
          notification_.set(index, value);
          onChanged();
        } else {
          notificationBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setNotification(
          int index, net.pocrd.api.resp.ApiNotification.Api_Notification.Builder builderForValue) {
        if (notificationBuilder_ == null) {
          ensureNotificationIsMutable();
          notification_.set(index, builderForValue.build());
          onChanged();
        } else {
          notificationBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addNotification(net.pocrd.api.resp.ApiNotification.Api_Notification value) {
        if (notificationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNotificationIsMutable();
          notification_.add(value);
          onChanged();
        } else {
          notificationBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addNotification(
          int index, net.pocrd.api.resp.ApiNotification.Api_Notification value) {
        if (notificationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNotificationIsMutable();
          notification_.add(index, value);
          onChanged();
        } else {
          notificationBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addNotification(
          net.pocrd.api.resp.ApiNotification.Api_Notification.Builder builderForValue) {
        if (notificationBuilder_ == null) {
          ensureNotificationIsMutable();
          notification_.add(builderForValue.build());
          onChanged();
        } else {
          notificationBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addNotification(
          int index, net.pocrd.api.resp.ApiNotification.Api_Notification.Builder builderForValue) {
        if (notificationBuilder_ == null) {
          ensureNotificationIsMutable();
          notification_.add(index, builderForValue.build());
          onChanged();
        } else {
          notificationBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllNotification(
          java.lang.Iterable<? extends net.pocrd.api.resp.ApiNotification.Api_Notification> values) {
        if (notificationBuilder_ == null) {
          ensureNotificationIsMutable();
          super.addAll(values, notification_);
          onChanged();
        } else {
          notificationBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearNotification() {
        if (notificationBuilder_ == null) {
          notification_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          notificationBuilder_.clear();
        }
        return this;
      }
      public Builder removeNotification(int index) {
        if (notificationBuilder_ == null) {
          ensureNotificationIsMutable();
          notification_.remove(index);
          onChanged();
        } else {
          notificationBuilder_.remove(index);
        }
        return this;
      }
      public net.pocrd.api.resp.ApiNotification.Api_Notification.Builder getNotificationBuilder(
          int index) {
        return getNotificationFieldBuilder().getBuilder(index);
      }
      public net.pocrd.api.resp.ApiNotification.Api_NotificationOrBuilder getNotificationOrBuilder(
          int index) {
        if (notificationBuilder_ == null) {
          return notification_.get(index);  } else {
          return notificationBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends net.pocrd.api.resp.ApiNotification.Api_NotificationOrBuilder> 
           getNotificationOrBuilderList() {
        if (notificationBuilder_ != null) {
          return notificationBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(notification_);
        }
      }
      public net.pocrd.api.resp.ApiNotification.Api_Notification.Builder addNotificationBuilder() {
        return getNotificationFieldBuilder().addBuilder(
            net.pocrd.api.resp.ApiNotification.Api_Notification.getDefaultInstance());
      }
      public net.pocrd.api.resp.ApiNotification.Api_Notification.Builder addNotificationBuilder(
          int index) {
        return getNotificationFieldBuilder().addBuilder(
            index, net.pocrd.api.resp.ApiNotification.Api_Notification.getDefaultInstance());
      }
      public java.util.List<net.pocrd.api.resp.ApiNotification.Api_Notification.Builder> 
           getNotificationBuilderList() {
        return getNotificationFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          net.pocrd.api.resp.ApiNotification.Api_Notification, net.pocrd.api.resp.ApiNotification.Api_Notification.Builder, net.pocrd.api.resp.ApiNotification.Api_NotificationOrBuilder> 
          getNotificationFieldBuilder() {
        if (notificationBuilder_ == null) {
          notificationBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              net.pocrd.api.resp.ApiNotification.Api_Notification, net.pocrd.api.resp.ApiNotification.Api_Notification.Builder, net.pocrd.api.resp.ApiNotification.Api_NotificationOrBuilder>(
                  notification_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          notification_ = null;
        }
        return notificationBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:net.pocrd.api.resp.Api_Response)
    }
    
    static {
      defaultInstance = new Api_Response(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.pocrd.api.resp.Api_Response)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_pocrd_api_resp_Api_Response_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_pocrd_api_resp_Api_Response_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%net/pocrd/api/resp/Api_Response.proto\022" +
      "\022net.pocrd.api.resp\032&net/pocrd/api/resp/" +
      "Api_CallState.proto\032)net/pocrd/api/resp/" +
      "Api_Notification.proto\"\215\001\n\014Api_Response\022" +
      "\017\n\007systime\030\001 \002(\003\0220\n\005state\030\002 \003(\0132!.net.po" +
      "crd.api.resp.Api_CallState\022:\n\014notificati" +
      "on\030\003 \003(\0132$.net.pocrd.api.resp.Api_Notifi" +
      "cation"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_net_pocrd_api_resp_Api_Response_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_net_pocrd_api_resp_Api_Response_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_pocrd_api_resp_Api_Response_descriptor,
              new java.lang.String[] { "Systime", "State", "Notification", },
              net.pocrd.api.resp.ApiResponse.Api_Response.class,
              net.pocrd.api.resp.ApiResponse.Api_Response.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          net.pocrd.api.resp.ApiCallState.getDescriptor(),
          net.pocrd.api.resp.ApiNotification.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
