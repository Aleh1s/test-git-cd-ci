package com.example.testgitcdci.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello !!!";
    }

    @GetMapping("/bye")
    public String getBye() {
        return "Bye !!!";
    }
}
