using Entities.Models;
using Microsoft.EntityFrameworkCore;

namespace EFC.DAOImplementation;
public class CustomerDAOImplementation : ICustomerService
    {
        private readonly DbAccess _context;

        public CustomerDAOImplementation(DbAccess context)
        {
            _context = context;
        }

        public async Task<Customer> AddCustomer(Customer customer)
        {
            await _context.Customers.AddAsync(customer);
            await _context.SaveChangesAsync();
            return customer;
        }

        public async Task<List<Customer>> GetAllCustomers()
        {
            return await _context.Customers.ToListAsync();
        }

        public async Task<Customer> GetCustomerById(int id)
        {
            return await _context.Customers.FindAsync(id) ?? throw new Exception("Customer not found");
        }

        public async Task UpdateCustomer(Customer customer)
        {
            _context.Entry(customer).State = EntityState.Modified;
            await _context.SaveChangesAsync();
        }

        public async Task DeleteCustomer(int id)
        {
            var customer = await _context.Customers.FindAsync(id) ?? throw new Exception("Customer not found");
            _context.Customers.Remove(customer);
            await _context.SaveChangesAsync();
        }
    }