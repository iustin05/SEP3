using Entities.Models;

interface IUserService {
    public Task<User> AddUser(User user);
    public Task<List<User>> GetAllUsers();
    public Task<User> GetUserById(int id);
    public Task UpdateUser(User user);
    public Task DeleteUser(int id);
}