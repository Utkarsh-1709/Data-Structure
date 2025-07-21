package Arrays.service;

/**
 * Service class for Reversing Arrays.
 * Provides a method to reverse the elements of an integer array in place.
 * Includes a simple two-pointer approach to swap elements.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * This class is used to demonstrate array manipulation techniques.
 * It prints the original and reversed arrays to the console.
 */

public class ReverseArray {
    
    public void reverseArray(int originalArray[])
    {
        System.out.print("Original Array is : ");
        for(int i = 0; i<originalArray.length;i++)
        {
            System.out.print(originalArray[i]+ " ");
        }
        
        int first = 0;
        int last = originalArray.length-1;
        while(first<last)
        {
            int t = originalArray[first];
            originalArray[first] = originalArray[last];
            originalArray[last] = t;

            first++;
            last--;
        }

        System.out.println("\nReversed Array:- ");
        for(int i = 0; i<originalArray.length;i++)
        {
            System.out.print(originalArray[i]+" ");
        }
    }
}
