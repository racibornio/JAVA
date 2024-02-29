package com.patryk.foundations;

public class MultiClass {
        public static void main(String[] args) {
            Rectangles rect1 = new Rectangles();
            rect1.a = 33;
            rect1.b = 99;
            System.out.println("Rectangle: " + rect1.a + " x " + rect1.b);
        }
}

class Rectangles {
    int a, b;
}

class Circles {
    int r;
    double PI;
}
