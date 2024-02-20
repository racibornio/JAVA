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

        // every shift-left moves bits by one position - for int each after 31st gets lost, for long each after 63rd
        // moving value '1' onto 31st or 63rd accordingly and the value will get negative
        // this will always bring new '0' value on the most left bit


        //////////////////////////////////////////////////////////////
        // right shift

        int rightA = 32;
        System.out.println(rightA);
        rightA = rightA >> 2;
        System.out.println(rightA);

        // every shift-right moves bits by one position
        // this will always bring new '1' value on the most right bit

        //////////////////////////////////////////////////////////////
        // when a negative value is unwanted

        char[] hex = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        byte bHex = (byte) 0xf1;
        System.out.println("bHex = 0x" + hex[(bHex >> 4) & 0x0f] + hex[bHex & 0x0f]);

    }
}
