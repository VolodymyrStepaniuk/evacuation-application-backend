package com.volunteer.spring.service;

import com.volunteer.spring.exceptions.TokenNotFoundException;
import com.volunteer.spring.interfaces.ServiceInterface;
import com.volunteer.spring.model.Token;
import com.volunteer.spring.repository.TokenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TokenService implements ServiceInterface<Token> {
    private final TokenRepository repository;
    public List<Token> findAllValidTokenByUser(Long userId){
        return repository.findAllValidTokenByUser(userId);
    }
    public Optional<Token> findByToken(String token){
        return repository.findByToken(token);
    };

    @Override
    public void save(Token token) {
        repository.save(token);
    }

    @Override
    public Iterable<Token> getAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Token token) {
        repository.delete(token);
    }
    //TODO: add some functional
    @Override
    public void update(Token token) {

    }

    @Override
    public Token getById(Long id) {
        return repository.findById(id).orElseThrow(TokenNotFoundException::new);
    }

    public void saveAll(List<Token> validUserTokens) {
        repository.saveAll(validUserTokens);
    }
}
