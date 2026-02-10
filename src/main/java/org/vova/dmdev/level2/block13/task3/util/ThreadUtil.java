package org.vova.dmdev.level2.block13.task3.util;

public final class ThreadUtil {
    private ThreadUtil() {
    }

    public static void startThreads(Thread... threads) {
        for (Thread t : threads) {
            t.start();
        }
    }

    public static void joinThreads(Thread... threads) throws InterruptedException {
        for (Thread t : threads) {
            t.join();
        }
    }
}
