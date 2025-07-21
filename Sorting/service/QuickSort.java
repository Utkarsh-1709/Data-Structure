package Sorting.service;

/*
 * This class implements the Quick Sort algorithm.
 * It provides a method to sort an array of integers using the Quick Sort technique.
 * Quick Sort is a divide-and-conquer algorithm that selects a 'pivot' element and partitions the array into two halves,
 * such that elements less than the pivot are on the left and elements greater than the pivot are on the right.
 * The algorithm has a time complexity of O(n log n) on average, but can degrade to O(n^2) in the worst case.
 * It is efficient for large datasets and is widely used in practice.
 */

public class QuickSort {
    
     public void quickSort(int arr[], int low, int high)
    {
       if(low<high)
       {
            int pivotIndex = partition(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }

    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = low-1;

       for(int j = low; j<high;j++)
       {
            if(arr[j]<pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
       }
       i++;
       int temp = arr[i];
       arr[i] = pivot;
       arr[high] = temp;
       return i;
    }

}
