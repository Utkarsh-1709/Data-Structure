package Sorting.service;

/*
 * This class implements the Bubble Sort algorithm.
 * It provides a method to sort an array of integers using the Bubble Sort technique.
 * Bubble Sort repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order.
 * The pass through the list is repeated until the list is sorted.
 * The algorithm has a time complexity of O(n^2).
 * It is a simple sorting algorithm but not efficient for large datasets.
 * It is mainly used for educational purposes to illustrate the concept of sorting.
 * It is not recommended for production use due to its inefficiency.
 * 
 */

public class BubbleSort {
    
     public int[] bubbleSort(int[] arr)
    {
        for(int i =0;i<arr.length-1;i++)
        {
            for(int j = 0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        return arr;
    }

}
