package com.example.SpringSecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
    @GetMapping("/")
    public String home(HttpServletRequest request){
        return "Home Page" + request.getSession().getId();
    }
    @GetMapping("/about")
    public String aboutUs(){
        return "Seshathri";
    }
    @GetMapping("/csrf.token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
