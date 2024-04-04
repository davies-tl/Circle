/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Tyler
 */
//*****************************************************************
// Main.java     Author: Tyler Davies
// This program computes the area and circumference using Circle class.
//*****************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
    //------------------------------------------------------
    // define Circle object
    // call helper (class) method to input the radius
    // instantiate the Circle object
    // output the circumference using instance method
    // output the area using instance method
    //------------------------------------------------------
    public static void main (String[] args)
    {
        double radius;      //prompt says to define Circle object, but just need radius right now
        radius = getRadius();
        Circle c = new Circle(radius);
        DecimalFormat fmt = new DecimalFormat ("0.##");     //sets decimal to two after point
        System.out.println("The circumference of the circle is: " + fmt.format(c.getCircumference()));
        System.out.println("The area of the circle is: " + fmt.format(c.getArea()));
    }
    
    //------------------------------------------------------
    // define a local radius variable
    // read in a value for radius
    // return the value
    //------------------------------------------------------
    public static double getRadius()
    {
        double circleRadius;
        Scanner scan = new Scanner(System.in);        
        System.out.print("Enter the radius of the circle: ");
        circleRadius = scan.nextDouble();
        return circleRadius;
    }
}
