package org.vova.dmdev.level2.block6and7.exercise2;

import org.vova.dmdev.level2.block6and7.exercise1.Pair;

public class Test {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("111a", 222);
        System.out.println(pair);

        Pair<Integer, String> swappedPair = PairUtil.swap(pair);
        System.out.println(swappedPair);
    }
}
