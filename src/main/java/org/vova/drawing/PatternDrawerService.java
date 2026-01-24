package org.vova.drawing;

import java.util.Arrays;

public class PatternDrawerService {

    public static final String ASTERIX = "*";
    public static final String SPACE = " ";

    public static PatternDrawerService newInstance() {
        return new PatternDrawerService();
    }


    //Третья группа: (сервисные) методы, которым делегировано рисование отдельных частей фигур


    void printDottedLines(int linesNumber, Dot... dots) {
        for (int i = 0; i < linesNumber; i++) {
            int[] ints = Arrays.stream(dots).mapToInt(Dot::getNextIndent).toArray();
            printDottedLine(ints);
        }
    }

    //Печатает пробелы до звездочек в цикле и ставит их
    void printDottedLine(int... amountOfSpacesBeforeAsterix) {
        for (int i = 0; i < amountOfSpacesBeforeAsterix.length; i++) {
            printSpaces(amountOfSpacesBeforeAsterix[i]);
            System.out.print(ASTERIX);
        }
        System.out.println();
    }

    //Печатает пробелы в цикле
    void printSpaces(int amountOfSpacesBeforeChar1) {
        for (int i = 0; i < amountOfSpacesBeforeChar1; i++) {
            System.out.print(SPACE);
        }
    }

    //Печатает звездочки в цикле и переводит строку после цикла
    void printSolidLine(int amountOfAsterixes) {
        for (int i = 0; i < amountOfAsterixes; i++) {
            System.out.print(ASTERIX);
        }
        System.out.println();
    }


    public class Dot {
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
