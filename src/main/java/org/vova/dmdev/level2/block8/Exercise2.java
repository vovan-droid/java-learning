package org.vova.dmdev.level2.block8;

public class Exercise2 {

    public static void main(String[] args) {
        int[] values = {1, 4, 6, 7, 8};
        try {
            for (int i = 0; i <= values.length; i++) {
                System.out.println(values[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Catch");
            e.printStackTrace();
        }
    }
}
