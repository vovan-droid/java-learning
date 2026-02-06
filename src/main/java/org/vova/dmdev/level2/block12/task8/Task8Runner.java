package org.vova.dmdev.level2.block12.task8;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;

public class Task8Runner {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime with = now.with(temporal -> temporal.plus(42, ChronoUnit.DAYS));
        System.out.println(with);
    }
}
