using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace backend.Models;

public class Booking
{
    [Key]
    public required int Id { get; set; }

    [Required]
    [ForeignKey(nameof(User))]
    public required int CustomerId { get; set; }

    [Required]
    [ForeignKey(nameof(Car))]
    public required int CarId { get; set; }

    [Required]
    [Range(1, 100000)]
    public required int TotalPrice { get; set; }

    [Required]
    public required DateTime CreatedTime { get; set; }

    [Required]
    public required DateTime StartTime { get; set; }

    [Required]
    public required DateTime EndTime { get; set; }

    [Required]
    public required BookingStatus Status { get; set; }
}

public enum BookingStatus
{
    Pending,
    Cancelled,
    InProgress,
    Completed,
}