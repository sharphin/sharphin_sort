package com.example.sort;
import com.example.App;

public class HeapSort {
    private static int swapcount = 0;
    public HeapSort(int arr[]) {
        int array[] = new int[arr.length];
        System.arraycopy(arr, 0, array, 0, arr.length);
        System.out.println("heap sort");
        //GenRandArray.printArray(array,0,arr.length);
        long startTime = System.nanoTime();
        heapSort(array);
        long endTime = System.nanoTime();
        //GenRandArray.printArray(array,0,arr.length);
        System.out.println("処理時間：" + (endTime - startTime) / 1000000f + "ms swap: "+swapcount);
        System.out.println("");
    }

    public static void heapSort(int array[]) {
        int len = array.length;
        for(int i = (len>>1)-1; i >= 0;i--) sort(array, len, i);
        for(int i = len-1; i > 0;i--) {
            App.swap(array, i, 0);
            sort(array,i,0);
        }
    }
    public static void sort(int array[],int len,int i) {
        int maxi = i;
        int left  = (i<<1)+1;
        int right  = (i<<1)+2;        
        if(left < len && array[maxi] < array[left]) maxi = left;
        if(right < len && array[maxi] < array[right]) maxi = right;
        if(maxi != i) {
            App.swap(array, i, maxi);
            sort(array, len, maxi);
            swapcount++;
        }
    }
}
