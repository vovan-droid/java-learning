package org.vova.dmdev.level2.block6and7.exercise7.task4;

import java.util.*;

public class Task4Runner {

    public static void main(String[] args) {
        Map<Integer, Integer> polynomial1 = Map.of(
                0, 5,
                1, 3,
                3, 2,
                5, 4,
                6, 7
        );
        Map<Integer, Integer> polynomial2 = Map.of(
                0, 5,
                3, 4,
                5, 5,
                6, 1
        );

        System.out.println(sum(polynomial1, polynomial2));
        System.out.println(convertToString(sum(polynomial1, polynomial2)));
    }

    public static String convertToString(Map<Integer, Integer> map) {
        Map<Integer, Integer> result = new TreeMap<>(Comparator.reverseOrder());
        result.putAll(map);
        List<String> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            String value = entry.getKey() == 0
                    ? String.valueOf(entry.getValue())
                    : entry.getValue() + "x^" + entry.getKey();
            list.add(value);
        }
        return String.join(" + ", list);
    }

    public static Map<Integer, Integer> sum(Map<Integer, Integer> polynomial1, Map<Integer, Integer> polynomial2) {
        Map<Integer, Integer> polynomResult = new HashMap<>(polynomial1);
        for (Map.Entry<Integer, Integer> entry : polynomial2.entrySet()) {
//            Integer value = polynomResult.getOrDefault(entry.getKey(), 0);
//            polynomResult.put(entry.getKey(), value + entry.getValue());
            polynomResult.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        return polynomResult;

    }
}
