package com.udemy.section04;

public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double a,double b){

        int aa = (int) (a * 1000);
        int bb = (int) (b * 1000);
        System.out.println(aa+" "+bb);

        if(aa==bb){
            return true;
        }

        return false;
    }
}
