package org.vova.drawing;

public class FigureDrawerRunner {

    public static void main(String[] args) {
        int size = 7;

        // Drawing different figures, with an empty line between them
        FigureDrawerService.newInstance()
                .drawHorizontalLine(size)
                .drawNewLine()
                .drawVerticalLine(size)
                .drawNewLine()
                .drawSquare(size)
                .drawNewLine()
                .drawSquareWithDottedLine(size)
                .drawNewLine()
                .drawTriangle1(size)
                .drawNewLine()
                .drawTriangle1WithDottedLine(size)
                .drawNewLine()
                .drawTriangle2(size)
                .drawNewLine()
                .drawTriangle2WithDottedLine(size)
                .drawNewLine()
                .drawCrossWithDottedLine(size)
                .drawNewLine();

        // Drawing a house using all 4 levels of abstraction, starting from the most non-optimized
        HouseDrawerService.newInstance()
                .drawHouseLvl0(size)
                .drawNewLine()
                .drawHouseLvl1(size)
                .drawNewLine()
                .drawHouseLvl2(size)
                .drawNewLine()
                .drawHouseLvl3(size)
                .drawNewLine();
    }
}
