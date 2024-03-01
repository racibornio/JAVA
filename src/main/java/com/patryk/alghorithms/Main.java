package com.patryk.alghorithms;

public class Main {
    public static void main(String[] args) {

        // table declaration
        double[] tabOfDoubles = {2, 4, 8};

        // find biggest value in the table
        double max = tabOfDoubles[0];
        for (int i = 1; i < tabOfDoubles.length; i++) {
            if (tabOfDoubles[i] > max) max = tabOfDoubles[i];
        }
        System.out.println("The biggest value is " + max);

        // find average value from inside the table
        int N = tabOfDoubles.length;
        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            sum += tabOfDoubles[i];
        }
        double average = sum/N;
        System.out.println("Average value is " + average);

        // copy one table to another
        double[] copyOfTabOfDoubles =  new double[N];
        // copy
        for (int i = 0; i < N; i++) {
            copyOfTabOfDoubles[i] = tabOfDoubles[i];
        }
        // read and print
        for (int i = 0; i < N; i++) {
            System.out.println("Copied table at index " + i + " contains value " + copyOfTabOfDoubles[i]);
        }

        // reverse the values order
        for (int i = 0; i < N/2; i++) {
            double temp = tabOfDoubles[i];
            tabOfDoubles[i] = tabOfDoubles[N-1-i];
            tabOfDoubles[N-i-1] = temp;
        }
        // display reversed table
        for (int i = 0; i < N; i++) {
            System.out.println("The table index " + i + " after reversion is " + tabOfDoubles[i]);
        }
    }
}
