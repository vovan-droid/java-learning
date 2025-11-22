package org.vova.drawing;

public class FigureDrawer {

    public static final String ASTERIX = "*";
    public static final String SPACE = " ";

    //Первая группа: главный клиент, который инициирует начальные действия
    public static void main(String[] args) {
        int size = 7;
        drawHorizontalLine(size);
        System.out.println();
        drawHorizontalLineWithPrintElementWithForLn(size);
        System.out.println();
        drawVerticalLine(size);
        System.out.println();
        drawSquare(size);
        System.out.println();
        drawSquareWithDottedLine(size);
        System.out.println();
        drawSquareWithPrintElementWithForLn(size);
        System.out.println();
        drawTriangle1(size);
        System.out.println();
        drawTriangle1WithDottedLine(size);
        System.out.println();
        drawTriangle1WithPrintElementWithForLn(size);
        System.out.println();
        drawTriangle2(size);
        System.out.println();
        drawTriangle2WithDottedLine(size);
        System.out.println();
        drawTriangle2WithPrintElementWithForLn(size);
    }

    //Вторая группа: (функциональные) методы, рисующие фигуры полностью
    //If size >= 1
    private static void drawHorizontalLine(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(ASTERIX);
        }
        System.out.println();
    }

    private static void drawHorizontalLineWithPrintElementWithForLn(int size) {
        printElementWithForLn(ASTERIX,"", size, 1);
    }

    private static void drawVerticalLine(int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(ASTERIX);
        }
    }
// Можно теоретически и метод "drawVerticalLine" сделать используя сервисный метод, если добавить Чаром ASTERIX с переводом строки
//    private static void drawVerticalLineWithPrintElementWithFor(int size) {
//        printElementWithForLn(ASTERIXLn, size, 0, 0);
//    }

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

    private static void drawSquareWithDottedLine(int size) {
        drawHorizontalLine(size);
        for (int i = 0; i < size - 2; i++) {
            drawDottedLine(0, size - 2);
        }
        if (size != 1) {
            drawHorizontalLine(size);
        }
    }

    private static void drawSquareWithPrintElementWithForLn(int size) {
        drawHorizontalLineWithPrintElementWithForLn(size);
        for (int i = 0; i < size - 2; i++) {
            System.out.print(ASTERIX);
            printElementWithForLn(SPACE, ASTERIX, size - 2, 1);
        }
        if (size != 1) {
            drawHorizontalLineWithPrintElementWithForLn(size);
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

    private static void drawTriangle1WithDottedLine(int size) {
        drawDottedLine(0);
        for (int i = 0; i < size - 2; i++) {
            drawDottedLine(0, i);
        }
        drawHorizontalLine(size);
    }

    private static void drawTriangle1WithPrintElementWithForLn(int size) {
        System.out.println(ASTERIX);
        for (int i = 0; i < size - 2; i++) {
            System.out.print(ASTERIX);
            printElementWithForLn(SPACE, ASTERIX, i, 1);
        }
        if (size != 1) {
            drawHorizontalLineWithPrintElementWithForLn(size);
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
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(SPACE);
            }
            System.out.println(ASTERIX);
        }

        if (size != 1) {
            drawHorizontalLine(size);
        }
    }

    private static void drawTriangle2WithDottedLine(int size) {
        int midHeight = size / 2 - 1;
        drawDottedLine(midHeight + 1);
        for (int i = 0; i < midHeight; i++) {
            drawDottedLine(midHeight - i, 2 * i + 1);
        }
        if (size != 1) {
            drawHorizontalLine(size);
        }
    }

    private static void drawTriangle2WithPrintElementWithForLn(int size) {
        int midHeight = size / 2 - 1;
        printElementWithForLn(SPACE, ASTERIX, midHeight + 1, 1);

        for (int i = 0; i < midHeight; i++) {
            printElementWithForLn(SPACE, "", midHeight - i, 0);
            System.out.print(ASTERIX);
            printElementWithForLn(SPACE, ASTERIX, 2 * i + 1, 1);
        }

        if (size != 1) {
            drawHorizontalLineWithPrintElementWithForLn(size);
        }
    }

    //Третья группа: (сервисные) методы, которым делигировано рисование отдельных частей фигур

    //Делает пробелы до звездочек в цикле и ставит их
    private static void drawDottedLine(int... amountOfSpacesBeforeAsterix) {
        for (int i = 0; i < amountOfSpacesBeforeAsterix.length; i++) {
            for (int j = 0; j < amountOfSpacesBeforeAsterix[i]; j++) {
                System.out.print(SPACE);
            }
            System.out.print(ASTERIX);
        }
        System.out.println();
    }

    //Делает пробелы в цикле и если нужно использует println()
    private static void printElementWithForLn(String character, String character1, int... amountOfRepeatsAndElement) {
        for (int j = 0; j < amountOfRepeatsAndElement[0]; j++) {
            System.out.print(character);
        }
        if (amountOfRepeatsAndElement[1] == 1) {
            System.out.println(character1);
        }
    }
}