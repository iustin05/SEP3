using System.ComponentModel.DataAnnotations;

namespace Entities.Models
{
    public class Location
    {
        [Key]
        public int Id { get; set; }

        [Required]
        public required string Name { get; set; }

        public required string Address { get; set; }

        public required string City { get; set; }

        public required string State { get; set; }

        public required string Country { get; set; }
    }
}
