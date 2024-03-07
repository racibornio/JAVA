package com.patryk.hyperskill;

import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {

        //Write a program that reads two numbers aa and bb from the keyboard and calculates and outputs to the console the arithmetic average of all numbers from the interval [a;b][a;b], which are divisible by 3.

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
        double avg = counter > 0 ? (double) sum / counter : 0;
        System.out.println("The sum is: " + sum);
        System.out.println("The average value is: " + avg);
    }
}