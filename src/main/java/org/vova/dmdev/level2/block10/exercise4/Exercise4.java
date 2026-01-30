package org.vova.dmdev.level2.block10.exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercise4 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/main/java/org/vova/dmdev/level2/block10/exercise3/Exercise3.java");
        String stringValue = Files.readString(path);
        String result = stringValue.replaceAll("public", "private");

        Path resultPath = Path.of("src/main/java/org/vova/dmdev/level2/block10/exercise3", "Exercise3.java");
        Files.writeString(resultPath, result);
    }
}
