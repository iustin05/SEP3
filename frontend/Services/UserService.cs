using Microsoft.JSInterop;

namespace frontend.Services;

public class UserService
{
    private readonly IJSRuntime _jsRuntime;

    public UserService(IJSRuntime jsRuntime)
    {
        _jsRuntime = jsRuntime;
    }

    public async Task SetUserIdAsync(int userId)
    {
        await _jsRuntime.InvokeVoidAsync("sessionStorage.setItem", "userId", userId.ToString());
    }

    public async Task<int?> GetUserIdAsync()
    {
        string result = await _jsRuntime.InvokeAsync<string>("sessionStorage.getItem", "userId");
        return int.TryParse(result, out int userId) ? userId : (int?)null;
    }
}