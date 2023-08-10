package com.boot.SpringDbProject.exception;

public class RecordExistsException extends Exception{
    public RecordExistsException(String message) {
        super(message);
    }
}
