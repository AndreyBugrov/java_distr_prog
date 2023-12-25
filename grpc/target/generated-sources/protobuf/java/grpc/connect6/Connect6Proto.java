// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Game.proto

package grpc.connect6;

public final class Connect6Proto {
  private Connect6Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_MoveInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_MoveInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_WinStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_WinStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_PlayerNum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_PlayerNum_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_Board_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_Board_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_TurnNum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_TurnNum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nGame.proto\022\004grpc\032\033google/protobuf/empt" +
      "y.proto\"5\n\tMoveInput\022\022\n\nplayer_num\030\001 \001(\005" +
      "\022\t\n\001x\030\002 \001(\005\022\t\n\001y\030\003 \001(\005\"\033\n\tWinStatus\022\016\n\006s" +
      "tatus\030\001 \001(\010\"\037\n\tPlayerNum\022\022\n\nplayer_num\030\001" +
      " \001(\005\"\026\n\005Board\022\r\n\005board\030\001 \003(\005\"\027\n\007TurnNum\022" +
      "\014\n\004turn\030\001 \001(\0052\204\002\n\010Connect6\022(\n\004move\022\017.grp" +
      "c.MoveInput\032\017.grpc.WinStatus\0220\n\tget_boar" +
      "d\022\026.google.protobuf.Empty\032\013.grpc.Board\022:" +
      "\n\017register_player\022\026.google.protobuf.Empt" +
      "y\032\017.grpc.PlayerNum\022-\n\twin_check\022\017.grpc.P" +
      "layerNum\032\017.grpc.WinStatus\0221\n\010get_turn\022\026." +
      "google.protobuf.Empty\032\r.grpc.TurnNumB \n\r" +
      "grpc.connect6B\rConnect6ProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_grpc_MoveInput_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpc_MoveInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_MoveInput_descriptor,
        new java.lang.String[] { "PlayerNum", "X", "Y", });
    internal_static_grpc_WinStatus_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpc_WinStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_WinStatus_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_grpc_PlayerNum_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_grpc_PlayerNum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_PlayerNum_descriptor,
        new java.lang.String[] { "PlayerNum", });
    internal_static_grpc_Board_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_grpc_Board_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_Board_descriptor,
        new java.lang.String[] { "Board", });
    internal_static_grpc_TurnNum_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_grpc_TurnNum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_TurnNum_descriptor,
        new java.lang.String[] { "Turn", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
