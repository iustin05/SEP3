using backend.EFC;
using backend.EFC.DAOImplementation;
using backend.Services;
using backend.Services.Exposed;
using Microsoft.AspNetCore.Hosting;
using Microsoft.Extensions.Hosting;
using Microsoft.EntityFrameworkCore;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.

builder.Services.AddControllers();
// Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();
builder.Services.AddGrpc();

// Adding Database Context with PostgreSQL
builder.Services.AddDbContext<DbContext>(options =>
    options.UseNpgsql(builder.Configuration.GetConnectionString("DefaultConnection")));


builder.Services.AddScoped<IBookingDao, BookingDaoImplementation>();
builder.Services.AddScoped<IUserDao, UserDaoImpl>();
builder.Services.AddScoped<ICarDao, CarDaoImplementation>();
builder.Services.AddScoped<DbAccess, DbAccess>();

builder.WebHost.ConfigureKestrel(options =>
{
    options.ListenLocalhost(5000, o => o.Protocols = Microsoft.AspNetCore.Server.Kestrel.Core.HttpProtocols.Http2);
});

var app = builder.Build();

// Configure the HTTP request pipeline.
if (app.Environment.IsDevelopment())
{
    app.UseDeveloperExceptionPage();
    app.UseSwagger();
    app.UseSwaggerUI();
}

app.MapGrpcService<CarGrpcService>();
app.MapGrpcService<BookingGrpcService>();
app.MapGrpcService<UserGrpcService>();

app.MapControllers();

app.Run();