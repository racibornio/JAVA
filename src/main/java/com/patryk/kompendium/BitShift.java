package com.patryk.kompendium;

public class BitShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("Initial value of a: " + a);
        System.out.println("i and b: " + i + " " + b);

        // move to multiply and return
        int initialA = 2;
        System.out.println(initialA);
        int movedA = initialA << 1;
        System.out.println(movedA);
        int returnedA = movedA >> 1;
        System.out.println(returnedA);

        // hex values
        int firstHexValue = 0xF0;
        System.out.println(firstHexValue);

        // bit shift of hexadecimal values
        int num = 0xFFFFFFE;

        for (int iter = 0; iter < 4; iter++) {
            num = num << 1;
            System.out.println(num);
        }
    }
}
