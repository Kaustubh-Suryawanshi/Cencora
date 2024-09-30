package com.MongoHiber.shop.controller;

import com.MongoHiber.shop.model.User;
import com.MongoHiber.shop.repo.ShoppingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shopping-Service")
public class ShopController {
    @Autowired
    private ShoppingRepo shoppingRepo;

    public ShopController(ShoppingRepo shoppingRepo) {
        this.shoppingRepo = shoppingRepo;
    }

    @PostMapping("/orderPlace")
    private String placeOrder(@RequestBody User user) {
        shoppingRepo.save(user);
        return "Order placed successfully";
    }
    //also we can write above method as
    /*@PostMapping
    public ResponseEntity<User> saveOrUpdate(@RequestBody User user){
    return new ResponseEntity<User>(shoppingRepo.saveOrUpdate(user),HTTPStatus.ACCEPTED);
    }*/

    @GetMapping("/getUsersByName/{name}")
    public List<User> getUserByName(@PathVariable String name) {
        return shoppingRepo.findByName(name);
    }

    @GetMapping("/getUsersByAddress/{city}")
    public List<User> getUserByAddress(@PathVariable String city) {
        return shoppingRepo.findByCity(city);
    }

    @GetMapping("/getUsersByState/{state}")
    public List<User> getUserByState(@PathVariable String state) {
        return shoppingRepo.findByState(state);
    }








}
