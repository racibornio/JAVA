package com.patryk.kompendium;

public class Arrays {

    public static void main(String[] args) {

        // two-dim array
        double[][] n = {
                {0*0, 1*0, 2*0, 3*0},
                {0*1, 1*1, 2*1, 3*1},
                {0*2, 1*2, 2*2, 3*2},
                {0*3, 1*3, 2*3, 3*3}
        };

        int i, j;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }


        // three-dim array
        int[][][] threeD = new int[3][4][5];
        int iter, jter, kter;

        for (iter = 0; iter < 3; iter++) {
            for (jter = 0; jter < 4; jter++) {
                for (kter = 0; kter < 5; kter++) {
                    threeD[iter][jter][kter] = iter * jter * kter;
                }
            }
        }

        for (iter = 0; iter < 3; iter++) {
            for (jter = 0; jter < 4; jter++) {
                for (kter = 0; kter < 5; kter++) {
                    System.out.print(threeD[iter][jter][kter] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

}
