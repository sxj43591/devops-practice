package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HelloWorldTest {
    @Test
    public void testOutput() {
        String message = "Hello from Maven + Jenkins!";
        assertTrue(message.contains("Hello"));
    }
}

