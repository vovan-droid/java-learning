package org.vova.dmdev.level2.block5.geometryFigures;

public interface WithPerimeter {

    double getPerimeter();

    default double getSide(Point point1, Point point2) {
        return point1.distance(point2);
    }

    default double getSemiPerimeter() {
        return getPerimeter() / 2;
    }
}
