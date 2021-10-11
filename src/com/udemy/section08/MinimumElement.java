package com.udemy.section08;

import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        return a;
    }
    private static int[] readElements(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}