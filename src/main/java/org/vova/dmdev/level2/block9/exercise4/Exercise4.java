package org.vova.dmdev.level2.block9.exercise4;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        String result = listOfIntegers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(result);
    }
}
