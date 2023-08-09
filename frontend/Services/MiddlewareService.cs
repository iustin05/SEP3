using System.Text.Json;
using frontend.Models;

namespace frontend.Services;

public class MiddlewareService
{
    private readonly HttpClient _httpClient;
    private readonly UserService _userService;

    public MiddlewareService(HttpClient httpClient, UserService userService)
    {
        _httpClient = httpClient;
        _userService = userService;
    }

    public async Task<List<Car>?> GetCarsAsync()
    {
        var response = await _httpClient.GetAsync($"http://localhost:8080/api/cars");
        var responseString = await response.Content.ReadAsStringAsync();
        return JsonSerializer.Deserialize<List<Car>>(responseString);
    }

    public async Task<bool> BookCarAsync(int carId, DateTime startDate, DateTime endDate)
    {
        int? userId = await _userService.GetUserIdAsync();

        if (userId == null)
        {
            return false; // User not logged in
        }

        var response = await _httpClient.GetAsync($"api/bookCar/{carId}/{userId}/{startDate}/{endDate}");

        return response.IsSuccessStatusCode;
    }

    public async Task<bool> CancelBookingAsync(int userId, int carId)
    {
        var response = await _httpClient.GetAsync($"api/cancelBooking/{userId}/{carId}");
        var responseString = await response.Content.ReadAsStringAsync();
        return JsonSerializer.Deserialize<bool>(responseString);
    }

    public async Task<string?> GetReportsAsync()
    {
        var response = await _httpClient.GetAsync("api/getReports");
        var responseString = await response.Content.ReadAsStringAsync();
        return JsonSerializer.Deserialize<string>(responseString);
    }

    public async Task<bool> SetCarAsync(int carId, CarStatus newState)
    {
        var response = await _httpClient.GetAsync($"api/setCar/{carId}/{(int)newState}");
        var responseString = await response.Content.ReadAsStringAsync();
        return JsonSerializer.Deserialize<bool>(responseString);
    }

    // public async Task<bool> AddCarAsync(int carId, int newPrice, int newColor, int newImage, /* other parameters */)
    // {
    //     var response = await _httpClient.GetAsync($"api/addCar/{carId}/{newPrice}/{newColor}/{newImage}"); // Add other parameters
    //     var responseString = await response.Content.ReadAsStringAsync();
    //     return JsonSerializer.Deserialize<bool>(responseString);
    // }

    public async Task<bool> RemoveCarAsync(int carId)
    {
        var response = await _httpClient.GetAsync($"api/removeCar/{carId}");
        var responseString = await response.Content.ReadAsStringAsync();
        return JsonSerializer.Deserialize<bool>(responseString);
    }

    // public async Task<bool> UpdateCarAsync(int carId, int newPrice, int newColor, int newImage, /* other parameters */)
    // {
    //     var response = await _httpClient.GetAsync($"api/updateCar/{carId}/{newPrice}/{newColor}/{newImage}"); // Add other parameters
    //     var responseString = await response.Content.ReadAsStringAsync();
    //     return JsonSerializer.Deserialize<bool>(responseString);
    // }
    //
    // public async Task<bool> ChangeUserAsync(int userId, string newEmail, string newPassword, /* other parameters */)
    // {
    //     var response = await _httpClient.GetAsync($"api/changeUser/{userId}/{newEmail}/{newPassword}"); // Add other parameters
    //     var responseString = await response.Content.ReadAsStringAsync();
    //     return JsonSerializer.Deserialize<bool>(responseString);
    // }
}