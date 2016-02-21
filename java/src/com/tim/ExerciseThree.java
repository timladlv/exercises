package com.tim;

import java.util.Scanner;

/**
 * Created by tim on 21/02/16.
 */
public class ExerciseThree {
    public static void main(String[] args) {
        System.out.print("What is the quote? ");
        try (Scanner scanner = new Scanner(System.in)) {
            final String quote = scanner.nextLine();
            System.out.print("Who said it? ");
            final String author = scanner.nextLine();
            final String output = author + " says, \"" + quote + "\"";
            System.out.println(output);
        }
    }
}
