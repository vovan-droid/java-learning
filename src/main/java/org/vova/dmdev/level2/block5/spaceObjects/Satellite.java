package org.vova.dmdev.level2.block5.spaceObjects;

public class Satellite extends SpaceObject {

    public Satellite(double x, double y, double z, String name, double mass, double radius) {
        super(x, y, z, name, mass, radius);
    }

    public double getBrightness() {
        return k * Math.pow(radius, 4);
    }

    @Override
    public String toString() {
        return "Satelite{" +
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
