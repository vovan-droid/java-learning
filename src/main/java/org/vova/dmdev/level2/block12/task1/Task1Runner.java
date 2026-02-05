package org.vova.dmdev.level2.block12.task1;

import java.time.LocalDateTime;

public class Task1Runner {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 06, 25, 19, 47);
        System.out.println(localDateTime);
        LocalDateTime localDateTime2 = localDateTime.plusMonths(3);
        System.out.println(localDateTime2);
        System.out.println(localDateTime2.toLocalDate());
        System.out.println(localDateTime2.toLocalTime());
    }
}
