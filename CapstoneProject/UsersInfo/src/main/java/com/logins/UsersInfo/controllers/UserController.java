package com.logins.UsersInfo.controllers;

import com.logins.UsersInfo.response.BookingDTO;
import com.logins.UsersInfo.response.BookingResponse;
import com.logins.UsersInfo.response.UserResponseWithBooking;
import com.logins.UsersInfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/booking/details/{user_id}")
    public ResponseEntity<Mono<List<BookingResponse>>> getBookingDetailsByUserId(@PathVariable int user_id){
        UserResponseWithBooking userResponseWithBooking= userService.getBookingDetailsByUserId(user_id);
        return ResponseEntity.status(HttpStatus.CREATED).body( userResponseWithBooking.getBookingResponseList());
    }

    @PostMapping("/booking/add/{user_id}")
    public String addBookingDetails(@PathVariable int user_id,@RequestBody BookingDTO bookingDTO){
        if(userService.addBookingDetails(user_id,bookingDTO)!=null){
            return "booking added";
        }
        return "not added";

    }


}
