package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "index.html";
    }
    
    @GetMapping("/api/hello")
    public String sayHello() {
       return "Hello from Java backend 🚀";

       
    }
    
}
