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
    public void display() {
        for (int i = 0; i < numElements; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    public void sort() {
        int i,j,min;
        for (i = 0 ; i < numElements - 1; i++) {
            min = i;
            for ( j = i+1; j < numElements; j++) {
                if (array[j] > array[min]) {
                    min = j;

                    swap(i, min);
                }
            }
        }
    }

}
