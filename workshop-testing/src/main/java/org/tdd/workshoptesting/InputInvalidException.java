package org.tdd.workshoptesting;

public class InputInvalidException extends RuntimeException{
    public InputInvalidException(String errorCase01) {
        super(errorCase01);
    }
}
