package org.vova.drawing;

public class FigureDrawer {

    public static final String ASTERIX = "*";
    public static final String SPACE = " ";

    //Первая группа: главный клиент, который инициирует начальные действия
    public static void main(String[] args) {
        int size = 7;
        drawHorizontalLine(size);
        System.out.println();
        drawVerticalLine(size);
        System.out.println();
        drawSquare(size);
        System.out.println();
        drawSquareWithDottedLine(size);
        System.out.println();
        drawTriangle1(size);
        System.out.println();
        drawTriangle2(size);
    }

    //Вторая группа: (функциональные) методы, рисующие фигуры полностью
    //If size >= 1
    private static void drawHorizontalLine(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(ASTERIX);
        }
        System.out.println();
    }

    private static void drawVerticalLine(int size) {
        for (int i = 0; i < size; i++) {
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
        if (size != 1) {
            drawHorizontalLine(size);
        }
    }

    private static void drawSquareWithDottedLine (int size) {
        drawHorizontalLine(size);
        for (int i = 0; i < size - 2; i++) {
            drawDottedLine(0, size - 2);
        }
        if (size != 1) {
            drawHorizontalLine(size);
        }
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
        if (size != 1) {
            drawHorizontalLine(size);
        }
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

        if (size != 1) {
            drawHorizontalLine(size);
        }
    }

    //Третья группа: (сервисные) методы, которым делигировано рисование отдельных частей фигур
    private static void drawDottedLine(int... amountOfSpacesBeforeAsterix) {
        for (int i = 0; i < amountOfSpacesBeforeAsterix.length; i++) {
            for (int j = 0; j < amountOfSpacesBeforeAsterix[i]; j++) {
                System.out.print(SPACE);
            }
            System.out.print(ASTERIX);
        }
        System.out.println();
    }
}