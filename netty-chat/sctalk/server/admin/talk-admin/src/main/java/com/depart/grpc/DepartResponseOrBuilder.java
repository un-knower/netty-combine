// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: depart.proto

package com.depart.grpc;

public interface DepartResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.depart.grpc.DepartResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>string departname = 2;</code>
   */
  java.lang.String getDepartname();
  /**
   * <code>string departname = 2;</code>
   */
  com.google.protobuf.ByteString
      getDepartnameBytes();

  /**
   * <code>int32 priority = 3;</code>
   */
  int getPriority();

  /**
   * <code>int32 parentid = 4;</code>
   */
  int getParentid();

  /**
   * <code>int32 status_id = 5;</code>
   */
  int getStatusId();

  /**
   * <code>repeated .com.depart.grpc.Depart depart = 6;</code>
   */
  java.util.List<com.depart.grpc.Depart> 
      getDepartList();
  /**
   * <code>repeated .com.depart.grpc.Depart depart = 6;</code>
   */
  com.depart.grpc.Depart getDepart(int index);
  /**
   * <code>repeated .com.depart.grpc.Depart depart = 6;</code>
   */
  int getDepartCount();
  /**
   * <code>repeated .com.depart.grpc.Depart depart = 6;</code>
   */
  java.util.List<? extends com.depart.grpc.DepartOrBuilder> 
      getDepartOrBuilderList();
  /**
   * <code>repeated .com.depart.grpc.Depart depart = 6;</code>
   */
  com.depart.grpc.DepartOrBuilder getDepartOrBuilder(
      int index);
}
