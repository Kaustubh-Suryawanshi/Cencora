package com.pack.trainBookings.service;

import com.pack.trainBookings.entity.Booking;
import com.pack.trainBookings.entity.Trains;
import com.pack.trainBookings.repository.BookingRepo;
import com.pack.trainBookings.repository.TrainRepo;
import com.pack.trainBookings.response.BookingResponse;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookingService {
    @Autowired
    private BookingRepo bookingRepo;

    @Autowired
    private TrainRepo trainRepo;

    public BookingResponse addBookingDetails(int train_id,Booking booking) {
        Optional<Trains> managedTrain = trainRepo.findById(train_id);
        managedTrain.get().setAvailable_seats(managedTrain.get().getAvailable_seats()-1);
        booking.setTrain(managedTrain.orElse(null));
        return BookingResponse.MapToBookingResponse(bookingRepo.save(booking));
    }

    public Optional<Booking> getBookingDetails(int booking_id) {
        Optional<Booking> booking =bookingRepo.findById(booking_id);
        return booking;
    }

    public List<BookingResponse> getBookingDetailsByUserId(int user_id) {
        List<BookingResponse> bookingResponseList =bookingRepo.getBookingDetailsByUserId(user_id).stream().
                                                    map(BookingResponse::MapToBookingResponse).
                                                    collect(Collectors.toList());
        return bookingResponseList!=null?bookingResponseList:null;
    }

    public void cancelTheBooking(int bookingId) {
        Optional<Booking> bookingOptional =bookingRepo.findById(bookingId);
        Booking  booking=bookingOptional.get();
        if(bookingOptional.isPresent()) {
            Trains train =booking.getTrain();
            train.setAvailable_seats(train.getAvailable_seats()+1);
            bookingRepo.deleteById(bookingId);
        }
    }
}
