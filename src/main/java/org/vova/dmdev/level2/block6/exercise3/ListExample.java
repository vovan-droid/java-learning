package org.vova.dmdev.level2.block6.exercise3;

public class ListExample {

    public static void main(String[] args) {
        ListExercise<String> list = new ListExercise<>(10);
        list.add("string1");
        list.add("string2");
        list.add("string3");
        list.add("string4");

        for (String value : list) {
            System.out.println(value);
        }
    }
}
