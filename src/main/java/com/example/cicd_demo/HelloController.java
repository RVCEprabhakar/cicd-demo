package com.example.cicd_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello! CI/CD practice is working.";
    }
    
    @GetMapping("/home")
    public String home() {
    	return "this is the home";
    	
    }
    @GetMapping("/status")
    public String status() {
        return "New GET endpoint is working!";
    }
}