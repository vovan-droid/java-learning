package org.vova.dmdev.level2.block6.exercise7.task1;

import java.util.ArrayList;
import java.util.List;

public class task1Runner {

    public static void main(String[] args) {
        List<Integer> list = List.of(-4, -2, 0, 1, 2, 3, 4, 5, 12, 20, 109);
        List<Integer> result = removeEven(list);
        System.out.println(result);

    }

    public static List<Integer> removeEven(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 != 0) {
                result.add(i);
            }
        }
        return result;
    }
}
