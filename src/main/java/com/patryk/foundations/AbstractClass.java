package com.patryk.foundations;

public abstract sealed class AbstractClass permits AbstractClassExtended {

    public abstract void helloAbstract();

    public static void nonAbstractMethodFromAbstractClass() {
        System.out.println("Non-abstract method.");
    }
}