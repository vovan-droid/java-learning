package org.vova.drawing;

public class FigureDrawer {

    public static final String ASTERIX = "*";
    public static final String SPACE = " ";

    public static void main(String[] args) {
        int size = 7;
        int rep = 0;
        drawHorizontalLine(size);
        System.out.println();
        drawVerticalLine(size);
        System.out.println();
        drawSquare(size);
        System.out.println();
        drawSquareAlg1(size, size - 2, size - 2);
        System.out.println();
        //drawTriangle1Alg1(size, size - 2, rep);
        System.out.println();
        drawTriangle1(size);
        System.out.println();
        drawTriangle2(size);
    }

    //If size >= 1
    private static void drawHorizontalLine(int size) {
        if (size != 1) {
            for (int i = 0; i < size; i++) {
                System.out.print(ASTERIX);
            }
            System.out.println();
        }
    }
    private static void drawVerticalLine(int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(ASTERIX);
        }
    }

    private static void alg1(int repForAsterixPrint, int repForSpacePrint) {
        int rep = 0;
        for (int i = 0; i < repForAsterixPrint; i++) {
            System.out.print(ASTERIX);
            for (int j = 0; j < repForSpacePrint; j++) {
                System.out.print(SPACE);
                rep++;
            }
            System.out.println(ASTERIX);
        }
    }
    private static void drawSquare(int size) {
        drawHorizontalLine(size);

        for (int i = 0; i < size - 2; i++) {
            System.out.print(ASTERIX);
            for (int j = 0; j < size - 2; j++) {
                System.out.print(SPACE);
            }
            System.out.println(ASTERIX);
        }

        drawHorizontalLine(size);
    }

    private static void drawSquareAlg1(int size, int repForAsterixPrint, int repForSpacePrint) {
        drawHorizontalLine(size);
        alg1(repForAsterixPrint, repForSpacePrint);
        drawHorizontalLine(size);
    }

    private static void drawTriangle1(int size) {
        System.out.println(ASTERIX);

        for (int i = 0; i < size - 2; i++) {
            System.out.print(ASTERIX);
            for (int j = 0; j < i; j++) {
                System.out.print(SPACE);
            }
            System.out.println(ASTERIX);
        }

        drawHorizontalLine(size);
    }

//Проблема со вторым параметром в alg1 для этой функции, так как "i" (или "rep" созданная для замены "i") не сохраняется глобально
    private static void drawTriangle1Alg1(int size, int repForAsterixPrint, int repForSpacePrint) {
        System.out.println(ASTERIX);
        alg1(repForAsterixPrint, repForSpacePrint);
        drawHorizontalLine(size);
    }

    private static void drawTriangle2(int size) {
        int midHeight = size / 2 - 1;
        for (int i = 0; i <= midHeight; i++) {
            System.out.print(SPACE);
        }
        System.out.println(ASTERIX);

        for (int i = 0; i < midHeight; i++) {
            for (int j = 0; j < midHeight - i; j++) {
                System.out.print(SPACE);
            }
            System.out.print(ASTERIX);
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print(SPACE);
            }
            System.out.println(ASTERIX);
        }

        drawHorizontalLine(size);
    }
}