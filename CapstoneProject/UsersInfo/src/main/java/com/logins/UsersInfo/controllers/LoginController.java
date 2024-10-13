package com.logins.UsersInfo.controllers;

import com.logins.UsersInfo.entity.User;
import com.logins.UsersInfo.response.LogInDTO;
import com.logins.UsersInfo.response.UserResponse;
import com.logins.UsersInfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class LoginController {
    @Autowired
    private UserService userService;



    //all user details(no usr)
    /*@GetMapping("/allusers")
    public ResponseEntity<List<UserResponse>> getaAllUserDetails(){
        List<UserResponse> userResponses= userService.getAllusers();
        return ResponseEntity.status(HttpStatus.CREATED).body(userResponses);
    }*/

    //add new user
    @PostMapping("/register")
    public ResponseEntity<UserResponse>  addNewuser(@RequestBody User user){
//        validtion that user is new
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.addUserDetails(user));
    }

//    get user by id
    @GetMapping("/getUser/{id}")
    public  ResponseEntity<UserResponse> getSingleUserDetails(@PathVariable("id") int id){
        UserResponse userResponse=userService.getSingleuserById(id);
        return ResponseEntity.status(HttpStatus.CREATED).body(userResponse);
    }

    @PostMapping("/login")
    public ResponseEntity<UserResponse> authenTicateuser(@RequestBody LogInDTO logInDTO){
        UserResponse isAuthenticated=userService.authenthenticateUser(logInDTO);
        /*String msg;
        if(isAuthenticated)  msg="Login successful";
        else msg="Invalid credentials";*/
        return ResponseEntity.status(HttpStatus.CREATED).body(isAuthenticated==null?null:isAuthenticated);
    }






}
