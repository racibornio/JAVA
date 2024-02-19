package com.patryk.kompendium;

public class BitShift {
    public static void main(String[] args) {

        //////////////////////////////////////////////////////////////
        // left shift
        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("Initial value of a: " + a);
        System.out.println("i and b: " + i + " " + b);

        // move to multiply and return
        int initialA = 2;
        System.out.println(initialA);
        initialA = initialA << 1;
        System.out.println(initialA);
        initialA = initialA >> 1;
        System.out.println(initialA);

        // hex values
        int firstHexValue = 0xF0;
        System.out.println(firstHexValue);

        // bit shift of hexadecimal values
        int num = 0xFFFFFFE;

        for (int iter = 0; iter < 4; iter++) {
            num = num << 1;
            System.out.println(num);
        }


        //////////////////////////////////////////////////////////////
        // right shift

        int rightA = 32;
        System.out.println(rightA);
        rightA = rightA >> 2;
        System.out.println(rightA);

    }
}
