using backend.Contracts;
using backend.Models;
using Microsoft.EntityFrameworkCore;

namespace backend.EFC.DAOImplementation;
public class BookingDaoImplementation : IBookingDao

    {
        private readonly DbAccess _context;

        public BookingDaoImplementation(DbAccess context)
        {
            _context = context;
        }

        public async Task<Booking> AddBooking(Booking booking)
        {
            await _context.Bookings!.AddAsync(booking);
            await _context.SaveChangesAsync();
            return booking;
        }

        public async Task<List<Booking>> GetAllBookings()
        {
            return await _context.Bookings!.ToListAsync() ?? throw new Exception("No bookings found");
        }

        public async Task<Booking> GetBookingById(int id)
        {
            var booking = await _context.Bookings!.FindAsync(id) ?? throw new Exception("No bookings found");
            return booking;
        }

        public async Task UpdateBooking(Booking booking)
        {
            _context.Entry(booking).State = EntityState.Modified;
            await _context.SaveChangesAsync();
        }

        public async Task DeleteBooking(int id)
        {
            var booking = await _context.Bookings!.FindAsync(id) ?? throw new Exception("Booking not found");
            _context.Bookings.Remove(booking);
            await _context.SaveChangesAsync();
        }
    }