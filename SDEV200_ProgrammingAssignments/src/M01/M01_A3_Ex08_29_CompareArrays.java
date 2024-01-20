/*
* Assignment: SDEV200_M01_Assignment3
* File: M01_A3_Ex08_29_CompareArrays.java
* Version: 1.0
* Date: 1/19/2024
* Author: Tomomi Hobara
* Description: This program compares two 3 X 3 arrays of integers and displays
*              whether they are identical.
* Variables: 
    - m1 and m2: integer, 2D arrays to hold user input
    - m1List and m2List: integer, lists used to compare elements of m1 and m2.
* Steps:
    1. Ask for user input and assign the values to arrays.
    2. Change the arrays to lists and sort the elements in ascending order.
    3. Compare the lists and return true if the lists are identical.
    a. Print the result in the console. 
*/


import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class M01_A3_Ex08_29_CompareArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int ROW_SIZE = 3;
        final int COLUMN_SIZE = 3;

        //Get input for the first list
        System.out.println("Enter list 1: ");
        int[][] m1 = new int[ROW_SIZE][COLUMN_SIZE];
        for (int i = 0; i < m1.length; i++)  //For rows
            for (int j = 0; j < m1[0].length; j++)  //For columns
                m1[i][j] = input.nextInt();

        //Get input for the second list
        System.out.println("Enter list 2: ");
        int[][] m2 = new int[ROW_SIZE][COLUMN_SIZE];
        for (int i = 0; i < m2.length; i++)  //For rows
            for (int j = 0; j < m2[0].length; j++)  //For columns
                m2[i][j] = input.nextInt();

        //Print the result of the comparison 
        if (equals(m1, m2))  //true (m1 == m2)
            System.out.println("\nThe two arrays are identical");
        else
            System.out.println("\nThe two arrays are not identical"); 
    }

    //Check if the two arrays are identical
    public static boolean equals(int[][] m1, int[][] m2) {

        //Create lists to change 2D arrays to lists for comparison
        List<Integer> m1List = new ArrayList<>();  //textbook p783
        List<Integer> m2List = new ArrayList<>();

        //Change m1 array to a list
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) 
                m1List.add(m1[i][j]);
        }

        //Change m2 array to a list
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[0].length; j++) 
                m2List.add(m2[i][j]);
        }

        //Sort the two lists
        Collections.sort(m1List);
        Collections.sort(m2List);
        
        //Return true if the two lists are identical
        return m1List.equals(m2List);
    }
}
