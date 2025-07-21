package Sorting.service;

/*
 * This class implements the Merge Sort algorithm.
 * It provides a method to sort an array of integers using the Merge Sort technique.
 * Merge Sort is a divide-and-conquer algorithm that divides the input array into two halves,
 * recursively sorts each half, and then merges the sorted halves back together.
 * The algorithm has a time complexity of O(n log n).
 * It is efficient for large datasets and is often used in practice.
 */

public class MergeSort {
    
    public void mergeSort(int[] arr, int si, int ei)
    {
        if(si>=ei){
            return;
        }

        int mid = si + (ei-si)/2;
        
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }

    public void merge(int arr[],int si, int mid, int ei)
    {
        int merged[] = new int[ei-si+1];
        int index = si;
        int index2 = mid+1;
        int x = 0;

        while(index<=mid && index2<=ei)
        {
            if(arr[index]<=arr[index2])
                merged[x++] = arr[index++];
            else
                merged[x++] = arr[index2++];
        }
        while(index<=mid)
        {
            merged[x++] = arr[index++];
        }
        while(index2<=ei)
        {
            merged[x++] = arr[index2++];
        }

        for(int i = 0, j=si;i<merged.length;i++,j++)
        {
            arr[j] = merged[i];
        }
    }
}
