package org.vova.dmdev.level2;

public class JavaLvl2Practice1Time {

    int seconds;
    int minutes;
    int hours = 10;

    JavaLvl2Practice1Time(int overallSeconds) {
        hours = overallSeconds / 3600;
        minutes = overallSeconds % 3600 / 60;
        seconds = overallSeconds % 60;
    }

    JavaLvl2Practice1Time(int hours, int minutes, int seconds) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getOverallSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public void printData() {
        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds ");
    }
}
