package com.example.CustomerRelationship.service;

import com.example.CustomerRelationship.model.Customer;
import com.example.CustomerRelationship.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService{
    @Autowired
    CustomerRepo userDao;

    public List<Customer> getAll() {
        return userDao.findAll();
    }

    public Optional<Customer> getById(long id) {
        return userDao.findById(id);
    }

    public Customer save(Customer newUser) {
        return userDao.save(newUser);
    }

    public void delete(long id) {
        userDao.deleteById(id);
    }
}
