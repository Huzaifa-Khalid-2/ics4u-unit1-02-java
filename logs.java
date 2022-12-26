/*
* The program gets mass, plugs into alberts formula E = mc^2
* and gives you the energy with a try and catch
*
* @author  Jackson Naufal
* @version 1.0
* @since   2020-01-01
*
* This is a E = mc^2 calculator program.
*/

import java.util.Scanner;
/**
 * This is E = mc^2 program.
 */

final class AlbertCalculator {

    /**
    * This is the speed of light for E = m(c)^2.
    */
    public static final double ALBERT = 298000000;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private AlbertCalculator() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // print out "Albert Einstien Formula"

        try {
            final Scanner myObj = new Scanner(System.in);
            System.out.print("Enter mass in (Kg): ");
            final float mass = myObj.nextFloat();
            System.out.println("Energy Outputted is (J): "
                + (mass * Math.pow(ALBERT, 2)));
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Invalid Input!");
        } finally {
            System.out.println("\nDone!");
        }
    }
}

