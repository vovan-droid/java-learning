package org.vova.dmdev.level2.block13.task3.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CrystalField {
    private final Object lock = new Object();
    private final List<CrystalType> crystals = new LinkedList<>();

    public Object getLock() {
        return lock;
    }

    public int size() {
        return crystals.size();
    }

    public boolean isEmpty() {
        return crystals.isEmpty();
    }

    public void add(CrystalType crystal) {
        crystals.add(crystal);
    }

    public CrystalType remove(int index) {
        return crystals.remove(index);
    }

    public List<CrystalType> removeAll() {
        List<CrystalType> result = new ArrayList<>(crystals);
        crystals.clear();
        return result;
    }
}
