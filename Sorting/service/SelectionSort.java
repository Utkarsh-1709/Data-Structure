package Sorting.service;

public class SelectionSort {
    
    /*
     * This class implements the Selection Sort algorithm.
     * It provides a method to sort an array of integers using the Selection Sort technique.
     * Selection Sort divides the input list into two parts: a sorted sublist of items which is built up from left to right
     * and a sublist of the remaining unsorted items. Initially, the sorted sublist is empty and the unsorted sublist contains all the items.
     * The algorithm has a time complexity of O(n^2).
     * Finding  the minimum element and place it at the beginning.
     */

    public int[] selectionSort(int[] arr)
    {
        for(int i = 0;i<arr.length-1;i++)
        {
            int min = i;
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                    min = j;
            }
            int t = arr[min];
            arr[min] = arr[i];
            arr[i] = t;
        }
        return arr;
    }
}
