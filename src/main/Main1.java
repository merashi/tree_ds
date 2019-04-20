package main;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        SelectionSort s = new SelectionSort(n);
        System.out.println("Enter the value for the array:");
        for (int i = 0; i < n; i++) {
            s.insert(scanner.nextLong());
        }
        System.out.println("The values before sorting:");
        s.display();
        s.sort();
        System.out.println("The values after sorting:");
        s.display();
    }
}
