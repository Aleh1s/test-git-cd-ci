package com.example.testgitcdci;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class TestGitCdCiApplicationTests {

    Calculator calculator = new Calculator();

    @Test
    void contextLoads() {
    }

    @Test
    void badTest() {
        int a = 20;
        int b = 30;

        int result = calculator.calculate(a, b);

        assertThat(result).isEqualTo(50);
    }

    class Calculator {
        int calculate(int a, int b) {
            return a + b;
        }
    }
}
