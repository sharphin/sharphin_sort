package com.example;

import com.example.genarray.GenRandArray;
import com.example.sort.BubbleSort;
import com.example.sort.CombSort;
import com.example.sort.DefaultSort;
import com.example.sort.HeapSort;
import com.example.sort.QuickSort;
import com.example.sort.ShakerSort;

public class App {
    final int arrayLength = 32;
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
    }
    public static void swap(int array[],int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
