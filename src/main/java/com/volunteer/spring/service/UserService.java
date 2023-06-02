package com.volunteer.spring.service;

import com.volunteer.spring.exceptions.UserNotFoundException;
import com.volunteer.spring.interfaces.ServiceInterface;
import com.volunteer.spring.model.User;
import com.volunteer.spring.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements ServiceInterface<User> {
    private final UserRepository repository;

    @Override
    public void save(User user) {
        repository.save(user);
    }

    @Override
    public Iterable<User> getAll() {
        return repository.findAll();
    }

    @Override
    public void delete(User user) {
        repository.delete(user);
    }
    //TODO: add some functional
    @Override
    public void update(User user) {

    }

    @Override
    public User getById(Long id) {
        return repository.findById(id).orElseThrow(UserNotFoundException::new);
    }

    public User findByUsername(String username){
        return repository.findByUsername(username).orElseThrow(UserNotFoundException::new);
    }
}
