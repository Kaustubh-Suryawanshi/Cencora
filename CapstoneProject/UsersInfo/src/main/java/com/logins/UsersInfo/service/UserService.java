package com.logins.UsersInfo.service;

import com.logins.UsersInfo.entity.User;
import com.logins.UsersInfo.repository.UserRepo;
import com.logins.UsersInfo.response.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private WebClient webClient;


    public List<UserResponse> getAllusers(){
        UserResponse userResponse;
        List<User> allusers= userRepo.findAll();
        List<UserResponse> userResponses=new ArrayList<>();
        for(Object it:allusers){
             userResponse=modelMapper.map(it, UserResponse.class) ;
             userResponses.add(userResponse);
        }
        return userResponses;
    }

    public void addUserDetails(User user){
        userRepo.save(user);
    }

    public UserResponse getSingleuserById(int id){
        User user  = userRepo.findById(id).get();
        return modelMapper.map(user,UserResponse.class);
    }




    public boolean authenthenticateUser(LogInDTO logInDTO) {
        String email=logInDTO.getEmail();
        if(userRepo.findByEmail(email)!=null && userRepo.findByEmail(email).getPassword().equals( logInDTO.getPassword())){
            return true;
        }
        return false;

    }

    public UserResponseWithBooking getBookingDetailsByUserId(int user_id){
        Mono<List<BookingResponse>> bookingResponseList;
        UserResponseWithBooking userResponseWithBooking=new UserResponseWithBooking();
        userResponseWithBooking.setUser_id(user_id);
        bookingResponseList= webClient.get()
                .uri("/booking/search/"+user_id) // Adjust the endpoint as necessary
                .retrieve()
                .bodyToFlux(BookingResponse.class)
                .collectList();
        userResponseWithBooking.setBookingResponseList(bookingResponseList);
        return userResponseWithBooking;
    }

    public BookingResponse addBookingDetails(int userId, BookingDTO bookingDTO) {
        bookingDTO.setUser_id(userId);
        return webClient.post().uri("/booking/addBooking")
                .bodyValue(bookingDTO)
                .retrieve()
                .bodyToMono(BookingResponse.class).block();

    }
}
