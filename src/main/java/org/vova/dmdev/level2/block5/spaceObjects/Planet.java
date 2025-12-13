package org.vova.dmdev.level2.block5.spaceObjects;

public class Planet extends SpaceObject implements HasDensity {

    public Planet(double x, double y, double z, String name, double mass, double radius) {
        super(x, y, z, name, mass, radius);
    }

    public double getDensity(double mass, double radius) {
        return HasDensity.super.getVolume(radius);
    }

    @Override
    public double getBrightness() {
        return k * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Planet{" +
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
