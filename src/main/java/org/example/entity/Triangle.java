package org.example.entity;

/**
 * 삼각형
 */
public class Triangle implements Figure {
    private static final int size = 3;
    private Points points;

    @Override
    public double Calculator() {
        Point p1 = points.getPoint(0);
        Point p2 = points.getPoint(1);
        Point p3 = points.getPoint(2);
        return Math.abs(0.5 * (p1.getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - p1.getY()) + p3.getX() * (p1.getY() - p2.getY())));
    }

    @Override
    public boolean isPossible() {
        if (points.getPointsSize() == this.size) {
            return true;
        }
        return false;
    }
}
