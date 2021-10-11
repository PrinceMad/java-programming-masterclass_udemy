package com.udemy.section08;

public class ReverseArray {
    private static void reverse(int[] array) {
        System.out.print("Array = ["+array[0]);
        for (int i = 1; i<array.length; i++){
            System.out.print(", "+array[i]);
        }
        System.out.println("]");
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.print("Reversed array = ["+array[0]);
        for (int i = 1; i<array.length; i++){
            System.out.print(", "+array[i]);
        }
        System.out.println("]");
    }
}
