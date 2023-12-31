// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Game.proto

package grpc.connect6;

/**
 * Protobuf type {@code grpc.Board}
 */
public final class Board extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.Board)
    BoardOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Board.newBuilder() to construct.
  private Board(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Board() {
    board_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Board();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.connect6.Connect6Proto.internal_static_grpc_Board_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.connect6.Connect6Proto.internal_static_grpc_Board_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.connect6.Board.class, grpc.connect6.Board.Builder.class);
  }

  public static final int BOARD_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList board_ =
      emptyIntList();
  /**
   * <code>repeated int32 board = 1;</code>
   * @return A list containing the board.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getBoardList() {
    return board_;
  }
  /**
   * <code>repeated int32 board = 1;</code>
   * @return The count of board.
   */
  public int getBoardCount() {
    return board_.size();
  }
  /**
   * <code>repeated int32 board = 1;</code>
   * @param index The index of the element to return.
   * @return The board at the given index.
   */
  public int getBoard(int index) {
    return board_.getInt(index);
  }
  private int boardMemoizedSerializedSize = -1;

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (getBoardList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(boardMemoizedSerializedSize);
    }
    for (int i = 0; i < board_.size(); i++) {
      output.writeInt32NoTag(board_.getInt(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < board_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(board_.getInt(i));
      }
      size += dataSize;
      if (!getBoardList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      boardMemoizedSerializedSize = dataSize;
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof grpc.connect6.Board)) {
      return super.equals(obj);
    }
    grpc.connect6.Board other = (grpc.connect6.Board) obj;

    if (!getBoardList()
        .equals(other.getBoardList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getBoardCount() > 0) {
      hash = (37 * hash) + BOARD_FIELD_NUMBER;
      hash = (53 * hash) + getBoardList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.connect6.Board parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.connect6.Board parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.connect6.Board parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.connect6.Board parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.connect6.Board parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.connect6.Board parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.connect6.Board parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.connect6.Board parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static grpc.connect6.Board parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static grpc.connect6.Board parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.connect6.Board parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.connect6.Board parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(grpc.connect6.Board prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code grpc.Board}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.Board)
      grpc.connect6.BoardOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.connect6.Connect6Proto.internal_static_grpc_Board_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.connect6.Connect6Proto.internal_static_grpc_Board_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.connect6.Board.class, grpc.connect6.Board.Builder.class);
    }

    // Construct using grpc.connect6.Board.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      board_ = emptyIntList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.connect6.Connect6Proto.internal_static_grpc_Board_descriptor;
    }

    @java.lang.Override
    public grpc.connect6.Board getDefaultInstanceForType() {
      return grpc.connect6.Board.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.connect6.Board build() {
      grpc.connect6.Board result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.connect6.Board buildPartial() {
      grpc.connect6.Board result = new grpc.connect6.Board(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(grpc.connect6.Board result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        board_.makeImmutable();
        result.board_ = board_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.connect6.Board) {
        return mergeFrom((grpc.connect6.Board)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.connect6.Board other) {
      if (other == grpc.connect6.Board.getDefaultInstance()) return this;
      if (!other.board_.isEmpty()) {
        if (board_.isEmpty()) {
          board_ = other.board_;
          board_.makeImmutable();
          bitField0_ |= 0x00000001;
        } else {
          ensureBoardIsMutable();
          board_.addAll(other.board_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int v = input.readInt32();
              ensureBoardIsMutable();
              board_.addInt(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureBoardIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                board_.addInt(input.readInt32());
              }
              input.popLimit(limit);
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList board_ = emptyIntList();
    private void ensureBoardIsMutable() {
      if (!board_.isModifiable()) {
        board_ = makeMutableCopy(board_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated int32 board = 1;</code>
     * @return A list containing the board.
     */
    public java.util.List<java.lang.Integer>
        getBoardList() {
      board_.makeImmutable();
      return board_;
    }
    /**
     * <code>repeated int32 board = 1;</code>
     * @return The count of board.
     */
    public int getBoardCount() {
      return board_.size();
    }
    /**
     * <code>repeated int32 board = 1;</code>
     * @param index The index of the element to return.
     * @return The board at the given index.
     */
    public int getBoard(int index) {
      return board_.getInt(index);
    }
    /**
     * <code>repeated int32 board = 1;</code>
     * @param index The index to set the value at.
     * @param value The board to set.
     * @return This builder for chaining.
     */
    public Builder setBoard(
        int index, int value) {

      ensureBoardIsMutable();
      board_.setInt(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 board = 1;</code>
     * @param value The board to add.
     * @return This builder for chaining.
     */
    public Builder addBoard(int value) {

      ensureBoardIsMutable();
      board_.addInt(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 board = 1;</code>
     * @param values The board to add.
     * @return This builder for chaining.
     */
    public Builder addAllBoard(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureBoardIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, board_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 board = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBoard() {
      board_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc.Board)
  }

  // @@protoc_insertion_point(class_scope:grpc.Board)
  private static final grpc.connect6.Board DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.connect6.Board();
  }

  public static grpc.connect6.Board getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Board>
      PARSER = new com.google.protobuf.AbstractParser<Board>() {
    @java.lang.Override
    public Board parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Board> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Board> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.connect6.Board getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

