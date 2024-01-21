/*
* Assignment: SDEV200_M01_Assignment4_Ex09_09
* File: TestRegularPolygon.java
* Version: 1.0
* Date: 1/20/2024
* Author: Tomomi Hobara
* Description: This program creates three regular polygons.
* Variables: 
    - polygon1, 2, 3: objects of class, RegularPolygon
* Computation:
    - Perimeter = number of sides * length of sides
    - Area = (number of sides * side^2) / (4 * tan( pi / number of sides))    
* Steps:
    1. Invoke constructor, RegularPolygon(), which is in RegularPolygon.java
    2. Print the calculated perimeters and areas in the console
 */

 
package SDEV200_M01_Assignment4_Ex09_09;

public class TestRegularPolygon {
    public static void main(String[] args) {

        //* Create objects */
        RegularPolygon polygon1 = new RegularPolygon();  //Create a polygon with default values

        RegularPolygon polygon2 = new RegularPolygon(6, 4); 

        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        //** Display the objects' state */ 
        System.out.printf("\npolygon1 (%d, %.1f, %.1f, %.1f): The perimeter is %.1f, and the area is %.1f", polygon1.getN(), polygon1.getSide(), polygon1.getX(), polygon1.getY(), polygon1.getPerimeter(), polygon1.getArea());   
        System.out.printf("\npolygon2 (%d, %.1f, %.1f, %.1f): The perimeter is %.1f, and the area is %.1f", polygon2.getN(), polygon2.getSide(), polygon2.getX(), polygon2.getY(), polygon2.getPerimeter(), polygon2.getArea());       
        System.out.printf("\npolygon3 (%d, %.1f, %.1f, %.1f): The perimeter is %.1f, and the area is %.1f", polygon3.getN(), polygon3.getSide(), polygon3.getX(), polygon3.getY(), polygon3.getPerimeter(), polygon3.getArea());           
       
    }
}