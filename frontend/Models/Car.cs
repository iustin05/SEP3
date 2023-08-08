using System.ComponentModel.DataAnnotations;

namespace frontend.Models;

public class Car
{
    [Key]
    public required int Id { get; set; }
        
    [Required]
    public required string Make { get; set; }
        
    [Required]
    public required string Model { get; set; }
        
    [Required]
    public required string Color { get; set; }
        
    [Required]
    public required string Fuel { get; set; }
        
    [Required]
    public required string Transmission { get; set; }
        
    [Required]
    public required CarCategory Category { get; set; }
        
    [Required]
    public required int Year { get; set; }
        
    [Required]
    public required int Mileage { get; set; }
        
    [Required]
    public required int PricePerDay { get; set; }
        
    [Required]
    public required string Description { get; set; }
        
    [Required]
    public required string Image { get; set; }
        
    [Required]
    public required DateTime CreatedAt { get; set; }
        
    [Required]
    public required DateTime UpdatedAt { get; set; }

    [Required]
    public required int NumberOfSeats { get; set; }

    [Required]
    public required int EuroNorm { get; set; }

    [Required]
    public required int HorsePower { get; set; }

    [Required]
    public required float FuelConsumption { get; set; }

    [Required]
    public required int Deposit { get; set; }

    [Required]
    public required CarStatus Status { get; set; }

    public Rating? Ratings { get; set; }
}

public enum CarCategory
{
    Economy,
    Standard,
    Luxury,
}

public enum CarStatus
{
    Available,
    Unavailable,
    InService,
}