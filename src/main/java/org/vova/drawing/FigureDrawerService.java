package org.vova.drawing;

public class FigureDrawerService {

    public static final String ASTERIX = "*";
    public static final String SPACE = " ";
    private final PatternDrawerService patternDrawer = PatternDrawerService.getInstance();
    private static FigureDrawerService figureDrawerService;

    public static FigureDrawerService getInstance() {
        if (figureDrawerService == null) {
            figureDrawerService = new FigureDrawerService();
        }
        return figureDrawerService;
    }

    //Вторая группа: (функциональные) методы, рисующие фигуры полностью


    //If size >= 1

    FigureDrawerService drawNewLine() {
        System.out.println();
        return this;
    }

    FigureDrawerService drawHorizontalLine(int size) {
        patternDrawer.printSolidLine(size);
        return this;
    }

    FigureDrawerService drawVerticalLine(int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(ASTERIX);
        }
        return this;
    }

    FigureDrawerService drawSquare(int size) {
        patternDrawer.printSolidLine(size);

        for (int i = 0; i < size - 2; i++) {
            System.out.print(ASTERIX);
            for (int j = 0; j < size - 2; j++) {
                System.out.print(SPACE);
            }
            System.out.println(ASTERIX);
        }

        if (size != 1) {
            patternDrawer.printSolidLine(size);
        }
        return this;
    }

    FigureDrawerService drawSquareWithDottedLine(int size) {
        patternDrawer.printSolidLine(size);

        for (int i = 0; i < size - 2; i++) {
            patternDrawer.printDottedLine(0, size - 2);
        }

        if (size != 1) {
            patternDrawer.printSolidLine(size);
        }
        return this;
    }

    FigureDrawerService drawTriangle1(int size) {
        System.out.println(ASTERIX);

        for (int i = 0; i < size - 2; i++) {
            System.out.print(ASTERIX);
            for (int j = 0; j < i; j++) {
                System.out.print(SPACE);
            }
            System.out.println(ASTERIX);
        }

        if (size != 1) {
            patternDrawer.printSolidLine(size);
        }
        return this;
    }

    FigureDrawerService drawTriangle1WithDottedLine(int size) {
        patternDrawer.printDottedLine(0);

        for (int i = 0; i < size - 2; i++) {
            patternDrawer.printDottedLine(0, i);
        }

        if (size != 1) {
            patternDrawer.printSolidLine(size);
        }
        return this;
    }

    FigureDrawerService drawTriangle2(int size) {
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
            patternDrawer.printSolidLine(size);
        }
        return this;
    }

    FigureDrawerService drawTriangle2WithDottedLine(int size) {
        int midHeight = size / 2 - 1;
        patternDrawer.printDottedLine(midHeight + 1);

        for (int i = 0; i < midHeight; i++) {
            patternDrawer.printDottedLine(midHeight - i, 2 * i + 1);
        }

        if (size != 1) {
            patternDrawer.printSolidLine(size);
        }
        return this;
    }

    FigureDrawerService drawCrossWithPrintDottedLine(int size) {
        int midHeightCross = size / 2;

        for (int i = 0; i < midHeightCross; i++) {
            patternDrawer.printDottedLine(i, size - 2 - 2 * i);
        }

        patternDrawer.printDottedLine(midHeightCross);

        for (int i = 0; i < midHeightCross; i++) {
            patternDrawer.printDottedLine(midHeightCross - 1 - i, 1 + 2 * i);
        }
        return this;
    }

    FigureDrawerService drawHouse(int size) {
        drawTriangle2(size);

        int midHeightCrossForHouse = size / 2 - 1;
        for (int i = 0; i < midHeightCrossForHouse; i++) {
            patternDrawer.printDottedLine(0, i, size - 4 - 2 * i, i);
        }

        patternDrawer.printDottedLine(0, midHeightCrossForHouse, midHeightCrossForHouse);

        for (int i = 0; i < midHeightCrossForHouse; i++) {
            patternDrawer.printDottedLine(0, midHeightCrossForHouse - 1 - i, 1 + 2 * i, midHeightCrossForHouse - 1 - i);
        }

        patternDrawer.printSolidLine(size);
        return this;
    }

    FigureDrawerService drawHouse1(int size) {
        drawTriangle2(size);

        int midHeightCrossForHouse = size / 2 - 1;
        patternDrawer.printDottedLines(
                midHeightCrossForHouse,
                patternDrawer.new Dot(0, 0),
                patternDrawer.new Dot(0, 1),
                patternDrawer.new Dot(size - 4, -2),
                patternDrawer.new Dot(0, 1)
        );
        patternDrawer.printDottedLines(
                1,
                patternDrawer.new Dot(0, 0),
                patternDrawer.new Dot(midHeightCrossForHouse, 0),
                patternDrawer.new Dot(midHeightCrossForHouse, 0)
        );
        patternDrawer.printDottedLines(
                midHeightCrossForHouse,
                patternDrawer.new Dot(0, 0),
                patternDrawer.new Dot(midHeightCrossForHouse - 1, -1),
                patternDrawer.new Dot(1, 2),
                patternDrawer.new Dot(midHeightCrossForHouse - 1, -1)
        );

        patternDrawer.printSolidLine(size);
        return this;
    }
}
