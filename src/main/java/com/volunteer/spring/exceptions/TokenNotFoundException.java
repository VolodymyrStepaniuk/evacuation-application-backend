package com.volunteer.spring.exceptions;

import jakarta.persistence.EntityNotFoundException;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class TokenNotFoundException extends EntityNotFoundException {
    private String message;
    public TokenNotFoundException(){
        message = "No token found";
    }
}