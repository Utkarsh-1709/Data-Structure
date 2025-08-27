package Heaps.test;

import java.util.Scanner;

import Heaps.service.HeapSort;

/*
 * Heap Sort Tester class to test the Heap Sort implementation.
 * It takes input from the user and prints the sorted array.
 */

public class HeapSortTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int size = sc.nextInt();

        System.out.println("Enter the "+size+" elements in an Array");
        int arr[] = new int[size];

        for(int i = 0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        HeapSort heapSort = new HeapSort();

        heapSort.heapSort(arr);

        System.out.println("Sorted Array using Heap Sort");
        for(int i : arr)
        {
            System.out.println(i);
        }
        sc.close();
    }
}
