package org.vova.drawing;

public class FigureDrawerRunner {

    public static void main(String[] args) {
        int size = 7;
        Dot dot1 = new Dot(0, 0);
        Dot dot2 = new Dot(0, 1);
        Dot dot3 = new Dot(3, -2);
        Dot dot4 = new Dot(0, 1);


        PatternDrawerService.getInstance().printDottedLines2(2, dot1, dot2, dot3, dot4);
//        FigureDrawerService.getInstance().
//                .drawHorizontalLine(size)
//                .drawVerticalLine(size)
//                .drawNewLine()
//                .drawSquare(size)
//                .drawNewLine()
//                .drawSquareWithDottedLine(size)
//                .drawNewLine()
//                .drawTriangle1(size)
//                .drawNewLine()
//                .drawTriangle1WithDottedLine(size)
//                .drawNewLine()
//                .drawTriangle2(size)
//                .drawNewLine()
//                .drawTriangle2WithDottedLine(size)
//                .drawNewLine()
//                .drawCrossWithPrintDottedLine(size)
//                .drawNewLine()
//                .drawHouse2(size);
    }
}
