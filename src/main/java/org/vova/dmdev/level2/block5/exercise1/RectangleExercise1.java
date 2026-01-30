package org.vova.dmdev.level2.block5.exercise1;

public class RectangleExercise1 {
    private PointExercise1 leftTop;
    private PointExercise1 rightBottom;

    public RectangleExercise1(PointExercise1 leftTop, PointExercise1 rightBottom) {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
    }

    public double squareRectangle() {
        double square = (rightBottom.getX() - leftTop.getX()) * (leftTop.getY() - rightBottom.getY());
        return square;
    }

    public double diagonalRectangle() {
        double diagonal = leftTop.distance(rightBottom);
        return diagonal;
    }
}
