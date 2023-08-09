import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking AddBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public List<Booking> GetAllBookings() {
        return bookingRepository.findAll();
    }

    public Optional<Booking> GetBookingById(int id) {
        return bookingRepository.findById(id);
    }

    public Booking UpdateBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public void DeleteBooking(int id) {
        bookingRepository.deleteById(id);
    }
}