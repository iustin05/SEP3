using Entities.Models;

namespace EFC.DAOImplementation;

public class RatingDAOImpl : IRatingService
{
    private readonly DbAccess _context;

    public RatingDAOImpl(DbAccess context)
    {
        _context = context;
    }
    
    public async Task<Rate> AddRate(Rate rate)
    {
        try
        {
            Console.WriteLine(rate.ratedUsername+" "+rate.ratingUsername+" "+rate.score);
            return rate;
        }
        catch (Exception e)
        {
            throw new Exception(e.Message);
        }

    }
}