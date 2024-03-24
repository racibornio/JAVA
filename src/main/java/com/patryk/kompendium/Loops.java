package com.patryk.kompendium;

public class Loops {

    public static void main(String[] args) {
        // while

        int i = 100, j = 200;

        // no body needed - all calculations are performed within the conditinal expression
        while (++i < --j);

        // final 'i' value is as follows:
        System.out.println("The final value is " + i);
    }

}
