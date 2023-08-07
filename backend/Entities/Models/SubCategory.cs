using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Entities.Models
{
    public class Subcategory
    {
        [Key]
        public int Id { get; set; }

        [Required]
        public required string Name { get; set; }

        [ForeignKey(nameof(Category))]
        public int CategoryId { get; set; }
        public required Category Category { get; set; }
    }
}
