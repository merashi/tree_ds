package main;

public class SelectionSort {
    private long[] array;
    private int numElements;
    public SelectionSort(int n){
        array = new long[n];
        numElements = 0;
    }
    public void insert(long value) {
        array[numElements] = value;
        numElements++;
    }

}
