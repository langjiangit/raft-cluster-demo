// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messages.proto

package cn.atomicer.raft.proto;

public interface ResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.Response)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .proto.MessageType type = 1;</code>
   */
  int getTypeValue();
  /**
   * <code>optional .proto.MessageType type = 1;</code>
   */
  cn.atomicer.raft.proto.MessageType getType();

  /**
   * <code>optional int64 term = 2;</code>
   */
  long getTerm();

  /**
   * <code>optional bytes data = 3;</code>
   */
  com.google.protobuf.ByteString getData();
}