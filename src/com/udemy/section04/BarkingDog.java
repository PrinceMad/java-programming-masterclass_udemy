package com.udemy.section04;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking,int hourOfDay){

        if (barking==true){
            if (hourOfDay>=0&&hourOfDay<=23)
                if (hourOfDay<8||hourOfDay>22)
                    return true;
        }
        return false;
    }
}
