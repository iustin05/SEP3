using Entities.Models;

interface ILocationService {
    public Task<Location> AddLocation(Location location);
    public Task<List<Location>> GetAllLocations();
    public Task<Location> GetLocationById(int id);
    public Task UpdateLocation(Location location);
    public Task DeleteLocation(int id);
}