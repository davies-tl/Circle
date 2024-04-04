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
//****************************************************************
// Circle.java     Author: Tyler Davies
// Circle class created.
//****************************************************************

public class Circle
{
    double radius;
    public Circle(double rad)
    {
        radius = rad;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getDiameter()
    {
        return 2.0*radius;
    }
    public double getCircumference()
    {
        return 2.0*Math.PI*radius;
    }
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
}