package org.vova.dmdev.level2.block7.exercise3;

public class Exercise3Runner {

    public static void main(String[] args) {
        try {
            throwMyException();
        } catch (MyException e) {
            System.err.println("Catch");
            e.printStackTrace();
        }

    }

    public static void throwMyException() throws MyException {
            throw new MyException(new);
    }
}
