package org.example.entity;

public interface Figure{

    // 도형의 길이 또는 넓이를 계산한다.
    double Calculator();

    // 도형을 만들 수 있는 지 확인한다.
    default boolean isPossible(Points points, int size){
        if(points == null){
            return false;
        }

        if (points.getPointsSize() == size) {
            return true;
        }
        return false;
    }

}
