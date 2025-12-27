package org.vova.dmdev.level2.block7;

public class exercise1 {

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
