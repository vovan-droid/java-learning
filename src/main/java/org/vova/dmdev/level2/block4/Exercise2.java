package org.vova.dmdev.level2.block4;

public class Exercise2 {

    public static void main(String[] args) {
        String value = "CM";
        int result = convertToArabic(value);
        System.out.println(result);
    }

    public static int convertToArabic(String romanNumber) {
        int prevArabic = getArabic(romanNumber.charAt(romanNumber.length() - 1));
        int result = prevArabic;
        for (int i = romanNumber.length() - 2; i >= 0; i--) {
            int currentArabic = getArabic(romanNumber.charAt(i));
            result += currentArabic < prevArabic ? -currentArabic : currentArabic;
            prevArabic = currentArabic;
        }
        return result;
    }

    public static int getArabic(char romanChar) {
        return switch (romanChar) {
            case 'M' -> 1000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> 0;
        };
    }
}
