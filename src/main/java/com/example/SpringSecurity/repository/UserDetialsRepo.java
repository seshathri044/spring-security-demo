package com.example.SpringSecurity.repository;

import com.example.SpringSecurity.models.User;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetialsRepo extends JpaRepository<User,Integer> {
    User getByUsername(String username);

}
