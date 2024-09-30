package com.MongoHiber.shop.repo;

import com.MongoHiber.shop.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Update;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ShoppingRepo extends MongoRepository<User, Integer> {
    List<User> findByName(String name);

    @Query("{'Address.city':?0}")
    List<User> findByCity(String city);


    @Query("{'Address.state':?0}")
    List<User> findByState(String state);


//    @Query(value = "{'Address.city': ?0}", update = "{'$set': {'Address.state': ?1}}")
//    List<User> updateName(int id, String name);
}
