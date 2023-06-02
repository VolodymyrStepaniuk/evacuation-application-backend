package com.volunteer.spring.service;

import com.volunteer.spring.exceptions.RequestNotFoundException;
import com.volunteer.spring.interfaces.ServiceInterface;
import com.volunteer.spring.model.Request;
import com.volunteer.spring.repository.RequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RequestService implements ServiceInterface<Request> {
    private final RequestRepository repository;
    @Override
    public void save(Request request) {
        repository.save(request);
    }

    @Override
    public Iterable<Request> getAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Request request) {
        repository.delete(request);
    }
    //TODO: add some functional
    @Override
    public void update(Request request) {
    }

    @Override
    public Request getById(Long id) {
        return repository.findById(id).orElseThrow(RequestNotFoundException::new);
    }
}
