package org.vova.dmdev.level2.block5.spaceObjects;

public final class SpaceUtils {

    private SpaceUtils() {

    }

    public static double gravityForceBetweenTwoSpaceObjects(SpaceObject spaceObject1, SpaceObject spaceObject2) {
        return Math.pow(spaceObject1.distanceTo(spaceObject2), 2.0);
    }

    public static boolean isStar(SpaceObject spaceObject) {
        return spaceObject instanceof Star;
    }
}
