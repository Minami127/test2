package com.example.test.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.Entity.User;
import com.example.test.Repository.UserRepository;
import com.example.test.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        System.out.println("Saving User: " + user);
        return userRepository.save(user);
    }
    
}
