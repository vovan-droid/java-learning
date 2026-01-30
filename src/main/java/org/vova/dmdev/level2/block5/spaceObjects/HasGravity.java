package org.vova.dmdev.level2.block5.spaceObjects;

public interface HasGravity {
    double G = 6.67430e-11;

    default double getSurfaceGravity(double mass, double radius) {
        return G * mass / Math.pow(radius, 2);
    }

    default double getGravity(double mass, double radius) {
        return Math.sqrt(2 * G * mass / radius);
    }
}
