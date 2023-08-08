using Entities.Models;

interface IRatingService {
    public Task<Rate> AddRating(Rate rate);
    public Task<List<Rate>> GetAllRatings();
    public Task<Rate> GetRatingById(int id);
    public Task UpdateRating(Rate rating);
    public Task DeleteRating(int id);
}