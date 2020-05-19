package com.bl.quantitymeasurment.exception;

public class QuantityMeasurmentException extends RuntimeException {
    public enum ExceptionType {
        ENTER_VALID_INPUT
    }
    public ExceptionType type;
    public QuantityMeasurmentException(ExceptionType type,String message) {
        super((message));
        this.type=type;
    }
}
