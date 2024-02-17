package com.patryk.hyperskill;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'a': ");
        int a = scanner.nextInt();
        System.out.println("Enter 'b': ");
        int b = scanner.nextInt();

        int sum = 0;
        int counter = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                counter++;
            }
        }
        int avg = sum / counter;
        System.out.println("The sum is: " + sum);
        System.out.println("The average value is: " + avg);
    }
}