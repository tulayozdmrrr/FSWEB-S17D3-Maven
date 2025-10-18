package com.workintech.zoo.exceptions;

import org.springframework.http.HttpStatus;

public class ZooException extends RuntimeException {

    private HttpStatus httpStatus;

    public ZooException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    // GETTER METODU
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    // SETTER METODU (Eklenmiştir)
    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}