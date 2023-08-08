package com.sep3group1.middleware.dev_integration_testing.controllers;

import com.sep3group1.middleware.dev_integration_testing.controllers.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("devtest/api/cars")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/{id}")
    public String getCarById(@PathVariable int id) {
        return carService.getCarById(id);
    }

}
