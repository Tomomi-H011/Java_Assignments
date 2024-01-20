/*
* Assignment: SDEV200_M01_Assignment2
* Program: M01_A2_Ex06_31_CreditCardValidation.java
* Version: 1.0
* Date: 1/18/2024
* Author: Tomomi Hobara
* Description: This program validates if an entered credit card number is valid or not.
               Then, it outputs the validation result in the console. 
* Variables: 
    - number : long, a credit card number entered by the user.
* Steps:
   1. Ask the user to enter a credit card number as a long integer.
   2. Check if the number is valid (digit length, prefix, and sum of numbers)
   3. Print the validation result in the console.
*/

import java.util.Scanner;

public class M01_A2_Ex06_31_CreditCardValidation {
    /** Main method */
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);

        //Ask the user to enter a credit card number
        System.out.println("\nThis program checks if a credit card number is valid.");
        System.out.println("Please enter a credit card number as a long integer: ");
        
        while (true) {
            try {
                long number = input.nextLong();

                //Print the validation result. If isValid returns true, valid. If not, invalid.
                System.out.println("\n" + number + " is " + (isValid(number) ? "valid." : "invalid.\n"));
                
                break; //End the loop and the program if a valid input is provided.
            }

            catch (Exception ex) {
                System.out.println("\nIncorrect input. Re-enter the credit card number as a long integer: ");
                input.nextLine(); //Discard the input.
            }   
        } 
    }

    /** Return true if the card number is valid.
     * Criteria: 
     *      - Digits are between 13 and 16 digits.
     *      - And, the prefix matches to 4, 5, 37, or 6.
     *      - And, the sum of even and odd place numbers is divisible by 10.
     */
    public static boolean isValid (long number) {
        Boolean valid = ((getSize(number) >= 13) && (getSize(number) <= 16 ))
                        && (prefixMatched(number, 4) ||
                            prefixMatched(number, 5) ||
                            prefixMatched(number, 37) ||
                            prefixMatched(number, 6))
                        && ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0) // There should be no remainder
                        ;
        return valid; 
    }

    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number) {
        //Double every second digit from right to left and get the total.
        String numberAsString = Long.toString(number);
        int sumEven = 0;
        for (int index = getSize(number)-2; index >=0; index -= 2) {
            sumEven += getDigit(Integer.parseInt(String.valueOf(numberAsString.charAt(index))) * 2); //Call getDigit to check if the doubled number is one or two digits before adding.
        }   
        return sumEven;
    }
    

    /** Return this number if it is a single digit, otherwise,
    * return the sum of the two digits */
    //numberToCheck is doubled digit
    public static int getDigit(int numberToCheck) {  
        if (numberToCheck < 9)
            return numberToCheck;
        else
            return 1 + (numberToCheck % 10);  //Get the sum of two digits if it is between 10 and 18. 
    }

    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number) {
        String numberAsString = Long.toString(number);  //Change from long to string
        int sumOdd = 0;
        for (int index = getSize(number)-1; index >=0; index -= 2) {
            sumOdd += Integer.parseInt(String.valueOf(numberAsString.charAt(index)));  //Change to int to add
        }   
        return sumOdd;
    }

    /** Return true if the number d is a prefix for number */
    public static boolean prefixMatched (long number, int d) {
       //1. Get the size of prefix, 
       //2. Get the prefix based on the size of prefix.
       //3. Check if the prefix belongs to any of the companies' prefixes (d is provided in main).
        return getPrefix(number, getSize(d)) == d;             
    }

    /** Return the number of digits in d (Used to count the digits of a credit card number or prefixes)*/
    public static int getSize(long d) {
        String dAsString = Long.toString(d);
        return dAsString.length();
    }

    /** Return the first k number of digits from number. If the
    * number of digits in number is less than k, return number. 
    * int k is provided by getSize(d) within prefixedMatched().*/
    public static long getPrefix(long number, int k) {
        String numberAsString = Long.toString(number);
        if (getSize(number) > k) {
           String prefix = numberAsString.substring(0, k);
            return Long.parseLong(prefix);
        }
        return number;
    }  
}