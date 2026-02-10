package org.vova.dmdev.level2.block13.task3.model;

import java.util.Arrays;
import java.util.List;

public enum CrystalType {
    RED,
    WHITE;

    public static final List<CrystalType> CACHED_VALUES = Arrays.asList(values());
}
