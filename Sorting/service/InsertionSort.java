package Sorting.service;

public class InsertionSort {
    
    /*
     * This class implements the Insertion Sort algorithm.
     * It provides a method to sort an array of integers using the Insertion Sort technique.
     * Insertion Sort builds a sorted array one element at a time by repeatedly taking an unsorted element
     * and inserting it into the correct position in the sorted part of the array.
     * The algorithm has a time complexity of O(n^2).
     * Divides the array into two parts :- Sorted and Unsorted. Putting each item from an unsorted array into a sorted array at one time.
     */

    public int[] insertionSort(int arr[])
    {
        for(int i = 1; i<arr.length;i++)
        {
            int current = i;
            int previous = i-1;
            while(previous>=0 && arr[previous] > arr[current])
            {
                arr[previous+1] = arr[previous];
                previous--;
            }
            arr[previous+1] = arr[current];
        }
        return arr;
    }

}
