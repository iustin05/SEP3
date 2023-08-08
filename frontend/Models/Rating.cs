using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace frontend.Models;

public class Rating
{
    [Key]
    public int Id { get; set; }

    [Required]
    [ForeignKey(nameof(User))]
    public required int UserId { get; set; }

    [Required]
    [MaxLength(500)]
    [MinLength(5)]
    [RegularExpression(@"^[a-zA-Z0-9\s]*$")]
    public required string Comment { get; set; }

    [Required]
    public required DateTime CreatedTime { get; set; }

    [Required]
    [Range(1, 5)]
    public int NumberOfStars { get; set; }
}