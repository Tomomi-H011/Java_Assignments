/**
* Assignment: SDEV200_M02_Assignment3_Ex12_09
* File: M02_A3_Ex12_09_Bin2Dec.java
* Version: 1.0
* Date: 1/27/2024
* Author: Tomomi Hobara
* Description: This program converts a binary string to a decimal value. 
               If the given string is not a binary string, the program throws a custom 
               exception called BinaryFormatException.
* Variables: 
    - binValue1-4: String, variables to hold binary values
    - bin2DecValue: int, holds converted decimal values
* Steps:
    1. Define the main method that throws the BinaryFormatException.
    2. Define the bin2Dec method that converts binary strings to decimal values and throws exceptions when not successful.
    3. Declare the BinaryFormatException class that extends the built-in Exception class.
        i. Define a non-arg constructor that sets a default error message for an illegal binary character.
        ii. Define a constructor that takes a parameter with specific error messages.
*/

public class M02_A3_Ex12_09_Bin2Dec {

    public static void main(String[] args) throws BinaryFormatException {
        String binValue1 = "01001111";         // Valid binary value, 79
        String binValue2 = "010011110011";     // Valid binary value, 1267
        String binValue3 = "010011118";        // Invalid binary value
        String binValue4 = "011111111";         // Valid binary value
        
        System.out.println(binValue1 + " is " + bin2Dec(binValue1));      
        System.out.println(binValue2 + " is " + bin2Dec(binValue2));  
        System.out.println(binValue3 + " is " + bin2Dec(binValue3));  
        System.out.println(binValue4 + " is " + bin2Dec(binValue4));     
         
    }


    // Convert from string to int (= decimal) 
    public static int bin2Dec(String binValue) throws BinaryFormatException {
        int bin2DecValue = Integer.parseInt(binValue, 2);      // textbook p.384
        return bin2DecValue;
    }

}


// Define the BinaryFormatException class 
class BinaryFormatException extends Exception {        // Built-in Exception class
    BinaryFormatException() {                          // No-arg constructor    
        super("Illegal binary character");     
    }


    BinaryFormatException(String message) {            // Constructor with a parameter
        super(message);                                
    }
    
}

