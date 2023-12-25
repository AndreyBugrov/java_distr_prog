package grpc.connect6;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: Game.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class Connect6Grpc {

  private Connect6Grpc() {}

  public static final java.lang.String SERVICE_NAME = "grpc.Connect6";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.connect6.MoveInput,
      grpc.connect6.WinStatus> getMoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "move",
      requestType = grpc.connect6.MoveInput.class,
      responseType = grpc.connect6.WinStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.connect6.MoveInput,
      grpc.connect6.WinStatus> getMoveMethod() {
    io.grpc.MethodDescriptor<grpc.connect6.MoveInput, grpc.connect6.WinStatus> getMoveMethod;
    if ((getMoveMethod = Connect6Grpc.getMoveMethod) == null) {
      synchronized (Connect6Grpc.class) {
        if ((getMoveMethod = Connect6Grpc.getMoveMethod) == null) {
          Connect6Grpc.getMoveMethod = getMoveMethod =
              io.grpc.MethodDescriptor.<grpc.connect6.MoveInput, grpc.connect6.WinStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "move"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.connect6.MoveInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.connect6.WinStatus.getDefaultInstance()))
              .setSchemaDescriptor(new Connect6MethodDescriptorSupplier("move"))
              .build();
        }
      }
    }
    return getMoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      grpc.connect6.Board> getGetBoardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get_board",
      requestType = com.google.protobuf.Empty.class,
      responseType = grpc.connect6.Board.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      grpc.connect6.Board> getGetBoardMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, grpc.connect6.Board> getGetBoardMethod;
    if ((getGetBoardMethod = Connect6Grpc.getGetBoardMethod) == null) {
      synchronized (Connect6Grpc.class) {
        if ((getGetBoardMethod = Connect6Grpc.getGetBoardMethod) == null) {
          Connect6Grpc.getGetBoardMethod = getGetBoardMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, grpc.connect6.Board>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get_board"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.connect6.Board.getDefaultInstance()))
              .setSchemaDescriptor(new Connect6MethodDescriptorSupplier("get_board"))
              .build();
        }
      }
    }
    return getGetBoardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      grpc.connect6.PlayerNum> getRegisterPlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "register_player",
      requestType = com.google.protobuf.Empty.class,
      responseType = grpc.connect6.PlayerNum.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      grpc.connect6.PlayerNum> getRegisterPlayerMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, grpc.connect6.PlayerNum> getRegisterPlayerMethod;
    if ((getRegisterPlayerMethod = Connect6Grpc.getRegisterPlayerMethod) == null) {
      synchronized (Connect6Grpc.class) {
        if ((getRegisterPlayerMethod = Connect6Grpc.getRegisterPlayerMethod) == null) {
          Connect6Grpc.getRegisterPlayerMethod = getRegisterPlayerMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, grpc.connect6.PlayerNum>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "register_player"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.connect6.PlayerNum.getDefaultInstance()))
              .setSchemaDescriptor(new Connect6MethodDescriptorSupplier("register_player"))
              .build();
        }
      }
    }
    return getRegisterPlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.connect6.PlayerNum,
      grpc.connect6.WinStatus> getWinCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "win_check",
      requestType = grpc.connect6.PlayerNum.class,
      responseType = grpc.connect6.WinStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.connect6.PlayerNum,
      grpc.connect6.WinStatus> getWinCheckMethod() {
    io.grpc.MethodDescriptor<grpc.connect6.PlayerNum, grpc.connect6.WinStatus> getWinCheckMethod;
    if ((getWinCheckMethod = Connect6Grpc.getWinCheckMethod) == null) {
      synchronized (Connect6Grpc.class) {
        if ((getWinCheckMethod = Connect6Grpc.getWinCheckMethod) == null) {
          Connect6Grpc.getWinCheckMethod = getWinCheckMethod =
              io.grpc.MethodDescriptor.<grpc.connect6.PlayerNum, grpc.connect6.WinStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "win_check"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.connect6.PlayerNum.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.connect6.WinStatus.getDefaultInstance()))
              .setSchemaDescriptor(new Connect6MethodDescriptorSupplier("win_check"))
              .build();
        }
      }
    }
    return getWinCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      grpc.connect6.TurnNum> getGetTurnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get_turn",
      requestType = com.google.protobuf.Empty.class,
      responseType = grpc.connect6.TurnNum.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      grpc.connect6.TurnNum> getGetTurnMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, grpc.connect6.TurnNum> getGetTurnMethod;
    if ((getGetTurnMethod = Connect6Grpc.getGetTurnMethod) == null) {
      synchronized (Connect6Grpc.class) {
        if ((getGetTurnMethod = Connect6Grpc.getGetTurnMethod) == null) {
          Connect6Grpc.getGetTurnMethod = getGetTurnMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, grpc.connect6.TurnNum>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get_turn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.connect6.TurnNum.getDefaultInstance()))
              .setSchemaDescriptor(new Connect6MethodDescriptorSupplier("get_turn"))
              .build();
        }
      }
    }
    return getGetTurnMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Connect6Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Connect6Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Connect6Stub>() {
        @java.lang.Override
        public Connect6Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Connect6Stub(channel, callOptions);
        }
      };
    return Connect6Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Connect6BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Connect6BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Connect6BlockingStub>() {
        @java.lang.Override
        public Connect6BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Connect6BlockingStub(channel, callOptions);
        }
      };
    return Connect6BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Connect6FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<Connect6FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<Connect6FutureStub>() {
        @java.lang.Override
        public Connect6FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new Connect6FutureStub(channel, callOptions);
        }
      };
    return Connect6FutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Метод получает и возвращает сообщение. Каждое из них должно быть описано
     * </pre>
     */
    default void move(grpc.connect6.MoveInput request,
        io.grpc.stub.StreamObserver<grpc.connect6.WinStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveMethod(), responseObserver);
    }

    /**
     */
    default void getBoard(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<grpc.connect6.Board> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBoardMethod(), responseObserver);
    }

    /**
     */
    default void registerPlayer(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<grpc.connect6.PlayerNum> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterPlayerMethod(), responseObserver);
    }

    /**
     */
    default void winCheck(grpc.connect6.PlayerNum request,
        io.grpc.stub.StreamObserver<grpc.connect6.WinStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWinCheckMethod(), responseObserver);
    }

    /**
     */
    default void getTurn(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<grpc.connect6.TurnNum> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTurnMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Connect6.
   */
  public static abstract class Connect6ImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return Connect6Grpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Connect6.
   */
  public static final class Connect6Stub
      extends io.grpc.stub.AbstractAsyncStub<Connect6Stub> {
    private Connect6Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Connect6Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Connect6Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Метод получает и возвращает сообщение. Каждое из них должно быть описано
     * </pre>
     */
    public void move(grpc.connect6.MoveInput request,
        io.grpc.stub.StreamObserver<grpc.connect6.WinStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBoard(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<grpc.connect6.Board> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBoardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerPlayer(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<grpc.connect6.PlayerNum> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterPlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void winCheck(grpc.connect6.PlayerNum request,
        io.grpc.stub.StreamObserver<grpc.connect6.WinStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWinCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTurn(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<grpc.connect6.TurnNum> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTurnMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Connect6.
   */
  public static final class Connect6BlockingStub
      extends io.grpc.stub.AbstractBlockingStub<Connect6BlockingStub> {
    private Connect6BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Connect6BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Connect6BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Метод получает и возвращает сообщение. Каждое из них должно быть описано
     * </pre>
     */
    public grpc.connect6.WinStatus move(grpc.connect6.MoveInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.connect6.Board getBoard(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBoardMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.connect6.PlayerNum registerPlayer(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterPlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.connect6.WinStatus winCheck(grpc.connect6.PlayerNum request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWinCheckMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.connect6.TurnNum getTurn(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTurnMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Connect6.
   */
  public static final class Connect6FutureStub
      extends io.grpc.stub.AbstractFutureStub<Connect6FutureStub> {
    private Connect6FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Connect6FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new Connect6FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Метод получает и возвращает сообщение. Каждое из них должно быть описано
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.connect6.WinStatus> move(
        grpc.connect6.MoveInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.connect6.Board> getBoard(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBoardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.connect6.PlayerNum> registerPlayer(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterPlayerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.connect6.WinStatus> winCheck(
        grpc.connect6.PlayerNum request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWinCheckMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.connect6.TurnNum> getTurn(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTurnMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MOVE = 0;
  private static final int METHODID_GET_BOARD = 1;
  private static final int METHODID_REGISTER_PLAYER = 2;
  private static final int METHODID_WIN_CHECK = 3;
  private static final int METHODID_GET_TURN = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MOVE:
          serviceImpl.move((grpc.connect6.MoveInput) request,
              (io.grpc.stub.StreamObserver<grpc.connect6.WinStatus>) responseObserver);
          break;
        case METHODID_GET_BOARD:
          serviceImpl.getBoard((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<grpc.connect6.Board>) responseObserver);
          break;
        case METHODID_REGISTER_PLAYER:
          serviceImpl.registerPlayer((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<grpc.connect6.PlayerNum>) responseObserver);
          break;
        case METHODID_WIN_CHECK:
          serviceImpl.winCheck((grpc.connect6.PlayerNum) request,
              (io.grpc.stub.StreamObserver<grpc.connect6.WinStatus>) responseObserver);
          break;
        case METHODID_GET_TURN:
          serviceImpl.getTurn((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<grpc.connect6.TurnNum>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getMoveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.connect6.MoveInput,
              grpc.connect6.WinStatus>(
                service, METHODID_MOVE)))
        .addMethod(
          getGetBoardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              grpc.connect6.Board>(
                service, METHODID_GET_BOARD)))
        .addMethod(
          getRegisterPlayerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              grpc.connect6.PlayerNum>(
                service, METHODID_REGISTER_PLAYER)))
        .addMethod(
          getWinCheckMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              grpc.connect6.PlayerNum,
              grpc.connect6.WinStatus>(
                service, METHODID_WIN_CHECK)))
        .addMethod(
          getGetTurnMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              grpc.connect6.TurnNum>(
                service, METHODID_GET_TURN)))
        .build();
  }

  private static abstract class Connect6BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Connect6BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.connect6.Connect6Proto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Connect6");
    }
  }

  private static final class Connect6FileDescriptorSupplier
      extends Connect6BaseDescriptorSupplier {
    Connect6FileDescriptorSupplier() {}
  }

  private static final class Connect6MethodDescriptorSupplier
      extends Connect6BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    Connect6MethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (Connect6Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Connect6FileDescriptorSupplier())
              .addMethod(getMoveMethod())
              .addMethod(getGetBoardMethod())
              .addMethod(getRegisterPlayerMethod())
              .addMethod(getWinCheckMethod())
              .addMethod(getGetTurnMethod())
              .build();
        }
      }
    }
    return result;
  }
}
