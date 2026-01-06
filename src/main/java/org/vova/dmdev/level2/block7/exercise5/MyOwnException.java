package org.vova.dmdev.level2.block7.exercise5;

public class MyOwnException extends RuntimeException {

    public MyOwnException(String message) {
        super(message);
    }

    public MyOwnException(Throwable cause) {
        super(cause);
    }
}
