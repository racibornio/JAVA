package com.patryk.kompendium;

public class VarTypeInference {

    public static void main(String[] args) {

        // 1 - these two do the same:
        double avg = 10.0;
        var avg1 = 10.0;

        // 2 - 'var' became a keyword - it tells the compiler that the variable type must be inferenced
        // in other places of code it means nothing - may be even used as a variable name:
        int var = 9;
        var minusValue = -var; // this flips sign for the var variable of int

        // 3 - var can be used to declare arrays:
        var myArray = new int[10];
        // but it cannot be used on the left side of the equation:
        // var [] myArray = new int[10]; - ERROR
        // var myArray[] = new int[10]; - ERROR

        // 4 - var can be used locally for variables that are initialized at the same time:
        // var value; - ERROR


        // 5 - 'var' is a contextual keyword so it cannot be used for
        // - class name,
        // - interface name,
        // - annotations,
        // - parameter name,
        // - parametrized types,
        // - declaring variables of exceptions in 'catch' instructions,
        // - lambda expressions and method references cannot be initializers,
        // - only one variable in the instruction can be inferenced as 'var'
        // - 'null' cannot be its initializer

        // - cannot be used as array initializer:
        // var myArray = new int[10]; - OK
        // var myArray = {1, 2, 3}; - ERROR
    }

}
