using Entities.Models;

namespace Contracts;
public interface ISubCategoryService
    {
        Task<Subcategory> CreateSubcategoryAsync(Subcategory subcategory);
        Task<Subcategory> GetSubcategoryAsync(int subcategoryId);
        Task<List<Subcategory>> GetAllSubcategories();
        Task UpdateSubcategory(Subcategory subcategory);
        Task DeleteSubcategory(int subcategoryId);
    }