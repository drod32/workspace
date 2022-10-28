package com.library;

public class FullShelfException extends RuntimeException{
    public FullShelfException() {
    }

    public FullShelfException(String message) {
        super(message);
    }

    public FullShelfException(String message, Throwable cause) {
        super(message, cause);
    }

    public FullShelfException(Throwable cause) {
        super(cause);
    }
}
