using Entities.Models;
using Microsoft.EntityFrameworkCore;

namespace EFC.DAOImplementation;
public class BookingDAOImplementation : IBookingService
    {
        private readonly DbAccess _context;

        public BookingDAOImplementation(DbAccess context)
        {
            _context = context;
        }

        public async Task<Booking> AddBooking(Booking booking)
        {
            await _context.Bookings.AddAsync(booking);
            await _context.SaveChangesAsync();
            return booking;
        }

        public async Task<List<Booking>> GetAllBookings()
        {
            return await _context.Bookings.ToListAsync();
        }

        public async Task<Booking> GetBookingById(int id)
        {
            return await _context.Bookings.FindAsync(id);
        }

        public async Task UpdateBooking(Booking booking)
        {
            _context.Entry(booking).State = EntityState.Modified;
            await _context.SaveChangesAsync();
        }

        public async Task DeleteBooking(int id)
        {
            var booking = await _context.Bookings.FindAsync(id);
            _context.Bookings.Remove(booking);
            await _context.SaveChangesAsync();
        }
    }
