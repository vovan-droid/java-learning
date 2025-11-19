package org.vova.drawing;

public class FigureDrawer {
    public static void main(String[] args) {
        int size = 7;
        drawHorizontalLine(size);
    }

    //If size >= 1
    private static void drawHorizontalLine(int size) {
        for (int i = 1; i <= size; i++) {
            System.out.print("-");
        }
    }

    private static void drawVerticalLine(int size) {
        // TODO: Implement
    }

    private static void drawSquare(int size) {
        // TODO: Implement
    }
}
