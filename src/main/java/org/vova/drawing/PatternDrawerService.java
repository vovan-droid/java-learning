package org.vova.drawing;

import java.util.Arrays;

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
            for (Point p : points) {
                int pos = p.nextPosition();
                buffer.setChar(pos);
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

    public static Dot dot(int amountOfSpacesInitial, int amountOfSpacesStep) {
        return new Dot(amountOfSpacesInitial, amountOfSpacesStep);
    }

    public static Point point(int initialPosition, int step) {
        return new Point(initialPosition, step);
    }

    public static class Dot {
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
