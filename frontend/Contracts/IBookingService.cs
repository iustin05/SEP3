using Entities.Models;

namespace Contracts;
public interface IBookingService
    {
        Task<Booking> CreateBookingAsync(Booking booking);
        Task<Booking> GetBookingAsync(int bookingId);
        Task<List<Booking>> GetAllBookings();
        Task UpdateBooking(Booking booking);
        Task DeleteBooking(int bookingId);
    }
