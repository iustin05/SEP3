using backend.Models;
using Microsoft.EntityFrameworkCore;

namespace backend.EFC;

public class DbAccess : DbContext
{
    public DbAccess(DbContextOptions<DbContext> options) : base(options)
    {
        
    }

    public required DbSet<Car> Cars { get; set; }
    public required DbSet<Booking> Bookings { get; set; }
    public required DbSet<User> Users { get; set; }
    public required DbSet<Rating> Ratings { get; set; }
}