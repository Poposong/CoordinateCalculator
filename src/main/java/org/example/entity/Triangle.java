package org.example.entity;

/**
 * 삼각형
 */
public class Triangle implements Figure {
    private Points points;

    public Triangle(Points points) {
        this.points = points;
    }

    @Override
    public double Calculator() {
        Point p1 = points.getPoint(0);
        Point p2 = points.getPoint(1);
        Point p3 = points.getPoint(2);
        return Math.abs(0.5 * (p1.getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - p1.getY()) + p3.getX() * (p1.getY() - p2.getY())));
    }
}
