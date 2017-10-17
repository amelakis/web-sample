package com.coding.web.dto;

import org.springframework.stereotype.Component;

@Component
public class GreetingDto {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
