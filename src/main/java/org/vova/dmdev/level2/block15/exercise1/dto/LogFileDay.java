package org.vova.dmdev.level2.block15.exercise1.dto;

import java.util.ArrayList;
import java.util.List;

public class LogFileDay {

    private final List<LogFileRow> rows = new ArrayList<>();

    public void add(LogFileRow row) {
        rows.add(row);
    }

    public List<LogFileRow> getRows() {
        return rows;
    }
}
