using backend.Models;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Internal;

namespace backend.EFC;

public class DbAccess : DbContext
{
    public DbSet<Car>? Cars { get; set; }
    public DbSet<Booking>? Bookings { get; set; }
    public DbSet<User>? Users { get; set; }
    public DbSet<Rating>? Ratings { get; set; }
}