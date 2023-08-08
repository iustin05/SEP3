using backend.EFC;
using Backend.Grpc;
using Grpc.Core;

namespace backend.Services.Exposed;

public class BookingGrpcService : Backend.Grpc.BookingGrpcService.BookingGrpcServiceBase
{
    private readonly IBookingDao _bookingDao;

    public BookingGrpcService(IBookingDao bookingDao)
    {
        _bookingDao = bookingDao;
    }

    public override async Task<Booking> AddBooking(Booking request, ServerCallContext context)
    {
        var booking = await _bookingDao.AddBooking(ConvertToDomainModel(request));
        return ConvertToMessage(booking);
    }

    public override async Task<Bookings> GetAllBookings(Empty request, ServerCallContext context)
    {
        var bookings = await _bookingDao.GetAllBookings();
        return new Bookings { Bookings_ = { bookings.Select(ConvertToMessage) } };
    }

    public override async Task<Booking> GetBookingById(IdRequest request, ServerCallContext context)
    {
        var booking = await _bookingDao.GetBookingById(request.Id);
        return ConvertToMessage(booking);
    }

    public override async Task<Empty> UpdateBooking(Booking request, ServerCallContext context)
    {
        await _bookingDao.UpdateBooking(ConvertToDomainModel(request));
        return new Empty();
    }

    public override async Task<Empty> DeleteBooking(IdRequest request, ServerCallContext context)
    {
        await _bookingDao.DeleteBooking(request.Id);
        return new Empty();
    }

    private backend.Models.Booking ConvertToDomainModel(Booking message)
    {
        return new backend.Models.Booking
        {
            Id = message.Id,
            CustomerId = message.CustomerId,
            CarId = message.CarId,
            TotalPrice = message.TotalPrice,
            CreatedTime = DateTime.Parse(message.CreatedTime),
            StartTime = DateTime.Parse(message.StartTime),
            EndTime = DateTime.Parse(message.EndTime),
            Status = (backend.Models.BookingStatus)message.Status
        };
    }

    private Booking ConvertToMessage(backend.Models.Booking domainModel)
    {
        return new Booking
        {
            Id = domainModel.Id,
            CustomerId = domainModel.CustomerId,
            CarId = domainModel.CarId,
            TotalPrice = domainModel.TotalPrice,
            CreatedTime = domainModel.CreatedTime.ToString("o"),
            StartTime = domainModel.StartTime.ToString("o"),
            EndTime = domainModel.EndTime.ToString("o"),
            Status = (BookingStatus)domainModel.Status
        };
    }
}