// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Student.proto

package com.thesevensky.proto;

public final class StudentProto {
  private StudentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_thesevensky_protobuf_StudentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_thesevensky_protobuf_StudentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_thesevensky_protobuf_StudentResponseList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_thesevensky_protobuf_StudentResponseList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_thesevensky_protobuf_MyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_thesevensky_protobuf_MyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_thesevensky_protobuf_StudentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_thesevensky_protobuf_StudentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_thesevensky_protobuf_MyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_thesevensky_protobuf_MyResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_thesevensky_protobuf_StreamRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_thesevensky_protobuf_StreamRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_thesevensky_protobuf_StreamResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_thesevensky_protobuf_StreamResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rStudent.proto\022\030com.thesevensky.protobu" +
      "f\":\n\017StudentResponse\022\014\n\004name\030\001 \001(\t\022\013\n\003ag" +
      "e\030\002 \001(\005\022\014\n\004city\030\003 \001(\t\"Y\n\023StudentResponse" +
      "List\022B\n\017studentResponse\030\001 \003(\0132).com.thes" +
      "evensky.protobuf.StudentResponse\"\035\n\tMyRe" +
      "quest\022\020\n\010username\030\001 \001(\t\"\035\n\016StudentReques" +
      "t\022\013\n\003age\030\001 \001(\005\"\036\n\nMyResponse\022\020\n\010realName" +
      "\030\002 \001(\t\"%\n\rStreamRequest\022\024\n\014request_info\030" +
      "\001 \001(\t\"\'\n\016StreamResponse\022\025\n\rresponse_info" +
      "\030\001 \001(\t2\277\003\n\016StudentService\022d\n\025GetRealName" +
      "ByUsername\022#.com.thesevensky.protobuf.My" +
      "Request\032$.com.thesevensky.protobuf.MyRes" +
      "ponse\"\000\022k\n\020GetStudentsByAge\022(.com.thesev" +
      "ensky.protobuf.StudentRequest\032).com.thes" +
      "evensky.protobuf.StudentResponse\"\0000\001\022w\n\030" +
      "GetStudentsWrapperByAges\022(.com.thesevens" +
      "ky.protobuf.StudentRequest\032-.com.theseve" +
      "nsky.protobuf.StudentResponseList\"\000(\001\022a\n" +
      "\006BiTalk\022\'.com.thesevensky.protobuf.Strea" +
      "mRequest\032(.com.thesevensky.protobuf.Stre" +
      "amResponse\"\000(\0010\001B\'\n\025com.thesevensky.prot" +
      "oB\014StudentProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_thesevensky_protobuf_StudentResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_thesevensky_protobuf_StudentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_thesevensky_protobuf_StudentResponse_descriptor,
        new java.lang.String[] { "Name", "Age", "City", });
    internal_static_com_thesevensky_protobuf_StudentResponseList_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_thesevensky_protobuf_StudentResponseList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_thesevensky_protobuf_StudentResponseList_descriptor,
        new java.lang.String[] { "StudentResponse", });
    internal_static_com_thesevensky_protobuf_MyRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_thesevensky_protobuf_MyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_thesevensky_protobuf_MyRequest_descriptor,
        new java.lang.String[] { "Username", });
    internal_static_com_thesevensky_protobuf_StudentRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_thesevensky_protobuf_StudentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_thesevensky_protobuf_StudentRequest_descriptor,
        new java.lang.String[] { "Age", });
    internal_static_com_thesevensky_protobuf_MyResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_thesevensky_protobuf_MyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_thesevensky_protobuf_MyResponse_descriptor,
        new java.lang.String[] { "RealName", });
    internal_static_com_thesevensky_protobuf_StreamRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_thesevensky_protobuf_StreamRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_thesevensky_protobuf_StreamRequest_descriptor,
        new java.lang.String[] { "RequestInfo", });
    internal_static_com_thesevensky_protobuf_StreamResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_thesevensky_protobuf_StreamResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_thesevensky_protobuf_StreamResponse_descriptor,
        new java.lang.String[] { "ResponseInfo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
