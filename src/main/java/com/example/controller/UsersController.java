package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UsersController {
    
    @GetMapping("/users")
    public ResponseEntity<List<Map<String, Object>>> getUsers() {
        List<Map<String, Object>> users = new ArrayList<>();
        
        Map<String, Object> user1 = new HashMap<>();
        user1.put("id", 1);
        user1.put("name", "Nguyen Van A");
        user1.put("email", "a@example.com");
        
        Map<String, Object> user2 = new HashMap<>();
        user2.put("id", 2);
        user2.put("name", "Tran Thi B");
        user2.put("email", "b@example.com");
        
        Map<String, Object> user3 = new HashMap<>();
        user3.put("id", 3);
        user3.put("name", "Le Van C");
        user3.put("email", "c@example.com");
        
        users.add(user1);
        users.add(user2);
        users.add(user3);
        
        return ResponseEntity.ok(users);
    }
}
