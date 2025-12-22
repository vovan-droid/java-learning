package org.vova.dmdev.level2.block6.exercise8.task1;

import java.util.*;

public class task1Runner {

    public static void main(String[] args) {
        String engText = new String("apple,# Apple Banana cat apple.");
        System.out.println(engText);
        stringSplitter(engText);
    }

    public static void stringSplitter(String engText) {
        String[] words = engText.split("\\W+");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
