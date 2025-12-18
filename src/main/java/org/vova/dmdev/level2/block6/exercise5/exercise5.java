package org.vova.dmdev.level2.block6.exercise5;

import java.util.List;

public class exercise5 {

    public static void markLength4(List<String> listOfStrings) {
        for (int i = 0; i < listOfStrings.size(); i++) {
            if (listOfStrings.get(i).length() == 4) {
                listOfStrings.add(i, "****");
                i++;
            }
        }
    }
}
