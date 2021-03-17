package com.ioanna.shopping.models;



import org.springframework.data.jpa.repository.JpaRepository;

import com.ioanna.shopping.models.data.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
    
}