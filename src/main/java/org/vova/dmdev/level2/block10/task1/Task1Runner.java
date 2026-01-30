package org.vova.dmdev.level2.block10.task1;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;

/**
 * Задан файл со стихотворением Александра Пушкина.
 * Определить частоту повторяемости всех букв в стихотворении, игнорируя регистр.
 * Вывести результат в файл в виде:
 * а - 15
 * б - 7
 * ....
 * я - 11
 */

public class Task1Runner {
    public static void main(String[] args) throws IOException {
        Path poemPath = Path.of("src/main/java/org/vova/dmdev/level2/block10/task1/task1.txt");
        Map<Character, Integer> characterFrequency = CharacterHelper.calcFrequency(poemPath);

        Path resultPath = Path.of("src/main/java/org/vova/dmdev/level2/block10/task1/task1result.txt");
        Files.write(resultPath, CharacterHelper.toListRepresentation(characterFrequency), CREATE, TRUNCATE_EXISTING);
    }
}
