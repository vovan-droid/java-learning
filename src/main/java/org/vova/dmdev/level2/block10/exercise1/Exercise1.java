package org.vova.dmdev.level2.block10.exercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Exercise1 {

    private static final String VOWELS = "aeiouAEIOU";

    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/main/java/org/vova/dmdev/level2/block10/exercise1/exercise1.txt");
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                char firstSymbol = word.charAt(0);
                if(VOWELS.indexOf(firstSymbol) != -1) {
                    System.out.println(word);
                }
            }
        }
    }
}
