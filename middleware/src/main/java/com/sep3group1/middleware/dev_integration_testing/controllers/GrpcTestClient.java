package com.sep3group1.middleware.dev_integration_testing.controllers;

import com.sep3group1.middleware.backend.grpc.*;
import com.sep3group1.middleware.grpc.GrpcClientService;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcTestClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 5000)
                .usePlaintext()
                .build();

        GrpcClientService grpcClientService = new GrpcClientService(channel);
        BackendServices.Users users = grpcClientService.getAllUsers();
        users.getUsersList().forEach(user -> System.out.println("User: " + user.getName()));
        channel.shutdown();
    }
}
