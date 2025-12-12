package org.vova.dmdev.level2.block5.exercise1;

public class PointExercise1 {
    private double x;
    private double y;


    PointExercise1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public double distance(PointExercise1 other) {
        double dx = other.getX() - this.getX();
        double dy = other.getY() - this.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
