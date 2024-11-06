package com.example.sampleapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
public class UserController {

    @GetMapping("/api/v1/user")
    public ResponseEntity<String> getUser() {
        return ResponseEntity.ok("82263855"); // 사번을 반환
    }
}