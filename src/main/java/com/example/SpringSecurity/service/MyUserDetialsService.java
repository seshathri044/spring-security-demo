package com.example.SpringSecurity.service;

import com.example.SpringSecurity.models.User;
import com.example.SpringSecurity.models.UserPrincipal;
import com.example.SpringSecurity.repository.UserDetialsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetialsService implements UserDetailsService {

    @Autowired
    UserDetialsRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repo.getByUsername(username);
        if(user ==  null){
            throw new UsernameNotFoundException("User not found");
        }
        return  new UserPrincipal(user);
    }
}
