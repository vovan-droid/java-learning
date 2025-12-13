package org.vova.dmdev.level2.block6.exercise2;

import org.vova.dmdev.level2.block6.exercise1.Pair;

public final class PairUtil {

    private PairUtil() {

    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair<>(pair.getValue(), pair.getKey());
    }
}
