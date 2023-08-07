using System.ComponentModel.DataAnnotations.Schema;

namespace Entities.Models;

public class Rate
{
    [ForeignKey(nameof(RatingUser))]
    public required string RatingUsername { get; set; }
    public required User RatingUser { get; set; }
         
    [ForeignKey(nameof(RatedUser))]
    public required string  RatedUsername { get; set; }

    public required User RatedUser { get; set; }
    public int score;
}