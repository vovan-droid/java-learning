package org.vova.dmdev.level2.block10.exercise2;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/main/java/org/vova/dmdev/level2/block10/exercise2/exercise2.txt");
        try (Scanner scanner = new Scanner(path)) {
            String prev = null;
            if (scanner.hasNext()) {
                prev = scanner.next();
            }
            while (scanner.hasNext()) {
                String current = scanner.next();
                if (isEqualLastSymbolAndFirstSymbol(prev, current)) {
                    System.out.println(prev + ": " + current);
                }
                prev = current;
            }
        }
    }

    private static boolean isEqualLastSymbolAndFirstSymbol(String prev, String current) {
        return prev.charAt(prev.length() - 1) == current.charAt(0);
    }
}
