package com.example.SpringSecurity.service;

import com.example.SpringSecurity.models.User;
import com.example.SpringSecurity.repository.UserDetialsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDetialsRepo repo;

    @Autowired
    private PasswordEncoder passwordEncoder; // injected from SecurityConfiguration

    public void addUser(User user) {
        // Encode password before saving
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        repo.save(user);
    }
}
