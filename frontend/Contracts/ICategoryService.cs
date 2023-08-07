using Entities.Models;

namespace Contracts;
public interface ICategoryService
    {
        Task<Category> CreateCategoryAsync(Category category);
        Task<Category> GetCategoryAsync(int categoryId);
        Task<List<Category>> GetAllCategories();
        Task UpdateCategory(Category category);
        Task DeleteCategory(int categoryId);
    }
