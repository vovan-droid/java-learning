package org.vova.dmdev.level2.block13.task3.model;

import org.vova.dmdev.level2.block13.task3.util.DayConst;

import java.util.List;

public class Race {
    private final String name;

    private int red;
    private int white;

    public Race(String name) {
        this.name = name;
    }

    public void addCrystals(List<CrystalType> crystals) {
        for (CrystalType c : crystals) {
            if (c == CrystalType.RED) {
                red++;
            } else {
                white++;
            }
        }
    }

    public boolean hasWon() {
        return red >= DayConst.TARGET_RED && white >= DayConst.TARGET_WHITE;
    }

    public String getName() {
        return name;
    }

    public int getRed() {
        return red;
    }

    public int getWhite() {
        return white;
    }
}
