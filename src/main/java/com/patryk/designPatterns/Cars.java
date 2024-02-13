package com.patryk.designPatterns;

public class Cars implements Moving {
    @Override
    public void run() {
        System.out.println("Running the car engine");
        System.out.println("The car engine is up and running");
    }

    @Override
    public void stop() {
        System.out.println("Braking the car");
        System.out.println("The car is stopped");
    }
}
