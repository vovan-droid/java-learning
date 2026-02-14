package org.vova.dmdev.level2.block15.exercise1;

import org.vova.dmdev.level2.block15.exercise1.parser.LogFileParser;
import org.vova.dmdev.level2.block15.exercise1.report.StatisticReportGenerator;
import org.vova.dmdev.level2.block15.exercise1.report.TimeReportGenerator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;

public class Exercise1Runner {
    public static void main(String[] args) throws IOException {
        var logFilePath = Path.of("src/main/java/org/vova/dmdev/level2/block15/exercise1/homework.log");
        var logFileParser = new LogFileParser();
        var logFileDays = logFileParser.parse(logFilePath);

        var timeReportGenerator = new TimeReportGenerator();
        var timeReport = timeReportGenerator.generate(logFileDays);
        Files.writeString(Path.of("src/main/java/org/vova/dmdev/level2/block15/exercise1/time-report.txt"), timeReport, CREATE, TRUNCATE_EXISTING);

        var statisticReportGenerator = new StatisticReportGenerator();
        var statisticReport = statisticReportGenerator.generate(logFileDays);
        Files.writeString(Path.of("src/main/java/org/vova/dmdev/level2/block15/exercise1/statistic-report.txt"), statisticReport, CREATE, TRUNCATE_EXISTING);
    }
}
