package com.pack.trainBookings.controller;


import com.pack.trainBookings.entity.Booking;
import com.pack.trainBookings.entity.Trains;
import com.pack.trainBookings.response.BookingResponse;
import com.pack.trainBookings.service.BookingService;
import org.hibernate.annotations.CurrentTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/booking")
public class BookingController {
    @Autowired
    BookingService bookingService;

//    add booking details when user books Ticket
    @PostMapping("/addBooking")
    public BookingResponse addBooking(@PathVariable int user_id,@RequestBody BookingResponse bookingResponse){
        Booking booking=new Booking();
        booking.setPassenger_name(bookingResponse.getPassenger_name());
        booking.setPassenger_age(bookingResponse.getPassenger_age());
        booking.setBooking_date(LocalDateTime.now());
        booking.setUser_id(user_id);
        Trains train=booking.getTrain();
        if(train==null) return null;
        return bookingService.addBookingDetails(booking);
    }

//    show booking details using booking_id (no use)
    @GetMapping("/getbookings")
    public ResponseEntity<Optional<Booking>> getBookingDetails(@RequestParam int booking_id){
        return ResponseEntity.ok(bookingService.getBookingDetails(booking_id));
    }

//    show bookings using user_id
    @GetMapping("/search/{user_id}")
    public ResponseEntity<List<BookingResponse>> getBookingDetailsByUserId(@PathVariable int user_id){
        List<BookingResponse> bookingResponseList=bookingService.getBookingDetailsByUserId(user_id);
        return ResponseEntity.ok(bookingResponseList!=null?bookingResponseList:null);
    }
//  cancel booking
    @PostMapping("/cancel/{booking_id}")
    public void cancelTheBooking(@PathVariable int booking_id){
        bookingService.cancelTheBooking(booking_id);
    }


//    optional...
//    show booking details of particular train(for admin)
//    show booking details base on the train_name

}
