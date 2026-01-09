package org.vova.dmdev.level2.block8;

public class Exercise1 {

    public static void main(String[] args) {
        String exceptionString = null;
        try {
            exceptionString.length();
        } catch (NullPointerException e) {
            System.err.println("Catch");
            e.printStackTrace();
        }
    }
}
