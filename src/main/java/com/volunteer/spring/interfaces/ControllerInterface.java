package com.volunteer.spring.interfaces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

public interface ControllerInterface<T> {
    @GetMapping("/all")
    Iterable<T> getAll();

    @GetMapping("/{id}")
    T getById(@PathVariable("id") Long id);

    @PutMapping("/{id}")
    ResponseEntity.HeadersBuilder<?> changeById(@PathVariable Long id);

    @DeleteMapping("/{id}")
    ResponseEntity.HeadersBuilder<?> deleteById(@PathVariable Long id);
}
