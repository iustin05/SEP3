using Entities.Models;

namespace Contracts;
public interface ILocationService
    {
        Task<Location> CreateLocationAsync(Location location);
        Task<Location> GetLocationAsync(int locationId);
        Task<List<Location>> GetAllLocations();
        Task UpdateLocation(Location location);
        Task DeleteLocation(int locationId);
    }
