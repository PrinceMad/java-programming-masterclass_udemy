package com.udemy.section05;

import java.util.Scanner;
public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        int  avg =0;
        double sum = 0, count = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            boolean isInt = sc.hasNextInt();

            if (isInt) {
                int value = sc.nextInt();
                sum += value;
                count++;
            } else if (count == 0){
                System.out.println("SUM = 0 AVG = 0");
                break;
            } else {
                avg = (int) Math.round(sum/ count);
                System.out.println("SUM = " + (int)sum + " AVG = " + avg);
                break;
            }
            sc.nextLine();
        }
        sc.close();
    }
}
