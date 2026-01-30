package org.vova.dmdev.level2.block9.exercise3;

import java.util.Map;

public class Exercise3 {

    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "fafsa", 2,
                "fafaafagh", 4,
                "afasf", 3,
                "h,ghjgh", 5,
                "asf", 25
        );

        int sum = map.entrySet().stream()
                .filter(entry -> entry.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println(sum);
    }
}
