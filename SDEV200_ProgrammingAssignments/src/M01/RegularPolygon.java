/*
* Assignment: SDEV200_M01_Assignment4_Ex09_09
* File: RegularPolygon.java
* Version: 1.0
* Date: 1/20/2024
* Author: Tomomi Hobara
* Description: This program defines class, RegularPolygon, and its data fields. 
               Also, it defines constructor, accessor and mutator methods.
* Variables: 
    - n: int, the number of sides in polygon
    - side: double, the length of sides 
    - x: double, the x-coordinate of polygon's center
    - y: double, the y-coordinate of polygon's center
* Computation:
    - Perimeter = number of sides * length of sides
    - Area = (number of sides * side^2) / (4 * tan( pi / number of sides))    
* Steps:
    1. Define class, RegularPolygon, with four data fields
    2. Create three constructors
    3. Create accessor and mutator methods for the data fields
    4. Create a method for calculating the polygon's perimeter
    5. Create a method for calculating the polygon's area
* Related files:
    - TestRegularPolygon.java (A program to create objects)
    - RegularPolygonUMLClassDiagram.pdf (A class UML diagram)    
*/

package SDEV200_M01_Assignment4_Ex09_09;

public class RegularPolygon {
    /** Data fields*/
    private int n = 3;   //The number of sides in the polygon
    private double side = 1;  //The length of the side
    private double x = 0;  //The x-coordinate of the polygon's center
    private double y = 0;  //The y-coordinate of the polygon's center

    /** A non-arg constructor to create a polygon with default values*/
    public RegularPolygon() {
    }

    /** A constructor to create a polygon with the specified number of 
    sides and length at with the coordinate, (0,0)*/
    public RegularPolygon(int newN, double newSide) {
        n = newN;
        side = newSide;
    }

    /** A constructor to create a polygon with the specified number of 
    sides, length and coordinates*/
    public RegularPolygon(int newN, double newSide, double newX, double newY) {
        n = newN;
        side = newSide;
        x = newX;
        y = newY;
    }
    /** Accessor and mutator methods for all data types */
    /** Return the number of sides */
    int getN() {
        return n;
    }

    /** Return the length of sides */
    double getSide() {
        return side;
    }

    /** Return the x-coordinate */
    double getX() {
        return x;
    }

    /** Return the y-coordinate */
    double getY() {
        return y;
    }

    /** Set a new number of sides */
    void setN(int newN) {
        n = newN;
    }

    /** Set new length of the sides */
    void setSide(double newSide) {
        side = newSide;
    }

    /** Set a new x-coordinate */
    void setX(double newX) {
        x = newX;
    }

    /** Set a new y-coordinate */
    void setY(double newY) {
        y = newY;
    }

    //** Returns the perimeter of the polygon */
    double getPerimeter() {
        return n * side;  //The sum of all sides
    }

    //** Returns the area of the polygon */
    double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan( Math.PI/ n));
    }

}
