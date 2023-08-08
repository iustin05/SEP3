using backend.Models;
using Microsoft.EntityFrameworkCore;

namespace backend.EFC.DAOImplementation;
public class CarDaoImplementation : ICarDao
    {
        private readonly DbAccess _context;

        public CarDaoImplementation(DbAccess context)
        {
            _context = context;
            if (!context.Cars.Any())
            {
                CreateDefaultPlaceHolderCar();
            }
        }

        private void CreateDefaultPlaceHolderCar()
        {
            _context.Cars.Add(new Car
            {
                Id = 1,
                Make = "Mercedes",
                Model = "GLS",
                Color = "Black",
                Fuel = "Petrol",
                Transmission = "Automatic",
                Category = CarCategory.Luxury,
                Year = 2021,
                Mileage = 23000,
                PricePerDay = 2000,
                Description = "An amazing SUV.",
                Image = "https://blog.bilbasen.dk/wp-content/uploads/2020/08/Mercedes-Benz-GLS-400d-Åbner-e1596527765424.jpg",
                CreatedAt = DateTime.Now,
                UpdatedAt = DateTime.Now,
                NumberOfSeats = 5,
                EuroNorm = 6,
                HorsePower = 270,
                FuelConsumption = 7,
                Deposit = 15000,
                Status = CarStatus.Available,
            });
        }

        public async Task<Car> AddCar(Car car)
        {
            await _context.Cars.AddAsync(car);
            await _context.SaveChangesAsync();
            return car;
        }

        public async Task<List<Car>> GetAllCars()
        {
            return await _context.Cars.ToListAsync() ?? throw new Exception("No cars found");
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
