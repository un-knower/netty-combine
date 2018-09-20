// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: role_power.proto

package com.role_power.grpc;

public final class RolePower {
  private RolePower() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_role_power_grpc_RP_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_role_power_grpc_RP_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_role_power_grpc_RPRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_role_power_grpc_RPRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_role_power_grpc_RPResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_role_power_grpc_RPResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020role_power.proto\022\023com.role_power.grpc\"" +
      "3\n\002RP\022\n\n\002id\030\004 \001(\005\022\017\n\007role_id\030\001 \001(\005\022\020\n\010po" +
      "wer_id\030\002 \001(\005\"_\n\tRPRequest\022\n\n\002id\030\004 \001(\005\022\017\n" +
      "\007role_id\030\001 \001(\005\022\020\n\010power_id\030\002 \001(\005\022#\n\002rp\030\005" +
      " \003(\0132\027.com.role_power.grpc.RP\"s\n\nRPRespo" +
      "nse\022\n\n\002id\030\004 \001(\005\022\017\n\007role_id\030\001 \001(\005\022\020\n\010powe" +
      "r_id\030\002 \001(\005\022#\n\002rp\030\005 \003(\0132\027.com.role_power." +
      "grpc.RP\022\021\n\tstatus_id\030\006 \001(\0052\272\002\n\tRPService" +
      "\022I\n\006listRP\022\036.com.role_power.grpc.RPReque" +
      "st\032\037.com.role_power.grpc.RPResponse\022H\n\005a",
      "ddRP\022\036.com.role_power.grpc.RPRequest\032\037.c" +
      "om.role_power.grpc.RPResponse\022K\n\010removeR" +
      "P\022\036.com.role_power.grpc.RPRequest\032\037.com." +
      "role_power.grpc.RPResponse\022K\n\010modifyRP\022\036" +
      ".com.role_power.grpc.RPRequest\032\037.com.rol" +
      "e_power.grpc.RPResponseB\002P\001b\006proto3"
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
    internal_static_com_role_power_grpc_RP_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_role_power_grpc_RP_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_role_power_grpc_RP_descriptor,
        new java.lang.String[] { "Id", "RoleId", "PowerId", });
    internal_static_com_role_power_grpc_RPRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_role_power_grpc_RPRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_role_power_grpc_RPRequest_descriptor,
        new java.lang.String[] { "Id", "RoleId", "PowerId", "Rp", });
    internal_static_com_role_power_grpc_RPResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_role_power_grpc_RPResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_role_power_grpc_RPResponse_descriptor,
        new java.lang.String[] { "Id", "RoleId", "PowerId", "Rp", "StatusId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
