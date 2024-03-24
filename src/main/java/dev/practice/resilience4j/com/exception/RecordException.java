package dev.practice.resilience4j.com.exception;

public class RecordException extends RuntimeException {
    public RecordException(String message) {
        super(message);
    }
}