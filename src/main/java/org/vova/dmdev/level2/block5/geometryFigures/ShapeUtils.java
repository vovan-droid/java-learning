package org.vova.dmdev.level2.block5.geometryFigures;

import java.awt.*;

public final class ShapeUtils {

    private ShapeUtils() {

    }

    public static boolean isRectangle(Figure figure) {
        return figure instanceof Rectangle;
    }

    public static boolean isTriangle(Figure figure) {
        return figure instanceof Triangle;
    }

    public static boolean isCircle(Figure figure) {
        return figure instanceof Circle;
    }
}
