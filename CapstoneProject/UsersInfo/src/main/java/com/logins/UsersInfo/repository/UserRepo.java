package com.logins.UsersInfo.repository;

import com.logins.UsersInfo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    User findByEmail(String email);
//    User findByUser_Role(String role);
}
