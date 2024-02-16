package com.patryk.foundations;

public class OverridenConstructor {
    int number1;
    double number2;

    OverridenConstructor(int number) {
        number1 = number;
    }

    OverridenConstructor(double number) {
        number2 = number;
    }

    OverridenConstructor(int parameterNo1, double parameterNo2) {
        // the line below delegates the instruction to another constructor in the class that has compatible data/argument type
        // a constructor may be explicitly invoked only in another constructor - that one is invoked in this one - and in must be the first instruction; one and only one constructor may be invoked and no other instruction can be put earlier
        this(parameterNo1);
        this.number2 =  parameterNo2;
    }

    void displayNumbers() {
        System.out.println("Number1: " + number1);
        System.out.println("Number2: " + number2);
    }

}
