package org.vova.dmdev.level2.block13.task3;

import org.vova.dmdev.level2.block13.task3.model.CompetitionState;
import org.vova.dmdev.level2.block13.task3.model.CrystalField;
import org.vova.dmdev.level2.block13.task3.model.Race;
import org.vova.dmdev.level2.block13.task3.thread.CrystalGrowthThread;
import org.vova.dmdev.level2.block13.task3.thread.DayThread;
import org.vova.dmdev.level2.block13.task3.thread.RocketCollectorThread;
import org.vova.dmdev.level2.block13.task3.util.ThreadUtil;

public class Task3Runner {
    public static void main(String[] args) throws InterruptedException {
        CompetitionState state = new CompetitionState();

        CrystalField field = new CrystalField();

        Race fireMages = new Race("Fire mages");
        Race airMages = new Race("Air mages");

        DayThread dayThread = new DayThread(state);
        CrystalGrowthThread growthThread = new CrystalGrowthThread(dayThread, field, state);

        RocketCollectorThread fireRocket = new RocketCollectorThread("FireRocket", fireMages, field, dayThread, state);
        RocketCollectorThread airRocket = new RocketCollectorThread("AirRocket", airMages, field, dayThread, state);

        ThreadUtil.startThreads(dayThread, growthThread, fireRocket, airRocket);
        ThreadUtil.joinThreads(dayThread, growthThread, fireRocket, airRocket);

        System.out.println("---- RESULT ----");
        System.out.printf("Winner: %s (day %d)%n", state.getWinnerName(), state.getWinnerDay());
        System.out.printf("%s -> RED=%d WHITE=%d%n", fireMages.getName(), fireMages.getRed(), fireMages.getWhite());
        System.out.printf("%s -> RED=%d WHITE=%d%n", airMages.getName(), airMages.getRed(), airMages.getWhite());
    }
}
