package org.vova.dmdev.level2.block12.task3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task3Runner {
    public static void main(String[] args) {
        String s = ("26-03-1968T09:24");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime ldt = LocalDateTime.parse(s, dtf);
        System.out.println(ldt);
    }
}
