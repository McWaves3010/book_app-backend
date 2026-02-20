package com.example.demo2.controllers;

import com.example.demo2.models.User;
import com.example.demo2.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/me")
    public Object me(){
        return Map.of("id", 1, "name" , "Samuel" , "email" , "samuelamoh@ghmail.com");
    }

    @PostMapping("/register")
    public Object register(@RequestBody User user){
        return userService.register(user);
    }
}
