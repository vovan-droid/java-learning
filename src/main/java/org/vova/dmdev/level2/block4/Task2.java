package org.vova.dmdev.level2.block4;

public class Task2 {

    public static void main(String[] args) {
        String target = "One, Two, Three, Two, One";
        String word = "One";
        System.out.println(isSameStartAndEnd(target, word));
    }

    public static boolean isSameStartAndEnd(String target, String word) {
        return target.startsWith(word) && target.endsWith(word);
    }
}
