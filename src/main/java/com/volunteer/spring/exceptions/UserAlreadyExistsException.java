package com.volunteer.spring.exceptions;

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(){
        super("User already exists!");
    }
    public UserAlreadyExistsException(String message){
        super(message);
    }
    public UserAlreadyExistsException(Throwable throwable){
        super(throwable);
    }
}
