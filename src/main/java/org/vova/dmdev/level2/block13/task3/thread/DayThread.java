package org.vova.dmdev.level2.block13.task3.thread;

import org.vova.dmdev.level2.block13.task3.model.CompetitionState;
import org.vova.dmdev.level2.block13.task3.util.DayConst;

public class DayThread extends Thread {
    private final Object lock = new Object();
    private final CompetitionState state;

    private int day = 0;

    public DayThread(CompetitionState state) {
        this.state = state;
        setName("DayThread");
    }

    public Object getLock() {
        return lock;
    }

    public int getDay() {
        return day;
    }

    @Override
    public void run() {
        while (!state.isFinished()) {
            synchronized (lock) {
                day++;
                System.out.printf("=== Day %d (midnight) ===%n", day);

                lock.notifyAll();

                try {
                    lock.wait(DayConst.DAY_INTERVAL_MS);
                } catch (InterruptedException e) {
                    interrupt();
                    break;
                }
            }
        }

        synchronized (lock) {
            lock.notifyAll();
        }
    }
}
