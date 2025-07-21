package Recursion.service;

/*
 * This class contains methods to perform various recursive operations such as checking if an array is sorted,
 * finding the first occurrence of an element, finding the last occurrence of an element, and solving the tiling problem.
 */

public class Recursion {
    
    public boolean isSorted(int arr[],int i)
    {
        if(i==arr.length-1)
            return true;
        if(arr[i]>arr[i+1])
            return false;
        return isSorted(arr,i+1);
    }

    public int firstOccurrence(int arr[], int key, int i)
    {
        if(i==arr.length)
            return -1;
        if(arr[i]==key)
            return i+1;
        return firstOccurrence(arr,key,i+1);
    }

    public int lastOccurrence(int arr[], int key, int i)
    {
        if(i==0)
            return -1;
        if(arr[i]==key)
            return i;
        return lastOccurrence(arr,key,i-1);
    }

    //tiling problem
    public int numberOfWays(int n) {
        // code here
        if(n<0)
            return 0;
        if(n==0)
            return 1;
        
        int ways = numberOfWays(n-1);
        ways += numberOfWays(n-2);
        return ways;
    }

}
