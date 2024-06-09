package org.example.entity;

import java.util.ArrayList;
import java.util.List;

public class Points{
    private List<Point> points;

    public Points(){
        this.points = new ArrayList<>();
    }

    public void addPoint(Point point){
        this.points.add(point);
    }

    public Point getPoint(int index){
        return this.points.get(index);
    }

    public List<Point> getPoints(){
        return this.points;
    }

    public int getPointsSize(){
        return this.points.size();
    }

}
