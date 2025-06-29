package com.example.sort;

import java.util.ArrayList;

import com.example.genarray.GenRandArray;

public class RadixSort {
    private static int swapcount = -1;
    private static int length;
    public RadixSort(int arr[]) {
        int array[] = new int[arr.length];
        length = array.length;
        System.arraycopy(arr, 0, array, 0, arr.length);
        System.out.println("radix sort");
        long startTime = System.nanoTime();
        sort(array);
        long endTime = System.nanoTime();
        System.out.println("処理時間：" + (endTime - startTime) / 1000000f + "ms swap: "+swapcount);
    }
    public static int[] sort(int[] array) {
        if (array == null || array.length < 2) return array;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        int maxDigit = 0;
        while (max != 0) {
            max /= 10;
            maxDigit++;
        }
        int mod = 10, div = 1;
        ArrayList<ArrayList<Integer>> bucketList = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 10; i++)bucketList.add(new ArrayList<Integer>());
        for (int i = 0; i < maxDigit; i++, mod *= 10, div *= 10) {
            for (int j = 0; j < array.length; j++) {
                int num = (array[j] % mod) / div;
                bucketList.get(num).add(array[j]);
            }
            int index = 0;
            for (int j = 0; j < bucketList.size(); j++) {
                for (int k = 0; k < bucketList.get(j).size(); k++)
                    array[index++] = bucketList.get(j).get(k);
                bucketList.get(j).clear();
            }
        }
        return array;
    }
}
