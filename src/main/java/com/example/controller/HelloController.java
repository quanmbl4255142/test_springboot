package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {
    
    @GetMapping("/hello")
    public ResponseEntity<Map<String, Object>> getHello() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Hello from Spring Boot Backend!");
        response.put("time", LocalDateTime.now());
        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/health")
    public ResponseEntity<Map<String, Object>> getHealth() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "healthy");
        response.put("service", "Spring Boot Backend");
        response.put("timestamp", LocalDateTime.now());
        return ResponseEntity.ok(response);
    }
}
