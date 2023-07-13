package com.volunteer.spring.exceptions;

public class InvalidTokenException extends RuntimeException{
    public InvalidTokenException(){
        super("This token is invalid");
    }
    public InvalidTokenException(String message){
        super(message);
    }
    public InvalidTokenException(Throwable throwable){
        super(throwable);
    }
}
