package com.patryk.designPatterns;

public class Main {
    public static void main(String[] args) {
        System.out.println("It works!");

        Moving car1 = new Cars();
        car1.run();
        car1.stop();

        Moving truck1 = new Trucks();
        truck1.run();
        truck1.stop();
    }
}
