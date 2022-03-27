package com.example.testgitcdci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestGitCdCiApplication {

    @GetMapping
    public String getHello() {
        return "Hello application !!!";
    }

    @GetMapping
    public String getBye() {
        return "Bye !!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestGitCdCiApplication.class, args);
    }

}
