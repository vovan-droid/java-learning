package org.vova.dmdev.level2.block9.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise1 {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20, 25, 30);
        OptionalDouble optionalDouble = listOfIntegers.stream()
                .filter(value -> value % 2 != 0)
                .filter(value -> value % 5 == 0)
                .mapToInt(Integer::intValue)
                .average();
        optionalDouble.ifPresent(System.out::println);
    }
}
