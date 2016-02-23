package com.tim;

import java.util.Scanner;

/**
 * Created by tim on 23/02/16.
 */
public class ExerciseFour {
    public static void main(String[] args) {
        System.out.print("Enter a noun: ");
        try (Scanner scanner = new Scanner(System.in)) {
            final String noun = scanner.nextLine();
            System.out.print("Enter a verb: ");
            final String verb = scanner.nextLine();
            System.out.print("Enter an adjective: ");
            final String adjective = scanner.nextLine();
            System.out.print("Enter an adverb: ");
            final String adverb = scanner.nextLine();
            final String output = String.format("Do you %s your %s %s %s? How funny ...", verb, adjective, noun, adverb);
            System.out.println(output);
        }
    }
}
