package com.udemy.section05;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int r,sum=0,temp;
        int n=Math.abs(number);

        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            return true;
        else
            return false;
    }
}
