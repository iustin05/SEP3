using System.ComponentModel.DataAnnotations;

namespace backend.Models;

public class User
{
    [Key]
    public required int Id { get; set; }

    [Required]
    public required string Name { get; set; }

    [Required]
    [RegularExpression(@"^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$")]
    [MaxLength(50)]
    public required string Email { get; set; }

    [Required]
    [RegularExpression(@"^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[^\da-zA-Z]).{8,15}$")]
    public required string Password { get; set; }

    [Required]
    [Range(0, 2)]
    public required int AccessLevel { get; set; }

    [Required]
    public required DateTime CreatedTime { get; set; }

    [Required]
    [Range(18, 100)]
    [RegularExpression(@"^[0-9]*$")]
    public required int Age { get; set; }
}