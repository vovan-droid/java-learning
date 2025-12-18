package org.vova.dmdev.level2.block6.exercise5.task1;

import java.util.List;
import java.util.ListIterator;

public class exercise5 {

    private static final String TARGET_VALUE = "****";
    private static final int TARGET_LENGTH = 4;

    private exercise5() {
    }

    /**
     * У наследников интерфейса List есть более мощный итератор - ListIterator, который наследуется от обычного
     * интерфейса Iterator, но предоставляет еще больше функциональности, которую можно использовать для свох нужд,
     * например, методы set, add и другие.
     */
    public static void markLength4(List<String> list) {
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String nextValue = listIterator.next();
            if (nextValue.length() == TARGET_LENGTH) {
                listIterator.set(TARGET_VALUE);
                listIterator.add(nextValue);
            }
        }
    }
}
