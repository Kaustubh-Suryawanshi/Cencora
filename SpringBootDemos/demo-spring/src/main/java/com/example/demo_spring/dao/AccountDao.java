package com.example.demo_spring.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {
    public void addAccount(){
        System.out.println("Inside the Account Dao");
    }
}
