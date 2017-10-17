package com.coding.web.service;

import com.coding.web.dto.GreetingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GreetService {

    private static final String API_URL = "http://localhost:8080/day-message/";


    @Autowired
    private RestTemplate restTemplate;

    public GreetingDto getGreeting(String input) {
        StringBuilder sb = new StringBuilder(API_URL).append(input);

        return restTemplate.getForObject(sb.toString(), GreetingDto.class);
    }

}
