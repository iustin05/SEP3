using backend.EFC;
using Backend.Grpc;
using Grpc.Core;

namespace backend.Services.Exposed;

public class UserGrpcService : Backend.Grpc.UserGrpcService.UserGrpcServiceBase
{
    private readonly IUserDao _userDao;

    public UserGrpcService(IUserDao userDao)
    {
        _userDao = userDao;
    }

    public override async Task<User> AddUser(User request, ServerCallContext context)
    {
        var user = await _userDao.AddUser(ConvertToDomainModel(request));
        return ConvertToMessage(user);
    }

    public override async Task<Users> GetAllUsers(Empty request, ServerCallContext context)
    {
        // var users = await _userDao.GetAllUsers();
        backend.Models.User user1 = new Models.User
        {
            CreatedTime = DateTime.Now,
            Id = 0,
            Name = "Alex",
            Email = "alex@email.com",
            Password = "39528572487589",
            AccessLevel = 2,
            Age = 23
        };
        var users = new List<backend.Models.User> { user1 };
        return new Users { Users_ = { users.Select(ConvertToMessage) } };
    }

    public override async Task<User> GetUserById(IdRequest request, ServerCallContext context)
    {
        var user = await _userDao.GetUserById(request.Id);
        return ConvertToMessage(user);
    }

    public override async Task<Empty> UpdateUser(User request, ServerCallContext context)
    {
        await _userDao.UpdateUser(ConvertToDomainModel(request));
        return new Empty();
    }

    public override async Task<Empty> DeleteUser(IdRequest request, ServerCallContext context)
    {
        await _userDao.DeleteUser(request.Id);
        return new Empty();
    }

    private backend.Models.User ConvertToDomainModel(User message)
    {
        // Convert the gRPC message to your domain model
        return new backend.Models.User
        {
            Id = message.Id,
            Name = message.Name,
            Email = message.Email,
            Password = message.Password,
            AccessLevel = message.AccessLevel,
            CreatedTime = DateTime.Parse(message.CreatedTime),
            Age = message.Age
        };
    }

    private User ConvertToMessage(backend.Models.User domainModel)
    {
        // Convert your domain model to the gRPC message
        return new User
        {
            Id = domainModel.Id,
            Name = domainModel.Name,
            Email = domainModel.Email,
            Password = domainModel.Password,
            AccessLevel = domainModel.AccessLevel,
            CreatedTime = domainModel.CreatedTime.ToString("o"),
            Age = domainModel.Age
        };
    }
}