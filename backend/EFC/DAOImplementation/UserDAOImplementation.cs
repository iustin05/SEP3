using Entities.Models;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.ChangeTracking;

namespace EFC.DAOImplementation;

public class UserDAOImpl : IUserService {
    private readonly DbAccess _context;

    public UserDAOImpl(DbAccess _context) {
        this._context = _context;
    }

    public async Task<User> AddUser(User user) {
        Console.WriteLine("UserDAOImpl.AddUser");
        Console.WriteLine(user.FirstName + " " + user.LastName + " " + user.Username + " " + user.Password);
        await _context.Users.AddAsync(user);
        await _context.SaveChangesAsync();
        return user;
    }

    public async Task<User?> GetUser(string username) {
        User? user = await _context.Users.FirstOrDefaultAsync(t => t.Username.Equals(username)) ?? throw new Exception("Incorrect username");
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