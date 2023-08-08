using backend.Contracts;
using backend.Models;
using Microsoft.EntityFrameworkCore;

namespace backend.EFC.DAOImplementation;

public class RatingDaoImpl : IRatingService {
    private readonly DbAccess _context;

    public RatingDaoImpl(DbAccess context)
    {
        _context = context;
    }

    public async Task<Rating> AddRating(Rating rating)
    {
        await _context.Ratings!.AddAsync(rating);
        await _context.SaveChangesAsync();
        return rating;
    }

    public async Task DeleteRating(int id)
    {
        var rating = await _context.Ratings!.FindAsync(id) ?? throw new Exception("Rating not found");
        _context.Ratings.Remove(rating);
        await _context.SaveChangesAsync();
    }

    public async Task<List<Rating>> GetAllRatings()
    {
        return await _context.Ratings!.ToListAsync() ?? throw new Exception("No ratings found");
    }

    public async Task<Rating> GetRatingById(int id)
    {
        return await _context.Ratings!.FindAsync(id) ?? throw new Exception("Rating not found");
    }

    public async Task UpdateRating(Rating rating)
    {
        _context.Entry(rating).State = EntityState.Modified;
        await _context.SaveChangesAsync();
    }
}