using frontend.Models;

namespace frontend.Contracts;

interface IRatingService {
    public Task<Rating> AddRating(Rating rating);
    public Task<List<Rating>> GetAllRatings();
    public Task<Rating> GetRatingById(int id);
    public Task UpdateRating(Rating rating);
    public Task DeleteRating(int id);
}