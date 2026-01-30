package org.vova.dmdev.level1;

public class JavaLvl1Practice2ForWhile {

    public static void main(String[] args) {
        int factorial = 10;
        int integer = 512;
        int sumStart = 24;
        int yearStart = 1626;
        int currentYear = 2020;
        int value = 17;
        boolean result = ex4(value);
        System.out.println(result);
        ex5();
        printFactorial(factorial);
        printFactorial2(factorial);
        System.out.println(printFactorial3(factorial));
        System.out.println(ex2(integer));
        System.out.println(ex3(sumStart, yearStart, currentYear));
    }

    public static void printFactorial(int factorial) {
        int factorialResult = 1;
        for (int i = 1; i <= factorial; i++) {
            factorialResult = factorialResult * i;
        }
        System.out.println(factorialResult);
    }

    private static void printFactorial2(int factorial) {
        int factorialResult = 1;
        for (int i = factorial; i > 0; i--) {
            factorialResult = factorialResult * i;
        }
        System.out.println(factorialResult);
    }

    private static int printFactorial3(int factorial) {
        if (factorial == 1) {
            return 1;
        }
        return factorial * printFactorial3(factorial - 1);
    }

    private static int ex2(int integer) {
        int result = 0;
        int integer1 = integer;
        while (integer1 > 0) {
            result = result + integer1 % 10;
            integer1 = integer1 / 10;
        }
        return result;
    }

    private static double ex3(int sumStart, int yearStart, int currentYear) {
        double sum0 = sumStart;
        for (int i = yearStart + 1; i <= currentYear; i++) {
            sum0 = sum0 * 1.05;
        }
        return sum0;
    }

    public static boolean ex4(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void ex5() {
        for (char letter = 'b'; !isVowel(letter); letter++) {
            System.out.println(letter);

        }
    }

    public static boolean isVowel(char value) {
        return value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u' || value == 'y';
    }
}
