package com.example.demo2.services;

import com.example.demo2.models.User;
import com.example.demo2.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Object register(User user) {
        try{
            boolean existingUser = userRepository.findByEmail(user.getEmail());
            if(existingUser){
                return Map.of("message" , "User already exist");
            }
            User user1 = new User();
            user1.setName(user.getName());
            user1.setEmail(user.getEmail());
            user1.setPassword(user.getPassword());
            userRepository.save(user1);
            return Map.of("message" , "User saved successfully");
        }catch(Exception e){
            return new RuntimeException(e.getMessage());
        }
    }
}
