package org.vova.dmdev.level2.block15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String regex = "0[Xx][0-9a-fA-F]+";
        String input = "adeaede 0Xff adasfaadss 0x12 afagsere 0XAB afghdfm";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
