package org.vova.dmdev.level2.block5.exercise1;

public class TestExercise1 {
    public static void main(String[] args) {
        RectangleExercise1 rectangle = new RectangleExercise1(new PointExercise1(0, 0), new PointExercise1(5, -3));
        System.out.println(rectangle.squareRectangle() + " " + rectangle.diagonalRectangle());
    }
}
