package com.boa.jwtsecurity.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/homes")
public class HomeController {
    @PreAuthorize("hasRole('USER')")
    @GetMapping("/v1.0/user/")
    public ResponseEntity<String> getUser(){
        return ResponseEntity.status(HttpStatus.OK).body("Welcome User");
    }
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/v1.0/admin/")
    public ResponseEntity<String> getAdmin(){
        return ResponseEntity.status(HttpStatus.OK).body("Welcome Admin");
    }
}
