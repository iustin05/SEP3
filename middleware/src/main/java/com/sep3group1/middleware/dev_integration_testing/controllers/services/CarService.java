package com.sep3group1.middleware.dev_integration_testing.controllers.services;

import com.sep3group1.middleware.backend.grpc.BackendServices;
import com.sep3group1.middleware.backend.grpc.CarGrpcServiceGrpc;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;


@Service
public class CarService {

    private final CarGrpcServiceGrpc.CarGrpcServiceBlockingStub carStub;

    public CarService() {
        this.carStub = CarGrpcServiceGrpc.newBlockingStub(
                ManagedChannelBuilder.forAddress("localhost", 5000)
                        .usePlaintext()
                        .build());
    }

    public String getCarById(int id) {
        BackendServices.Car car = carStub.getCarById(BackendServices.IdRequest.newBuilder().setId(id).build());
        return car.toString();
    }

}
