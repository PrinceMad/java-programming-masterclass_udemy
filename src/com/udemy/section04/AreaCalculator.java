package com.udemy.section04;

public class AreaCalculator {
    public static double area(double radius){
        if (radius>=0){
            return radius*radius*Math.PI;
        }
        return -1.0;
    }
    public static double area(double a,double b){
        if (a>=0)
            if (b>=0)
                return a*b;
        return -1.0;
    }
}