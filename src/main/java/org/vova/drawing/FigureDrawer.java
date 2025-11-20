package org.vova.drawing;

public class FigureDrawer {
    public static void main(String[] args) {
        int size = 7;
        //drawHorizontalLine(size);
        //System.out.println();
        //drawVerticalLine(size);
        //System.out.println();
        //drawSquare(size);
        //System.out.println();
        drawTriangle1(size);
        //System.out.println();
        //drawTriangle2(size);
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


    private static void drawTriangle1(int size) {
        int space = 0;
        System.out.println("*");
        for (int i = 1; i <= size - 2; i++) {
            System.out.print("*");
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
            space = space + 1;
        }
        if (size != 1) {
            drawHorizontalLine(size);
        }
    }

    private static void drawTriangle2(int size) {

    }
}