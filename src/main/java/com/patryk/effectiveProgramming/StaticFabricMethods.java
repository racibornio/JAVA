package com.patryk.effectiveProgramming;

public class StaticFabricMethods {
    int value;

    public static StaticFabricMethods anObject(int value) {
        StaticFabricMethods staticFabricMethod;
        staticFabricMethod.value = value;
        return StaticFabricMethods;
    }

}
