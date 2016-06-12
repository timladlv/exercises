package com.tim;

import java.util.Scanner;

/**
 * Created by tim on 28/02/16.
 */
public class ExerciseNine {
    private static final int AREA_ONE_GALLON = 350;

    public static void main(String[] args) {
        System.out.println("What is the room width (feet)?");
        try (Scanner scanner = new Scanner(System.in)) {
            final int width = scanner.nextInt();
            System.out.println("What is the room length (feet)?");
            final int length = scanner.nextInt();
            final int areaFeetSquared = width * length;
            final int numberOfGallons = (int)Math.ceil((double)areaFeetSquared / AREA_ONE_GALLON);
            final String message = String.format("You need %d gallons to cover %d", numberOfGallons, areaFeetSquared);
            System.out.println(message);
        }
    }
}
