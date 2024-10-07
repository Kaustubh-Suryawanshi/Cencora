package com.logins.UsersInfo.controllers;

import com.logins.UsersInfo.entity.User;
import com.logins.UsersInfo.response.UserResponse;
import com.logins.UsersInfo.service.UserService;
import org.hibernate.boot.model.source.spi.SubclassEntitySource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    //all user details
    @GetMapping("/allusers")
    public ResponseEntity<List<UserResponse>> getaAllUserDetails(){
        List<UserResponse> userResponses= userService.getAllusers();
        return ResponseEntity.status(HttpStatus.CREATED).body(userResponses);
    }

    //add user
    @PostMapping("/adduser")
    public ResponseEntity<List<UserResponse>>  addNewuser(@RequestBody User user){
        userService.addUserDetails(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.getAllusers());
    }

//    get user by id
    @GetMapping("/getUser/{id}")
    public  ResponseEntity<UserResponse> getSingleUserDetails(@PathVariable("id") int id){
        UserResponse userResponse=userService.getSingleuserById(id);
        return ResponseEntity.status(HttpStatus.CREATED).body(userResponse);
    }





}
