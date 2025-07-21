package Sorting.service;

/*
 * This class implements the Counting Sort algorithm.
 * It provides a method to sort an array of integers using the Counting Sort technique.
 * Counting Sort is a non-comparison based sorting algorithm that counts the occurrences of each unique element in the input array.
 * It is particularly efficient for sorting integers or objects that can be mapped to integers.
 * The algorithm has a time complexity of O(n + k), where n is the number of elements in the input array and k is the range of the input values.
 * It is not suitable for sorting large ranges of numbers with small datasets.
 */

public class CountingSort {
    
    public int[] countingSort(int[] arr)
    {
        int size = findMax(arr);
        int count[] = new int[size+1];
        for(int i = 0; i<arr.length;i++)
        {
           count[arr[i]]++;
        }
        int j = 0;
        for(int i = 0;i<count.length;i++)
        {
          while(count[i]>0)
          {
            arr[j] = i;
            j++;
            count[i]--;
          }
        }
        return arr;
    }

    public static int findMax(int[] arr)
    {
        int max = 0;
        for(int i = 0;i<arr.length;i++)
        {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

}
