package com.volunteer.spring.controller;

import com.volunteer.spring.model.User;
import com.volunteer.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping
    public Iterable<User> getAllUsers(){
        return service.getAll();
    }
}
