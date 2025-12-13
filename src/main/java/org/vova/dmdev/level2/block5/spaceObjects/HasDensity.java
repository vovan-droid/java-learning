package org.vova.dmdev.level2.block5.spaceObjects;

public interface HasDensity extends HasVolume {

    default double getDensity(double mass, double radius) {
        return mass / getVolume(radius);
    }
}
