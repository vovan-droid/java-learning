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
            System.out.print("*  ");
        }
    }

    private static void drawVerticalLine(int size) {
        for (int i = 1; i <= size; i++) {
            System.out.println("*");
        }
    }

    private static void drawSquare(int size) {
    }
}
