package dev.practice.resilience4j.com.exception;

public class IgnoreException extends RuntimeException {

    public IgnoreException(String message) {
        super(message);
    }
}