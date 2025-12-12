package org.vova.dmdev.level2.block5.geometryFigures;

import java.awt.*;

public final class ShapeUtils {

    static boolean isRectangle(Figure figure) {
        return figure instanceof Rectangle;
    }

    static boolean isTriangle(Figure figure) {
        return figure instanceof Triangle;
    }

    static boolean isCircle(Figure figure) {
        return figure instanceof Circle;
    }
}
