package org.vova.dmdev.level2.block12.task6;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Task6Runner {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate localDate = LocalDate.of(2018, 7, 7);
        System.out.println(localDate);
        //LocalDateTime.of(today, LocalTime.MIDNIGHT);
        LocalDateTime localDateTime = today.atStartOfDay();
        LocalDateTime localDateTime1 = localDate.atStartOfDay();

        Duration duration = Duration.between(localDateTime1, localDateTime);
        System.out.println(duration);


    }
}
