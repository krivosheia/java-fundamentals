package homework10.task2;

public class WhatIsBetween {
    public static int[] Between(int a, int b) {
        int arrSize = b - a + 1;
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = a++;
        }
        return arr;
    }
}