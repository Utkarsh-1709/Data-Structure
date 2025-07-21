package Searching.service;

/*
 * Linear Search Implementation
 * This class provides a method to perform linear search on an array.
 * It returns the index of the key if found, otherwise returns 0.
 */

public class LinearSearch {

    public int linearSearch(int arr[], int key)
    {
        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i]==key)
                return i+1;
        }
        return 0;
    }

}
