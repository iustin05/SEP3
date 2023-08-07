using Entities.Models;
using Microsoft.EntityFrameworkCore;

namespace EFC.DAOImplementation;

public class RatingDAOImpl : IRatingService {
    private readonly DbAccess _context;

    public RatingDAOImpl(DbAccess context)
    {
        _context = context;
    }

    public async Task<Rate> AddRating(Rate rating)
    {
        await _context.Ratings.AddAsync(rating);
        await _context.SaveChangesAsync();
        return rating;
    }

    public async Task DeleteRating(int id)
    {
        var rating = await _context.Ratings.FindAsync(id) ?? throw new Exception("Ratings not found");
        _context.Ratings.Remove(rating);
        await _context.SaveChangesAsync();
    }

    public async Task<List<Rate>> GetAllRatings()
    {
        return await _context.Ratings.ToListAsync() ?? throw new Exception("No ratings found");
    }

    public async Task<Rate> GetRatingById(int id)
    {
        return await _context.Ratings.FindAsync(id) ?? throw new Exception("Rating not found");
    }

    public async Task UpdateRating(Rate rating)
    {
        _context.Entry(rating).State = EntityState.Modified;
        await _context.SaveChangesAsync();
    }
}