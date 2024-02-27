package com.patryk.foundations;

public class Point3D extends Point {

    int z;

    Point3D(int z) {
        super();
        this.z = z;
    }

    // this gets superclass relevant constructor and extends it with another parameter that is passed extra - the object gets cast
    Point3D(Point point, int z) {
        super(point);
        this.z = z;
    }
}
