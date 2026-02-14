package org.vova.dmdev.level2.block15.exercise1.dto;

import java.time.LocalTime;

public class LogFileRow {

    private final LocalTime time;
    private final String activityName;

    public LogFileRow(LocalTime time, String activityName) {
        this.time = time;
        this.activityName = activityName;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getActivityName() {
        return activityName;
    }
}