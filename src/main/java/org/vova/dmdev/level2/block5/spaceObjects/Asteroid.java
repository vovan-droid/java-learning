package org.vova.dmdev.level2.block5.spaceObjects;

public class Asteroid extends SpaceObject implements HasVolume {

    public Asteroid(double x, double y, double z, String name, double mass, double radius) {
        super(x, y, z, name, mass, radius);
    }

    @Override
    public double getVolume(double radius) {
        return HasVolume.super.getVolume(radius);
    }

    @Override
    public double getBrightness() {
        return k * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Asteroid{" +
                "name='" + name +
                ", mass=" + mass +
                ", radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
}
