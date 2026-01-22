package org.vova.drawing;

public class PatternDrawerService {

    public static final String ASTERIX = "*";
    public static final String SPACE = " ";
    private static PatternDrawerService patternDrawerService;

    public static PatternDrawerService getInstance() {
        if (patternDrawerService == null) {
            patternDrawerService = new PatternDrawerService();
        }
        return patternDrawerService;
    }


    //Третья группа: (сервисные) методы, которым делегировано рисование отдельных частей фигур


    void printDottedLines(int linesNumber, Dot... dots) {
        for (int i = 0; i < linesNumber; i++) {
            for (int j = 0; j < dots.length; j++) {
                for (int k = 0; k < dots[j].getAmountOfSpacesInitial(); k++) {
                    printSpaces(dots[k].getAmountOfSpacesInitial());
                    System.out.print(ASTERIX);
                }
                for (int k = 0; k < dots[j].getAmountOfSpacesStep(); k++) {
                    printSpaces(dots[k].getAmountOfSpacesStep());
                    System.out.print(ASTERIX);
                }
            }
            System.out.println();
        }
    }

    void printDottedLines2(int linesNumber, Dot... dots) {
        for (int i = 0; i < linesNumber; i++) {
            for (int j = 0; j < dots.length; j++) {
                int amountOfSpaces = dots[j].getAmountOfSpacesInitial() + (dots[j].getAmountOfSpacesStep() * i);
                printSpaces(amountOfSpaces);
                System.out.print(ASTERIX);
            }
            System.out.println();
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

    //Печатает звездочки в цикле и переводит строку после цикла
    void printSolidLine(int amountOfAsterixes) {
        for (int i = 0; i < amountOfAsterixes; i++) {
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
}
