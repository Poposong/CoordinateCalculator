package org.example.constant;

public enum Size {
    Line(2),
    TRIANGLE(3),
    SQUARE(4);

    private final int size;

    Size(int size) {
        this.size = size;
    }

    public int getSize(){
        return this.size;
    }
}
