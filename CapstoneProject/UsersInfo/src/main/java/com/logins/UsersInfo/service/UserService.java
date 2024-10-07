package com.logins.UsersInfo.service;

import com.logins.UsersInfo.entity.User;
import com.logins.UsersInfo.repository.UserRepo;
import com.logins.UsersInfo.response.UserResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;

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


}
