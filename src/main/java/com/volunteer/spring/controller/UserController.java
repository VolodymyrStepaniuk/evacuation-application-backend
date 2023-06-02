package com.volunteer.spring.controller;

import com.volunteer.spring.interfaces.ControllerInterface;
import com.volunteer.spring.model.User;
import com.volunteer.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController implements ControllerInterface<User> {
    private final UserService service;

    @Override
    public Iterable<User> getAll(){
        return service.getAll();
    }

    @Override
    public User getById(Long id) {
        return service.getById(id);
    }


    public ResponseEntity.HeadersBuilder<?> changeById(Long id){
        service.update(service.getById(id));
        return ResponseEntity.ok();
    }

    public ResponseEntity.HeadersBuilder<?> deleteById( Long id){
        service.delete(service.getById(id));
        return ResponseEntity.ok();
    }
}
