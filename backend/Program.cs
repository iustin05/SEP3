using backend.Contracts;
using backend.EFC;
using backend.EFC.DAOImplementation;
using backend.Services;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.

builder.Services.AddControllers();
// Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();
builder.Services.AddGrpc();

builder.Services.AddScoped<IBookingDao, BookingDaoImplementation>();
builder.Services.AddScoped<IUserDao, UserDaoImpl>();
builder.Services.AddScoped<ICarDao, CarDaoImplementation>();
builder.Services.AddScoped<DbAccess, DbAccess>();


var app = builder.Build();

// Configure the HTTP request pipeline.
if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI();
}

app.MapGrpcService<CarService>();
app.MapGrpcService<BookingService>();
app.MapGrpcService<UserService>();

app.UseHttpsRedirection();

app.UseAuthorization();

app.MapControllers();

app.Run();