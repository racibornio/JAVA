package com.patryk.foundations;

public class Main {

    public static void main(String[] args) {

        ObjectsComparison oc1 = new ObjectsComparison();
        ObjectsComparison oc2 = new ObjectsComparison();

        oc1.setaValue(1);
        oc2.setaValue(1);

        // this won't compare the value of objects but their addresses in the memory
        boolean areNotEmptyObjectsEqual = oc1 == oc2;
        System.out.println("Are objects equal by '=='? -> " + areNotEmptyObjectsEqual + " as \noc1 is " + oc1 + " and \noc2 is " + oc2);

        // comparing the same as above but using 'equals()' method
        boolean areObjectsEqualByEqualsMethod = oc1.equals(oc2);
        System.out.println("Are objects equal by 'equals()'? -> " + areObjectsEqualByEqualsMethod);

        // default implementation of 'equals()' works the same as '==' operator so in order to compare two objects by their content the 'equals()' method should be overriden in your class

    }
}
