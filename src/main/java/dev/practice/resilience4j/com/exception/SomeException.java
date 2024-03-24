package dev.practice.resilience4j.com.exception;

public class SomeException extends RuntimeException {
    public SomeException(String message) {
        super(message);
    }
}