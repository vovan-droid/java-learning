package org.vova.dmdev.level2.block12.task4;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Task4Runner {
    public static void main(String[] args) {
        String s = ("26-03-1968T09:24");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime ldt = LocalDateTime.parse(s, dtf);
        Instant instant = ldt.toInstant(ZoneId.of("America/Chicago").getRules().getOffset(ldt));
        System.out.println(instant);
        long epochMilli = instant.toEpochMilli();
        System.out.println(epochMilli);
    }
}
