package com.colak.springtutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TracingController {

    // http://localhost:8080/api/hello
    @GetMapping("/api/hello")
    public String hello() {
        return "Hello, World!";
    }

    // http://localhost:8080/api/trace
    @GetMapping("/api/trace")
    public String traceExample() {
        return "This is a traced endpoint.";
    }
}

