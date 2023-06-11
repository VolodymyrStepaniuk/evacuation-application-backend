package com.volunteer.spring.exceptions;

import jakarta.persistence.EntityNotFoundException;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class RequestNotFoundException extends EntityNotFoundException {
    private String message;
    public RequestNotFoundException(){

        message = "No request found";
    }
}
