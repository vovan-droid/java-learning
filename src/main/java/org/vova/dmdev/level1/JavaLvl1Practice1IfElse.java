package org.vova.dmdev.level1;

public class JavaLvl1Practice1IfElse {

    public static void main(String[] args) {
        int monthNumber = 1;
        int number = 53;
        int moneyAmount = 14;
        int year = 200108;
        printSeason(monthNumber);
        printSeason2(monthNumber);
        lastNumCheck(number);
        ex3(moneyAmount);
        ex4(year);
    }

    public static void printSeason(int monthNumber) {
        switch (monthNumber) {
            case 1, 2, 12 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
        }
    }

    public static void printSeason2(int monthNumber) {
        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
            System.out.println("Winter");
        }   else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5){
            System.out.println("Spring");
        }   else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            System.out.println("Summer");
        }   else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            System.out.println("Autumn");
        }
    }



    private static void lastNumCheck(int number) {
        if (number % 10 == 3) {
            System.out.println("Last Num is 3");
        } else {
            System.out.println("Last Num is not 3");
        }
    }

    private static void ex3(int moneyAmount) {
        if (moneyAmount % 10 == 1 && moneyAmount != 11) {
            System.out.println(moneyAmount + " рубль");
        } else if ((moneyAmount % 10 >= 2 && moneyAmount % 10 <= 4) && !(moneyAmount % 100 >= 12 && moneyAmount % 100 <= 14)) {
            System.out.println(moneyAmount + " рубля");
        } else {
            System.out.println(moneyAmount + " рублей");
        }
    }

    public static void ex4(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является высокосным");
        }
    }
}
