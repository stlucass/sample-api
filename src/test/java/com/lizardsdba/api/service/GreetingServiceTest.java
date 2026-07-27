package com.lizardsdba.api.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GreetingServiceTest {

    @Autowired
    private GreetingService greetingService;

    @Test
    void testGreetWithName() {
        String result = greetingService.greet("Lucas");
        assertEquals("Hello, Lucas!", result);
    }

    @Test
    void testGreetWithoutName() {
        String result = greetingService.greet(null);
        assertEquals("Hello, World!", result);
    }

    @Test
    void testGetVersion() {
        String version = greetingService.getVersion();
        assertEquals("1.0.0", version);
    }
}
