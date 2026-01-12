package org.vova.dmdev.level2.block9.exercise2;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercise2 {

    public static void main(String[] args) {
        List<String> listOfStrings = List.of("string-1", "string-8", "string-10", "string-10", "string-30", "string-10");
        int result = listOfStrings.stream()
                .filter(s -> s.length() > 8)
                .collect(Collectors.toSet())
                .size();
        System.out.println(result);

        long result1 = listOfStrings.stream()
                .filter(s -> s.length() > 8)
                .distinct()
                .count();
        System.out.println(result1);
    }
}
