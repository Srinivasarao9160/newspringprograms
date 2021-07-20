package com.ojas.exception;

public class BlogAlreadyExitsException extends RuntimeException {
    private String message;
    public BlogAlreadyExitsException(String message) {
        super(message);
        this.message = message;
    }
    public BlogAlreadyExitsException() {
    }
}
