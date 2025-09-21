package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
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
