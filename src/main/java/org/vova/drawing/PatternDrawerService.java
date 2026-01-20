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
