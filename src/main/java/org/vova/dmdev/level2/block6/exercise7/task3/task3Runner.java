package org.vova.dmdev.level2.block6.exercise7.task3;

import java.util.HashMap;
import java.util.Map;

public class task3Runner {

    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        map.put("Marty", "Stepp");
//        map.put("Stuart", "Reges");
//        map.put("Jessica", "Miller");
//        map.put("Amanda", "Camp");
//        map.put("Hal", "Perkins");
        Map<String, String> map = Map.of(
                "Marty", "Stepp",
                "Stuart", "Reges",
                "Jessica", "Miller",
                "Amanda", "Camp",
                "Hal", "Perkins"
        );

        Map<String, String> map1 = Map.of(
                "Marty", "Stepp",
                "Stuart", "Reges",
                "Jessica", "Miller",
                "Amanda", "Camp",
                "Hal", "Stepp"
        );

        System.out.println(isUnique(map));
        System.out.println(isUnique(map1));
    }

    public static boolean isUnique(Map<String, String> map) {
        for (String s : map.keySet()) {
            if (map.get(s).equals(s)) {
                return false;
            }
        }
        return true;
    }
}
