package com.sep3group1.middleware.grpc;

import com.sep3group1.middleware.backend.grpc.*;
import com.sep3group1.middleware.backend.grpc.BackendServices.*;
import io.grpc.ManagedChannel;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class GrpcClientService implements DisposableBean {

    private final ManagedChannel channel;

    public GrpcClientService(ManagedChannel channel) {
        this.channel = channel;
    }

    // User Service Methods
    public BackendServices.User addUser(BackendServices.User user) {
        UserGrpcServiceGrpc.UserGrpcServiceBlockingStub stub = UserGrpcServiceGrpc.newBlockingStub(channel);
        return stub.addUser(user);
    }

    public BackendServices.Users getAllUsers() {
        UserGrpcServiceGrpc.UserGrpcServiceBlockingStub stub = UserGrpcServiceGrpc.newBlockingStub(channel);
        return stub.getAllUsers(Empty.newBuilder().build());
    }

    public BackendServices.User getUserById(int userId) {
        UserGrpcServiceGrpc.UserGrpcServiceBlockingStub stub = UserGrpcServiceGrpc.newBlockingStub(channel);
        BackendServices.IdRequest request = BackendServices.IdRequest.newBuilder().setId(userId).build();
        return stub.getUserById(request);
    }

    public Empty updateUser(User user) {
        UserGrpcServiceGrpc.UserGrpcServiceBlockingStub stub = UserGrpcServiceGrpc.newBlockingStub(channel);
        return stub.updateUser(user);
    }

    public Empty deleteUser(int userId) {
        UserGrpcServiceGrpc.UserGrpcServiceBlockingStub stub = UserGrpcServiceGrpc.newBlockingStub(channel);
        IdRequest request = IdRequest.newBuilder().setId(userId).build();
        return stub.deleteUser(request);
    }

    // Booking Service Methods
    public Booking addBooking(Booking booking) {
        BookingGrpcServiceGrpc.BookingGrpcServiceBlockingStub stub = BookingGrpcServiceGrpc.newBlockingStub(channel);
        return stub.addBooking(booking);
    }

    public Bookings getAllBookings() {
        BookingGrpcServiceGrpc.BookingGrpcServiceBlockingStub stub = BookingGrpcServiceGrpc.newBlockingStub(channel);
        return stub.getAllBookings(Empty.newBuilder().build());
    }

    public Booking getBookingById(int bookingId) {
        BookingGrpcServiceGrpc.BookingGrpcServiceBlockingStub stub = BookingGrpcServiceGrpc.newBlockingStub(channel);
        IdRequest request = IdRequest.newBuilder().setId(bookingId).build();
        return stub.getBookingById(request);
    }

    public Empty updateBooking(Booking booking) {
        BookingGrpcServiceGrpc.BookingGrpcServiceBlockingStub stub = BookingGrpcServiceGrpc.newBlockingStub(channel);
        return stub.updateBooking(booking);
    }

    public Empty deleteBooking(int bookingId) {
        BookingGrpcServiceGrpc.BookingGrpcServiceBlockingStub stub = BookingGrpcServiceGrpc.newBlockingStub(channel);
        IdRequest request = IdRequest.newBuilder().setId(bookingId).build();
        return stub.deleteBooking(request);
    }

    // Car Service Methods
    public Car addCar(Car car) {
        CarGrpcServiceGrpc.CarGrpcServiceBlockingStub stub = CarGrpcServiceGrpc.newBlockingStub(channel);
        return stub.addCar(car);
    }

    public Cars getAllCars() {
        CarGrpcServiceGrpc.CarGrpcServiceBlockingStub stub = CarGrpcServiceGrpc.newBlockingStub(channel);
        return stub.getAllCars(Empty.newBuilder().build());
    }

    public Car getCarById(int carId) {
        CarGrpcServiceGrpc.CarGrpcServiceBlockingStub stub = CarGrpcServiceGrpc.newBlockingStub(channel);
        IdRequest request = IdRequest.newBuilder().setId(carId).build();
        return stub.getCarById(request);
    }

    public Empty updateCar(Car car) {
        CarGrpcServiceGrpc.CarGrpcServiceBlockingStub stub = CarGrpcServiceGrpc.newBlockingStub(channel);
        return stub.updateCar(car);
    }

    public Empty deleteCar(int carId) {
        CarGrpcServiceGrpc.CarGrpcServiceBlockingStub stub = CarGrpcServiceGrpc.newBlockingStub(channel);
        IdRequest request = IdRequest.newBuilder().setId(carId).build();
        return stub.deleteCar(request);
    }

    @Override
    public void destroy() throws Exception {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
}
