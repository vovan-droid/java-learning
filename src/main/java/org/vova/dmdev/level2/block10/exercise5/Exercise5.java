package org.vova.dmdev.level2.block10.exercise5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class Exercise5 {
    public static void main(String[] args) {
        Path path = Path.of("src/main/java/org/vova/dmdev/level2/block10/exercise4/Exercise4.java");
        Path result = Path.of("src/main/java/org/vova/dmdev/level2/block10/exercise5/exercise5");

        try (Stream<String> lines = Files.lines(path);
             BufferedWriter bufferedWriter = Files.newBufferedWriter(result, APPEND, CREATE)) {
            lines.map(StringBuilder::new)
                    .map(StringBuilder::reverse)
                    .forEach(line -> {
                        try {
                            bufferedWriter.write(line.toString());
                            bufferedWriter.newLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
