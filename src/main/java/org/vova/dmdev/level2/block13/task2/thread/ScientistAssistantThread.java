package org.vova.dmdev.level2.block13.task2.thread;

import org.vova.dmdev.level2.block13.task2.util.NightConst;
import org.vova.dmdev.level2.block13.task2.util.RandomUtil;
import org.vova.dmdev.level2.block13.task2.model.Dump;
import org.vova.dmdev.level2.block13.task2.model.RobotDetail;
import org.vova.dmdev.level2.block13.task2.model.Scientist;

import java.util.ArrayList;
import java.util.List;

public class ScientistAssistantThread extends Thread {

    private static final int MAX_DETAILS_COUNT = 4;
    private final NightThread night;
    private final Scientist scientist;
    private final Dump dump;

    public ScientistAssistantThread(Scientist scientist, Dump dump, NightThread night) {
        this.scientist = scientist;
        this.dump = dump;
        this.night = night;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < NightConst.AMOUNT_OF_NIGHT; i++) {
                List<RobotDetail> robotDetails = gatherRobotDetailsFromFactory();
                scientist.addRobotDetails(robotDetails);
                waitNextNight();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private List<RobotDetail> gatherRobotDetailsFromFactory() {
        int detailsCount = RandomUtil.getNextWithoutZero(MAX_DETAILS_COUNT);
        List<RobotDetail> gatheredDetailsFromFactory = new ArrayList<>(MAX_DETAILS_COUNT);
        synchronized (dump.getLock()) {
            if (dump.size() <= detailsCount) {
                gatheredDetailsFromFactory.addAll(dump.removeAll());
            } else if (dump.isNotEmpty()) {
                for (int j = 0; j < detailsCount; j++) {
                    RobotDetail removedDetail = dump.remove(RandomUtil.getNext(dump.size()));
                    gatheredDetailsFromFactory.add(removedDetail);
                }
            }
            System.out.printf("%s assistant gathered next details: %s\n", scientist.getName(), gatheredDetailsFromFactory);
        }

        return gatheredDetailsFromFactory;
    }

    private void waitNextNight() throws InterruptedException {
        synchronized (night.getLock()) {
            night.getLock().wait();
        }
    }

    public Scientist getScientist() {
        return scientist;
    }
}
