package com.udemy.section04;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            return -1;
        else
        {
            double x = (kilometersPerHour/1.609);
            int y = (int) Math.round(x);
            return y;
        }
    }
    public static void printConversion(double kilometersPerHour){
        int x = (int)toMilesPerHour(kilometersPerHour);
        if (x<0)
            System.out.printf("Invalid Value");
        else
            System.out.println(kilometersPerHour+" km/h = "+x+" mi/h");
    }
}
