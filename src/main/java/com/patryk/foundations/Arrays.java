package com.patryk.foundations;

public class Arrays {
    public static void main(String[] args) {
        int[][] arr1 = {
                {11},
                {22, 33}
        };

        System.out.println(arr1.length);
        System.out.println(arr1[0].length);
        System.out.println(arr1[1].length);

        int[] arr2 = {1, 2, 3, 4, 5};
        int temp;

        System.out.println("Init state: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }


        for (int i = 0; i < arr2.length / 2; i++) {
            temp = arr2[i];
            arr2[i] = arr2[arr2.length - 1 - i];
            arr2[arr2.length - 1 - i] = temp;
        }


        System.out.println("Target state: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
