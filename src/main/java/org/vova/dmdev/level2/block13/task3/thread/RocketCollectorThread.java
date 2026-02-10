package org.vova.dmdev.level2.block13.task3.thread;

import org.vova.dmdev.level2.block13.task3.model.CompetitionState;
import org.vova.dmdev.level2.block13.task3.model.CrystalField;
import org.vova.dmdev.level2.block13.task3.model.CrystalType;
import org.vova.dmdev.level2.block13.task3.model.Race;
import org.vova.dmdev.level2.block13.task3.util.RandomUtil;

import java.util.ArrayList;
import java.util.List;

public class RocketCollectorThread extends Thread {
    private final Race race;
    private final CrystalField field;
    private final DayThread dayThread;
    private final CompetitionState state;

    private int lastProcessedDay = 0;

    public RocketCollectorThread(String threadName, Race race, CrystalField field, DayThread dayThread, CompetitionState state) {
        this.race = race;
        this.field = field;
        this.dayThread = dayThread;
        this.state = state;
        setName(threadName);
    }

    @Override
    public void run() {
        try {
            while (!state.isFinished()) {
                waitNextMidnight();
                if (state.isFinished()) {
                    break;
                }

                List<CrystalType> loot = collect();

                race.addCrystals(loot);

                System.out.printf("[%s] got %s | total: RED=%d WHITE=%d%n",
                        race.getName(), loot, race.getRed(), race.getWhite());

                if (race.hasWon()) {
                    state.finishIfNotFinished(race.getName(), dayThread.getDay());
                }
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

    private List<CrystalType> collect() {
        int capacity = RandomUtil.nextIntRangeInclusive(2, 5);
        List<CrystalType> result = new ArrayList<>(capacity);

        synchronized (field.getLock()) {
            if (field.isEmpty()) {
                return result; // улетает пустой
            }

            if (field.size() <= capacity) {
                result.addAll(field.removeAll());
                return result;
            }

            for (int i = 0; i < capacity; i++) {
                int idx = RandomUtil.nextInt(field.size());
                result.add(field.remove(idx));
            }
        }

        return result;
    }
}
