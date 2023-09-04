package org.example.topic4;

public class BEJException extends RuntimeException {

    public BEJException() {}

    public BEJException(String message) {
        super("Terjadi BEJ Exception cuy!, gara-gara : " + message);
    }
}
