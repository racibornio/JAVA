package com.patryk.kompendium;

public class TernaryOperator {
    public static void main(String[] args) {
        int result, value;
        value = 10;
        result = value < 0 ? -value : value;
        System.out.println(value + " [" + result + "]");

        value = -10;
        result = value < 10 ? -value : value;
        System.out.println(value + " [" + result + "]");
    }
}