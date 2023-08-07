using Entities.Models;
using Microsoft.EntityFrameworkCore;

namespace EFC.DAOImplementation;
public class LocationDAOImplementation : ILocationService {

    private readonly DbAccess _context;

    public LocationDAOImplementation(DbAccess context)
    {
        _context = context;
    }

    public async Task<Location> AddLocation(Location location)
    {
        await _context.Locations.AddAsync(location);
        await _context.SaveChangesAsync();
        return location;
    }

    public async Task<List<Location>> GetAllLocations()
    {
        return await _context.Locations.ToListAsync();
    }

    public async Task<Location> GetLocationById(int id)
    {
        return await _context.Locations.FindAsync(id) ?? throw new Exception("Location not found");
    }

    public async Task UpdateLocation(Location location)
    {
        _context.Entry(location).State = EntityState.Modified;
        await _context.SaveChangesAsync();
    }

    public async Task DeleteLocation(int id)
    {
        var location = await _context.Locations.FindAsync(id) ?? throw new Exception("Location not found");
        _context.Locations.Remove(location);
        await _context.SaveChangesAsync();
    }
}