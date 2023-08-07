using System.ComponentModel.DataAnnotations;

namespace Entities.Models
{
    public class Customer
    {
        [Key]
        public int Id { get; set; }

        [Required]
        public required string FirstName { get; set; }

        [Required]
        public required string LastName { get; set; }

        public required string Email { get; set; }

        public required string Phone { get; set; }
    }
}
