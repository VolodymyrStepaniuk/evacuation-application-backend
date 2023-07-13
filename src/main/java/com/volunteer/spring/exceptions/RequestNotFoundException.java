package com.volunteer.spring.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class RequestNotFoundException extends RuntimeException {
    public RequestNotFoundException(){
       super("No request found");
    }
    public RequestNotFoundException(String message){
        super(message);
    }
    public RequestNotFoundException(Throwable throwable){
        super(throwable);
    }
}
