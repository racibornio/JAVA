package com.patryk.foundations;

public class TwoDimArrays {

    public static void main(String[] args) {
        int[][] twoDimArray = {

        //        [][0], [][1], [][2], [][3], [][4]
        /*[0][]*/ {0,      2,     4,     6,     8},
        /*[1][]*/ {1,      3,     5,     7,     9}

        };

        System.out.println(twoDimArray[1][4]);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(twoDimArray[i][j] + ", ");
            }
            System.out.println();
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Adres [" + i + "][" + j + "] trzyma " + twoDimArray[i][j]);
            }
        }



    }
}
