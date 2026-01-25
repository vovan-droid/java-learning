package org.vova.drawing;

public class FigureDrawerRunner {

    public static void main(String[] args) {
        int size = 7;

        FigureDrawerService.newInstance()
                .drawHorizontalLine(size)
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
                .drawNewLine()
                .drawHouseWithDottedLine(size)
                .drawNewLine()
                .drawHouseWithDottedLines(size)
                .drawNewLine()
                .drawHouseEx(size);
    }
}
