package com.patryk.foundations;

public class TwoDimArrays {

    public static void main(String[] args) {

        // 1st exercise
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
                System.out.println("Addres [" + i + "][" + j + "] stores " + twoDimArray[i][j]);
            }
        }

        // two dimensional array is just an array of arrays, hence:
        System.out.println("Array length is " + twoDimArray.length);
        System.out.println("First sub-array length is " + twoDimArray[0].length);
        System.out.println("Second sub-array length is " + twoDimArray[1].length);


        // 2nd exercise
        String[][] anotherTwoDimArray = { {"1stTab-1stItem", "1stTab-2ndItem"}, {"2ndTab-1stItem", "2ndTab-2ndItem"}};

        for (int firstTabIter = 0; firstTabIter < 2; firstTabIter++) {
            for (int secondTabIter = 0; secondTabIter < 2; secondTabIter++) {
                System.out.println(anotherTwoDimArray[firstTabIter][secondTabIter]);
            }
        }


        // 3rd exercise
        int[][] oneMoreTwoDimArray = new int[2][4];
        int counter = 1;
        for (int i = 0; i < oneMoreTwoDimArray.length; i++) {
            for (int j = 0; j < oneMoreTwoDimArray[i].length; j++) {
                oneMoreTwoDimArray[i][j] = counter++;
            }
        }

        for (int i = 0; i < oneMoreTwoDimArray.length; i++) {
            for (int j = 0; j < oneMoreTwoDimArray[i].length; j++) {
                System.out.println("Address[" + i + ", " + j + "] = " + oneMoreTwoDimArray[i][j]);
            }
        }


        // 4th exercise
        int[][] multiDimArray = new int[4][];
        multiDimArray[0] = new int[4];
        multiDimArray[1] = new int[2];
        multiDimArray[2] = new int[1];
        multiDimArray[3] = new int[3];

        int counterForMixed = 1;
        for (int i = 0; i < multiDimArray.length; i++) {
            for (int j = 0; j < multiDimArray[i].length; j++) {
                multiDimArray[i][j] = counterForMixed++;
            }
        }

        for (int i = 0; i < multiDimArray.length; i++) {
            System.out.println("Address[" + i + "] = ");
            for (int j = 0; j < multiDimArray[i].length; j++) {
                System.out.print(multiDimArray[i][j] + ", ");
            }
            System.out.println(" ");
        }

        // 5th exercise - 3 dim array
        int[][][] threeDimArray = new int[2][][];
        threeDimArray[0] = new int[2][];
        threeDimArray[1] = new int[2][];

        threeDimArray[0][0] = new int[2];
        threeDimArray[0][1] = new int[2];

        threeDimArray[1][0] = new int[2];
        threeDimArray[1][1] = new int[2];

        threeDimArray[0][0][0] = 1;
        threeDimArray[0][0][1] = 2;
        threeDimArray[0][1][0] = 3;
        threeDimArray[0][1][1] = 4;
        threeDimArray[1][0][0] = 5;
        threeDimArray[1][0][1] = 6;
        threeDimArray[1][1][0] = 7;
        threeDimArray[1][1][1] = 8;

        System.out.println(threeDimArray[0][0][0]);
        System.out.println(threeDimArray[0][0][1]);
        System.out.println(threeDimArray[0][1][0]);
        System.out.println(threeDimArray[0][1][1]);
        System.out.println(threeDimArray[1][0][0]);
        System.out.println(threeDimArray[1][0][1]);
        System.out.println(threeDimArray[1][1][0]);
        System.out.println(threeDimArray[1][1][1]);


        // 6th exercise - 2.39a from the book
        int[][] tab6th = new int[4][];
//        tab6th[0] = new int[4];
//        tab6th[1] = new int[3];
//        tab6th[2] = new int[2];
//        tab6th[3] = new int[1];

        // this does in the loop exactly the same as four lines above
        for (int i = 0; i < tab6th.length; i++) {
            tab6th[i] = new int[4 - i];
        }

        int counterForTab6th = 1;
        for (int i = 0; i < tab6th.length; i++) {
            for (int j = 0; j < tab6th[i].length; j++) {
                tab6th[i][j] = counterForTab6th++;
            }
        }

        for (int[] ints : tab6th) {
            for (int anInt : ints) {
                //System.out.println("Array cell[" + i + "][" + j + "] = " + tab6th[i][j]);
                System.out.print(anInt + " ");
            }
            System.out.println(" ");
        }

    }
}