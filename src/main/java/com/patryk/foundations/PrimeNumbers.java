package com.patryk.foundations;

public class PrimeNumbers {
    public static void main(String[] args) {


        for (int numberToCheck = 2; numberToCheck < 100; numberToCheck++) {
            boolean isPrime = true;
            for (int divider = 2; divider <= Math.sqrt(numberToCheck); divider++) {
                if (numberToCheck % divider == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(numberToCheck + " is prime");
            }
        }

        // the example above uses an interesting numbers characteristic - a number sqrt will have pairs of number before and after which - while multiplied with one another - will result in the number, so it is enough to check by the sqrt value of the number if any divides with a remainder - if so the number is not prime

        // the loop below uses the extracted pattern to display all that indeed are the number dividers

        for (int i = 2; i <= 26; i++) {
            if (26 % i == 0) {
                System.out.println(i + " is divider of 26");
            }
        }

    }
}
