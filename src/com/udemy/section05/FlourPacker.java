package com.udemy.section05;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
        if (bigCount<0)
            return false;
        if (smallCount<0)
            return false;
        if (goal<0)
            return false;
        if(goal > ((bigCount * 5) + smallCount)) {
            return false;
        }

        if((goal % 5) > smallCount) {
            return false;
        }
        return true;
    }
}
