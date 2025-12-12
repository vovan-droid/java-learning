package org.vova.dmdev.level2.block5.geometryFigures;

public class Rectangle extends Figure implements WithDiagonal {
    private final Point leftTop;
    private final Point rightBottom;

    public Rectangle(Point leftTop, Point rightBottom) {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
    }

    @Override
    public double getDiagonal() {
        return leftTop.distance(rightBottom);
    }

    @Override
    public double getArea() {
        return (rightBottom.getX() - leftTop.getX()) + (rightBottom.getY() - leftTop.getY());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "leftTopPoint=" + leftTop +
                ", rightBottomPoint=" + rightBottom +
                "}";
    }

    public Point getLeftTop() {
        return leftTop;
    }

    public Point getRightBottom() {
        return rightBottom;
    }
}
