package Arrays.service;

/**
 * Service class for Sub-Arrays.
 * Provides methods to generate sub-arrays and calculate maximum sub-array sums.
 * Includes brute-force, prefix sum, and Kadane's algorithm approaches.
 */

public class SubArray {

    /*
     * This method generates all possible sub-arrays of the given array.
     * It uses a nested loop to iterate through all starting and ending indices.
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    
    public void subArrays(int arr[])
    {
        System.out.println("Subarrays are:");
        for(int i = 0; i<arr.length;i++)
        {
            for(int j = i; j<arr.length;j++)
            {
                System.out.print("[ ");
                for(int k = i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.print("] ");
            }
            System.out.println();
        }
    }

    /*
     * Brute-Force
     * Time Complexity: O(n^3)
     * Space Complexity: O(1)
     * This method iterates through all possible sub-arrays and calculates their sums.
     */

    public void maxSubArraySum(int arr[])
    {
        int maxSum = 0;
        for(int i = 0; i<arr.length;i++)
        {//start
            for(int j = i; j<arr.length;j++)
            {//end
                int sum = 0;
                for(int k = i;k<=j;k++)
                {
                    sum = sum + arr[k];
                    if(sum>maxSum)
                        maxSum = sum;
                }
                System.out.println("Sum of "+(j+1)+" Sub-Array is: "+sum);
            }
        }
        System.out.println("\nMaximum Subarray Sum is:"+maxSum);
    }

    /*
     * Prefix Sum
     * Time Complexity: O(n^2)
     * Space Complexity: O(n)
     * This method uses a prefix sum array to calculate sub-array sums efficiently.
     * It reduces the time complexity of calculating sums for sub-arrays.
     * This method iterates through all possible sub-arrays and calculates their sums using the prefix sum array.
     * The prefix sum array allows for O(1) sum calculation for any sub-array.
     */

    public void maxSubArraySumUsingPrefix(int arr[])
    {
         int maxSum = 0;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i<prefix.length;i++)
        {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i = 0;i<arr.length;i++)
        {
            int sum = 0;
            for(int j = i;j<arr.length;j++)
            {
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                System.out.println("Sum of "+(j+1)+" Sub-Array is: "+sum);

                if(sum>maxSum)
                    maxSum = sum;
            }
        }
        System.out.println("Maximum Subarray Sum is: "+maxSum);
    }

    /*
     * Kadane's Algorithm
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * This method uses Kadane's algorithm to find the maximum sub-array sum in linear time.
     * It maintains a running sum and resets it when it becomes negative.
     */

    public void maxSubArraySumUsingKadanes(int arr[])
    {
        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i<arr.length;i++)
        {
            sum = sum + arr[i];
            if(sum<0)
                sum = 0;
            maxSum = sum>maxSum ? sum : maxSum;
        }
        System.out.println("Maximum Subarray Sum is: "+maxSum);
    }


}
