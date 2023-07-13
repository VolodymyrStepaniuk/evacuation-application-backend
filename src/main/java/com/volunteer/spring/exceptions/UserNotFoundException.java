package com.volunteer.spring.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(){
        super("No user found");
    }
    public UserNotFoundException(String message){
        super(message);
    }
    public UserNotFoundException(Throwable throwable){
        super(throwable);
    }
}
