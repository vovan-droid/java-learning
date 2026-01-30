package org.vova.dmdev.level2.block8.exercise4;

public class Exercise4Runner {

    public static void main(String[] args) {
        try {
            throwMyRunTimeException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void throwMyRunTimeException() {
        throw new MyRunTimeException("Test Exception");
    }
}
