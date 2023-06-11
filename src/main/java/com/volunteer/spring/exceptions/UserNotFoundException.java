package com.volunteer.spring.exceptions;

import jakarta.persistence.EntityNotFoundException;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserNotFoundException extends EntityNotFoundException {
    private String message;
    public UserNotFoundException(){
        message = "No user found";
    }
}
