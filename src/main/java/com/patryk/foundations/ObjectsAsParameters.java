package com.patryk.foundations;

public class ObjectsAsParameters {

    ObjectsAsParameters() {

    }

    ObjectsAsParameters(ObjectsAsParameters objectsAsParameter) {
        this.door = objectsAsParameter.door;
    }

    int door;

    int getDoor() {
        return this.door;
    }
}
