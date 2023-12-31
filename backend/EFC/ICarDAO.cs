using backend.Models;

namespace backend.EFC;

public interface ICarDao {
    public Task<Car> AddCar(Car car);
    public Task<List<Car>> GetAllCars();
    public Task<Car> GetCarById(int id);
    public Task UpdateCar(Car car);
    public Task DeleteCar(int id);
}