package com.prac.JpaTestConn.controller;


import com.prac.JpaTestConn.entities.Customer;

import com.prac.JpaTestConn.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    private final CustomerService customerService;
    //custructor based injection no need of autowiring
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAllCustomers()
    {
        return  ResponseEntity.ok(customerService.getAllCustomer());

    }
}

