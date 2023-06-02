package com.volunteer.spring.controller;

import com.volunteer.spring.auth.AuthenticationRequest;
import com.volunteer.spring.auth.AuthenticationResponse;
import com.volunteer.spring.auth.RegisterRequest;
import com.volunteer.spring.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;
    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(service.register(request));
    }
    @PostMapping("/auth")
    public ResponseEntity<AuthenticationResponse> authentication(@RequestBody AuthenticationRequest request){
        return ResponseEntity.ok(service.authenticate(request));
    }
}
