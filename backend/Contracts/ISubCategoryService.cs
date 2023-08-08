using Entities.Models;

interface ISubcategoryService {
    public Task<Subcategory> AddSubcategory(Subcategory subcategory);
    public Task<List<Subcategory>> GetAllSubcategories();
    public Task<Subcategory> GetSubcategoryById(int id);
    public Task UpdateSubcategory(Subcategory subcategory);
    public Task DeleteSubcategory(int id);
}