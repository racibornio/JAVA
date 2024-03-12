package com.patryk.hyperskill;

import java.util.Scanner;

public class CountOfNumbersDivisibleByN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a:");
        int a = scanner.nextInt();
        System.out.println("Type b:");
        int b = scanner.nextInt();
        System.out.println("Type n:");
        int n = scanner.nextInt();

        // version with loop
//        int count = 0;
//
//        for (int i = a; i <= b; i++) {
//            if (i % n == 0) {
//                count++;
//            }
//        }
//
//        System.out.println("The count is: " + count);

        // version without loop
        int firstDivisible = (a % n == 0) ? a : (a + n - a % n);
        int lastDivisible = (b % n == 0) ? b : (b - b % n);

        int count = (lastDivisible - firstDivisible) / n + 1;

        System.out.println("The count is: " + count);


        // extended version of above - extended 'if' instructions
        int firstDivisibleInExtendedIf;
        if (a % n == 0) {
            firstDivisibleInExtendedIf = a;
        } else {
            firstDivisibleInExtendedIf = (a + n - a % n);
        }

        int lastDivisibleInExtendedIf;
        if (b % n == 0) {
            lastDivisibleInExtendedIf = b;
        } else {
            lastDivisibleInExtendedIf = b - b % n;
        }

        int countByLoops = (lastDivisibleInExtendedIf - firstDivisibleInExtendedIf) / n + 1;
        System.out.println("The count by loops is " + countByLoops);

    }
}
