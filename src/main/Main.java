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
//**********************************************************
// Main.java     Author: Tyler Davies
// This program computes the area and circumference of a circle.
//**********************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
    //------------------------------------------------------
    // defines variables
    // call helper methods to input the radius
    // call helper method to calculate the circumference
    // call helper method to calculate the area
    // output the calculated values
    //------------------------------------------------------
    public static void main (String[] args)
    {
        double radius, circumference, area;
        radius = getRadius();
        circumference = calcCirc(radius);
        area = calcArea(radius);
        DecimalFormat fmt = new DecimalFormat ("0.##");     //sets decimal to two after point
        System.out.println("The circumference of the circle is: " + fmt.format(circumference));
        System.out.println("The area of the circle is: " + fmt.format(area));
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
    
    //------------------------------------------------------
    // calculate and return value for the circumference
    // using the radius passed as an argument
    //------------------------------------------------------
    public static double calcCirc(double circleRadius)
    {
        double circleCircumference;
        circleCircumference = 2 * Math.PI * circleRadius;
        return circleCircumference;
    }
    
    //------------------------------------------------------
    // calculate and return value for the area
    // using the radius passed as an argument
    //------------------------------------------------------
    public static double calcArea(double circleRadius)
    {
        double circleArea;
        circleArea = Math.PI * Math.pow(circleRadius, 2.0);
        return circleArea;
    }
}
