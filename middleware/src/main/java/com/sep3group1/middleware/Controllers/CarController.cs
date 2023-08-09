package middleware.src.main.java.com.sep3group1.middleware.Controllers;

import group6.semester.project.Models.Car;
import group6.semester.project.Services.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping(value = "/addCar")
    public ResponseEntity addCar(@RequestBody Car car) {
        try {
            Car addedCar = carService.addCar(car).get(); // Wait for the task to complete
            return ResponseEntity.ok(addedCar);
        } catch (InterruptedException | ExecutionException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping(value = "/getAllCars")
    public ResponseEntity<List<Car>> getAllCars() {
        try {
            List<Car> cars = carService.getAllCars().get(); // Wait for the task to complete
            return ResponseEntity.ok(cars);
        } catch (InterruptedException | ExecutionException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping(value = "/getCarById/{id}")
    public ResponseEntity getCarById(@PathVariable int id) {
        try {
            Car car = carService.getCarById(id).get(); // Wait for the task to complete
            return ResponseEntity.ok(car);
        } catch (InterruptedException | ExecutionException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PatchMapping(value = "/updateCar")
    public ResponseEntity updateCar(@RequestBody Car car) {
        try {
            Car updatedCar = carService.updateCar(car).get(); // Wait for the task to complete
            return ResponseEntity.ok(updatedCar);
        } catch (InterruptedException | ExecutionException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
        }
    }

    @DeleteMapping(value = "/deleteCar/{id}")
    public ResponseEntity deleteCar(@PathVariable int id) {
        try {
            carService.deleteCar(id).get(); // Wait for the task to complete
            return ResponseEntity.ok("Car deleted successfully");
        } catch (InterruptedException | ExecutionException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
        }
    }
}
