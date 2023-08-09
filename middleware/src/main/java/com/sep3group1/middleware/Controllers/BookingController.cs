package middleware.src.main.java.com.sep3group1.middleware.Controllers;

import middleware.src.main.java.com.sep3group1.middleware.Models;
import middleware.src.main.java.com.sep3group1.middleware.Services.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
public class BookingController {

    private final BookingService service;

    public BookingController(BookingService bookingService) {
        this.service = bookingService;
    }

    @PostMapping(value = "/bookCar")
    public ResponseEntity addBooking(@RequestBody Booking booking) {
        try {
            Booking addedBooking = service.addBooking(booking).get();
            return ResponseEntity.ok(addedBooking);
        } catch (InterruptedException | ExecutionException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping(value = "/allBookings")
    public ResponseEntity getAllBookings() {
        try {
            List<Booking> allBookings = service.getAllBookings().get();
            return ResponseEntity.ok(allBookings);
        } catch (InterruptedException | ExecutionException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping(value = "/bookingDetails/{bookingId}")
    public ResponseEntity getBookingDetails(@PathVariable int bookingId) {
        try {
            Booking booking = service.getBookingById(bookingId).get();
            return ResponseEntity.ok(booking);
        } catch (InterruptedException | ExecutionException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PatchMapping(value = "/updateBooking")
    public ResponseEntity updateBooking(@RequestBody Booking booking) {
        try {
            service.updateBooking(booking).get();
            return ResponseEntity.ok("Booking updated successfully");
        } catch (InterruptedException | ExecutionException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
        }
    }

    @DeleteMapping(value = "/deleteBooking/{bookingId}")
    public ResponseEntity deleteBooking(@PathVariable int bookingId) {
        try {
            service.deleteBooking(bookingId).get();
            return ResponseEntity.ok("Booking deleted successfully");
        } catch (InterruptedException | ExecutionException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
        }
    }
}
