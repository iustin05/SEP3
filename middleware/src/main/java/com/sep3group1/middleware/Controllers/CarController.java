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

    @PostMapping(value = "/addBooking/{carId}/{userId}/{start_date}/{end_date}")
    public boolean addBooking(
            @PathVariable int carId,
            @PathVariable int userId,
            @PathVariable String start_date,
            @PathVariable String end_date) {

        Car car = carService.getCarById(carId);
        if (car.getStatus() != CarStatus.AVAILABLE) {
            return false;
        }

        List<Booking> bookingsList = bookingService.getAllBookings();
        for (Booking b : bookingsList) {
            if (b.getCarId() == carId) {
                LocalDateTime bStartDate = LocalDateTime.parse(b.StartDate());
                LocalDateTime bEndDate = LocalDateTime.parse(b.EndDate());
                LocalDateTime newStartDate = LocalDateTime.parse(start_date);
                LocalDateTime newEndDate = LocalDateTime.parse(end_date);
                if (isBetween(newStartDate, bStartDate, bEndDate) || isBetween(newEndDate, bStartDate, bEndDate)) {
                    return false;
                }
            }
        }

        car.setStatus(CarStatus.UNAVAILABLE);
        int newBookingId = bookingsList.size() + 1;
        Booking booking = new Booking(newBookingId, userId, carId, car.getPricePerDay(), start_date, end_date);
        try {
            bookingService.addBooking(booking);
            return true;
        } catch (Exception e) {
            return false;
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

    @GetMapping("/cancelBooking/{userId}/{carId}")
        public ResponseEntity<String> cancelBooking(@PathVariable int userId, @PathVariable int carId) {
            try {
                boolean isCancelled = bookingService.CancelBooking(userId, carId);

                if (isCancelled) {
                    return new ResponseEntity<>("Booking has been successfully cancelled.", HttpStatus.OK);
                } else {
                    return new ResponseEntity<>("Booking could not be cancelled.", HttpStatus.BAD_REQUEST);

    @GetMapping("/setCarState/{carId}/{newState}")
        public ResponseEntity<String> setCarState(
                @PathVariable int carId,
                @PathVariable CarStatus newState) {
            try {
                Car car = carService.getCarById(carId);
                if (car == null) {
                    return new ResponseEntity<>("Car not found", HttpStatus.NOT_FOUND);
                }
}
