using System;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Entities.Models
{
    public class Car
    {
        [Key]
        public int Id { get; set; }

        [Required]
        public string Model { get; set; }

        public string Manufacturer { get; set; }

        public int Year { get; set; }

        [ForeignKey(nameof(Category))]
        public int CategoryId { get; set; }
        public Category Category { get; set; }

        public bool IsAvailable { get; set; }

        [Column(TypeName = "decimal(10, 2)")]
        public decimal DailyRate { get; set; }

        public string ImageUrl { get; set; }
    }
}
