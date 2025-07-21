package Sorting.test;

import java.util.Scanner;

import Sorting.service.BubbleSort;
import Sorting.service.CountingSort;
import Sorting.service.InsertionSort;
import Sorting.service.MergeSort;
import Sorting.service.QuickSort;
import Sorting.service.SelectionSort;

/*
 * This is a Tester class for testing various sorting algorithms.
 * It allows the user to input an array and choose a sorting algorithm to sort the array.
 * The available algorithms are Bubble Sort, Selection Sort, Insertion Sort, Counting Sort, Merge Sort, and Quick Sort.
 */

public class Tester {
    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        boolean exit = false;

        System.out.println("Enter the size of an Array");
        int size  = sc.nextInt();

        System.out.println("Enter "+size+" elements in an array");
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

         while(!exit)
        {
            System.out.println("Select from one of the below Sorting Algorithm to Sort an Array:\n1. Bubble Sort\n2. Selection Sort\n3. Insertion Sort\n4. Counting Sort\n5. Merge Sort\n6. Quick Sort\n0. Exit");

            switch (sc.nextInt()) {
                case 1:
                    int[] sortedArray = new BubbleSort().bubbleSort(arr);
                    System.out.print("Sorted Array using Bubble Sort is: ");
                    for (int num : sortedArray) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    int[] selectionSortArray = new SelectionSort().selectionSort(arr);
                    System.out.print("Sorted Array using Selection Sort is: ");
                    for (int num : selectionSortArray) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    int[] insertionSortArray = new InsertionSort().insertionSort(arr);
                    System.out.print("Sorted Array using Insertion Sort is: ");
                    for(int num : insertionSortArray)
                    {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                case 4:
                    int[] countingSortArray = new CountingSort().countingSort(arr);
                    System.out.print("Sorted Array using Insertion Sort is: ");
                    for(int num : countingSortArray)
                    {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                case 5:
                    new MergeSort().mergeSort(arr, 0, size-1);
                    System.out.print("Sorted Array using Merge Sort Algorithm is: ");

                    for (int i : arr) {
                     System.out.print(i+" ");   
                    }
                    System.out.println();
                    break;
                case 6:
                    new QuickSort().quickSort(arr, 0, size-1);
                    System.out.print("Sorted Array using Quick Sort is: ");
                    for (int i : arr) {
                        System.out.print(i+" "); 
                    }
                    System.out.println();
                    break;
                case 0:
                    exit = true;
                    break;
            
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
        sc.close();

    }
}
