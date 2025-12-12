package org.vova.dmdev.level2.block5.geometryFigures;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int distance(Point point) {
        double dx = Math.pow(x - point.x, 2.0);
        double dy = Math.pow(y - point.y, 2.0);
        return (int) Math.sqrt(dx + dy);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
