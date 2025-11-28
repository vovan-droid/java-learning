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
        drawSquareWithPrintSpacesAndAsterixNewLine(size);
        System.out.println();
        drawSquareWithPrintSpacesAndAsterixWithNewLineIfNeeded(size);
        System.out.println();
        drawSquareWithDottedLine(size);
        System.out.println();
        drawTriangle1(size);
        System.out.println();
        drawTriangle1WithPrintSpacesAndAsterixNewLine(size);
        System.out.println();
        drawTriangle1WithPrintSpacesAndAsterixWithNewLineIfNeeded(size);
        System.out.println();
        drawTriangle1WithDottedLine(size);
        System.out.println();
        drawTriangle2(size);
        System.out.println();
        drawTriangle2WithPrintSpacesAndAsterixNewLine(size);
        System.out.println();
        drawTriangle2WithPrintSpacesAndAsterixWithNewLineIfNeeded(size);
        System.out.println();
        drawTriangle2WithDottedLine(size);
        System.out.println();
        drawCrossWithPrintDottedLineWithoutNewLine(size);
        System.out.println();
        drawCrossWithPrintDottedLine(size);
        System.out.println();
        drawHouse(size);
        System.out.println();
        drawHouse1(size);
        System.out.println();
        drawHouse2(size);
        System.out.println();
//        drawHouseDNA(size);
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

    private static void drawSquareWithPrintSpacesAndAsterixNewLine(int size) {
        drawHorizontalLine(size);

        for (int i = 0; i < size - 2; i++) {
            System.out.print(ASTERIX);
            printSpacesAndAsterixNewLine(size - 2);
        }

        if (size != 1) {
            drawHorizontalLine(size);
        }
    }

    private static void drawSquareWithPrintSpacesAndAsterixWithNewLineIfNeeded(int size) {
        drawHorizontalLine(size);

        for (int i = 0; i < size - 2; i++) {
            System.out.print(ASTERIX);
            printSpacesAndAsterixWithNewLineIfNeeded(size - 2, true);
        }

        if (size != 1) {
            drawHorizontalLine(size);
        }
    }
    private static void drawSquareWithDottedLine(int size) {
        drawHorizontalLine(size);

        for (int i = 0; i < size - 2; i++) {
            printDottedLine(0, size - 2);
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

    private static void drawTriangle1WithPrintSpacesAndAsterixNewLine(int size) {
        System.out.println(ASTERIX);

        for (int i = 0; i < size - 2; i++) {
            System.out.print(ASTERIX);
            printSpacesAndAsterixNewLine(i);
        }

        if (size != 1) {
            drawHorizontalLine(size);
        }
    }

    private static void drawTriangle1WithPrintSpacesAndAsterixWithNewLineIfNeeded(int size) {
        System.out.println(ASTERIX);

        for (int i = 0; i < size - 2; i++) {
            System.out.print(ASTERIX);
            printSpacesAndAsterixWithNewLineIfNeeded(i, true);
        }

        if (size != 1) {
            drawHorizontalLine(size);
        }
    }

    private static void drawTriangle1WithDottedLine(int size) {
        printDottedLine(0);

        for (int i = 0; i < size - 2; i++) {
            printDottedLine(0, i);
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
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(SPACE);
            }
            System.out.println(ASTERIX);
        }

        if (size != 1) {
            drawHorizontalLine(size);
        }
    }

    private static void drawTriangle2WithPrintSpacesAndAsterixNewLine(int size) {
        int midHeight = size / 2 - 1;
        printSpacesAndAsterixNewLine(midHeight + 1);

        for (int i = 0; i < midHeight; i++) {
            printSpaces(midHeight - i);
            System.out.print(ASTERIX);
            printSpacesAndAsterixNewLine(2 * i + 1);
        }

        if (size != 1) {
            drawHorizontalLine(size);
        }
    }

    private static void drawTriangle2WithPrintSpacesAndAsterixWithNewLineIfNeeded(int size) {
        int midHeight = size / 2 - 1;
        printSpacesAndAsterixWithNewLineIfNeeded(midHeight + 1, true);

        for (int i = 0; i < midHeight; i++) {
            printSpacesAndAsterixWithNewLineIfNeeded(midHeight - i, false);
            System.out.print(ASTERIX);
            printSpacesAndAsterixWithNewLineIfNeeded(2 * i + 1, true);
        }

        if (size != 1) {
            drawHorizontalLine(size);
        }
    }

    private static void drawTriangle2WithDottedLine(int size) {
        int midHeight = size / 2 - 1;
        printDottedLine(midHeight + 1);

        for (int i = 0; i < midHeight; i++) {
            printDottedLine(midHeight - i, 2 * i + 1);
        }

        if (size != 1) {
            drawHorizontalLine(size);
        }
    }

    private static void drawCrossWithPrintDottedLineWithoutNewLine(int size) {
        int midHeightCross = size / 2;

        for (int i = 0; i < midHeightCross; i++) {
            printDottedLineWithoutNewLine(i, size - 2 - 2 * i);
            System.out.println();
        }

        printDottedLineWithoutNewLine(midHeightCross);
        System.out.println();

        for (int i = 0; i < midHeightCross; i++) {
            printDottedLineWithoutNewLine(midHeightCross - 1 - i, 1 + 2 * i);
            System.out.println();
        }
    }

    private static void drawCrossWithPrintDottedLine(int size) {
        int midHeightCross = size / 2;

        for (int i = 0; i < midHeightCross; i++) {
           printDottedLine(i, size - 2 - 2 * i);
           }

        printDottedLine(midHeightCross);

        for (int i = 0; i < midHeightCross; i++) {
           printDottedLine(midHeightCross - 1 - i, 1 + 2 * i);
        }
    }

    private static void drawHouse(int size) {
        drawTriangle2(size);

        int midHeightCrossForHouse = size / 2 - 1;
        for (int i = 0; i < midHeightCrossForHouse; i++) {
            System.out.print(ASTERIX);
            printDottedLineWithoutNewLine(i, size - 4 - 2 * i);
            printSpacesAndAsterixNewLine(i);
        }

        for (int i = 0; i < 2; i++) {
            System.out.print(ASTERIX);
            printSpaces(midHeightCrossForHouse);
        }
        System.out.println(ASTERIX);

        for (int i = 0; i < midHeightCrossForHouse; i++) {
            System.out.print(ASTERIX);
            printDottedLineWithoutNewLine(midHeightCrossForHouse - 1 - i, 1 + 2 * i);
            printSpacesAndAsterixNewLine(midHeightCrossForHouse - 1 - i);
        }

        drawHorizontalLine(size);
    }

    private static void drawHouse1(int size) {
        drawTriangle2(size);

        int midHeightCrossForHouse = size / 2 - 1;
        for (int i = 0; i < midHeightCrossForHouse; i++) {
            System.out.print(ASTERIX);
            printDottedLineWithoutNewLine(i, size - 4 - 2 * i);
            printSpacesAndAsterixNewLine(i);
        }

        System.out.print(ASTERIX);
        printDottedLine(midHeightCrossForHouse, midHeightCrossForHouse);

        for (int i = 0; i < midHeightCrossForHouse; i++) {
            System.out.print(ASTERIX);
            printDottedLineWithoutNewLine(midHeightCrossForHouse - 1 - i, 1 + 2 * i);
            printSpacesAndAsterixNewLine(midHeightCrossForHouse - 1 - i);
        }

        drawHorizontalLine(size);
    }

    private static void drawHouse2(int size) {
        drawTriangle2(size);

        int midHeightCrossForHouse = size / 2 - 1;
        for (int i = 0; i < midHeightCrossForHouse; i++) {
            printDottedLine(0,i, size - 4 - 2 * i, i);
        }

        printDottedLine(0,midHeightCrossForHouse, midHeightCrossForHouse);

        for (int i = 0; i < midHeightCrossForHouse; i++) {
            printDottedLine(0,midHeightCrossForHouse - 1 - i, 1 + 2 * i, midHeightCrossForHouse - 1 - i);
        }

        drawHorizontalLine(size);
    }

//    private static void drawHouseDNA(int size) {
//        drawTriangle2(size);
//
//        for (int i = 0; i < size - 2; i++) {
//            printDottedLine(0, size - 2);
//            drawCrossWithPrintDottedLine(size - 2);
//        }
//
//        if (size != 1) {
//            drawHorizontalLine(size);
//        }
//    }

    //Третья группа: (сервисные) методы, которым делигировано рисование отдельных частей фигур


    //Печатает пробелы до звездочек в цикле и ставит их

    private static void printDottedLine(int... amountOfSpacesBeforeAsterix) {
        for (int i = 0; i < amountOfSpacesBeforeAsterix.length; i++) {
            printSpaces(amountOfSpacesBeforeAsterix[i]);
            System.out.print(ASTERIX);
        }
        System.out.println();
    }

    //Печатает пробелы в цикле

    private static void printSpaces(int amountOfSpacesBeforeChar1) {
        for (int i = 0; i < amountOfSpacesBeforeChar1; i++) {
            System.out.print(SPACE);
        }
    }
}
