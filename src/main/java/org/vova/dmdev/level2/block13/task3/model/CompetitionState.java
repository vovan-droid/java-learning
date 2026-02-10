package org.vova.dmdev.level2.block13.task3.model;

public class CompetitionState {
    private final Object lock = new Object();

    private boolean finished = false;
    private String winnerName;
    private int winnerDay;

    public Object getLock() {
        return lock;
    }

    public boolean isFinished() {
        synchronized (lock) {
            return finished;
        }
    }

    public String getWinnerName() {
        synchronized (lock) {
            return winnerName;
        }
    }

    public int getWinnerDay() {
        synchronized (lock) {
            return winnerDay;
        }
    }

    public void finishIfNotFinished(String winnerName, int day) {
        synchronized (lock) {
            if (!finished) {
                finished = true;
                this.winnerName = winnerName;
                this.winnerDay = day;
            }
        }
    }
}
