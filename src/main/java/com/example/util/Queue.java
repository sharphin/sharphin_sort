package com.example.util;

public class Queue {
    private int tail = 0;
    private int head = 0;
    private int array[];
    public Queue(int length) {
        array = new int[length];
    }
    public void enqueue(int num) {
        array[head] = num;
        head++;
    }
    public int dequeue() {
        tail++;
        return array[tail-1];
    }
    public void queueClear() {
        array = new int[10];
    }
}
