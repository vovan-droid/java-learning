package org.vova.dmdev.level2.block13.task3.util;

import java.util.Random;

public final class RandomUtil {
    private static final Random RANDOM = new Random();

    private RandomUtil() {
    }

    public static int nextInt(int bound) {
        return RANDOM.nextInt(bound);
    }

    public static int nextIntWithoutZero(int bound) {
        return RANDOM.nextInt(bound) + 1;
    }

    public static int nextIntRangeInclusive(int min, int max) {
        return min + RANDOM.nextInt((max - min) + 1);
    }
}
