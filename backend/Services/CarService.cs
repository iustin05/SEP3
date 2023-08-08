using backend.Contracts;
using Backend.Grpc;
using Grpc.Core;

namespace backend.Services;

public class CarService : CarGrpcService.CarGrpcServiceBase
{
    private readonly ICarDao _carDao;

    public CarService(ICarDao carDao)
    {
        _carDao = carDao;
    }

    public override async Task<Car> AddCar(Car request, ServerCallContext context)
    {
        var car = await _carDao.AddCar(ConvertToDomainModel(request));
        return ConvertToMessage(car);
    }

    public override async Task<Cars> GetAllCars(Empty request, ServerCallContext context)
    {
        var cars = await _carDao.GetAllCars();
        return new Cars { Cars_ = { cars.Select(ConvertToMessage) } };
    }

    public override async Task<Car> GetCarById(IdRequest request, ServerCallContext context)
    {
        var car = await _carDao.GetCarById(request.Id);
        return ConvertToMessage(car);
    }

    public override async Task<Empty> UpdateCar(Car request, ServerCallContext context)
    {
        await _carDao.UpdateCar(ConvertToDomainModel(request));
        return new Empty();
    }

    public override async Task<Empty> DeleteCar(IdRequest request, ServerCallContext context)
    {
        await _carDao.DeleteCar(request.Id);
        return new Empty();
    }

    private backend.Models.Car ConvertToDomainModel(Car message)
    {
        return new backend.Models.Car
        {
            Id = message.Id,
            Make = message.Make,
            Model = message.Model,
            Color = message.Color,
            Fuel = message.Fuel,
            Transmission = message.Transmission,
            Category = (backend.Models.CarCategory)message.Category,
            Year = message.Year,
            Mileage = message.Mileage,
            PricePerDay = message.PricePerDay,
            Description = message.Description,
            Image = message.Image,
            CreatedAt = DateTime.Parse(message.CreatedAt),
            UpdatedAt = DateTime.Parse(message.UpdatedAt),
            NumberOfSeats = message.NumberOfSeats,
            EuroNorm = message.EuroNorm,
            HorsePower = message.HorsePower,
            FuelConsumption = message.FuelConsumption,
            Deposit = message.Deposit,
            Status = (backend.Models.CarStatus)message.Status,
            Ratings = message.Ratings.Select(r => new backend.Models.Rating
            {
                UserId = r.UserId,
                Comment = r.Comment,
                CreatedTime = DateTime.Parse(r.CreatedTime),
                NumberOfStars = r.NumberOfStars
            }).ToList()
        };
    }

    private Car ConvertToMessage(backend.Models.Car domainModel)
    {
        return new Car
        {
            Id = domainModel.Id,
            Make = domainModel.Make,
            Model = domainModel.Model,
            Color = domainModel.Color,
            Fuel = domainModel.Fuel,
            Transmission = domainModel.Transmission,
            Category = (CarCategory)domainModel.Category,
            Year = domainModel.Year,
            Mileage = domainModel.Mileage,
            PricePerDay = domainModel.PricePerDay,
            Description = domainModel.Description,
            Image = domainModel.Image,
            CreatedAt = domainModel.CreatedAt.ToString("o"),
            UpdatedAt = domainModel.UpdatedAt.ToString("o"),
            NumberOfSeats = domainModel.NumberOfSeats,
            EuroNorm = domainModel.EuroNorm,
            HorsePower = domainModel.HorsePower,
            FuelConsumption = domainModel.FuelConsumption,
            Deposit = domainModel.Deposit,
            Status = (CarStatus)domainModel.Status,
            Ratings = { (domainModel.Ratings ?? new List<Models.Rating>()).Select(r => new Rating
                {
                    UserId = r.UserId,
                    Comment = r.Comment,
                    CreatedTime = r.CreatedTime.ToString("o"),
                    NumberOfStars = r.NumberOfStars
                })
            }
        };
    }
}