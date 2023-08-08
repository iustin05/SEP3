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
 * Car service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: BackendServices.proto")
public final class CarGrpcServiceGrpc {

  private CarGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "backend.grpc.CarGrpcService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.sep3group1.middleware.Backend.Grpc.BackendServices.Car,
      com.sep3group1.middleware.Backend.Grpc.BackendServices.Car> METHOD_ADD_CAR =
      io.grpc.MethodDescriptor.<com.sep3group1.middleware.Backend.Grpc.BackendServices.Car, com.sep3group1.middleware.Backend.Grpc.BackendServices.Car>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "backend.grpc.CarGrpcService", "AddCar"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.Car.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.Car.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty,
      com.sep3group1.middleware.Backend.Grpc.BackendServices.Cars> METHOD_GET_ALL_CARS =
      io.grpc.MethodDescriptor.<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty, com.sep3group1.middleware.Backend.Grpc.BackendServices.Cars>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "backend.grpc.CarGrpcService", "GetAllCars"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.Cars.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest,
      com.sep3group1.middleware.Backend.Grpc.BackendServices.Car> METHOD_GET_CAR_BY_ID =
      io.grpc.MethodDescriptor.<com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest, com.sep3group1.middleware.Backend.Grpc.BackendServices.Car>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "backend.grpc.CarGrpcService", "GetCarById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.Car.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.sep3group1.middleware.Backend.Grpc.BackendServices.Car,
      com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> METHOD_UPDATE_CAR =
      io.grpc.MethodDescriptor.<com.sep3group1.middleware.Backend.Grpc.BackendServices.Car, com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "backend.grpc.CarGrpcService", "UpdateCar"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.Car.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest,
      com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> METHOD_DELETE_CAR =
      io.grpc.MethodDescriptor.<com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest, com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "backend.grpc.CarGrpcService", "DeleteCar"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CarGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new CarGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CarGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CarGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CarGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CarGrpcServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Car service
   * </pre>
   */
  public static abstract class CarGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addCar(com.sep3group1.middleware.Backend.Grpc.BackendServices.Car request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Car> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_CAR, responseObserver);
    }

    /**
     */
    public void getAllCars(com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Cars> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_CARS, responseObserver);
    }

    /**
     */
    public void getCarById(com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Car> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CAR_BY_ID, responseObserver);
    }

    /**
     */
    public void updateCar(com.sep3group1.middleware.Backend.Grpc.BackendServices.Car request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_CAR, responseObserver);
    }

    /**
     */
    public void deleteCar(com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_CAR, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ADD_CAR,
            asyncUnaryCall(
              new MethodHandlers<
                com.sep3group1.middleware.Backend.Grpc.BackendServices.Car,
                com.sep3group1.middleware.Backend.Grpc.BackendServices.Car>(
                  this, METHODID_ADD_CAR)))
          .addMethod(
            METHOD_GET_ALL_CARS,
            asyncUnaryCall(
              new MethodHandlers<
                com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty,
                com.sep3group1.middleware.Backend.Grpc.BackendServices.Cars>(
                  this, METHODID_GET_ALL_CARS)))
          .addMethod(
            METHOD_GET_CAR_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest,
                com.sep3group1.middleware.Backend.Grpc.BackendServices.Car>(
                  this, METHODID_GET_CAR_BY_ID)))
          .addMethod(
            METHOD_UPDATE_CAR,
            asyncUnaryCall(
              new MethodHandlers<
                com.sep3group1.middleware.Backend.Grpc.BackendServices.Car,
                com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty>(
                  this, METHODID_UPDATE_CAR)))
          .addMethod(
            METHOD_DELETE_CAR,
            asyncUnaryCall(
              new MethodHandlers<
                com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest,
                com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty>(
                  this, METHODID_DELETE_CAR)))
          .build();
    }
  }

  /**
   * <pre>
   * Car service
   * </pre>
   */
  public static final class CarGrpcServiceStub extends io.grpc.stub.AbstractStub<CarGrpcServiceStub> {
    private CarGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void addCar(com.sep3group1.middleware.Backend.Grpc.BackendServices.Car request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Car> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_CAR, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllCars(com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Cars> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_CARS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCarById(com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Car> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CAR_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCar(com.sep3group1.middleware.Backend.Grpc.BackendServices.Car request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_CAR, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCar(com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_CAR, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Car service
   * </pre>
   */
  public static final class CarGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<CarGrpcServiceBlockingStub> {
    private CarGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sep3group1.middleware.Backend.Grpc.BackendServices.Car addCar(com.sep3group1.middleware.Backend.Grpc.BackendServices.Car request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_CAR, getCallOptions(), request);
    }

    /**
     */
    public com.sep3group1.middleware.Backend.Grpc.BackendServices.Cars getAllCars(com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_CARS, getCallOptions(), request);
    }

    /**
     */
    public com.sep3group1.middleware.Backend.Grpc.BackendServices.Car getCarById(com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CAR_BY_ID, getCallOptions(), request);
    }

    /**
     */
    public com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty updateCar(com.sep3group1.middleware.Backend.Grpc.BackendServices.Car request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_CAR, getCallOptions(), request);
    }

    /**
     */
    public com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty deleteCar(com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_CAR, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Car service
   * </pre>
   */
  public static final class CarGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<CarGrpcServiceFutureStub> {
    private CarGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep3group1.middleware.Backend.Grpc.BackendServices.Car> addCar(
        com.sep3group1.middleware.Backend.Grpc.BackendServices.Car request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_CAR, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep3group1.middleware.Backend.Grpc.BackendServices.Cars> getAllCars(
        com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_CARS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep3group1.middleware.Backend.Grpc.BackendServices.Car> getCarById(
        com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CAR_BY_ID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> updateCar(
        com.sep3group1.middleware.Backend.Grpc.BackendServices.Car request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_CAR, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> deleteCar(
        com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_CAR, getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_CAR = 0;
  private static final int METHODID_GET_ALL_CARS = 1;
  private static final int METHODID_GET_CAR_BY_ID = 2;
  private static final int METHODID_UPDATE_CAR = 3;
  private static final int METHODID_DELETE_CAR = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CarGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CarGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_CAR:
          serviceImpl.addCar((com.sep3group1.middleware.Backend.Grpc.BackendServices.Car) request,
              (io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Car>) responseObserver);
          break;
        case METHODID_GET_ALL_CARS:
          serviceImpl.getAllCars((com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty) request,
              (io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Cars>) responseObserver);
          break;
        case METHODID_GET_CAR_BY_ID:
          serviceImpl.getCarById((com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest) request,
              (io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Car>) responseObserver);
          break;
        case METHODID_UPDATE_CAR:
          serviceImpl.updateCar((com.sep3group1.middleware.Backend.Grpc.BackendServices.Car) request,
              (io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty>) responseObserver);
          break;
        case METHODID_DELETE_CAR:
          serviceImpl.deleteCar((com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest) request,
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

  private static final class CarGrpcServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sep3group1.middleware.Backend.Grpc.BackendServices.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CarGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CarGrpcServiceDescriptorSupplier())
              .addMethod(METHOD_ADD_CAR)
              .addMethod(METHOD_GET_ALL_CARS)
              .addMethod(METHOD_GET_CAR_BY_ID)
              .addMethod(METHOD_UPDATE_CAR)
              .addMethod(METHOD_DELETE_CAR)
              .build();
        }
      }
    }
    return result;
  }
}
