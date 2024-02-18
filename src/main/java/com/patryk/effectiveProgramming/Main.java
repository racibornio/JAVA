package com.patryk.effectiveProgramming;

public class Main {
    public static void main(String[] args) {

        StaticFabricMethods valueOfClassObject = StaticFabricMethods.anObject(89);
        System.out.println(valueOfClassObject.value);

    }
}
