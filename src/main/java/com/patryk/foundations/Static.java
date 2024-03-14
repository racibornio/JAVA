package com.patryk.foundations;

public class Static {
    public static int a;
    public static int b;

    // can assign value to the class static field
    public static void setA(int a) {
        // cannot be this.a - the 'a' field is not associated with any class object/instance
        Static.a = a;
    }

    public static int getA() {
        return a;
    }

    public void setB(int b) {
        Static.b = b;
    }

    public int getB() {
        return b;
    }

}
