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
 * Booking service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: BackendServices.proto")
public final class BookingGrpcServiceGrpc {

  private BookingGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "backend.grpc.BookingGrpcService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking,
      com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking> METHOD_ADD_BOOKING =
      io.grpc.MethodDescriptor.<com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking, com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "backend.grpc.BookingGrpcService", "AddBooking"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty,
      com.sep3group1.middleware.Backend.Grpc.BackendServices.Bookings> METHOD_GET_ALL_BOOKINGS =
      io.grpc.MethodDescriptor.<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty, com.sep3group1.middleware.Backend.Grpc.BackendServices.Bookings>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "backend.grpc.BookingGrpcService", "GetAllBookings"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.Bookings.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest,
      com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking> METHOD_GET_BOOKING_BY_ID =
      io.grpc.MethodDescriptor.<com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest, com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "backend.grpc.BookingGrpcService", "GetBookingById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking,
      com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> METHOD_UPDATE_BOOKING =
      io.grpc.MethodDescriptor.<com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking, com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "backend.grpc.BookingGrpcService", "UpdateBooking"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest,
      com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> METHOD_DELETE_BOOKING =
      io.grpc.MethodDescriptor.<com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest, com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "backend.grpc.BookingGrpcService", "DeleteBooking"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookingGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new BookingGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookingGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BookingGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookingGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BookingGrpcServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Booking service
   * </pre>
   */
  public static abstract class BookingGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addBooking(com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_BOOKING, responseObserver);
    }

    /**
     */
    public void getAllBookings(com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Bookings> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_BOOKINGS, responseObserver);
    }

    /**
     */
    public void getBookingById(com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BOOKING_BY_ID, responseObserver);
    }

    /**
     */
    public void updateBooking(com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_BOOKING, responseObserver);
    }

    /**
     */
    public void deleteBooking(com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_BOOKING, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ADD_BOOKING,
            asyncUnaryCall(
              new MethodHandlers<
                com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking,
                com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking>(
                  this, METHODID_ADD_BOOKING)))
          .addMethod(
            METHOD_GET_ALL_BOOKINGS,
            asyncUnaryCall(
              new MethodHandlers<
                com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty,
                com.sep3group1.middleware.Backend.Grpc.BackendServices.Bookings>(
                  this, METHODID_GET_ALL_BOOKINGS)))
          .addMethod(
            METHOD_GET_BOOKING_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest,
                com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking>(
                  this, METHODID_GET_BOOKING_BY_ID)))
          .addMethod(
            METHOD_UPDATE_BOOKING,
            asyncUnaryCall(
              new MethodHandlers<
                com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking,
                com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty>(
                  this, METHODID_UPDATE_BOOKING)))
          .addMethod(
            METHOD_DELETE_BOOKING,
            asyncUnaryCall(
              new MethodHandlers<
                com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest,
                com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty>(
                  this, METHODID_DELETE_BOOKING)))
          .build();
    }
  }

  /**
   * <pre>
   * Booking service
   * </pre>
   */
  public static final class BookingGrpcServiceStub extends io.grpc.stub.AbstractStub<BookingGrpcServiceStub> {
    private BookingGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void addBooking(com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_BOOKING, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllBookings(com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Bookings> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_BOOKINGS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBookingById(com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BOOKING_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBooking(com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_BOOKING, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBooking(com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request,
        io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_BOOKING, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Booking service
   * </pre>
   */
  public static final class BookingGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<BookingGrpcServiceBlockingStub> {
    private BookingGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking addBooking(com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_BOOKING, getCallOptions(), request);
    }

    /**
     */
    public com.sep3group1.middleware.Backend.Grpc.BackendServices.Bookings getAllBookings(com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_BOOKINGS, getCallOptions(), request);
    }

    /**
     */
    public com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking getBookingById(com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BOOKING_BY_ID, getCallOptions(), request);
    }

    /**
     */
    public com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty updateBooking(com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_BOOKING, getCallOptions(), request);
    }

    /**
     */
    public com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty deleteBooking(com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_BOOKING, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Booking service
   * </pre>
   */
  public static final class BookingGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<BookingGrpcServiceFutureStub> {
    private BookingGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking> addBooking(
        com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_BOOKING, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep3group1.middleware.Backend.Grpc.BackendServices.Bookings> getAllBookings(
        com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_BOOKINGS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking> getBookingById(
        com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BOOKING_BY_ID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> updateBooking(
        com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_BOOKING, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty> deleteBooking(
        com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_BOOKING, getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_BOOKING = 0;
  private static final int METHODID_GET_ALL_BOOKINGS = 1;
  private static final int METHODID_GET_BOOKING_BY_ID = 2;
  private static final int METHODID_UPDATE_BOOKING = 3;
  private static final int METHODID_DELETE_BOOKING = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookingGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookingGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_BOOKING:
          serviceImpl.addBooking((com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking) request,
              (io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking>) responseObserver);
          break;
        case METHODID_GET_ALL_BOOKINGS:
          serviceImpl.getAllBookings((com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty) request,
              (io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Bookings>) responseObserver);
          break;
        case METHODID_GET_BOOKING_BY_ID:
          serviceImpl.getBookingById((com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest) request,
              (io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking>) responseObserver);
          break;
        case METHODID_UPDATE_BOOKING:
          serviceImpl.updateBooking((com.sep3group1.middleware.Backend.Grpc.BackendServices.Booking) request,
              (io.grpc.stub.StreamObserver<com.sep3group1.middleware.Backend.Grpc.BackendServices.Empty>) responseObserver);
          break;
        case METHODID_DELETE_BOOKING:
          serviceImpl.deleteBooking((com.sep3group1.middleware.Backend.Grpc.BackendServices.IdRequest) request,
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

  private static final class BookingGrpcServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sep3group1.middleware.Backend.Grpc.BackendServices.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BookingGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookingGrpcServiceDescriptorSupplier())
              .addMethod(METHOD_ADD_BOOKING)
              .addMethod(METHOD_GET_ALL_BOOKINGS)
              .addMethod(METHOD_GET_BOOKING_BY_ID)
              .addMethod(METHOD_UPDATE_BOOKING)
              .addMethod(METHOD_DELETE_BOOKING)
              .build();
        }
      }
    }
    return result;
  }
}
