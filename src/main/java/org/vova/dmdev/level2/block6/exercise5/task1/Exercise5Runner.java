package org.vova.dmdev.level2.block6.exercise5.task1;

import java.util.LinkedList;
import java.util.List;

public class Exercise5Runner {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        Exercise5.markLength4(list);
        System.out.println(list);
    }
}
