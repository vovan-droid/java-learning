package org.vova.drawing;

public class FigureDrawerService {

    public static final String drawingChar = "*";
    public static final String drawingSpace = " ";

    public static FigureDrawerService newInstance() {
        return new FigureDrawerService();
    }

    //Вторая группа: (функциональные) методы, рисующие фигуры полностью


    //If size >= 1

    FigureDrawerService drawNewLine() {
        System.out.println();
        return this;
    }

    FigureDrawerService drawHorizontalLine(int size) {
        PatternDrawerService.newInstance().printSolidLine(size);
        return this;
    }

    FigureDrawerService drawVerticalLine(int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(drawingChar);
        }
        return this;
    }

    FigureDrawerService drawSquare(int size) {
        PatternDrawerService pattern = PatternDrawerService.newInstance();
        pattern.printSolidLine(size);

        for (int i = 0; i < size - 2; i++) {
            System.out.print(drawingChar);
            for (int j = 0; j < size - 2; j++) {
                System.out.print(drawingSpace);
            }
            System.out.println(drawingChar);
        }

        if (size != 1) {
            pattern.printSolidLine(size);
        }
        return this;
    }

    FigureDrawerService drawSquareWithDottedLine(int size) {
        PatternDrawerService pattern = PatternDrawerService.newInstance();
        pattern.printSolidLine(size);

        for (int i = 0; i < size - 2; i++) {
            pattern.printDottedLine(0, size - 2);
        }

        if (size != 1) {
            pattern.printSolidLine(size);
        }
        return this;
    }

    FigureDrawerService drawTriangle1(int size) {
        System.out.println(drawingChar);

        for (int i = 0; i < size - 2; i++) {
            System.out.print(drawingChar);
            for (int j = 0; j < i; j++) {
                System.out.print(drawingSpace);
            }
            System.out.println(drawingChar);
        }

        if (size != 1) {
            PatternDrawerService.newInstance().printSolidLine(size);
        }
        return this;
    }

    FigureDrawerService drawTriangle1WithDottedLine(int size) {
        PatternDrawerService pattern = PatternDrawerService.newInstance();
        pattern.printDottedLine(0);

        for (int i = 0; i < size - 2; i++) {
            pattern.printDottedLine(0, i);
        }

        if (size != 1) {
            pattern.printSolidLine(size);
        }
        return this;
    }

    FigureDrawerService drawTriangle2(int size) {
        int midHeight = size / 2 - 1;
        for (int i = 0; i <= midHeight; i++) {
            System.out.print(drawingSpace);
        }
        System.out.println(drawingChar);

        for (int i = 0; i < midHeight; i++) {
            for (int j = 0; j < midHeight - i; j++) {
                System.out.print(drawingSpace);
            }
            System.out.print(drawingChar);
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(drawingSpace);
            }
            System.out.println(drawingChar);
        }

        if (size != 1) {
            PatternDrawerService.newInstance().printSolidLine(size);
        }
        return this;
    }

    FigureDrawerService drawTriangle2WithDottedLine(int size) {
        PatternDrawerService pattern = PatternDrawerService.newInstance();
        int midHeight = size / 2 - 1;
        pattern.printDottedLine(midHeight + 1);

        for (int i = 0; i < midHeight; i++) {
            pattern.printDottedLine(midHeight - i, 2 * i + 1);
        }

        if (size != 1) {
            pattern.printSolidLine(size);
        }
        return this;
    }

    FigureDrawerService drawCrossWithDottedLine(int size) {
        PatternDrawerService pattern = PatternDrawerService.newInstance();
        int midHeightCross = size / 2;

        for (int i = 0; i < midHeightCross; i++) {
            pattern.printDottedLine(i, size - 2 - 2 * i);
        }

        pattern.printDottedLine(midHeightCross);

        for (int i = 0; i < midHeightCross; i++) {
            pattern.printDottedLine(midHeightCross - 1 - i, 1 + 2 * i);
        }
        return this;
    }

    FigureDrawerService drawHouseWithDottedLine(int size) {
        PatternDrawerService pattern = PatternDrawerService.newInstance();
        int midHeight = size / 2 - 1;

        pattern.printDottedLine(midHeight + 1);

        for (int i = 0; i < midHeight; i++) {
            pattern.printDottedLine(midHeight - i, 2 * i + 1);
        }

        pattern.printSolidLine(size);

        for (int i = 0; i < midHeight; i++) {
            pattern.printDottedLine(0, i, size - 4 - 2 * i, i);
        }

        pattern.printDottedLine(0, midHeight, midHeight);

        for (int i = 0; i < midHeight; i++) {
            pattern.printDottedLine(0, midHeight - 1 - i, 1 + 2 * i, midHeight - 1 - i);
        }

        pattern.printSolidLine(size);

        return this;
    }

    FigureDrawerService drawHouseWithDottedLines(int size) {
        PatternDrawerService pattern = PatternDrawerService.newInstance();
        int midHeight = size / 2 - 1;

        pattern.printDottedLine(midHeight + 1);

        pattern.printDottedLines(
                midHeight,
                PatternDrawerService.dot(midHeight, -1),
                PatternDrawerService.dot(1, 2)
        );

        pattern.printSolidLine(size);

        pattern.printDottedLines(
                midHeight,
                PatternDrawerService.dot(0, 0),
                PatternDrawerService.dot(0, 1),
                PatternDrawerService.dot(size - 4, -2),
                PatternDrawerService.dot(0, 1)
        );
        pattern.printDottedLines(
                1,
                PatternDrawerService.dot(0, 0),
                PatternDrawerService.dot(midHeight, 0),
                PatternDrawerService.dot(midHeight, 0)
        );
        pattern.printDottedLines(
                midHeight,
                PatternDrawerService.dot(0, 0),
                PatternDrawerService.dot(midHeight - 1, -1),
                PatternDrawerService.dot(1, 2),
                PatternDrawerService.dot(midHeight - 1, -1)
        );

        pattern.printSolidLine(size);

        return this;
    }

    public FigureDrawerService drawHouseEx(int size) {
        PatternDrawerService p = PatternDrawerService.newInstance();


        int midHeight = size / 2 - 1;
        int roofLines = midHeight + 1;

        p.printDottedLinesEx(
                roofLines,
                new PatternDrawerService.Point(midHeight + 1, -1),
                new PatternDrawerService.Point(midHeight + 1, 1)
        );

        p.printSolidLine(size);

        p.printDottedLinesEx(
                midHeight,
                new PatternDrawerService.Point(0, 0),
                new PatternDrawerService.Point(1, 1),
                new PatternDrawerService.Point(5, -1),
                new PatternDrawerService.Point(6, 0)
        );

        p.printDottedLinesEx(
                1,
                new PatternDrawerService.Point(0, 0),
                new PatternDrawerService.Point(midHeight + 1, 0),
                new PatternDrawerService.Point(size - 1, 0)
        );

        p.printDottedLinesEx(
                midHeight,
                new PatternDrawerService.Point(0, 0),
                new PatternDrawerService.Point(2, -1),
                new PatternDrawerService.Point(4, 1),
                new PatternDrawerService.Point(6, 0)
        );

        p.printSolidLine(size);

        return this;
    }
}
