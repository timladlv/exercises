package com.tim;

import java.util.Scanner;

/**
 * Created by tim on 20/02/16.
 */
public class ExerciseOne {
    public static void main(String[] args) {
        System.out.print("What is your name? ");
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println(makeGreeting(scanner.nextLine()));
        }
    }

    private static String makeGreeting(final String input) {
        return String.format("Hello %s", input);
    }
}
