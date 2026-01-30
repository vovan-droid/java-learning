package org.vova.dmdev.level2.block5.spaceObjects;

public abstract class SpaceObject {
    public static final double k = 12345e-5;

    public final double x;
    public final double y;
    public final double z;
    public final String name;
    public final double mass;
    public final double radius;

    public SpaceObject(double x, double y, double z, String name, double mass, double radius) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
        this.mass = mass;
        this.radius = radius;
    }

    public double distanceTo(SpaceObject other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        double dz = this.z - other.z;
        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }

    public double getDiameter(double radius) {
        return radius * 2;
    }

    public boolean isMassEqual(SpaceObject other) {
        return this.mass == other.mass;
    }

    public boolean isBrightnessEqual(SpaceObject other) {
        return getBrightness() == other.getBrightness();
    }

    public abstract double getBrightness();
}
