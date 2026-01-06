package org.vova.dmdev.level2.block7.exercise5;

public class Exercise5 {

    public static void main(String[] args) {
        try {
            unsafe();
        } catch (RuntimeException e) {
            System.out.println("Catch main");
            throw new MyOwnException(e);
        }

    }

    public static void unsafe() {
        throw new RuntimeException("Oops");
    }
}
