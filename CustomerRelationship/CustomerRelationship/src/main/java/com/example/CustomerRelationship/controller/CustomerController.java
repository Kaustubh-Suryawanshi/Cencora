package com.example.CustomerRelationship.controller;

import java.util.List;
import java.util.Optional;

import com.example.CustomerRelationship.exception.RecordNotFoundException;
import com.example.CustomerRelationship.exception.ServerException;
import com.example.CustomerRelationship.model.Customer;
import com.example.CustomerRelationship.service.CustomerService;
import org.hibernate.boot.model.CustomSql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("users")
    public ResponseEntity<List<Customer>> getAll() {
        return new ResponseEntity<>(customerService.getAll(), HttpStatus.OK);
    }

    @GetMapping("users/{id}")
    public ResponseEntity<Customer> getById(@PathVariable final long id) {
        Optional<Customer> user = customerService.getById(id);
        if (user.isPresent()) {
            return new ResponseEntity<>(user.get(), HttpStatus.OK);
        }
        else {
            throw new RecordNotFoundException();
        }
    }

    @PostMapping(path = "users",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> create(@RequestBody final Customer newUser) {
        Customer user = customerService.save(newUser);
        if (user == null) {
            throw new ServerException();
        }
        else {
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        }
    }

    @PutMapping("users/{id}")
    public ResponseEntity<Customer> update(@RequestBody final Customer updatedUser) {
        Customer user = customerService.save(updatedUser);
        if (user == null) {
            throw new ServerException();
        }
        else {
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
    }

    @DeleteMapping("users/{id}")
    public HttpStatus delete(@PathVariable final long id) {
        try {
            customerService.delete(id);
            return HttpStatus.OK;
        }
        catch (Exception e) {
            throw new RecordNotFoundException();
        }
    }
}

