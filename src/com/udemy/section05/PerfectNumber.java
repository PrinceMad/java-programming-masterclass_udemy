package com.udemy.section05;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number)
    {
        if (number<1)
            return false;
        int sum = 1;
        for (int i = 2; i * i <= number; i++)
        {
            if (number % i==0)
            {
                if(i * i != number)
                    sum = sum + i + number / i;
                else
                    sum = sum + i;
            }
        }
        if (sum == number && number != 1)
            return true;
        return false;
    }
}
