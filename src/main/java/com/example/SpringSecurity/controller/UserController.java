package com.example.SpringSecurity.controller;

import com.example.SpringSecurity.models.User;
import com.example.SpringSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/add")
    public void addUser(@RequestBody User user){
        service.addUser(user);
    }
}
