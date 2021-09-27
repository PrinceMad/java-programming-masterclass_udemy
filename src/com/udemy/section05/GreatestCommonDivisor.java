package com.udemy.section05;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor (int first, int second) {
        int greatest = 0;

        if(first >= 10 && second >= 10){

            for(int i = 1; ((i <= first) && (i <=second)); i++ ){
                if((first % i == 0) && (second % i == 0)){
                    greatest = i;
                }
            }
            return greatest;
        } else
            return -1;
    }
}