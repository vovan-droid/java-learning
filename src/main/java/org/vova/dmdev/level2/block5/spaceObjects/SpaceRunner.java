package org.vova.dmdev.level2.block5.spaceObjects;

public class SpaceRunner {

    public static void main(String[] args) {
        Star star = new Star(1, 2, 3, "star1", 20, 300000 );
        Asteroid asteroid = new Asteroid(2, 2, 3, "asteroid1", 0.2, 3000 );
        Planet planet = new Planet(9, 5, 3, "planet1", 0.5, 30000 );
        Satellite satellite = new Satellite(6, 21, 32, "satellite1", 0.3, 15000 );

        System.out.println(star);
        System.out.println(star.getSurfaceGravity(star.getMass(), star.getRadius()));
        System.out.println(star.getGravity(star.getMass(), star.getRadius()));
        System.out.println(star.getBrightness());
        System.out.println(star.isBrightnessEqual(asteroid));

        System.out.println(asteroid);
        System.out.println(asteroid.getVolume(asteroid.getRadius()));
        System.out.println(asteroid.getDiameter(asteroid.getRadius()));

        System.out.println(planet.getDensity(planet.getMass(), planet.getRadius()));
        System.out.println(planet.getBrightness());
        System.out.println(planet.isMassEqual(satellite));

        System.out.println(satellite.distanceTo(asteroid));
        System.out.println(satellite.getMass() + " " + satellite.getRadius());

        System.out.println(SpaceUtils.gravityForceBetweenTwoSpaceObjects(star, planet));
        System.out.println(SpaceUtils.isStar(star));
        System.out.println(SpaceUtils.isStar(satellite));
    }
}
