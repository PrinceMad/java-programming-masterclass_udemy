package com.udemy.section05;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if (number<0)
            return -1;
        String a = ""+number;
        char[] aa = a.toCharArray();
        int q = 0;
        for (int i = 0; i<aa.length; i++){
            int w = (int)aa[i]-48;
            System.out.println(w);
            if (w%2==0)
                q+=w;
        }
        return q;
    }
}
