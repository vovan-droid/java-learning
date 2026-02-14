package org.vova.dmdev.level2.block15.exercise1.report;

import org.vova.dmdev.level2.block15.exercise1.dto.LogFileDay;

import java.util.List;

public interface ReportGenerator {

    String generate(List<LogFileDay> logFileDays);
}
