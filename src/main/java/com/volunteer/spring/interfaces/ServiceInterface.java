package com.volunteer.spring.interfaces;

public interface ServiceInterface<T> {
    void save(T t);
    Iterable<T> getAll();
    void delete(T t);
    void update(T t);
    T getById(Long id);
}
