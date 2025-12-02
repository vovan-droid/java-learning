package org.vova.dmdev.level2.block1;

public class TimeInterval {
    private int seconds;
    private int minutes;
    private int hours = 10;

    public TimeInterval(int overallSeconds) {
        hours = overallSeconds / 3600;
        minutes = overallSeconds % 3600 / 60;
        seconds = overallSeconds % 60;
    }

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int totalSeconds() {
        return seconds + minutes * 60 + hours * 60 * 60;
    }

    public TimeInterval sum(TimeInterval second) {
        return new TimeInterval(totalSeconds() + second.totalSeconds());
    }

    public void print() {
        System.out.println("h " + hours + ", m " + minutes + ", s " + seconds);
    }

    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(30, 2, 1);
        System.out.println(timeInterval.totalSeconds());
        TimeInterval timeInterval2 = new TimeInterval(timeInterval.totalSeconds());
        System.out.println(timeInterval2.totalSeconds());
        timeInterval2.print();
        TimeInterval sumIntervals = timeInterval.sum(timeInterval2);
        sumIntervals.print();
    }
}
