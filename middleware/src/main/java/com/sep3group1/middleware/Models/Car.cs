package middleware.src.main.java.com.sep3group1.middleware.Models;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Component
    @Data
@Entity
@Table(name = "bookings")
public class Booking {

    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
        @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;

    @NotNull
        @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @NotNull
        @Min(value = 1, message = "Total price must be at least 1")
    private Integer totalPrice;

    @NotNull
    private LocalDateTime createdTime;

    @NotNull
    private LocalDateTime startTime;

    @NotNull
    private LocalDateTime endTime;

    @NotNull
        @Enumerated(EnumType.STRING)
    private BookingStatus status;

    // Getters and setters
}