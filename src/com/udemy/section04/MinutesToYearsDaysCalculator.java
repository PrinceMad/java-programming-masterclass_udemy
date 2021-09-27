package com.udemy.section04;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes<0)
            System.out.println("Invalid Value");
        else{
            long a = minutes/60;
            a = a/24;
            int b = (int)(a/365);
            int c = (int)(a%365);
            System.out.println(minutes+" min = "+b+" y and "+c+" d");
        }
    }
}
