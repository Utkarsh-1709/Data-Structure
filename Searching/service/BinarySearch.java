package Searching.service;

/*
 * Binary Search Implementation
 * This class provides a method to perform binary search on an array.
 * It returns the index of the key if found, otherwise returns -1.
 */

public class BinarySearch {

    public int binarySearch(int arr[], int key)
    {
        if(arr.length==0) return -1;
        boolean isAscending = arr[0] < arr[arr.length-1];
        int first = 0;
        int last = arr.length-1;
        for(int i = 0; i<arr.length;i++)
        {
            int mid = (first+last)/2;
            if(arr[mid]==key)
                return mid + 1;
            if(isAscending)
            {
                if(key<arr[mid])
                {
                    last = mid-1;
                }
                else
                {
                    first = mid + 1;
                }
            }
            else
            {
                if(key>arr[mid])
                {
                    last = mid-1;
                }
                else
                {
                    first = mid + 1;
                }
            }
        }
        return 0;
    }


}
