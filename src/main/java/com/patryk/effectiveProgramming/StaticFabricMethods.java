package com.patryk.effectiveProgramming;

public class StaticFabricMethods {
    int value;

    public static StaticFabricMethods anObject(int value) {
        StaticFabricMethods anObjectFromstaticFabricMethod = new StaticFabricMethods();
        anObjectFromstaticFabricMethod.value = value;
        return anObjectFromstaticFabricMethod;
    }

}
