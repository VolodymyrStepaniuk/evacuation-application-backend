package com.volunteer.spring.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class TokenNotFoundException extends RuntimeException {
    public TokenNotFoundException(){
        super("No token found");
    }
    public TokenNotFoundException(String message){
        super(message);
    }
    public TokenNotFoundException(Throwable throwable){
        super(throwable);
    }
}