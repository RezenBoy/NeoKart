package com.neokart.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class User {
    @GetMapping("/register")
    public String registerUser() {
        return "customer/register-form";
    }


    @GetMapping("/login")
    public String loginUser() {
        return "customer/login-form";
    }
    
}
