package org.vova.dmdev.level2.block4;

public class Task4 {

    public static void main(String[] args) {
        String value = "djgnablga. fskakna! fdsf, fankfa? fasjksf. dnglga,faf!";
        System.out.println(amountSymbols(value));
    }

    public static int amountSymbols(String value) {
        String result = value.replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return value.length() - result.length();
    }
}
