using backend.Contracts;
using backend.Models;
using Microsoft.EntityFrameworkCore;

namespace backend.EFC.DAOImplementation;

public class UserDaoImpl : IUserService {
    private readonly DbAccess _context;

    public UserDaoImpl(DbAccess context) {
        _context = context;
        if (!_context.Users.Any())
        {
            CreateDefaultUserAccount();
        }
    }

    private void CreateDefaultUserAccount()
    {
        _context.Users.Add(new User
        {
            Id = 1,
            Name = "Alexander",
            Email = "alexander@rentacar.dk",
            Password = "change_me",
            AccessLevel = 2,
            CreatedTime = DateTime.Now,
            Age = 23
        });
        Console.WriteLine("Added default user account with:\n" +
                          "email: alexander@rentacar.dk\n" +
                          "password: change_me");
    }

    public async Task<User> AddUser(User user) {
        Console.WriteLine("UserDAOImpl.AddUser");
        Console.WriteLine(user.Name + " " + user.Password);
        await _context.Users.AddAsync(user);
        await _context.SaveChangesAsync();
        return user;
    }

    public async Task<User?> GetUser(string email) {
        User user = await _context.Users.FirstOrDefaultAsync(t => t.Email.Equals(email)) ?? throw new Exception("Invalid email");
        return user;
    }

    async Task IUserService.DeleteUser(int id) {
        User user = await _context.Users.FindAsync(id) ?? throw new Exception("User not found");
        _context.Users.Remove(user);
        await _context.SaveChangesAsync();
    }

    async Task<List<User>> IUserService.GetAllUsers()
    {
        List<User> users = await _context.Users.ToListAsync() ?? throw new Exception("No users found");
        return users;
    }

    async Task<User> IUserService.GetUserById(int id)
    {
        User user = await _context.Users.FindAsync(id) ?? throw new Exception("User not found");
        return user;
    }

    Task IUserService.UpdateUser(User user)
    {
        _context.Entry(user).State = EntityState.Modified;
        return _context.SaveChangesAsync();
    }
}