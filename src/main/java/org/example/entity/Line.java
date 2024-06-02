package org.example.entity;

import java.util.List;

/**
 * 선 길이
 */
public class Line implements Figure {
    private static final int size = 2;
    private Points points;

    @Override
    public double Calculator() {
        // 공식: 제곱근((A.x - B.x)^제곱 + (A.y - B.y)^제곱)
        Point p1 = points.getPoint(0);
        Point p2 = points.getPoint(1);
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }

    @Override
    public boolean isPossible() {
        if (points.getPointsSize() == this.size) {
            return true;
        }
        return false;
    }
}
