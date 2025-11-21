package org.vova.drawing;

public class FigureDrawer {
    public static void main(String[] args) {
        int size = 7;
        drawHorizontalLine(size);
        System.out.println();
        drawVerticalLine(size);
        System.out.println();
        drawSquare(size);
        System.out.println();
        drawTriangle1(size);
        System.out.println();
        drawTriangle2(size);
    }

    //If size >= 1
    private static void drawHorizontalLine(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void drawVerticalLine(int size) {
        for (int i = 0; i < size; i++) {
            System.out.println("*");
        }
    }

    private static void drawSquare(int size) {
        drawHorizontalLine(size);
        for (int i = 0; i < size - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < size - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        if (size != 1) {
            drawHorizontalLine(size);
        }
    }

    private static void drawTriangle1(int size) {
        System.out.println("*");
        for (int i = 0; i < size - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        if (size != 1) {
            drawHorizontalLine(size);
        }
    }

    private static void drawTriangle2(int size) {
        int midHeight = size / 2 - 1;
        for (int i = 0; i <= midHeight; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

        for (int i = 0; i < midHeight; i++) {
            for (int j = 0; j < midHeight - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        if (size != 1) {
            drawHorizontalLine(size);
        }
    }
}