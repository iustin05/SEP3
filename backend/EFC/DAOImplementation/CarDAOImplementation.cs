using Entities.Models;
using Microsoft.EntityFrameworkCore;

namespace EFC.DAOImplementation;
public class CarDAOImplementation : ICarService
    {
        private readonly DbAccess _context;

        public CarDAOImplementation(DbAccess context)
        {
            _context = context;
        }

        public async Task<Car> AddCar(Car car)
        {
            await _context.Cars.AddAsync(car);
            await _context.SaveChangesAsync();
            return car;
        }

        public async Task<List<Car>> GetAllCars()
        {
            return await _context.Cars.ToListAsync();
        }

        public async Task<Car> GetCarById(int id)
        {
            return await _context.Cars.FindAsync(id) ?? throw new Exception("Car not found");
        }

        public async Task UpdateCar(Car car)
        {
            _context.Entry(car).State = EntityState.Modified;
            await _context.SaveChangesAsync();
        }

        public async Task DeleteCar(int id)
        {
            var car = await _context.Cars.FindAsync(id) ?? throw new Exception("Car not found");
            _context.Cars.Remove(car);
            await _context.SaveChangesAsync();
        }
    }
