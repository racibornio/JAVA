package com.patryk.foundations;

public class Point {

    int x, y;

    Point() {

    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }

}