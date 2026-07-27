package com.lizardsdba.api.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greet(String name) {
        return "Hello, " + (name != null ? name : "World") + "!";
    }

    public String getVersion() {
        return "1.0.0";
    }
}
