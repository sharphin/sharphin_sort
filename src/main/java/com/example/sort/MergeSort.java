package com.example.sort;

public class MergeSort {
    private static int swapcount = 0;
    private static int length;
    public MergeSort(int arr[]) {
        int array[] = new int[arr.length];
        System.arraycopy(arr, 0, array, 0, arr.length);
        System.out.println("merge sort");
        long startTime = System.nanoTime();
        sort(array, 0,array.length);
        long endTime = System.nanoTime();
        System.out.println("処理時間：" + (endTime - startTime) / 1000000f + "ms swap: "+swapcount);
    }
    private static void merge(int array[], int left,int right, int mid) {
        int larr[] = new int[mid - left+1];
        int rarr[] = new int[right - mid+1];
        System.arraycopy(array, left, larr, 0, larr.length-1);
        System.arraycopy(array, mid, rarr, 0, rarr.length-1);
        larr[mid - left] = length;
        rarr[right - mid] = length;
        for(int i = left,li = 0,ri = 0;i < right; i++) {
            if(larr.length-1 < li || rarr.length-1 < ri) break;
            if(larr[li] < rarr[ri]) {
                array[i] = larr[li];li++;
            } else {
                array[i] = rarr[ri]; ri++;
                swapcount++;
            }
        }
    } 
    private static void split(int array[], int left,int right) {
        if(right-left <= 1) return;
        int mid = (left+right)/2;
        split(array,left,mid);
        split(array,mid,right);
        merge(array,left,right,mid);
    }
    public static void sort(int array[], int begin,int end) {
        length = array.length;
        split(array, begin, end);
    }
}
