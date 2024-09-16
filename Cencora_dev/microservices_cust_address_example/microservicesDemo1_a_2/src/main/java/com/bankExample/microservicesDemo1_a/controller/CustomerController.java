package com.bankExample.microservicesDemo1_a.controller;

import com.bankExample.microservicesDemo1_a.response.CustomerResponse;
import com.bankExample.microservicesDemo1_a.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/customer/{id}")
    public ResponseEntity<CustomerResponse> getCustomerDetails(@PathVariable("id") int id){
        CustomerResponse customerResponse=customerService.getCustomerById(id);
//        return ResponseEntity.status(HttpStatus.OK).body(customerResponse);
        return ResponseEntity.status(HttpStatus.CREATED).body(customerResponse);
    }
}
