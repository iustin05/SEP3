using Entities.Models;
using Microsoft.EntityFrameworkCore;

namespace EFC.DAOImplementation;
public class SubcategoryDAOImplementation : ISubcategoryService {
    private readonly DbAccess _context;

    public SubcategoryDAOImplementation(DbAccess context)
    {
        _context = context;
    }

    public async Task<Subcategory> AddSubcategory(Subcategory subcategory)
    {
        await _context.Subcategories.AddAsync(subcategory);
        await _context.SaveChangesAsync();
        return subcategory;
    }

    public async Task<List<Subcategory>> GetAllSubcategories()
    {
        return await _context.Subcategories.ToListAsync();
    }

    public async Task<Subcategory> GetSubcategoryById(int id)
    {
        return await _context.Subcategories.FindAsync(id) ?? throw new Exception("Subcategory not found");
    }

    public async Task UpdateSubcategory(Subcategory subcategory)
    {
        _context.Entry(subcategory).State = EntityState.Modified;
        await _context.SaveChangesAsync();
    }

    public async Task DeleteSubcategory(int id)
    {
        var subcategory = await _context.Subcategories.FindAsync(id) ?? throw new Exception("Subcategory not found");
        _context.Subcategories.Remove(subcategory);
        await _context.SaveChangesAsync();
    }
}