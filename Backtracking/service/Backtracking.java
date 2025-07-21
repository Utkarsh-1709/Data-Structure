package Backtracking.service;

/*
 * Backtracking Example:-
 * This class demonstrates a simple backtracking algorithm that modifies an array.
 * It recursively fills the array with incrementing values and then backtracks by decrementing the last value set.
 * The changeArr method is the core of the backtracking logic, and printArr is used to display the array contents.
 * The base case is when the index reaches the length of the array, at which point it prints the array.
 * The backtracking occurs after the recursive call, where the last modified element is decremented by 2.
 * This allows the algorithm to explore different configurations of the array.
 */

public class Backtracking {

    public void changeArr(int arr[], int i, int value)
    {
        //Base Case
        if(i==arr.length)
        {
            System.out.println("Array Elements before Backtracking");
            printArr(arr);
            return;
        }

        arr[i] = value;
        changeArr(arr, i+1, value+1);   //Recursive Function
        
        arr[i] = arr[i]-2;      //Backtracking 
    }

    public void printArr(int arr[])
    {
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
}
