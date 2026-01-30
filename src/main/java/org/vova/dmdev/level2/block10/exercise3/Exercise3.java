package org.vova.dmdev.level2.block10.exercise3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercise3 {
    private static void main(String[] args) throws IOException {
        Path path = Path.of("src/main/java/org/vova/dmdev/level2/block10/exercise3/exercise3.txt");
        Files.readAllLines(path).stream()
                .map(Exercise3::findMaxDigitsCount)
                .forEach(System.out::println);
    }

    private static Integer findMaxDigitsCount(String line) {
        int result = 0;
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i))) {
                counter++;
            } else {
                if (counter > result) {
                    result = counter;
                }
                counter = 0;
            }
        }
        return result;
    }
}
