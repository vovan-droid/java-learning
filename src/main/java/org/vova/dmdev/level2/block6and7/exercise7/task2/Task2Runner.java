package org.vova.dmdev.level2.block6and7.exercise7.task2;

import java.util.*;

public class Task2Runner {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        System.out.println(countUnique(integers));
    }

    public static int countUnique(List<Integer> list) {
        return new HashSet<>(list).size();
    }
}
