package com.bankExample.microservicesDemo1_b.controller;

import com.bankExample.microservicesDemo1_b.response.AddressResponse;
import com.bankExample.microservicesDemo1_b.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @GetMapping("/address/{id}")
    public ResponseEntity<AddressResponse> getCustomerDetails(@PathVariable("id") int id){
        AddressResponse customerResponse=addressService.findAddressById(id);
//        return ResponseEntity.status(HttpStatus.OK).body(customerResponse);
        return ResponseEntity.status(HttpStatus.CREATED).body(customerResponse);
    }


}
