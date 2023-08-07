using Entities.Models;

namespace Contracts;
public interface ICarService
    {
        Task<Car> CreateCarAsync(Car car);
        Task<Car> GetCarAsync(int carId);
        Task<List<Car>> GetAllCars();
        Task UpdateCar(Car car);
        Task DeleteCar(int carId);
    }
