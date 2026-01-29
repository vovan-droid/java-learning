package org.vova.drawing;

import java.util.Arrays;
/**
 * <p>
 * This class intentionally stays close to the output and provides a small set of reusable building blocks
 * used by higher-level drawers (e.g., house/figure services):
 * </p>
 **/
public class PatternDrawerService {

    private String drawingChar = "*";
    private String drawingSpace = " ";

    public static PatternDrawerService newInstance() {
        return new PatternDrawerService();
    }

    PatternDrawerService withDrawingChar(String drawingChar) {
        this.drawingChar = drawingChar;
        return this;
    }

    PatternDrawerService withDrawingSpace(String drawingSpace) {
        this.drawingSpace = drawingSpace;
        return this;
    }

    PatternDrawerService printDottedLinesEx(int linesNumber, Point... points) {
        LineBuffer buffer = new LineBuffer();
        for (int i = 0; i < linesNumber; i++) {
            for (Point point : points) {
                buffer.setChar(point.nextPosition());
            }
            buffer.print();
        }
        return this;
    }

    PatternDrawerService printDottedLines(int linesNumber, Dot... dots) {
        for (int i = 0; i < linesNumber; i++) {
            int[] ints = Arrays.stream(dots).mapToInt(Dot::getNextIndent).toArray();
            printDottedLine(ints);
        }
        return this;
    }

    PatternDrawerService printDottedLine(int... amountOfSpacesBeforeAsterix) {
        for (int ofSpacesBeforeAsterix : amountOfSpacesBeforeAsterix) {
            printSpaces(ofSpacesBeforeAsterix);
            System.out.print(drawingChar);
        }
        System.out.println();
        return this;
    }

    PatternDrawerService printSpaces(int amountOfSpacesBeforeChar1) {
        for (int i = 0; i < amountOfSpacesBeforeChar1; i++) {
            System.out.print(drawingSpace);
        }
        return this;
    }

    PatternDrawerService printSolidLine(int amountOfAsterixes) {
        for (int i = 0; i < amountOfAsterixes; i++) {
            System.out.print(drawingChar);
        }
        System.out.println();
        return this;
    }

    /**
     * Fabric method of a class Dot
     * @param amountOfSpacesInitial
     * @param amountOfSpacesStep
     * @return
     */
    public static Dot dot(int amountOfSpacesInitial, int amountOfSpacesStep) {
        return new Dot(amountOfSpacesInitial, amountOfSpacesStep);
    }

    public static Point point(int initialPosition, int step) {
        return new Point(initialPosition, step);
    }

    /**
     * Mutable helper that represents a horizontally "moving dot" in a multi-line pattern.
     * <p>
     * A {@code Dot} tracks how many leading spaces should be printed before a drawing character
     * on each successive row. Every call to {@link #getNextIndent()} advances the dot horizontally
     * by a fixed step, allowing higher-level code to create slanted or diagonal dotted lines.
     * </p>
     */
    public static class Dot {
        /**
         * Fixed horizontal step applied on every row in comparison to the previous one.
         * <p>
         * Positive values move the dot to the right, negative values move it to the left.
         * </p>
         */
        private final int amountOfSpacesStep;
        private int amountOfSpaces;

        private Dot(int amountOfSpacesInitial, int amountOfSpacesStep) {
            this.amountOfSpacesStep = amountOfSpacesStep;
            this.amountOfSpaces = amountOfSpacesInitial - amountOfSpacesStep;
        }

        public int getNextIndent() {
            return amountOfSpaces += amountOfSpacesStep;
        }
    }

    public static class Point {
        private final int step;
        private int current;

        private Point(int initialPosition, int step) {
            this.step = step;
            this.current = initialPosition - step;
        }

        public int nextPosition() {
            return current += step;
        }
    }

    private class LineBuffer {
        private final StringBuilder sb = new StringBuilder();
        private final char spaceChar;
        private final char drawChar;


        private LineBuffer() {
            this.spaceChar = PatternDrawerService.this.drawingSpace.charAt(0);
            this.drawChar = PatternDrawerService.this.drawingChar.charAt(0);
        }

        public void setChar(int position) {
            if (position < 0) {
                throw new IllegalArgumentException("Position cannot be negative");
            }
            while (sb.length() <= position) {
                sb.append(spaceChar);
            }
            sb.setCharAt(position, drawChar);
        }

        public void print() {
            System.out.println(sb);
            sb.setLength(0);
        }
    }
}
