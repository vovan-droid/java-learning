package org.vova.drawing;

import java.util.Arrays;

public class PatternDrawerService {

    public String drawingChar = "*";
    public String drawingSpace = " ";

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


    //Третья группа: (сервисные) методы, которым делегировано рисование отдельных частей фигур


    PatternDrawerService printDottedLines(int linesNumber, Dot... dots) {
        for (int i = 0; i < linesNumber; i++) {
            int[] ints = Arrays.stream(dots).mapToInt(Dot::getNextIndent).toArray();
            printDottedLine(ints);
        }
        return this;
    }

    //Печатает пробелы до звездочек в цикле и ставит их
    PatternDrawerService printDottedLine(int... amountOfSpacesBeforeAsterix) {
        for (int i = 0; i < amountOfSpacesBeforeAsterix.length; i++) {
            printSpaces(amountOfSpacesBeforeAsterix[i]);
            System.out.print(drawingChar);
        }
        System.out.println();
        return this;
    }

    //Печатает пробелы в цикле
    PatternDrawerService printSpaces(int amountOfSpacesBeforeChar1) {
        for (int i = 0; i < amountOfSpacesBeforeChar1; i++) {
            System.out.print(drawingSpace);
        }
        return this;
    }

    //Печатает звездочки в цикле и переводит строку после цикла
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


    public static class Dot {
        private int amountOfSpacesStep;
        private int amountOfSpaces;

        public Dot(int amountOfSpacesInitial, int amountOfSpacesStep) {
            this.amountOfSpacesStep = amountOfSpacesStep;
            amountOfSpaces = amountOfSpacesInitial - amountOfSpacesStep;
        }

        public int getNextIndent() {
            return amountOfSpaces += amountOfSpacesStep;
        }
    }
}
