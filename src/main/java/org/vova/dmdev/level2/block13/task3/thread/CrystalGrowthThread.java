package org.vova.dmdev.level2.block13.task3.thread;

import org.vova.dmdev.level2.block13.task3.model.CompetitionState;
import org.vova.dmdev.level2.block13.task3.model.CrystalField;
import org.vova.dmdev.level2.block13.task3.model.CrystalType;
import org.vova.dmdev.level2.block13.task3.util.RandomUtil;

public class CrystalGrowthThread extends Thread {
    private final DayThread dayThread;
    private final CrystalField field;
    private final CompetitionState state;

    private int lastProcessedDay = 0;

    public CrystalGrowthThread(DayThread dayThread, CrystalField field, CompetitionState state) {
        this.dayThread = dayThread;
        this.field = field;
        this.state = state;
        setName("CrystalGrowthThread");
    }

    @Override
    public void run() {
        try {
            while (!state.isFinished()) {
                waitNextMidnight();
                if (state.isFinished()) {
                    break;
                }
                grow();
            }
        } catch (InterruptedException e) {
            interrupt();
        }
    }

    private void waitNextMidnight() throws InterruptedException {
        synchronized (dayThread.getLock()) {
            while (!state.isFinished() && dayThread.getDay() == lastProcessedDay) {
                dayThread.getLock().wait();
            }
            lastProcessedDay = dayThread.getDay();
        }
    }

    private void grow() {
        int count = RandomUtil.nextIntRangeInclusive(2, 5);

        synchronized (field.getLock()) {
            for (int i = 0; i < count; i++) {
                CrystalType type = CrystalType.CACHED_VALUES.get(RandomUtil.nextInt(CrystalType.CACHED_VALUES.size()));
                field.add(type);
            }
            System.out.printf("[Planet] grew %d crystals. Field size=%d%n", count, field.size());
        }
    }
}
