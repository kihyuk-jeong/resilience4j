package dev.practice.resilience4j.com.retry.hardcoding;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class RetryDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RetryDemoApplication.class, args);
    }

}