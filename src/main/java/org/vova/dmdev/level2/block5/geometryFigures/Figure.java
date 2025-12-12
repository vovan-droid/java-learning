package org.vova.dmdev.level2.block5.geometryFigures;

public abstract class Figure {

    public boolean isAreaEqual(Figure figure) {
        return getArea() == figure.getArea();
    }

    public abstract double getArea();
}
