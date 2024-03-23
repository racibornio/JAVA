package com.patryk.foundations;

// final class means none class can extend the class
public final class FinalClassAndMembers {

    int classField = 9;

    // a final field may only be declared and not initialized - the value assign to it will be its value that couldn't be mofified; it should have value assigned in the constructor so that's why the constructor below has been enforced by the IDE
    final int finalFieldNotInitialized;

    public FinalClassAndMembers(int finalFieldNotInitialized) {
        this.finalFieldNotInitialized = finalFieldNotInitialized;
    }


    public void justAMethodWithFinalArgument(final int aValue) {
        // the value passed on here couldn't be modified
        System.out.println(aValue);
    }
}
