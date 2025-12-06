package org.vova.dmdev.level2.block4;

public class Task1 {

    public static void main(String[] args) {
        String value = "asdas :( fasfa :) afaf:( fafaaf :( dfgik :)";
        replace(value);
        String result = replace(value);
        System.out.println(result);
    }

    public static String replace(String value) {
        return value.replace(":(", ":)");
    }
}
