// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messages.proto

package cn.atomicer.raft.proto;

/**
 * Protobuf type {@code proto.AppendEntriesRequest}
 */
public  final class AppendEntriesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.AppendEntriesRequest)
    AppendEntriesRequestOrBuilder {
  // Use AppendEntriesRequest.newBuilder() to construct.
  private AppendEntriesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AppendEntriesRequest() {
    leaderId_ = "";
    term_ = 0L;
    prevLogIndex_ = 0L;
    prevLogTerm_ = 0L;
    leaderCommit_ = 0L;
    entries_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AppendEntriesRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            leaderId_ = s;
            break;
          }
          case 16: {

            term_ = input.readInt64();
            break;
          }
          case 24: {

            prevLogIndex_ = input.readInt64();
            break;
          }
          case 32: {

            prevLogTerm_ = input.readInt64();
            break;
          }
          case 40: {

            leaderCommit_ = input.readInt64();
            break;
          }
          case 50: {
            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
              entries_ = new java.util.ArrayList<cn.atomicer.raft.proto.EntryInfo>();
              mutable_bitField0_ |= 0x00000020;
            }
            entries_.add(
                input.readMessage(cn.atomicer.raft.proto.EntryInfo.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
        entries_ = java.util.Collections.unmodifiableList(entries_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cn.atomicer.raft.proto.Messages.internal_static_proto_AppendEntriesRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.atomicer.raft.proto.Messages.internal_static_proto_AppendEntriesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.atomicer.raft.proto.AppendEntriesRequest.class, cn.atomicer.raft.proto.AppendEntriesRequest.Builder.class);
  }

  private int bitField0_;
  public static final int LEADERID_FIELD_NUMBER = 1;
  private volatile java.lang.Object leaderId_;
  /**
   * <code>optional string leaderId = 1;</code>
   */
  public java.lang.String getLeaderId() {
    java.lang.Object ref = leaderId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      leaderId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string leaderId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getLeaderIdBytes() {
    java.lang.Object ref = leaderId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      leaderId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TERM_FIELD_NUMBER = 2;
  private long term_;
  /**
   * <code>optional int64 term = 2;</code>
   */
  public long getTerm() {
    return term_;
  }

  public static final int PREVLOGINDEX_FIELD_NUMBER = 3;
  private long prevLogIndex_;
  /**
   * <code>optional int64 prevLogIndex = 3;</code>
   */
  public long getPrevLogIndex() {
    return prevLogIndex_;
  }

  public static final int PREVLOGTERM_FIELD_NUMBER = 4;
  private long prevLogTerm_;
  /**
   * <code>optional int64 prevLogTerm = 4;</code>
   */
  public long getPrevLogTerm() {
    return prevLogTerm_;
  }

  public static final int LEADERCOMMIT_FIELD_NUMBER = 5;
  private long leaderCommit_;
  /**
   * <code>optional int64 leaderCommit = 5;</code>
   */
  public long getLeaderCommit() {
    return leaderCommit_;
  }

  public static final int ENTRIES_FIELD_NUMBER = 6;
  private java.util.List<cn.atomicer.raft.proto.EntryInfo> entries_;
  /**
   * <code>repeated .proto.EntryInfo entries = 6;</code>
   */
  public java.util.List<cn.atomicer.raft.proto.EntryInfo> getEntriesList() {
    return entries_;
  }
  /**
   * <code>repeated .proto.EntryInfo entries = 6;</code>
   */
  public java.util.List<? extends cn.atomicer.raft.proto.EntryInfoOrBuilder> 
      getEntriesOrBuilderList() {
    return entries_;
  }
  /**
   * <code>repeated .proto.EntryInfo entries = 6;</code>
   */
  public int getEntriesCount() {
    return entries_.size();
  }
  /**
   * <code>repeated .proto.EntryInfo entries = 6;</code>
   */
  public cn.atomicer.raft.proto.EntryInfo getEntries(int index) {
    return entries_.get(index);
  }
  /**
   * <code>repeated .proto.EntryInfo entries = 6;</code>
   */
  public cn.atomicer.raft.proto.EntryInfoOrBuilder getEntriesOrBuilder(
      int index) {
    return entries_.get(index);
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
    if (!getLeaderIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, leaderId_);
    }
    if (term_ != 0L) {
      output.writeInt64(2, term_);
    }
    if (prevLogIndex_ != 0L) {
      output.writeInt64(3, prevLogIndex_);
    }
    if (prevLogTerm_ != 0L) {
      output.writeInt64(4, prevLogTerm_);
    }
    if (leaderCommit_ != 0L) {
      output.writeInt64(5, leaderCommit_);
    }
    for (int i = 0; i < entries_.size(); i++) {
      output.writeMessage(6, entries_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLeaderIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, leaderId_);
    }
    if (term_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, term_);
    }
    if (prevLogIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, prevLogIndex_);
    }
    if (prevLogTerm_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, prevLogTerm_);
    }
    if (leaderCommit_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, leaderCommit_);
    }
    for (int i = 0; i < entries_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, entries_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cn.atomicer.raft.proto.AppendEntriesRequest)) {
      return super.equals(obj);
    }
    cn.atomicer.raft.proto.AppendEntriesRequest other = (cn.atomicer.raft.proto.AppendEntriesRequest) obj;

    boolean result = true;
    result = result && getLeaderId()
        .equals(other.getLeaderId());
    result = result && (getTerm()
        == other.getTerm());
    result = result && (getPrevLogIndex()
        == other.getPrevLogIndex());
    result = result && (getPrevLogTerm()
        == other.getPrevLogTerm());
    result = result && (getLeaderCommit()
        == other.getLeaderCommit());
    result = result && getEntriesList()
        .equals(other.getEntriesList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + LEADERID_FIELD_NUMBER;
    hash = (53 * hash) + getLeaderId().hashCode();
    hash = (37 * hash) + TERM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTerm());
    hash = (37 * hash) + PREVLOGINDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPrevLogIndex());
    hash = (37 * hash) + PREVLOGTERM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPrevLogTerm());
    hash = (37 * hash) + LEADERCOMMIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLeaderCommit());
    if (getEntriesCount() > 0) {
      hash = (37 * hash) + ENTRIES_FIELD_NUMBER;
      hash = (53 * hash) + getEntriesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.atomicer.raft.proto.AppendEntriesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.atomicer.raft.proto.AppendEntriesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.atomicer.raft.proto.AppendEntriesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.atomicer.raft.proto.AppendEntriesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.atomicer.raft.proto.AppendEntriesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.atomicer.raft.proto.AppendEntriesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.atomicer.raft.proto.AppendEntriesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.atomicer.raft.proto.AppendEntriesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.atomicer.raft.proto.AppendEntriesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.atomicer.raft.proto.AppendEntriesRequest parseFrom(
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
  public static Builder newBuilder(cn.atomicer.raft.proto.AppendEntriesRequest prototype) {
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
   * Protobuf type {@code proto.AppendEntriesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.AppendEntriesRequest)
      cn.atomicer.raft.proto.AppendEntriesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.atomicer.raft.proto.Messages.internal_static_proto_AppendEntriesRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.atomicer.raft.proto.Messages.internal_static_proto_AppendEntriesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.atomicer.raft.proto.AppendEntriesRequest.class, cn.atomicer.raft.proto.AppendEntriesRequest.Builder.class);
    }

    // Construct using cn.atomicer.raft.proto.AppendEntriesRequest.newBuilder()
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
        getEntriesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      leaderId_ = "";

      term_ = 0L;

      prevLogIndex_ = 0L;

      prevLogTerm_ = 0L;

      leaderCommit_ = 0L;

      if (entriesBuilder_ == null) {
        entries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000020);
      } else {
        entriesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.atomicer.raft.proto.Messages.internal_static_proto_AppendEntriesRequest_descriptor;
    }

    public cn.atomicer.raft.proto.AppendEntriesRequest getDefaultInstanceForType() {
      return cn.atomicer.raft.proto.AppendEntriesRequest.getDefaultInstance();
    }

    public cn.atomicer.raft.proto.AppendEntriesRequest build() {
      cn.atomicer.raft.proto.AppendEntriesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cn.atomicer.raft.proto.AppendEntriesRequest buildPartial() {
      cn.atomicer.raft.proto.AppendEntriesRequest result = new cn.atomicer.raft.proto.AppendEntriesRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.leaderId_ = leaderId_;
      result.term_ = term_;
      result.prevLogIndex_ = prevLogIndex_;
      result.prevLogTerm_ = prevLogTerm_;
      result.leaderCommit_ = leaderCommit_;
      if (entriesBuilder_ == null) {
        if (((bitField0_ & 0x00000020) == 0x00000020)) {
          entries_ = java.util.Collections.unmodifiableList(entries_);
          bitField0_ = (bitField0_ & ~0x00000020);
        }
        result.entries_ = entries_;
      } else {
        result.entries_ = entriesBuilder_.build();
      }
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
      if (other instanceof cn.atomicer.raft.proto.AppendEntriesRequest) {
        return mergeFrom((cn.atomicer.raft.proto.AppendEntriesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.atomicer.raft.proto.AppendEntriesRequest other) {
      if (other == cn.atomicer.raft.proto.AppendEntriesRequest.getDefaultInstance()) return this;
      if (!other.getLeaderId().isEmpty()) {
        leaderId_ = other.leaderId_;
        onChanged();
      }
      if (other.getTerm() != 0L) {
        setTerm(other.getTerm());
      }
      if (other.getPrevLogIndex() != 0L) {
        setPrevLogIndex(other.getPrevLogIndex());
      }
      if (other.getPrevLogTerm() != 0L) {
        setPrevLogTerm(other.getPrevLogTerm());
      }
      if (other.getLeaderCommit() != 0L) {
        setLeaderCommit(other.getLeaderCommit());
      }
      if (entriesBuilder_ == null) {
        if (!other.entries_.isEmpty()) {
          if (entries_.isEmpty()) {
            entries_ = other.entries_;
            bitField0_ = (bitField0_ & ~0x00000020);
          } else {
            ensureEntriesIsMutable();
            entries_.addAll(other.entries_);
          }
          onChanged();
        }
      } else {
        if (!other.entries_.isEmpty()) {
          if (entriesBuilder_.isEmpty()) {
            entriesBuilder_.dispose();
            entriesBuilder_ = null;
            entries_ = other.entries_;
            bitField0_ = (bitField0_ & ~0x00000020);
            entriesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEntriesFieldBuilder() : null;
          } else {
            entriesBuilder_.addAllMessages(other.entries_);
          }
        }
      }
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
      cn.atomicer.raft.proto.AppendEntriesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.atomicer.raft.proto.AppendEntriesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object leaderId_ = "";
    /**
     * <code>optional string leaderId = 1;</code>
     */
    public java.lang.String getLeaderId() {
      java.lang.Object ref = leaderId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        leaderId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string leaderId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLeaderIdBytes() {
      java.lang.Object ref = leaderId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        leaderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string leaderId = 1;</code>
     */
    public Builder setLeaderId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      leaderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string leaderId = 1;</code>
     */
    public Builder clearLeaderId() {
      
      leaderId_ = getDefaultInstance().getLeaderId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string leaderId = 1;</code>
     */
    public Builder setLeaderIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      leaderId_ = value;
      onChanged();
      return this;
    }

    private long term_ ;
    /**
     * <code>optional int64 term = 2;</code>
     */
    public long getTerm() {
      return term_;
    }
    /**
     * <code>optional int64 term = 2;</code>
     */
    public Builder setTerm(long value) {
      
      term_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 term = 2;</code>
     */
    public Builder clearTerm() {
      
      term_ = 0L;
      onChanged();
      return this;
    }

    private long prevLogIndex_ ;
    /**
     * <code>optional int64 prevLogIndex = 3;</code>
     */
    public long getPrevLogIndex() {
      return prevLogIndex_;
    }
    /**
     * <code>optional int64 prevLogIndex = 3;</code>
     */
    public Builder setPrevLogIndex(long value) {
      
      prevLogIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 prevLogIndex = 3;</code>
     */
    public Builder clearPrevLogIndex() {
      
      prevLogIndex_ = 0L;
      onChanged();
      return this;
    }

    private long prevLogTerm_ ;
    /**
     * <code>optional int64 prevLogTerm = 4;</code>
     */
    public long getPrevLogTerm() {
      return prevLogTerm_;
    }
    /**
     * <code>optional int64 prevLogTerm = 4;</code>
     */
    public Builder setPrevLogTerm(long value) {
      
      prevLogTerm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 prevLogTerm = 4;</code>
     */
    public Builder clearPrevLogTerm() {
      
      prevLogTerm_ = 0L;
      onChanged();
      return this;
    }

    private long leaderCommit_ ;
    /**
     * <code>optional int64 leaderCommit = 5;</code>
     */
    public long getLeaderCommit() {
      return leaderCommit_;
    }
    /**
     * <code>optional int64 leaderCommit = 5;</code>
     */
    public Builder setLeaderCommit(long value) {
      
      leaderCommit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 leaderCommit = 5;</code>
     */
    public Builder clearLeaderCommit() {
      
      leaderCommit_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<cn.atomicer.raft.proto.EntryInfo> entries_ =
      java.util.Collections.emptyList();
    private void ensureEntriesIsMutable() {
      if (!((bitField0_ & 0x00000020) == 0x00000020)) {
        entries_ = new java.util.ArrayList<cn.atomicer.raft.proto.EntryInfo>(entries_);
        bitField0_ |= 0x00000020;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        cn.atomicer.raft.proto.EntryInfo, cn.atomicer.raft.proto.EntryInfo.Builder, cn.atomicer.raft.proto.EntryInfoOrBuilder> entriesBuilder_;

    /**
     * <code>repeated .proto.EntryInfo entries = 6;</code>
     */
    public java.util.List<cn.atomicer.raft.proto.EntryInfo> getEntriesList() {
      if (entriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(entries_);
      } else {
        return entriesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.EntryInfo entries = 6;</code>
     */
    public int getEntriesCount() {
      if (entriesBuilder_ == null) {
        return entries_.size();
      } else {
        return entriesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.EntryInfo entries = 6;</code>
     */
    public cn.atomicer.raft.proto.EntryInfo getEntries(int index) {
      if (entriesBuilder_ == null) {
        return entries_.get(index);
      } else {
        return entriesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.EntryInfo entries = 6;</code>
     */
    public Builder setEntries(
        int index, cn.atomicer.raft.proto.EntryInfo value) {
      if (entriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntriesIsMutable();
        entries_.set(index, value);
        onChanged();
      } else {
        entriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.EntryInfo entries = 6;</code>
     */
    public Builder setEntries(
        int index, cn.atomicer.raft.proto.EntryInfo.Builder builderForValue) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        entries_.set(index, builderForValue.build());
        onChanged();
      } else {
        entriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.EntryInfo entries = 6;</code>
     */
    public Builder addEntries(cn.atomicer.raft.proto.EntryInfo value) {
      if (entriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntriesIsMutable();
        entries_.add(value);
        onChanged();
      } else {
        entriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.EntryInfo entries = 6;</code>
     */
    public Builder addEntries(
        int index, cn.atomicer.raft.proto.EntryInfo value) {
      if (entriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntriesIsMutable();
        entries_.add(index, value);
        onChanged();
      } else {
        entriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.EntryInfo entries = 6;</code>
     */
    public Builder addEntries(
        cn.atomicer.raft.proto.EntryInfo.Builder builderForValue) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        entries_.add(builderForValue.build());
        onChanged();
      } else {
        entriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.EntryInfo entries = 6;</code>
     */
    public Builder addEntries(
        int index, cn.atomicer.raft.proto.EntryInfo.Builder builderForValue) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        entries_.add(index, builderForValue.build());
        onChanged();
      } else {
        entriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.EntryInfo entries = 6;</code>
     */
    public Builder addAllEntries(
        java.lang.Iterable<? extends cn.atomicer.raft.proto.EntryInfo> values) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, entries_);
        onChanged();
      } else {
        entriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.EntryInfo entries = 6;</code>
     */
    public Builder clearEntries() {
      if (entriesBuilder_ == null) {
        entries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000020);
        onChanged();
      } else {
        entriesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.EntryInfo entries = 6;</code>
     */
    public Builder removeEntries(int index) {
      if (entriesBuilder_ == null) {
        ensureEntriesIsMutable();
        entries_.remove(index);
        onChanged();
      } else {
        entriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.EntryInfo entries = 6;</code>
     */
    public cn.atomicer.raft.proto.EntryInfo.Builder getEntriesBuilder(
        int index) {
      return getEntriesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.EntryInfo entries = 6;</code>
     */
    public cn.atomicer.raft.proto.EntryInfoOrBuilder getEntriesOrBuilder(
        int index) {
      if (entriesBuilder_ == null) {
        return entries_.get(index);  } else {
        return entriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.EntryInfo entries = 6;</code>
     */
    public java.util.List<? extends cn.atomicer.raft.proto.EntryInfoOrBuilder> 
         getEntriesOrBuilderList() {
      if (entriesBuilder_ != null) {
        return entriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(entries_);
      }
    }
    /**
     * <code>repeated .proto.EntryInfo entries = 6;</code>
     */
    public cn.atomicer.raft.proto.EntryInfo.Builder addEntriesBuilder() {
      return getEntriesFieldBuilder().addBuilder(
          cn.atomicer.raft.proto.EntryInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.EntryInfo entries = 6;</code>
     */
    public cn.atomicer.raft.proto.EntryInfo.Builder addEntriesBuilder(
        int index) {
      return getEntriesFieldBuilder().addBuilder(
          index, cn.atomicer.raft.proto.EntryInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.EntryInfo entries = 6;</code>
     */
    public java.util.List<cn.atomicer.raft.proto.EntryInfo.Builder> 
         getEntriesBuilderList() {
      return getEntriesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        cn.atomicer.raft.proto.EntryInfo, cn.atomicer.raft.proto.EntryInfo.Builder, cn.atomicer.raft.proto.EntryInfoOrBuilder> 
        getEntriesFieldBuilder() {
      if (entriesBuilder_ == null) {
        entriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            cn.atomicer.raft.proto.EntryInfo, cn.atomicer.raft.proto.EntryInfo.Builder, cn.atomicer.raft.proto.EntryInfoOrBuilder>(
                entries_,
                ((bitField0_ & 0x00000020) == 0x00000020),
                getParentForChildren(),
                isClean());
        entries_ = null;
      }
      return entriesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:proto.AppendEntriesRequest)
  }

  // @@protoc_insertion_point(class_scope:proto.AppendEntriesRequest)
  private static final cn.atomicer.raft.proto.AppendEntriesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.atomicer.raft.proto.AppendEntriesRequest();
  }

  public static cn.atomicer.raft.proto.AppendEntriesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AppendEntriesRequest>
      PARSER = new com.google.protobuf.AbstractParser<AppendEntriesRequest>() {
    public AppendEntriesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AppendEntriesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AppendEntriesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AppendEntriesRequest> getParserForType() {
    return PARSER;
  }

  public cn.atomicer.raft.proto.AppendEntriesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

