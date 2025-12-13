package org.vova.dmdev.level2.block5.spaceObjects;

public class Star extends SpaceObject implements HasGravity {

    public Star(double x, double y, double z, String name, double mass, double radius) {
        super(x, y, z, name, mass, radius);
    }

    @Override
    public double getSurfaceGravity(double mass, double radius) {
        return HasGravity.super.getSurfaceGravity(mass, radius);
    }

    @Override
    public double getGravity(double mass, double radius) {
        return HasGravity.super.getGravity(mass, radius);
    }


    @Override
    public double getBrightness() {
        return k * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Star{" +
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
