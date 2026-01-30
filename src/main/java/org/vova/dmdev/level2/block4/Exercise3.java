package org.vova.dmdev.level2.block4;

public class Exercise3 {

    public static void main(String[] args) {
        String string = "abc Cpddd Dio OsfWw";
        System.out.println(transform(string));
    }

    public static String transform(String string) {
        StringBuilder result = new StringBuilder();
        string = string.toLowerCase();
        string = string.replace(" ", "");

        for (int i = 0; i < string.length(); i++) {
            char current = string.charAt(i);
            if (i == 0 || current != string.charAt(i - 1)) {
                result.append(current);
            }
        }
        return result.toString().toUpperCase();
    }
}
