package org.vova.dmdev.level2.block12.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task2Runner {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(today.format(formatter));
    }
}
