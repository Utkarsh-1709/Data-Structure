package Arrays.service;

/**
 * Service class for Pairs of an Array.
 * Provides a method to generate pairs of elements from the array.
 * Includes nested loops to iterate through the array elements.
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

public class Pairs {
    
    public void pairsOfArray(int arr[])
    {
        System.out.println("Pairs of an Array");
        for(int i = 0; i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        }
    }
}
