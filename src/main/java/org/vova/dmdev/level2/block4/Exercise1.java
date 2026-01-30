package org.vova.dmdev.level2.block4;

public class Exercise1 {

    public static void main(String[] args) {
        String string = "Hello World";
        String string1 = "ABCDCBA";
        String string2 = "";
        String string3 = " ";
        String string4 = "  ";
        String string5 = " s ";
        String string6 = "SOS";
        System.out.println(isPalindrome(string2));
    }

    public static boolean isPalindrome(String string) {
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
