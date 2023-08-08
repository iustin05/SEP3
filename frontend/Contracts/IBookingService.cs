using frontend.Models;

namespace frontend.Contracts;

interface IBookingService {
    public Task<Booking> AddBooking(Booking booking);
    public Task<List<Booking>> GetAllBookings();
    public Task<Booking> GetBookingById(int id);
    public Task UpdateBooking(Booking booking);
    public Task DeleteBooking(int id);
}