package com.tim;

import java.util.Scanner;

/**
 * Created by tim on 25/02/16.
 */
public class ExerciseFive {
    public static void main(String[] args) {
        System.out.println("What is the 1st number? ");
        try (Scanner scanner = new Scanner(System.in)) {
            int first = scanner.nextInt();
            System.out.println("What is the 2nd number? ");
            int second = scanner.nextInt();
            printOutput(first, "+", second, first + second);
            printOutput(first, "-", second, first - second);
            printOutput(first, "*", second, first * second);
            printOutput(first, "/", second, first / second);
        }
    }

    private static void printOutput(final int first, final String operator, final int second, final int sum) {
        System.out.println(String.format("%d %s %d = %d", first, operator, second, sum));
    }
}
