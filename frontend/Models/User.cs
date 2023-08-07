using System.ComponentModel.DataAnnotations;

namespace Entities.Models; 

public class User 
{
    [Key]
    public required string Username { get; set; }
    public required string Password { get; set; }
    public required string FirstName { get; set; }
    public required string LastName { get; set; }
    public string? Role { get; set; }
}