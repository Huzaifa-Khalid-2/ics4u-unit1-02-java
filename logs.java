/*
* This program calculates the energy
* a mass would produce at the speed of light.
*
* @author  Huzaifa Khalid
* @version 1.0
* @since   2020-09-18
*/

import java.util.Scanner;

/**
* This is an energy calculation program.
*/
final class EnergyCalculation {

    /**
    * Constant assigned to 299800000.
    */
    public static final float SPEED_OF_LIGHT = 299800000;

    /**
    * Constant assigned to 2.
    */
    public static final float TWO = 2;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private EnergyCalculation() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // input
        final Scanner massObj = new Scanner(System.in);
        System.out.println("Enter the mass of your object (kg): ");

        /*
        * This try-catch ensures the program
        * won't crash with bad input.
        */
        try {
            // process
            final double mass = massObj.nextFloat();
            if (mass >= 0) {
                final double energy = mass * Math.pow(SPEED_OF_LIGHT, TWO);
                // output
                System.out.printf(energy + " Joules of energy.");
            } else {
                System.out.println("Number cannot be negative.");
            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Invalid Input.");
        } finally {
            System.out.println("\nDone.");
        }
    }
}

