package com.udemy.section05;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a,int b, int c){
        if (a<10||a>1000)
            return false;
        if ((b<10||b>1000))
            return false;
        if ((c<10||c>1000))
            return false;
        int lastA = a % 10;
        int lastB = b % 10;
        int lastC = c % 10;
        if (lastA == lastB || lastA == lastC || lastB == lastC )
            return true;
        return false;
    }
    public static boolean isValid (int a) {
        return (a >= 10 && a <= 1000);
    }
}