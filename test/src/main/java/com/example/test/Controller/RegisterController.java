package com.example.test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.example.test.Entity.User;
import com.example.test.Service.UserService;

@RestController
@RequestMapping("test")
public class RegisterController {

    @Autowired
    private UserService userService;


    @PostMapping("create")
    public ResponseEntity<User> createRegister(@RequestBody User user){
        return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
    }
}
