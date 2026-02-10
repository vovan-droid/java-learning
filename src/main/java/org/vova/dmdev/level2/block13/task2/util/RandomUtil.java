package org.vova.dmdev.level2.block13.task2.util;

import java.util.Random;

public class RandomUtil {
    private static final Random RANDOM = new Random();

    private RandomUtil() {
    }

    public static int getNextWithoutZero(int bound) {
        return RANDOM.nextInt(bound) + 1;
    }

    public static int getNext(int bound) {
        return RANDOM.nextInt(bound);
    }
}
