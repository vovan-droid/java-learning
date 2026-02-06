package org.vova.dmdev.level2.block12.task5;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Task5Runner {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate localDate = LocalDate.of(2018, 7, 7);
        Period period = Period.between(localDate, today);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        long days = ChronoUnit.DAYS.between(localDate, today);
        System.out.println(days);
    }
}
