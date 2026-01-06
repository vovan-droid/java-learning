package org.vova.dmdev.level2.block7.exercise3;

public class Exercise3Runner {

    public static void main(String[] args) {
        boolean b = true;
        try {
            throwMyException(b);
        } catch (MyException e) {
            System.err.println("Catch");
            e.printStackTrace();
        }

    }

    public static void throwMyException(boolean test) throws MyException {
        if (test) {
            throw new MyException();
        }
    }
}
