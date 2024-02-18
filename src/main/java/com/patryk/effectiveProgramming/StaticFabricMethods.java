package com.patryk.effectiveProgramming;

public class StaticFabricMethods {
    int value;

    public static StaticFabricMethods anObject(int value) {
        StaticFabricMethods staticFabricMethod = new StaticFabricMethods();
        staticFabricMethod.value = value;
        return staticFabricMethod;
    }

}
