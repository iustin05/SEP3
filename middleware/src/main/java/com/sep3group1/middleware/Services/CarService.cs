package middleware.src.main.java.com.sep3group1.middleware.Services;

import com.sep3group1.middleware.Models.Car;
import com.sep3group1.middleware.Models.CarCategory;
import com.sep3group1.middleware.Models.CarStatus;
import com.sep3group1.middleware.Repositories.ICarDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@Service
public class CarService {

    private final ICarDao carDao;

    public CarService(ICarDao carDao) {
        this.carDao = carDao;
    }

    public Car addCar(Car car) {
        try {
            return carDao.addCar(car).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Error adding car: " + e.getMessage());
        }
    }

    public List<Car> getAllCars() {
        try {
            return carDao.getAllCars().get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Error getting all cars: " + e.getMessage());
        }
    }

    public Car getCarById(int id) {
        try {
            Optional<Car> optionalCar = carDao.getCarById(id).get();
            return optionalCar.orElse(null);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Error getting car by ID: " + e.getMessage());
        }
    }

    public void updateCar(Car car) {
        try {
            carDao.updateCar(car).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Error updating car: " + e.getMessage());
        }
    }

    public void deleteCar(int id) {
        try {
            carDao.deleteCar(id).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Error deleting car: " + e.getMessage());
        }
    }

    public List<Car> getCarsByCategory(CarCategory category) {
        try {
            return carDao.getCarsByCategory(category).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Error getting cars by category: " + e.getMessage());
        }
    }

    public List<Car> getCarsByStatus(CarStatus status) {
        try {
            return carDao.getCarsByStatus(status).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Error getting cars by status: " + e.getMessage());
        }
    }
    
}
