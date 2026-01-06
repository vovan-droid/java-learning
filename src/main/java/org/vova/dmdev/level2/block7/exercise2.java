package org.vova.dmdev.level2.block7;

public class exercise2 {

    public static void main(String[] args) {
        try {
            IndexOutOfBoundsException ex = new IndexOutOfBoundsException();
            throw ex;
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Catch");
            e.printStackTrace();
        }
    }
}
