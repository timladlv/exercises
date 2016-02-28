package com.tim;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Created by tim on 28/02/16.
 */
public class ExerciseSix {
    public static void main(String[] args) {
        System.out.println("What is your age?");
        try (Scanner scanner = new Scanner(System.in)) {
            final int age = scanner.nextInt();
            System.out.println("What is your desired retirement age?");
            final int retirement = scanner.nextInt();
            final int thisYear = LocalDate.now().getYear();
            final int retirementYear = retirement - age + thisYear;
            System.out.println(String.format("It's %d, so you can retire in %d", thisYear, retirementYear));
        }
    }
}
