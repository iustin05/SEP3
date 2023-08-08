package com.sep3group1.middleware.Backend.Grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * User service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: BackendServices.proto")
public final class UserGrpcServiceGrpc {

  private UserGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "backend.grpc.UserGrpcService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.sep3group1.middleware.Backend.Grpc.BackendServices.User,
      com.sep3group1.middleware.Backend.Grpc.BackendServices.User> METHOD_ADD_USER =
      io.grpc.MethodDescriptor.<com.sep3group1.middleware.Backend.Grpc.BackendServices.User, com.sep3group1.middleware.Backend.Grpc.BackendServices.User>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "backend.grpc.UserGrpcService", "AddUser"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.User.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.User.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty,
      com.sep3group1.middleware.Backend.Grpc.BackendServices.Users> METHOD_GET_ALL_USERS =
      io.grpc.MethodDescriptor.<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty, com.sep3group1.middleware.Backend.Grpc.BackendServices.Users>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "backend.grpc.UserGrpcService", "GetAllUsers"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.Users.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest,
      com.sep3group1.middleware.Backend.Grpc.BackendServices.User> METHOD_GET_USER_BY_ID =
      io.grpc.MethodDescriptor.<com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest, com.sep3group1.middleware.Backend.Grpc.BackendServices.User>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "backend.grpc.UserGrpcService", "GetUserById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.User.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.sep3group1.middleware.Backend.Grpc.BackendServices.User,
      com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> METHOD_UPDATE_USER =
      io.grpc.MethodDescriptor.<com.sep3group1.middleware.Backend.Grpc.BackendServices.User, com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "backend.grpc.UserGrpcService", "UpdateUser"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.User.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest,
      com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> METHOD_DELETE_USER =
      io.grpc.MethodDescriptor.<com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest, com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "backend.grpc.UserGrpcService", "DeleteUser"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new UserGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserGrpcServiceFutureStub(channel);
  }

  /**
   * <pre>
   * User service
   * </pre>
   */
  public static abstract class UserGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addUser(com.sep3group1.middleware.Backend.Grpc.BackendServices.User request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.User> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_USER, responseObserver);
    }

    /**
     */
    public void getAllUsers(com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Users> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_USERS, responseObserver);
    }

    /**
     */
    public void getUserById(com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.User> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_USER_BY_ID, responseObserver);
    }

    /**
     */
    public void updateUser(com.sep3group1.middleware.Backend.Grpc.BackendServices.User request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_USER, responseObserver);
    }

    /**
     */
    public void deleteUser(com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_USER, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ADD_USER,
            asyncUnaryCall(
              new MethodHandlers<
                com.sep3group1.middleware.Backend.Grpc.BackendServices.User,
                com.sep3group1.middleware.Backend.Grpc.BackendServices.User>(
                  this, METHODID_ADD_USER)))
          .addMethod(
            METHOD_GET_ALL_USERS,
            asyncUnaryCall(
              new MethodHandlers<
                com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty,
                com.sep3group1.middleware.Backend.Grpc.BackendServices.Users>(
                  this, METHODID_GET_ALL_USERS)))
          .addMethod(
            METHOD_GET_USER_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest,
                com.sep3group1.middleware.Backend.Grpc.BackendServices.User>(
                  this, METHODID_GET_USER_BY_ID)))
          .addMethod(
            METHOD_UPDATE_USER,
            asyncUnaryCall(
              new MethodHandlers<
                com.sep3group1.middleware.Backend.Grpc.BackendServices.User,
                com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            METHOD_DELETE_USER,
            asyncUnaryCall(
              new MethodHandlers<
                com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest,
                com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty>(
                  this, METHODID_DELETE_USER)))
          .build();
    }
  }

  /**
   * <pre>
   * User service
   * </pre>
   */
  public static final class UserGrpcServiceStub extends io.grpc.stub.AbstractStub<UserGrpcServiceStub> {
    private UserGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void addUser(com.sep3group1.middleware.Backend.Grpc.BackendServices.User request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.User> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_USER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllUsers(com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Users> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_USERS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserById(com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.User> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USER_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(com.sep3group1.middleware.Backend.Grpc.BackendServices.User request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_USER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_USER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * User service
   * </pre>
   */
  public static final class UserGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<UserGrpcServiceBlockingStub> {
    private UserGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sep3group1.middleware.Backend.Grpc.BackendServices.User addUser(com.sep3group1.middleware.Backend.Grpc.BackendServices.User request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_USER, getCallOptions(), request);
    }

    /**
     */
    public com.sep3group1.middleware.Backend.Grpc.BackendServices.Users getAllUsers(com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_USERS, getCallOptions(), request);
    }

    /**
     */
    public com.sep3group1.middleware.Backend.Grpc.BackendServices.User getUserById(com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USER_BY_ID, getCallOptions(), request);
    }

    /**
     */
    public com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty updateUser(com.sep3group1.middleware.Backend.Grpc.BackendServices.User request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_USER, getCallOptions(), request);
    }

    /**
     */
    public com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty deleteUser(com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_USER, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * User service
   * </pre>
   */
  public static final class UserGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<UserGrpcServiceFutureStub> {
    private UserGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep3group1.middleware.Backend.Grpc.BackendServices.User> addUser(
        com.sep3group1.middleware.Backend.Grpc.BackendServices.User request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_USER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep3group1.middleware.Backend.Grpc.BackendServices.Users> getAllUsers(
        com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_USERS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep3group1.middleware.Backend.Grpc.BackendServices.User> getUserById(
        com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USER_BY_ID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> updateUser(
        com.sep3group1.middleware.Backend.Grpc.BackendServices.User request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_USER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> deleteUser(
        com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_USER, getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_USER = 0;
  private static final int METHODID_GET_ALL_USERS = 1;
  private static final int METHODID_GET_USER_BY_ID = 2;
  private static final int METHODID_UPDATE_USER = 3;
  private static final int METHODID_DELETE_USER = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_USER:
          serviceImpl.addUser((com.sep3group1.middleware.Backend.Grpc.BackendServices.User) request,
              (io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.User>) responseObserver);
          break;
        case METHODID_GET_ALL_USERS:
          serviceImpl.getAllUsers((com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty) request,
              (io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Users>) responseObserver);
          break;
        case METHODID_GET_USER_BY_ID:
          serviceImpl.getUserById((com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest) request,
              (io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.User>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.sep3group1.middleware.Backend.Grpc.BackendServices.User) request,
              (io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest) request,
              (io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty>) responseObserver);
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

  private static final class UserGrpcServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sep3group1.middleware.Backend.Grpc.BackendServices.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserGrpcServiceDescriptorSupplier())
              .addMethod(METHOD_ADD_USER)
              .addMethod(METHOD_GET_ALL_USERS)
              .addMethod(METHOD_GET_USER_BY_ID)
              .addMethod(METHOD_UPDATE_USER)
              .addMethod(METHOD_DELETE_USER)
              .build();
        }
      }
    }
    return result;
  }
}
