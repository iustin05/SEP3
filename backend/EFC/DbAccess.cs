using Entities.Models;
using Microsoft.EntityFrameworkCore;

namespace EFC
{
    public class DbAccess : DbContext
    {
        public DbSet<Car> Cars { get; set; }
        public DbSet<Category> Categories { get; set; }
        public DbSet<Subcategory> Subcategories { get; set; }
        public DbSet<Booking> Bookings { get; set; }
        public DbSet<Customer> Customers { get; set; }
        public DbSet<Location> Locations { get; set; }
        public DbSet<User> Users { get; set; }
        public DbSet<Rate> Ratings { get; set; }
        public DbAccess(DbContextOptions<DbAccess> options) : base(options) { }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            modelBuilder.Entity<Category>().HasMany(c => c.Subcategories).WithOne(sc => sc.Category);
            modelBuilder.Entity<Subcategory>().HasOne(sc => sc.Category).WithMany(c => c.Subcategories);

            // Define other relationships and configurations here

            modelBuilder.Entity<Booking>().HasKey(b => b.Id);
            modelBuilder.Entity<Customer>().HasKey(c => c.Id);
            modelBuilder.Entity<Location>().HasKey(l => l.Id);
        }
    }
}