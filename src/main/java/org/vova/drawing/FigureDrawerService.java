package org.vova.drawing;

public class FigureDrawerService {

    public String drawingChar = "*";
    public String drawingSpace = " ";

    public static FigureDrawerService newInstance() {
        return new FigureDrawerService();
    }

    FigureDrawerService withDrawingChar(String drawingChar) {
        this.drawingChar = drawingChar;
        return this;
    }
    FigureDrawerService withDrawingSpace(String drawingSpace) {
        this.drawingSpace = drawingSpace;
        return this;
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

        if (size != 1) {
            pattern.printSolidLine(size);
        }

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

        pattern.printDottedLines(
                1,
                pattern.new Dot(midHeight + 1, 0)
        );

        if (midHeight > 0) {
            pattern.printDottedLines(
                    midHeight,
                    pattern.new Dot(midHeight, -1),
                    pattern.new Dot(1, 2)
            );
        }

        if (size != 1) {
            pattern.printSolidLine(size);
        }


        pattern.printDottedLines(
                midHeight,
                pattern.new Dot(0, 0),
                pattern.new Dot(0, 1),
                pattern.new Dot(size - 4, -2),
                pattern.new Dot(0, 1)
        );
        pattern.printDottedLines(
                1,
                pattern.new Dot(0, 0),
                pattern.new Dot(midHeight, 0),
                pattern.new Dot(midHeight, 0)
        );
        pattern.printDottedLines(
                midHeight,
                pattern.new Dot(0, 0),
                pattern.new Dot(midHeight - 1, -1),
                pattern.new Dot(1, 2),
                pattern.new Dot(midHeight - 1, -1)
        );

        pattern.printSolidLine(size);

        return this;
    }
}
