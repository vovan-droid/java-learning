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
                .drawCrossWithPrintDottedLine(size)
                .drawNewLine()
                .drawHouse1(size)
                .drawNewLine()
                .drawHouse2(size);
    }
}
