package dev.practice.resilience4j.com.exception;

public class RetryException extends RuntimeException {
    public RetryException(String message) {
        super(message);
    }
}