package main;

public class BubbleSort {
    private long[] array;
    private int numElements;
    public BubbleSort(int n){
        array = new long[n];
        numElements = 0;
    }
    public void insert(long value) {
        array[numElements] = value;
        numElements++;
    }

}
