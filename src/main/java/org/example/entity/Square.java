package org.example.entity;

/**
 * 사각형
 * */
public class Square implements Figure{
    private Points points;

    public Square(Points points) {
        this.points = points;
    }

    @Override
    public double Calculator() {
        Point p1 = points.getPoint(0);
        Point p2 = points.getPoint(1);
        Point p3 = points.getPoint(2);

        return Math.abs(Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2))) *
                Math.abs(Math.sqrt(Math.pow(p2.getX() - p3.getX(), 2) + Math.pow(p2.getY() - p3.getY(), 2)));
    }
}
