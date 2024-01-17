/*
* Assignment: SDEV200_M01_Assignment1
* Program: Ex06_9.java
* Version: 1.0
* Date: 1/17/2024
* Author: Tomomi Hobara
* Description: This program converts length from feet to meters and meters to feet.
*              Then, it displays the conversion results in a table format.
* Variables: 
    - foot: double, Used as the starting number for converting to meters.
    - meter: double, Used as the starting number for converting to foot.
    - line: int, An index for counting the iterations of the for loop.    
* Computation:
    - meter = 0.305 * foot
    - foot = (1 / 0.305) * meter
* Steps:
    1. Set up the Main method that prints the table header and the conversion results.
    2. Convert feet to meters.
    3. Convert meters to feet.

*/


public class M01_A1_Ex06_09_ConvertFeetMeters {
    public static void main(String[] args) {
    /** Main method to print the table header. */
        
        //Print the table header.
        System.out.printf("%-15s%-15s%5s%-15s%-15s\n",
         "Feet", "Meters", "|    ", "Meters", "Feet");
        System.out.println("----------------------------------------------------------"); 

        //Declare and initiate variables.
        double foot = 1.0;
        double meter = 20.0;

        //Loop to call conersion methods and print the results 10 times.
        for (int line = 1; line <= 10; foot++, meter += 5, line++) {
            System.out.printf("%-15.1f%-15.3f%5s%-15.1f%-15.3f\n", 
                foot, footToMeter(foot), "|    ", meter, meterToFoot(meter) );
        }

    }

    /** Convert from feet to meters. */
    public static double footToMeter (double foot) {
        return 0.305 * foot;
    }

    /** Convert from meters to feet. */
    public static double meterToFoot (double meter) {
        return (1 / 0.305) * meter;
    }
}
