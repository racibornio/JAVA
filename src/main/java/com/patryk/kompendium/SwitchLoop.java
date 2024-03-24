package com.patryk.kompendium;

public class SwitchLoop {
    public static void main(String[] args) {
        int value = 0;

        switch (value) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("The value is not greater than 6.");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("The value is greater than 5 and not greater than 11.");
                break;
            default:
                System.out.println("Unknown value.");
        }
    }
}
