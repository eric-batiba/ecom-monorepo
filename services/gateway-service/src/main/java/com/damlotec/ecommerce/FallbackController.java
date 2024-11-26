package com.damlotec.ecommerce;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {
    @GetMapping
    public ResponseEntity<String> fallback() {
        String message = "The service is currently unavailable. Please try again later.";
        return new ResponseEntity<>(message, HttpStatus.SERVICE_UNAVAILABLE);
    }
}
