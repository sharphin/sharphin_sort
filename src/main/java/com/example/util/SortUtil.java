package com.example.util;

public class SortUtil {
    private int index = 0;
    public static void swap(int array[],int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
