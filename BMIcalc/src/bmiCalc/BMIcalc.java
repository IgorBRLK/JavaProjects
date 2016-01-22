package bmiCalc;

/*
 * Simple BMI Calculator
 * Asks for user height and weight
 * Print it to the console
 */

//Import the Scanner Library
import java.util.Scanner;

public class BMIcalc {

    // Main method this is needed for every program this is where
    // Your code starts from
    public static void main(String[] args) {

        //New input scanner object
        Scanner input = new Scanner(System.in);

        //Ask user to enter height
        System.out.println("Enter Height in inches");

        // Set what the user enters to the integer of height this is done by calling the object and asking for the next Integer input
        int height = input.nextInt();

        //Ask user to enter weight
        System.out.println("Enter Weight in pounds");

        //set integer weight to input from user
        int weight = input.nextInt();

        //don't need the object Scanner
        input.close();

        //Print out the BMI by using the formula and inputing the values stored in height and weight
        System.out.println("Your BMI is " + (weight * 703)/(height*height));


    }
}
