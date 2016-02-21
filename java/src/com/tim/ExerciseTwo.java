package com.tim;

import java.util.Scanner;

/**
 * Created by tim on 21/02/16.
 */
public class ExerciseTwo {
    public static void main(String[] args) {
        System.out.println("What is the input?");
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                final String input = scanner.nextLine();
                if (input.length() > 0) {
                    System.out.println(String.format("%s has %d characters", input, input.length()));
                    break;
                } else {
                    System.out.println("Please enter something ...");
                }
            }
        }
    }
}
