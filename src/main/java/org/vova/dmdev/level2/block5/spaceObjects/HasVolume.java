package org.vova.dmdev.level2.block5.spaceObjects;

public interface HasVolume {

    default double getVolume(double radius) {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
}
