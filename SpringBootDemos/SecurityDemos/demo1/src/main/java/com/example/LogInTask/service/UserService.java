package com.example.LogInTask.service;

import com.example.LogInTask.model.User;
import com.example.LogInTask.repo.UserRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void saveUser(User user)
    {
        userRepo.save(user);
    }

    public List<User> getAccountDetails(){
        return userRepo.findAll();
    }
}
