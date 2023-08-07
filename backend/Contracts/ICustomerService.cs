using Entities.Models;

interface ICustomerService {
    public Task<Customer> AddCustomer(Customer customer);
    public Task<List<Customer>> GetAllCustomers();
    public Task<Customer> GetCustomerById(int id);
    public Task UpdateCustomer(Customer customer);
    public Task DeleteCustomer(int id);

}