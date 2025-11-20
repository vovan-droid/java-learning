package org.vova.drawing;

public class FigureDrawer {
    public static void main(String[] args) {
        int size = 7;
        drawHorizontalLine(size);
        System.out.println();
        drawVerticalLine(size);
        System.out.println();
        drawSquare(size);
    }

    //If size >= 1
    private static void drawHorizontalLine(int size) {
        for (int i = 1; i <= size; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void drawVerticalLine(int size) {
        for (int i = 1; i <= size; i++) {
            System.out.println("*");
        }
    }

    private static void drawSquare(int size) {
        drawHorizontalLine(size);
        for (int i = 1; i <= size - 2; i++) {
            System.out.print("*");
            for (int j = 1; j <= size - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        if (size != 1) {
            drawHorizontalLine(size);
        }
    }
}