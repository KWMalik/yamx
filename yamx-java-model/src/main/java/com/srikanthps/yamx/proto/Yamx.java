// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PATH/yamx.proto

package com.srikanthps.yamx.proto;

public final class Yamx {
  private Yamx() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface SysInfoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string appName = 1;
    boolean hasAppName();
    String getAppName();
    
    // required string hostname = 2;
    boolean hasHostname();
    String getHostname();
    
    // required string ipAddr = 3;
    boolean hasIpAddr();
    String getIpAddr();
    
    // optional string systemType = 4;
    boolean hasSystemType();
    String getSystemType();
    
    // optional string osinfo = 5;
    boolean hasOsinfo();
    String getOsinfo();
  }
  public static final class SysInfo extends
      com.google.protobuf.GeneratedMessage
      implements SysInfoOrBuilder {
    // Use SysInfo.newBuilder() to construct.
    private SysInfo(Builder builder) {
      super(builder);
    }
    private SysInfo(boolean noInit) {}
    
    private static final SysInfo defaultInstance;
    public static SysInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public SysInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.srikanthps.yamx.proto.Yamx.internal_static_com_srikanthps_yamx_proto_SysInfo_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.srikanthps.yamx.proto.Yamx.internal_static_com_srikanthps_yamx_proto_SysInfo_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string appName = 1;
    public static final int APPNAME_FIELD_NUMBER = 1;
    private java.lang.Object appName_;
    public boolean hasAppName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getAppName() {
      java.lang.Object ref = appName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          appName_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getAppNameBytes() {
      java.lang.Object ref = appName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        appName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required string hostname = 2;
    public static final int HOSTNAME_FIELD_NUMBER = 2;
    private java.lang.Object hostname_;
    public boolean hasHostname() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getHostname() {
      java.lang.Object ref = hostname_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          hostname_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getHostnameBytes() {
      java.lang.Object ref = hostname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        hostname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required string ipAddr = 3;
    public static final int IPADDR_FIELD_NUMBER = 3;
    private java.lang.Object ipAddr_;
    public boolean hasIpAddr() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getIpAddr() {
      java.lang.Object ref = ipAddr_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          ipAddr_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getIpAddrBytes() {
      java.lang.Object ref = ipAddr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        ipAddr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string systemType = 4;
    public static final int SYSTEMTYPE_FIELD_NUMBER = 4;
    private java.lang.Object systemType_;
    public boolean hasSystemType() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public String getSystemType() {
      java.lang.Object ref = systemType_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          systemType_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getSystemTypeBytes() {
      java.lang.Object ref = systemType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        systemType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string osinfo = 5;
    public static final int OSINFO_FIELD_NUMBER = 5;
    private java.lang.Object osinfo_;
    public boolean hasOsinfo() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public String getOsinfo() {
      java.lang.Object ref = osinfo_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          osinfo_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getOsinfoBytes() {
      java.lang.Object ref = osinfo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        osinfo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      appName_ = "";
      hostname_ = "";
      ipAddr_ = "";
      systemType_ = "";
      osinfo_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasAppName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasHostname()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIpAddr()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getAppNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getHostnameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getIpAddrBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getSystemTypeBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getOsinfoBytes());
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
          .computeBytesSize(1, getAppNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getHostnameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getIpAddrBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getSystemTypeBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getOsinfoBytes());
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
    
    public static com.srikanthps.yamx.proto.Yamx.SysInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.srikanthps.yamx.proto.Yamx.SysInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.srikanthps.yamx.proto.Yamx.SysInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.srikanthps.yamx.proto.Yamx.SysInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.srikanthps.yamx.proto.Yamx.SysInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.srikanthps.yamx.proto.Yamx.SysInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.srikanthps.yamx.proto.Yamx.SysInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.srikanthps.yamx.proto.Yamx.SysInfo parseDelimitedFrom(
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
    public static com.srikanthps.yamx.proto.Yamx.SysInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.srikanthps.yamx.proto.Yamx.SysInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.srikanthps.yamx.proto.Yamx.SysInfo prototype) {
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
       implements com.srikanthps.yamx.proto.Yamx.SysInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.srikanthps.yamx.proto.Yamx.internal_static_com_srikanthps_yamx_proto_SysInfo_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.srikanthps.yamx.proto.Yamx.internal_static_com_srikanthps_yamx_proto_SysInfo_fieldAccessorTable;
      }
      
      // Construct using com.srikanthps.yamx.proto.Yamx.SysInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        appName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        hostname_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        ipAddr_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        systemType_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        osinfo_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.srikanthps.yamx.proto.Yamx.SysInfo.getDescriptor();
      }
      
      public com.srikanthps.yamx.proto.Yamx.SysInfo getDefaultInstanceForType() {
        return com.srikanthps.yamx.proto.Yamx.SysInfo.getDefaultInstance();
      }
      
      public com.srikanthps.yamx.proto.Yamx.SysInfo build() {
        com.srikanthps.yamx.proto.Yamx.SysInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.srikanthps.yamx.proto.Yamx.SysInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.srikanthps.yamx.proto.Yamx.SysInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.srikanthps.yamx.proto.Yamx.SysInfo buildPartial() {
        com.srikanthps.yamx.proto.Yamx.SysInfo result = new com.srikanthps.yamx.proto.Yamx.SysInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.appName_ = appName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.hostname_ = hostname_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.ipAddr_ = ipAddr_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.systemType_ = systemType_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.osinfo_ = osinfo_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.srikanthps.yamx.proto.Yamx.SysInfo) {
          return mergeFrom((com.srikanthps.yamx.proto.Yamx.SysInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.srikanthps.yamx.proto.Yamx.SysInfo other) {
        if (other == com.srikanthps.yamx.proto.Yamx.SysInfo.getDefaultInstance()) return this;
        if (other.hasAppName()) {
          setAppName(other.getAppName());
        }
        if (other.hasHostname()) {
          setHostname(other.getHostname());
        }
        if (other.hasIpAddr()) {
          setIpAddr(other.getIpAddr());
        }
        if (other.hasSystemType()) {
          setSystemType(other.getSystemType());
        }
        if (other.hasOsinfo()) {
          setOsinfo(other.getOsinfo());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasAppName()) {
          
          return false;
        }
        if (!hasHostname()) {
          
          return false;
        }
        if (!hasIpAddr()) {
          
          return false;
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
            case 10: {
              bitField0_ |= 0x00000001;
              appName_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              hostname_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              ipAddr_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              systemType_ = input.readBytes();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              osinfo_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string appName = 1;
      private java.lang.Object appName_ = "";
      public boolean hasAppName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getAppName() {
        java.lang.Object ref = appName_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          appName_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setAppName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        appName_ = value;
        onChanged();
        return this;
      }
      public Builder clearAppName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        appName_ = getDefaultInstance().getAppName();
        onChanged();
        return this;
      }
      void setAppName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        appName_ = value;
        onChanged();
      }
      
      // required string hostname = 2;
      private java.lang.Object hostname_ = "";
      public boolean hasHostname() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getHostname() {
        java.lang.Object ref = hostname_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          hostname_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setHostname(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        hostname_ = value;
        onChanged();
        return this;
      }
      public Builder clearHostname() {
        bitField0_ = (bitField0_ & ~0x00000002);
        hostname_ = getDefaultInstance().getHostname();
        onChanged();
        return this;
      }
      void setHostname(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        hostname_ = value;
        onChanged();
      }
      
      // required string ipAddr = 3;
      private java.lang.Object ipAddr_ = "";
      public boolean hasIpAddr() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getIpAddr() {
        java.lang.Object ref = ipAddr_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          ipAddr_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setIpAddr(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        ipAddr_ = value;
        onChanged();
        return this;
      }
      public Builder clearIpAddr() {
        bitField0_ = (bitField0_ & ~0x00000004);
        ipAddr_ = getDefaultInstance().getIpAddr();
        onChanged();
        return this;
      }
      void setIpAddr(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        ipAddr_ = value;
        onChanged();
      }
      
      // optional string systemType = 4;
      private java.lang.Object systemType_ = "";
      public boolean hasSystemType() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public String getSystemType() {
        java.lang.Object ref = systemType_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          systemType_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setSystemType(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        systemType_ = value;
        onChanged();
        return this;
      }
      public Builder clearSystemType() {
        bitField0_ = (bitField0_ & ~0x00000008);
        systemType_ = getDefaultInstance().getSystemType();
        onChanged();
        return this;
      }
      void setSystemType(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000008;
        systemType_ = value;
        onChanged();
      }
      
      // optional string osinfo = 5;
      private java.lang.Object osinfo_ = "";
      public boolean hasOsinfo() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public String getOsinfo() {
        java.lang.Object ref = osinfo_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          osinfo_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setOsinfo(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        osinfo_ = value;
        onChanged();
        return this;
      }
      public Builder clearOsinfo() {
        bitField0_ = (bitField0_ & ~0x00000010);
        osinfo_ = getDefaultInstance().getOsinfo();
        onChanged();
        return this;
      }
      void setOsinfo(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000010;
        osinfo_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:com.srikanthps.yamx.proto.SysInfo)
    }
    
    static {
      defaultInstance = new SysInfo(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.srikanthps.yamx.proto.SysInfo)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_srikanthps_yamx_proto_SysInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_srikanthps_yamx_proto_SysInfo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017PATH/yamx.proto\022\031com.srikanthps.yamx.p" +
      "roto\"`\n\007SysInfo\022\017\n\007appName\030\001 \002(\t\022\020\n\010host" +
      "name\030\002 \002(\t\022\016\n\006ipAddr\030\003 \002(\t\022\022\n\nsystemType" +
      "\030\004 \001(\t\022\016\n\006osinfo\030\005 \001(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_srikanthps_yamx_proto_SysInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_srikanthps_yamx_proto_SysInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_srikanthps_yamx_proto_SysInfo_descriptor,
              new java.lang.String[] { "AppName", "Hostname", "IpAddr", "SystemType", "Osinfo", },
              com.srikanthps.yamx.proto.Yamx.SysInfo.class,
              com.srikanthps.yamx.proto.Yamx.SysInfo.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
