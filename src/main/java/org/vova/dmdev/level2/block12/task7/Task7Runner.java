package org.vova.dmdev.level2.block12.task7;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Task7Runner {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Africa/Cairo"));
        System.out.println(zonedDateTime);
    }
}
