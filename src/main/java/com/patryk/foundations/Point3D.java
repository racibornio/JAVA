package com.patryk.foundations;

public class Point3D extends Point {

    int z;

    Point3D(int z) {
        super();
        this.z = z;
    }

    Point3D(Point point, int z) {
        super(point);
        this.z = z;
    }
}
