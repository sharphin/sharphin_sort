package com.example;

import com.example.genarray.GenRandArray;
import com.example.sort.BubbleSort;
import com.example.sort.CombSort;
import com.example.sort.DefaultSort;
import com.example.sort.HeapSort;
import com.example.sort.MergeSort;
import com.example.sort.QuickSort;
import com.example.sort.RadixSort;
import com.example.sort.ShakerSort;

public class App {
    final int arrayLength = 24;
    private int array[];
    public static void main(String[] args) {
        App a = new App();
        a.sortings();
    }
    void sortings() {
        GenRandArray gra = new GenRandArray(arrayLength,1);
        array = gra.generate();
        DefaultSort dsort = new DefaultSort(array);
        QuickSort qsort = new QuickSort(array);
        BubbleSort bsort = new BubbleSort(array);
        ShakerSort ssort = new ShakerSort(array);
        CombSort csort = new CombSort(array);
        HeapSort hsort = new HeapSort(array);
        MergeSort msort = new MergeSort(array);
        RadixSort rsort = new RadixSort(array);
    }
}
