package com.example.testgitcdci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestGitCdCiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestGitCdCiApplication.class, args);
    }

}
