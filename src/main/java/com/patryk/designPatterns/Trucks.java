package com.patryk.designPatterns;

public class Trucks implements Moving {
    @Override
    public void run() {
        System.out.println("Warming up the truck engine");
        System.out.println("Running the truck engine");
        System.out.println("The truck engine is up and running");
    }

    @Override
    public void stop() {
        System.out.println("Braking the truck");
        System.out.println("Turn on the truck parking mode");
        System.out.println("The truck is stopped");
    }
}
