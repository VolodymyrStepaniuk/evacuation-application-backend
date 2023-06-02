package com.volunteer.spring.controller;

import com.volunteer.spring.interfaces.ControllerInterface;
import com.volunteer.spring.model.Request;
import com.volunteer.spring.service.RequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/request")
@RequiredArgsConstructor
public class RequestController implements ControllerInterface<Request> {
    private final RequestService service;

    @Override
    public Iterable<Request> getAll() {
        return service.getAll();
    }

    @Override
    public Request getById(Long id) {
        return service.getById(id);
    }

    @Override
    public ResponseEntity.HeadersBuilder<?> changeById(Long id) {
        service.update(service.getById(id));
        return ResponseEntity.ok();
    }

    @Override
    public ResponseEntity.HeadersBuilder<?> deleteById(Long id) {
        service.delete(service.getById(id));
        return ResponseEntity.ok();
    }
}
