package Heaps.service;

/*
 * Time Complexity: O(nlogn)
 * Space Complexity: O(1)
 * Heap Sort is a comparison based sorting technique based on Binary Heap data structure.
 * It is similar to selection sort where we first find the maximum element and place the maximum element at the end.
 * We repeat the same process for the remaining elements.
 * It is not a stable sort.
 */

public class HeapSort {
    
    public void heapSort(int arr[])
    {
        //Step:1-> Build MaxHeap
        int n = arr.length;
        for(int i = n/2;i>=0;i--)
        {
            heapify(arr,i,n);
        }

        //Step:2-> Swap first and last element
        for(int i = n-1;i>0;i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0,i);
        }
    }

    public static void heapify(int arr[], int idx, int size)
    {
        int left = 2*idx+1;
        int right = 2*idx+2;
        int maxIndex = idx;

        if(left<size && arr[left]>arr[maxIndex])
        {
            maxIndex = left;
        }

        if(right<size && arr[right]>arr[maxIndex])
        {
            maxIndex = right;
        }

        if(maxIndex != idx)
        {
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[idx];
            arr[idx] = temp;

            heapify(arr, maxIndex, size);
        }
    }
}
