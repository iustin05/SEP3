using Entities.Models;

namespace Contracts;
public interface ICustomerService
    {
        Task<Customer> CreateCustomerAsync(Customer customer);
        Task<Customer> GetCustomerAsync(int customerId);
        Task<List<Customer>> GetAllCustomers();
        Task UpdateCustomer(Customer customer);
        Task DeleteCustomer(int customerId);
    }
