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
    public void display() {
        for (int i = 0; i < numElements; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public void sort() {
        for (int i = numElements - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }
        private void swap(int one, int two) {
            long temp = array[one];
            array[one] = array[two];
            array[two] = temp;
        }
    }


