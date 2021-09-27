package com.udemy.section05;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if (number<0)
            return -1;
        String a = ""+number;
        char[] aa = a.toCharArray();
        int c = (int)aa[0]-48;
        int d = (int)aa[aa.length-1]-48;

        return c+d;
    }
}
