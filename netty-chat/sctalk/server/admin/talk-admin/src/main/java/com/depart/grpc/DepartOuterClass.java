// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: depart.proto

package com.depart.grpc;

public final class DepartOuterClass {
  private DepartOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_depart_grpc_Depart_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_depart_grpc_Depart_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_depart_grpc_DepartRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_depart_grpc_DepartRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_depart_grpc_DepartResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_depart_grpc_DepartResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014depart.proto\022\017com.depart.grpc\"~\n\006Depar" +
      "t\022\n\n\002id\030\001 \001(\005\022\022\n\ndepartname\030\002 \001(\t\022\020\n\010pri" +
      "ority\030\003 \001(\005\022\020\n\010parentid\030\004 \001(\005\022\016\n\006status\030" +
      "\005 \001(\005\022\017\n\007created\030\006 \001(\005\022\017\n\007updated\030\007 \001(\005\"" +
      "|\n\rDepartRequest\022\n\n\002id\030\001 \001(\005\022\022\n\ndepartna" +
      "me\030\002 \001(\t\022\020\n\010priority\030\003 \001(\005\022\020\n\010parentid\030\004" +
      " \001(\005\022\'\n\006depart\030\005 \003(\0132\027.com.depart.grpc.D" +
      "epart\"\220\001\n\016DepartResponse\022\n\n\002id\030\001 \001(\005\022\022\n\n" +
      "departname\030\002 \001(\t\022\020\n\010priority\030\003 \001(\005\022\020\n\010pa" +
      "rentid\030\004 \001(\005\022\021\n\tstatus_id\030\005 \001(\005\022\'\n\006depar",
      "t\030\006 \003(\0132\027.com.depart.grpc.Depart2\316\002\n\rDep" +
      "artService\022M\n\nlistDepart\022\036.com.depart.gr" +
      "pc.DepartRequest\032\037.com.depart.grpc.Depar" +
      "tResponse\022L\n\taddDepart\022\036.com.depart.grpc" +
      ".DepartRequest\032\037.com.depart.grpc.DepartR" +
      "esponse\022O\n\014removeDepart\022\036.com.depart.grp" +
      "c.DepartRequest\032\037.com.depart.grpc.Depart" +
      "Response\022O\n\014modifyDepart\022\036.com.depart.gr" +
      "pc.DepartRequest\032\037.com.depart.grpc.Depar" +
      "tResponseB\002P\001b\006proto3"
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
    internal_static_com_depart_grpc_Depart_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_depart_grpc_Depart_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_depart_grpc_Depart_descriptor,
        new java.lang.String[] { "Id", "Departname", "Priority", "Parentid", "Status", "Created", "Updated", });
    internal_static_com_depart_grpc_DepartRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_depart_grpc_DepartRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_depart_grpc_DepartRequest_descriptor,
        new java.lang.String[] { "Id", "Departname", "Priority", "Parentid", "Depart", });
    internal_static_com_depart_grpc_DepartResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_depart_grpc_DepartResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_depart_grpc_DepartResponse_descriptor,
        new java.lang.String[] { "Id", "Departname", "Priority", "Parentid", "StatusId", "Depart", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
